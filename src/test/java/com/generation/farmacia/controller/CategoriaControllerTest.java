package com.generation.farmacia.controller;

import com.generation.farmacia.model.Categoria;
import com.generation.farmacia.repository.CategoriaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CategoriaController.class)
class CategoriaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CategoriaRepository categoriaRepository;

    @Test
    void deveRetornar200AoListarCategorias() throws Exception {
        when(categoriaRepository.findAll()).thenReturn(List.of(new Categoria()));

        mockMvc.perform(get("/categorias"))
            .andExpect(status().isOk());
    }

    @Test
    void deveRetornar404QuandoCategoriaNaoExiste() throws Exception {
        when(categoriaRepository.findById(anyLong())).thenReturn(Optional.empty());

        mockMvc.perform(get("/categorias/99"))
            .andExpect(status().isNotFound());
    }
}