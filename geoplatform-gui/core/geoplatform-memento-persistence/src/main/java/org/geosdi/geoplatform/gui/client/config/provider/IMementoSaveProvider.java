/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2014 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 *   This program is free software: you can redistribute it and/or modify it
 *   under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version. This program is distributed in the
 *   hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *   even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *   A PARTICULAR PURPOSE. See the GNU General Public License
 *   for more details. You should have received a copy of the GNU General
 *   Public License along with this program. If not, see http://www.gnu.org/licenses/
 *
 *   ====================================================================
 *
 *   Linking this library statically or dynamically with other modules is
 *   making a combined work based on this library. Thus, the terms and
 *   conditions of the GNU General Public License cover the whole combination.
 *
 *   As a special exception, the copyright holders of this library give you permission
 *   to link this library with independent modules to produce an executable, regardless
 *   of the license terms of these independent modules, and to copy and distribute
 *   the resulting executable under terms of your choice, provided that you also meet,
 *   for each linked independent module, the terms and conditions of the license of
 *   that module. An independent module is a module which is not derived from or
 *   based on this library. If you modify this library, you may extend this exception
 *   to your version of the library, but you are not obligated to do so. If you do not
 *   wish to do so, delete this exception statement from your version.
 */
package org.geosdi.geoplatform.gui.client.config.provider;

import com.extjs.gxt.ui.client.Registry;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import org.geosdi.geoplatform.gui.client.model.memento.puregwt.event.PeekCacheEvent;
import org.geosdi.geoplatform.gui.client.model.memento.save.GPMementoSaveCache;
import org.geosdi.geoplatform.gui.client.model.memento.save.GPMementoSaveDummy;
import org.geosdi.geoplatform.gui.client.model.memento.save.GPMementoSaveShared;
import org.geosdi.geoplatform.gui.client.model.memento.save.IMementoSave;
import org.geosdi.geoplatform.gui.client.model.memento.save.ObservableGPLayerSaveCache;
import org.geosdi.geoplatform.gui.configuration.users.options.member.UserSessionEnum;
import org.geosdi.geoplatform.gui.global.security.IGPAccountDetail;
import org.geosdi.geoplatform.gui.model.project.IGPClientProject;
import org.geosdi.geoplatform.gui.shared.GPRole;

/**
 * @author Nazzareno Sileno - CNR IMAA geoSDI Group
 * @email nazzareno.sileno@geosdi.org
 */
@Singleton
public class IMementoSaveProvider implements Provider<IMementoSave> {

    private IMementoSave mementoSave;
    private boolean savedShareStatus;
    private ObservableGPLayerSaveCache observable;
    private PeekCacheEvent peekCacheEvent;
    private long projID;

    @Inject
    public IMementoSaveProvider(ObservableGPLayerSaveCache observable, PeekCacheEvent peekCacheEvent) {
        this.observable = observable;
        this.peekCacheEvent = peekCacheEvent;
    }

    @Override
    public IMementoSave get() {
//        System.out.println("Trying to get the project from provider");
        IGPClientProject clientProject = (IGPClientProject) Registry.get(UserSessionEnum.CURRENT_PROJECT_ON_TREE.name());
//        System.out.println("Client proj saved shared: " + this.savedShareStatus);
//        System.out.println("Client proj saved id: " + this.projID);
//        if (clientProject != null) {
//            System.out.println("Client proj name: " + clientProject.getName());
//            System.out.println("Client proj shared: " + clientProject.isShared());
//            System.out.println("Client proj id: " + clientProject.getId());
//        }
        if (this.mementoSave == null || clientProject == null || this.projID != clientProject.getId()
                || this.savedShareStatus != clientProject.isShared()) {
            if (clientProject == null) {
                this.mementoSave = new GPMementoSaveCache(observable);
            } else {
                this.savedShareStatus = clientProject.isShared();
                IGPAccountDetail accountInSession = Registry.get(UserSessionEnum.ACCOUNT_DETAIL_IN_SESSION.name());
                if (GPRole.VIEWER.toString().equalsIgnoreCase(accountInSession.getAuthority())) {
                    this.mementoSave = new GPMementoSaveDummy();
                } else if (clientProject.isShared()) {
                    this.mementoSave = new GPMementoSaveShared(observable, peekCacheEvent);
                } else {
                    this.mementoSave = new GPMementoSaveCache(observable);
                }
                this.projID = clientProject.getId();
            }
        }
        return this.mementoSave;
    }
}
