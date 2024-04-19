package com.finan.orcamento.service.Proxy;


import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.service.OrcamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class OrcamentoProxy {

    @Autowired
    private OrcamentoService orcamentoService;

    private OrcamentoModel orcamentoModel;
    
    @Transactional
    public OrcamentoModel buscaporId(Long id) {
        if (orcamentoModel == null || !orcamentoModel.getId().equals(id)) {
            orcamentoModel = orcamentoService.buscaId(id);
            return orcamentoModel;
        } else {
            return orcamentoModel;
        }
    }
}