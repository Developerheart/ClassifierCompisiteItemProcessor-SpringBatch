package com.springbatch.processadorclassifier.processor;

import com.springbatch.processadorclassifier.dominio.Cliente;
import com.springbatch.processadorclassifier.dominio.Transacao;
import com.springbatch.processadorclassifier.processor.classifier.ClienteProcessor;
import com.springbatch.processadorclassifier.processor.classifier.TransacaoProcessor;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemProcessorBuilder;
import org.springframework.classify.Classifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessadorClassifierProcessorConfig {

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Bean
    public ItemProcessor processadorClassifierProcessor() {
        return new ClassifierCompositeItemProcessorBuilder<>()
                .classifier(classifier())
                .build();
    }

    @SuppressWarnings("rawtypes")
    public Classifier classifier() {
        return new Classifier<Object, ItemProcessor>() {
            @Override
            public ItemProcessor classify(Object objeto) {
                return switch (objeto) {
                    case Cliente  cliente-> new ClienteProcessor();
                    case Transacao transacao -> new TransacaoProcessor();
                    default -> throw new IllegalStateException("Unexpected value: " + objeto);
                };
            }
        };
    }

}
