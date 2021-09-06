package com.zup.InvestimentoZup.Usuario;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface Repository extends CrudRepository<Usuario, String> {

    List<Usuario> findByNomeUsuario(String letras);

}
