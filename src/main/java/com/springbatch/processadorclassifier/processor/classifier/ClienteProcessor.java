package com.springbatch.processadorclassifier.processor.classifier;

import com.springbatch.processadorclassifier.dominio.Cliente;
import org.springframework.batch.item.ItemProcessor;


public class ClienteProcessor implements ItemProcessor<Cliente, Cliente> {


    @Override
    public Cliente process(Cliente cliente) throws Exception {
        System.out.println(String.format("\nApplicando regras de négocio no cliente %s", cliente.getEmail()));
        return cliente;
    }
}
