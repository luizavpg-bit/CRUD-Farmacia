package com.generation.farmacia.repository;

import com.generation.farmacia.model.Categoria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CategoriaRepositoryTest {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Test
    void deveEncontrarCategoriaPelaDescricao() {
        Categoria categoria = new Categoria();
        categoria.setDescricao("Analgésico");
        categoriaRepository.save(categoria);

        List<Categoria> resultado = categoriaRepository
            .findAllByDescricaoContainingIgnoreCase("analg");

        assertThat(resultado).hasSize(1);
        assertThat(resultado.get(0).getDescricao()).isEqualTo("Analgésico");
    }
}