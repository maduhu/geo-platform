package org.geosdi.geoplatform.support.jackson.jts.serializer.geometry;

import com.fasterxml.jackson.core.JsonGenerator;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Polygon;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public class GeoJsonPolygonHandler extends GPGeoJsonGeometryHandler<Polygon> {

    public GeoJsonPolygonHandler() {
        super.setSuccessor(new GeoJsonMultiPointHandler());
    }

    /**
     * @param geometry
     * @param jsonGenerator
     * @throws Exception
     */
    @Override
    public void parseGeometry(Geometry geometry, JsonGenerator jsonGenerator) throws Exception {
        if (canParseGeometry(geometry)) {
            super.getGeometryWriterImplementor().writeGeometry(geometry, jsonGenerator);
        } else {
            super.forwardParseGeometry(geometry, jsonGenerator);
        }
    }

    /**
     * @return
     */
    @Override
    public Class<Polygon> getCompatibleGeometry() {
        return Polygon.class;
    }

    /**
     * @param geometry
     * @return {@link Boolean}
     */
    @Override
    protected Boolean canParseGeometry(Geometry geometry) {
        return geometry instanceof Polygon;
    }
}
