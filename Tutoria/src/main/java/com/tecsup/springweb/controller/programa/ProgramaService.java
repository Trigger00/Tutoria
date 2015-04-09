package com.tecsup.springweb.controller.programa;

import com.tecsup.springweb.model.Programa;
import java.util.List;

public interface ProgramaService {
    
    List<Programa> allPrograma();
    
    Programa findPrograma(Long id);
    
    void guardarPrograma(Programa programa);
    
    void deletePrograma(Long id);
    
}
