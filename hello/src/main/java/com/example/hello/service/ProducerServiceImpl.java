package com.example.hello.service;

import com.example.hello.model.Producer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerServiceImpl implements ProducerService {
    @Override
    public void saveProducer(Producer producer) {

    }

    @Override
    public Producer getProducerByName(String name) {
        return null;
    }

    @Override
    public boolean deleteProducerByName(String name) {
        return false;
    }

    @Override
    public List<Producer> getAllProducer() {
        return null;
    }

    @Override
    public boolean isProducerExist(Producer producer) {
        return false;
    }
}
