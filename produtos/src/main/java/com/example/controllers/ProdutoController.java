package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.entities.Produtos;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/api/produtos")
@Produces("application/json")
@Consumes("application/json")
public class ProdutoController {

    private List<Produtos> produtos = new ArrayList<>();

    @GET
    public List<Produtos> listarTodosOsProdutos() {

    }

}
