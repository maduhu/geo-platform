//<editor-fold defaultstate="collapsed" desc="License">
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
//</editor-fold>
package org.geosdi.geoplatform.responce;

import javax.xml.bind.annotation.XmlRootElement;
import org.geosdi.geoplatform.core.model.GPFolder;
import org.geosdi.geoplatform.core.model.GPProject;
import org.geosdi.geoplatform.core.model.GPVectorLayer;

/**
 * @author Vincenzo Monteverde
 * @email vincenzo.monteverde@geosdi.org - OpenPGP key ID 0xB25F4B38
 *
 */
@XmlRootElement(name = "VectorLayerDTO")
public class VectorLayerDTO extends ShortLayerDTO {

    //<editor-fold defaultstate="collapsed" desc="Constructor method">
    /**
     * Default constructor
     */
    public VectorLayerDTO() {
    }

    /**
     * Constructor with GPVectorLayer as arg
     */
    public VectorLayerDTO(GPVectorLayer vectorLayer) {
        super(vectorLayer);
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "VectorLayerDTO [" + super.toString() + ']';
    }

    public static GPVectorLayer convertToGPVectorLayer(GPProject project, GPFolder parent,
            VectorLayerDTO vectorDTO) {
        
        GPVectorLayer vector = new GPVectorLayer();
        ShortLayerDTO.convertToGPLayer(project, parent, vector, vectorDTO);

        return vector;
    }
}
