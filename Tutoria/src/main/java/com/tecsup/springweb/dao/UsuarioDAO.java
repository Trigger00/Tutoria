
package com.tecsup.springweb.dao;

import com.tecsup.springweb.model.Usuario;

public interface UsuarioDAO {
    
    Usuario findByLogin(String usuario);
    
}
