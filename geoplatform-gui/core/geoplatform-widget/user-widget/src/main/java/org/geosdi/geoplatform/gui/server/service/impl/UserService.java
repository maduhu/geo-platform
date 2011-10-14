/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2011 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
package org.geosdi.geoplatform.gui.server.service.impl;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.geosdi.geoplatform.core.model.GPUser;
import org.geosdi.geoplatform.gui.client.model.GPUserManageDetail;
import org.geosdi.geoplatform.gui.utility.GPSessionTimeout;
import org.geosdi.geoplatform.gui.global.GeoPlatformException;
import org.geosdi.geoplatform.gui.global.security.GPRole;
import org.geosdi.geoplatform.gui.global.security.IGPUserManageDetail;
import org.geosdi.geoplatform.gui.server.IUserService;
import org.geosdi.geoplatform.gui.utility.UserLoginEnum;
import org.geosdi.geoplatform.services.GeoPlatformService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vincenzo Monteverde
 * @email vincenzo.monteverde@geosdi.org - OpenPGP key ID 0xB25F4B38
 */
@Service("userService")
public class UserService implements IUserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    //
    private GeoPlatformService geoPlatformServiceClient;

    /**
     * @param geoPlatformServiceClient the geoPlatformServiceClient to set
     */
    @Autowired
    public void setGeoPlatformServiceClient(
            @Qualifier("geoPlatformServiceClient") GeoPlatformService geoPlatformServiceClient) {
        this.geoPlatformServiceClient = geoPlatformServiceClient;
    }

    @Override
    public Long insertUser(IGPUserManageDetail userDetail, HttpServletRequest httpServletRequest)
            throws GeoPlatformException {
        // TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long updateUser(IGPUserManageDetail userDetail, HttpServletRequest httpServletRequest)
            throws GeoPlatformException {
        // TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteUser(Long userId, HttpServletRequest httpServletRequest)
            throws GeoPlatformException {
        // TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<IGPUserManageDetail> getUsers(HttpServletRequest httpServletRequest) {
        // TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<IGPUserManageDetail> searchUsers(PagingLoadConfig config,
            HttpServletRequest httpServletRequest) {
        // TODO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // TODO Move in a DTOConverter class?
    private IGPUserManageDetail convertUser(GPUser user, List<String> authorities) {
        IGPUserManageDetail userDetail = new GPUserManageDetail();

        userDetail.setUsername(user.getUsername());
        userDetail.setName(user.getUsername());
        userDetail.setEmail(user.getEmailAddress());
        userDetail.setPassword(user.getPassword());

        List<GPRole> roles = new ArrayList<GPRole>(authorities.size());
        for (String authoritie : authorities) {
            roles.add(GPRole.valueOf(authoritie));
        }

        return userDetail;
    }
}
