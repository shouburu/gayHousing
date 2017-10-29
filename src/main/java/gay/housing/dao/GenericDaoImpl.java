package gay.housing.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

@SuppressWarnings("unchecked")
@Repository
public abstract class GenericDaoImpl<E, K extends Serializable> implements GenericDao<E, K> {

    @Autowired
    private SessionFactory sessionFactory;

    protected Class<? extends E> daoType;

    /**
     * By defining this class as abstract, we prevent Spring from creating
     * instance of this class If not defined as abstract,
     * getClass().getGenericSuperClass() would return Object. There would be
     * exception because Object class does not hava constructor with parameters.
     */
    public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }

    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void add(E entity) {
        currentSession().save(entity);
    }

    @Override
    public void saveOrUpdate(E entity) {
        currentSession().saveOrUpdate(entity);
    }

    @Override
    public void update(E entity) {
        currentSession().saveOrUpdate(entity);
    }

    @Override
    public void remove(E entity) {
        currentSession().delete(entity);
    }

    @Override
    public E find(K key) {
        return (E) currentSession().get(daoType, key);
    }

    @Override
    public List<E> getAll() {
        return currentSession().createCriteria(daoType).list();
    }


//    public <T> List<T> getAll(final Class<T> type) {
//        final Session session = sessionFactory.getCurrentSession();
//        final Criteria crit = session.createCriteria(type);
//        return crit.list();
//    }
//
//    @Override
//    public List<E> getAlls() {
//        // UPDATED: Create CriteriaBuilder
//        CriteriaBuilder builder = currentSession().getCriteriaBuilder();
//
//        // UPDATED: Create CriteriaQuery
//        CriteriaQuery<E> criteria = builder.createQuery();
//
//        // UPDATED: Specify criteria root
//        criteria.from(daoType);
//
//        // UPDATED: Execute query
//        List<E> categories = currentSession().createQuery(criteria).getResultList();
//        return categories;
//    }
//
//    private <E> List<E> fetchAllContacts(){
//        //Open Session
//        Session session = sessionFactory.getCurrentSession()
//
//        /* //Deprecated Way
//        * Criteria criteria = session.createCriteria(Contact.class);
//        * List<Contacts> contacts = criteria.list(); */
//
//        //Get Criteria Builder
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//
//        //Create Criteria
//        CriteriaQuery<E> criteria = builder.createQuery();
//        Root<Contact> contactRoot = criteria.from(Contact.class);
//        criteria.select(contactRoot);
//
//        //Use criteria to query with session to fetch all contacts
//        List<Contact> contacts = session.createQuery(criteria).getResultList();
//
//        //Close session
//        session.close();
//
//        return contacts;
//    }
}