package com.zup.InvestimentoZup.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    public Repository repository;


    //salvar usuario
    public Usuario salvarUsuario(Usuario usuario){

        return repository.save(usuario);
    }

    //exibicao usuario
    public List<Usuario> exibirUsuario(){

        return (List<Usuario>) repository.findAll();
    }



}
