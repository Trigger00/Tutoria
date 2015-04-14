package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.unalm.tutoria.dao.ConsejeroDAO;
import com.unalm.tutoria.model.ConsejeroEntity;

@Repository
public class ConsejeroDAOH extends BaseHibernateDAO implements ConsejeroDAO{

	public List<ConsejeroEntity> list() {
		  Criteria criteria = this.getSession().createCriteria(ConsejeroEntity.class);
	        return criteria.list();
	}

	public ConsejeroEntity get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(ConsejeroEntity t) {
		// TODO Auto-generated method stub
		
	}

	public void update(ConsejeroEntity t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long t) {
		// TODO Auto-generated method stub
		
	}

	public ConsejeroEntity findByCodigo(String Codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
