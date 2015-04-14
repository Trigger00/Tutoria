package com.unalm.tutoria.dao;

import com.unalm.tutoria.model.ConsejeroEntity;

public interface ConsejeroDAO extends GenericDAO<ConsejeroEntity>{
	ConsejeroEntity findByCodigo(String Codigo);

}
