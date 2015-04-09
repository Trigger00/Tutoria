package com.tecsup.springweb.dao.hibernate;

import com.tecsup.springweb.dao.UsuarioDAO;
import com.tecsup.springweb.model.Usuario;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAOH extends BaseHibernateDAO implements UsuarioDAO {


    public Usuario findByLogin(String usuario) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("username", usuario));
        criteria.add(Restrictions.eq("estado", "ACT"));
        return (Usuario) criteria.uniqueResult();
    }

}
