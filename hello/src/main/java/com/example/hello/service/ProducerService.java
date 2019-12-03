package com.example.hello.service;

import com.example.hello.model.Producer;

import java.util.List;

public interface ProducerService {
    void saveProducer(Producer producer);

    Producer getProducerByName(String name);

    boolean deleteProducerByName(String name);

    List<Producer> getAllProducer();

    boolean isProducerExist(Producer producer);
}
