package com.tecsup.springweb.dao.hibernate;

import com.tecsup.springweb.dao.ProgramaDAO;
import com.tecsup.springweb.model.Programa;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class ProgramaDAOH extends BaseHibernateDAO implements ProgramaDAO {

    public List<Programa> list() {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        return criteria.list();
    }

    public Programa get(Long t) {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        criteria.add(Restrictions.eq("id", t));
        return (Programa) criteria.uniqueResult();
    }

    public Programa findByCodigo(String codigo) {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        criteria.add(Restrictions.eq("codigo", codigo));
        return (Programa) criteria.uniqueResult();
    }

    public void save(Programa t) {
        this.getSession().save(t);
    }

    public void update(Programa t) {
        this.getSession().merge(t);
    }

    public void delete(Long t) {
        this.getSession().delete(new Programa(t));
    }
}
