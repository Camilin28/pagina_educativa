package com.plataforma.plataforma_educativa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plataforma.plataforma_educativa.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
