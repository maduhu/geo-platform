/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2015 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
package org.geosdi.geoplatform.wmc.support.v110.jaxb.context;

import net.jcip.annotations.ThreadSafe;
import org.geosdi.geoplatform.jaxb.GeoPlatformJAXBContext;
import org.geosdi.geoplatform.jaxb.repository.GeoPlatformJAXBContextRepository;
import org.geosdi.geoplatform.wmc.support.v110.jaxb.repository.WMCJAXBContextProviderV110;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.util.Map;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@ThreadSafe
public class WMCJAXBContextV110 extends GeoPlatformJAXBContext {

    public WMCJAXBContextV110(String contextPath) throws JAXBException {
        super(contextPath);
    }

    public WMCJAXBContextV110(String contextPath, ClassLoader classLoader)
            throws JAXBException {
        super(contextPath, classLoader);
    }

    public WMCJAXBContextV110(String contextPath, ClassLoader classLoader,
            Map<String, ?> properties) throws JAXBException {
        super(contextPath, classLoader, properties);
    }

    public WMCJAXBContextV110(Class... classToBeBound) throws JAXBException {
        super(classToBeBound);
    }

    public WMCJAXBContextV110(JAXBContext theJaxbContext) {
        super(theJaxbContext);
    }

    @Override
    public Marshaller acquireMarshaller() throws Exception {
        return super.createMarshaller();
    }

    @Override
    public Unmarshaller acquireUnmarshaller() throws Exception {
        return super.createUnmarshaller();
    }

    public static class WMCJAXBContextKeyV110 extends GeoPlatformJAXBContextRepository.GeoPlatformJAXBContextKey {

        public WMCJAXBContextKeyV110() {
            super(WMCJAXBContextProviderV110.class);
        }

        @Override
        public boolean isCompatibleValue(Object o) {
            return o instanceof WMCJAXBContextV110;
        }
    }

}