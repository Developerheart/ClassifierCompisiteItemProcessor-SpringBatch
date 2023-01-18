package com.springbatch.processadorclassifier.processor.classifier;

import com.springbatch.processadorclassifier.dominio.Transacao;
import org.springframework.batch.item.ItemProcessor;

public class TransacaoProcessor implements ItemProcessor<Transacao, Transacao> {
    @Override
    public Transacao process(Transacao transacao) throws Exception {
        System.out.println(String.format("Processando transação %s", transacao.getId()));
        return transacao;
    }
}
