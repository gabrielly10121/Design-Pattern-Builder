
package com.finan.orcamento.Interfaces;

import com.finan.orcamento.model.CasaModel;

public interface IBuilderCasa {
    IBuilderCasa buildQuartos(int quartos);
    IBuilderCasa buildBanheiros(int banheiros);
    IBuilderCasa buildGaragem(boolean garagem);
    IBuilderCasa buildChurrasqueira(boolean churrasqueira);

    CasaModel build();
}