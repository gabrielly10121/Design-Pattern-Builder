package com.finan.orcamento.model;

import com.finan.orcamento.Interfaces.IBuilderCasa;

public class CasaBuilder implements IBuilderCasa{
    private int quartos;
    private int banheiros;
    private boolean isChurrasqueira;
    private boolean isGaragem;

    @Override
    public IBuilderCasa buildQuartos(int quartos){
        this.quartos = quartos;
        return this;
    }

    @Override
    public IBuilderCasa buildBanheiros(int banheiros){
        this.banheiros = banheiros;
        return this;
    }

    @Override
    public IBuilderCasa buildGaragem(boolean isGaragem){
        this.isGaragem = isGaragem;
        return this;
    }

    @Override
    public IBuilderCasa buildChurrasqueira(boolean isChurrasqueira){
        this.isChurrasqueira = isChurrasqueira;
        return this;
    }

    @Override
    public CasaModel build(){
        return new CasaModel(quartos, banheiros, isGaragem, isChurrasqueira);
    }
}