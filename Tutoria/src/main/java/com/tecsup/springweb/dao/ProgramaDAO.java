package com.tecsup.springweb.dao;

import com.tecsup.springweb.model.Programa;

public interface ProgramaDAO extends GenericDAO<Programa> {

    Programa findByCodigo(String codigo);
}
