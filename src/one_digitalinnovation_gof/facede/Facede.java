package one_digitalinnovation_gof.facede;

import subsistema1_crm.CrmService;
import subsistema2_cep.CepApi;

public class Facede {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
