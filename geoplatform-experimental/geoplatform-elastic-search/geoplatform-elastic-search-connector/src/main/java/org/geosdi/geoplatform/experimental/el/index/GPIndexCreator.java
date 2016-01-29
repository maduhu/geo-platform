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
package org.geosdi.geoplatform.experimental.el.index;

import org.elasticsearch.client.Client;
import org.springframework.core.Ordered;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public interface GPIndexCreator extends Ordered {

    /**
     * <p>Create Index with {@link GPIndexSettings#getIndexName()} and {@link GPIndexSettings#getIndexType()}</p>
     * @throws Exception
     */
    void createIndex() throws Exception;

    /**
     * <p>Delete Index</p>
     * @throws Exception
     */
    void deleteIndex() throws Exception;

    /**
     * @return {@link Boolean}
     * @throws Exception
     */
    Boolean existIndex() throws Exception;

    /**
     * @param <IS>
     * @return {@link org.geosdi.geoplatform.experimental.el.index.GPIndexCreator.GPIndexSettings}
     */
    <IS extends GPIndexSettings> IS getIndexSettings();

    /**
     * @return {@link Client} client
     */
    Client client();

    /**
     * <p>
     * Index Settings Interface to define both IndexName and IndexType
     * </p>
     */
    interface GPIndexSettings {

        /**
         * @return {@link String} Index Name
         */
        String getIndexName();

        /**
         * @return {@link String} Index Type
         */
        String getIndexType();

    }
}
