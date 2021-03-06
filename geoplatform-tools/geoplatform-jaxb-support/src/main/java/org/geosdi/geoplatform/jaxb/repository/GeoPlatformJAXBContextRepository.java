/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2016 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
package org.geosdi.geoplatform.jaxb.repository;

import com.google.common.collect.Maps;
import net.jcip.annotations.ThreadSafe;
import org.geosdi.geoplatform.jaxb.GPBaseJAXBContext;
import org.geosdi.geoplatform.jaxb.provider.GeoPlatformJAXBContextProvider;

import java.awt.*;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@ThreadSafe
public abstract class GeoPlatformJAXBContextRepository implements JAXBContextRepository {

    private final Map<GeoPlatformJAXBContextKey, Object> values = Maps.<GeoPlatformJAXBContextKey, Object> newHashMap();

    protected GeoPlatformJAXBContextRepository() {
    }

    /**
     * <p> Register the JAXB Context for the Specific Connector </p>
     *
     * @param key      see also {@link GeoPlatformJAXBContextKey}
     * @param provider {@link Object}
     */
    @Override
    public void registerProvider(GeoPlatformJAXBContextKey key,
                                 Object provider) {
        if (!key.isCompatibleValue(provider)) {
            throw new IllegalArgumentException("The Provider : "
                    + provider + " is incompatible with Key : " + key);
        }

        synchronized (values) {
            if (!values.containsKey(key)) {
                values.put(key, provider);
            }
        }
    }

    /**
     * <p> Retrieve the JAXBContext for Specific Connector registered </p>
     *
     * @param key
     * @return GPConnectorJAXBContext Provider registered for Key
     */
    @Override
    public <P extends GPBaseJAXBContext> P getProvider(
            GeoPlatformJAXBContextKey key) {
        if (key == null) {
            throw new IllegalArgumentException(
                    "GeoPlatformJAXBContextKey must not be null.");
        }

        synchronized (values) {
            return (P) (values.get(key) != null ? values.get(key) : lookUpJAXBContext(
                    key));
        }
    }

    public abstract static class GeoPlatformJAXBContextKey
            extends RenderingHints.Key {

        private static final AtomicInteger keyID = new AtomicInteger(0);
        private final Class<? extends GeoPlatformJAXBContextProvider> jaxbContextClass;

        public GeoPlatformJAXBContextKey(Class<? extends GeoPlatformJAXBContextProvider> thejaxbContextClass) {
            super(keyID.getAndIncrement());
            this.jaxbContextClass = thejaxbContextClass;
        }

        /**
         * @return the class
         */
        public Class<?> getJAXBContextClass() {
            return jaxbContextClass;
        }

        @Override
        public String toString() {
            return getClass().getName()
                    + " : privatekey = " + super.intKey();
        }

    }
}
