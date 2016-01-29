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
package org.geosdi.geoplatform.persistence.configuration.dao.jpa;

import com.google.common.base.Preconditions;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.geosdi.geoplatform.persistence.configuration.dao.GPBaseSearchDAO;
import org.hibernate.Session;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@Transactional
public abstract class GenericJPASearchDAO<T extends Object>
        implements GPBaseSearchDAO<T> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    //
    protected Class<T> persistentClass;
    //
    protected EntityManager entityManager;
    private FullTextEntityManager ftEntityManager;

    public GenericJPASearchDAO(Class<T> thePersistentClass) {
        Preconditions.checkNotNull(thePersistentClass);
        this.persistentClass = thePersistentClass;
    }

    @PersistenceContext
    public void setEm(final EntityManager theEntityManager) {
        Preconditions.checkNotNull(theEntityManager);
        this.entityManager = theEntityManager;
    }

    @Override
    public FullTextEntityManager getSearchManager() {
        return this.ftEntityManager = (ftEntityManager == null)
                ? Search.getFullTextEntityManager(
                entityManager) : ftEntityManager;
    }

    @Override
    public T persist(T entity) {
        Preconditions.checkNotNull(entity);

        this.entityManager.persist(entity);
        return entity;
    }

    @Override
    public void update(T entity) {
        this.entityManager.merge(entity);
    }

    @Override
    public int removeAll() {
        return getSearchManager().createNativeQuery("delete from "
                + persistentClass.getSimpleName(), persistentClass).
                executeUpdate();
    }

    protected Session getSession() {
        return (Session) this.entityManager.getDelegate();
    }

}
