package com.tecsup.springweb.controller.programa;

import com.tecsup.springweb.dao.ProgramaDAO;
import com.tecsup.springweb.dao.hibernate.ProgramaDAOH;
import com.tecsup.springweb.model.Programa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProgramaServiceImp implements ProgramaService {

    @Autowired
    ProgramaDAO programaDAO;

    
    public List<Programa> allPrograma() {
        return programaDAO.list();
    }

    
    public Programa findPrograma(Long id) {
        return programaDAO.get(id);
    }

    
    public void guardarPrograma(Programa programa) {
        if(programa.getId() == null){
            programaDAO.save(programa);
        }else{
            programaDAO.update(programa);
        }
    }

    
    public void deletePrograma(Long id) {
        programaDAO.delete(id);
    }

    public void setDao( ProgramaDAO dao )
    {
    this.programaDAO = dao;
    }
    
}
