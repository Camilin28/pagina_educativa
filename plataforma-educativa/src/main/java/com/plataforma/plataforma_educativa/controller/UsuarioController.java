package com.plataforma.plataforma_educativa.controller;

import com.plataforma.plataforma_educativa.model.Usuario;
import com.plataforma.plataforma_educativa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // obtener todos los usuarios

    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    // Crea un nuevo Usuario
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Obtener usuario por ID

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable long id) {
        return usuarioRepository.findById(id).orElse(null);

    }

    // actializar usuario
    @PutMapping("/{id}")
    public Usuario UpdateUsuario(@PathVariable long id, @RequestBody Usuario usuario) {
        if (usuarioRepository.existsById(id)) {
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    // eliminar usuario
    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable long id) {
        usuarioRepository.deleteById(id);
    }

}
