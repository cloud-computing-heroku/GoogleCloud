package com.example.hello.service;

import com.example.hello.model.Shiper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiperServiceImpl implements ShiperService {
    @Override
    public void saveShiper(Shiper shiper) {

    }

    @Override
    public Shiper getShiperByNam(String name) {
        return null;
    }

    @Override
    public boolean deleteShiperByName(String name) {
        return false;
    }

    @Override
    public List<Shiper> getAllShiper() {
        return null;
    }

    @Override
    public boolean isShiperExist(Shiper shiper) {
        return false;
    }
}
