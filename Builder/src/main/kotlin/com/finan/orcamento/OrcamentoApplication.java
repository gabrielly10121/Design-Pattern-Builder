package com.finan.orcamento;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.finan.orcamento.Interfaces.IBuilderCasa;
import com.finan.orcamento.model.CasaBuilder;
import com.finan.orcamento.model.CasaModel;

import org.springframework.boot.SpringApplication;

@SpringBootApplication(scanBasePackages = {"com.finan.orcamento"})
public class OrcamentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrcamentoApplication.class, args);
        IBuilderCasa builder = new CasaBuilder();
        CasaModel casa = builder
                        .buildQuartos(2)
                        .buildBanheiros(1)
                        .buildGaragem(true)
                        .buildChurrasqueira(false)
                        .build();

        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("CASA: " + casa.toString());
        System.out.println("------------------------------------");
        System.out.println("");
    }
}