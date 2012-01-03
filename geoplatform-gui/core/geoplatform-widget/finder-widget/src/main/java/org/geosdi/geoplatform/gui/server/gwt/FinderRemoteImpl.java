/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2012 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. This program is distributed in the 
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR 
 * A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details. You should have received a copy of the GNU General 
 * Public License along with this program. If not, see http://www.gnu.org/licenses/ 
 *
 * ====================================================================
 *
 * Linking this library statically or dynamically with other modules is 
 * making a combined work based on this library. Thus, the terms and 
 * conditions of the GNU General Public License cover the whole combination. 
 * 
 * As a special exception, the copyright holders of this library give you permission 
 * to link this library with independent modules to produce an executable, regardless 
 * of the license terms of these independent modules, and to copy and distribute 
 * the resulting executable under terms of your choice, provided that you also meet, 
 * for each linked independent module, the terms and conditions of the license of 
 * that module. An independent module is a module which is not derived from or 
 * based on this library. If you modify this library, you may extend this exception 
 * to your version of the library, but you are not obligated to do so. If you do not 
 * wish to do so, delete this exception statement from your version. 
 *
 */
package org.geosdi.geoplatform.gui.server.gwt;

import java.util.ArrayList;
import java.util.logging.Level;
import org.geosdi.geoplatform.exception.GPCatalogException;
import org.geosdi.geoplatform.gui.client.model.FinderBean;
import org.geosdi.geoplatform.gui.global.GeoPlatformException;
import org.geosdi.geoplatform.gui.spring.GeoPlatformContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.geosdi.geoplatform.gui.client.service.FinderRemote;
import org.geosdi.geoplatform.gui.server.service.IFinderService;
import org.geosdi.geoplatform.gui.server.service.impl.FinderService;

/**
 * @author Michele Santomauro - CNR IMAA geoSDI Group
 * @email  michele.santomauro@geosdi.org
 */
public class FinderRemoteImpl extends RemoteServiceServlet implements
        FinderRemote {

    private static final long serialVersionUID = 8756054653877871843L;
    //
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    //
    private IFinderService finderService = (IFinderService) GeoPlatformContextUtil.getInstance().getBean(FinderService.class);

    @Override
    public ArrayList<FinderBean> searchPublicMetadata(String searchString) throws GPCatalogException {
        return this.finderService.searchPublicMetadata(searchString);
    }

    @Override
    public ArrayList<FinderBean> searchPrivateMetadata(String username, 
                                                       String password, 
                                                       String searchString) throws GPCatalogException {
        return this.finderService.searchPrivateMetadata(username, password, searchString);
    }
}
