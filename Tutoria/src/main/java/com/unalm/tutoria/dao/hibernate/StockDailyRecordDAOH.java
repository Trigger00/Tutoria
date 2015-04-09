package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.unalm.tutoria.dao.StockDailyRecordDAO;
import com.unalm.tutoria.model.Stock;
import com.unalm.tutoria.model.StockDailyRecord;

@Repository
public class StockDailyRecordDAOH  extends BaseHibernateDAO implements StockDailyRecordDAO{

	
	
	
	public List<StockDailyRecord> list() {
		  Criteria criteria = this.getSession().createCriteria(StockDailyRecord.class);	
				return criteria.list();
	}

	public StockDailyRecord get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(StockDailyRecord t) {
		// TODO Auto-generated method stub
		
	}

	public void update(StockDailyRecord t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long t) {
		// TODO Auto-generated method stub
		
	}

	public StockDailyRecord findByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
