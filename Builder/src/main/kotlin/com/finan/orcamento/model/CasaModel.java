package com.finan.orcamento.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CasaModel {

    private int quartos;

    private int banheiros;

    private boolean garagem;

    private boolean churrasqueira;

    public int getQuartos() {return quartos;}

    public int getBanheiros() {return banheiros;}

    public boolean isGaragem() {return garagem;}

    public boolean isChurrasqueira() {return churrasqueira;}
}
