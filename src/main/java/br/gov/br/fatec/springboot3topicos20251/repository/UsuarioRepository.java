package br.gov.br.fatec.springboot3topicos20251.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.br.fatec.springboot3topicos20251.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
