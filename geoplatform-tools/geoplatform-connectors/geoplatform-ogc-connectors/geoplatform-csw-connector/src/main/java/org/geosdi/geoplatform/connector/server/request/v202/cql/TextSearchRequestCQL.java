/**
 *
 * geo-platform Rich webgis framework http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2015 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version. This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details. You should have received a copy of the GNU General Public License
 * along with this program. If not, see http://www.gnu.org/licenses/
 *
 * ====================================================================
 *
 * Linking this library statically or dynamically with other modules is making a
 * combined work based on this library. Thus, the terms and conditions of the
 * GNU General Public License cover the whole combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent modules, and
 * to copy and distribute the resulting executable under terms of your choice,
 * provided that you also meet, for each linked independent module, the terms
 * and conditions of the license of that module. An independent module is a
 * module which is not derived from or based on this library. If you modify this
 * library, you may extend this exception to your version of the library, but
 * you are not obligated to do so. If you do not wish to do so, delete this
 * exception statement from your version.
 */
package org.geosdi.geoplatform.connector.server.request.v202.cql;

import org.geosdi.geoplatform.connector.server.request.CatalogGetRecordsRequest;
import org.geosdi.geoplatform.exception.IllegalParameterFault;
import org.geosdi.geoplatform.gui.responce.TextInfo;

/**
 *
 * @author Vincenzo Monteverde <vincenzo.monteverde@geosdi.org>
 */
public class TextSearchRequestCQL extends GetRecordsRequestHandlerCQL {

    private final static String ANYTEXT = "AnyText";
    private final static String TITLE = "dc:title";
    private final static String ABSTRACT = "dc:abstract";
    private final static String SUBJECT = "dc:subject";

    @Override
    protected void processGetRecordsRequest(CatalogGetRecordsRequest request)
            throws IllegalParameterFault {
        logger.debug("#####################{} Process...",
                getClass().getSimpleName());

        TextInfo textInfo = request.getCatalogFinder().getTextInfo();
        if (textInfo != null) {
            String searchText = textInfo.getText();
            boolean searchTitle = textInfo.isSearchTitle();
            boolean searchAbstract = textInfo.isSearchAbstract();
            boolean searchSubjects = textInfo.isSearchSubjects();
            if (searchText != null) {
                if (!searchTitle && !searchAbstract && !searchSubjects) {
                    throw new IllegalParameterFault(
                            "You need to specify where to search \"" + searchText + "\" text");
                }

                logger.debug("\n+++ Search text: \"{}\" +++", searchText);

                String constraint = this.createCQLTextPredicate(searchText,
                        searchTitle, searchAbstract, searchSubjects);

                logger.trace("\n+++ Text CQL constraint: \"{}\" +++",
                        request.getConstraint());
                super.addCQLConstraint(request, constraint);
            }
        }
    }

    private String createCQLTextPredicate(String searchText,
            boolean searchTitle, boolean searchAbstract, boolean searchSubjects) {

        StringBuilder constraint = new StringBuilder();

        if (searchTitle & searchAbstract & searchSubjects) {
            constraint.append(ANYTEXT);

        } else {
            if (searchTitle) {
                constraint.append(TITLE);
            }

            if (searchAbstract) {
                if (constraint.length() > 0) {
                    constraint.append(" OR ");
                }
                constraint.append(ABSTRACT);
            }

            if (searchSubjects) {
                if (constraint.length() > 0) {
                    constraint.append(" OR ");
                }
                constraint.append(SUBJECT);
            }
        }

        if (constraint.length() > 0) {
            constraint.append(" LIKE '%").append(searchText).append("%'");
        }

        return constraint.toString();
    }

}
