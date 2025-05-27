package com.example.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProdutosDTO {

    @NotBlank(message = "Nome do produto é obrigatório")
    @Size(min = 3, max = 100)
    private String nomeProduto;

    @NotBlank(message = "Descrição do produto é obrigatória")
    @Size(min = 10, max = 500)
    private String descricaoProduto;

    @NotBlank(message = "Preço do produto é obrigatório")
    @Size(min = 1, max = 10)
    private Double precoProduto;

    @NotBlank(message = "Categoria do produto é obrigatória")
    @Size(min = 3, max = 50)
    private String categoriaProduto;

}
