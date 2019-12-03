package com.example.hello.service;

import com.example.hello.model.Shiper;

import java.util.List;

public interface ShiperService {
    void saveShiper(Shiper shiper);

    Shiper getShiperByNam(String name);

    boolean deleteShiperByName(String name);

    List<Shiper> getAllShiper();

    boolean isShiperExist(Shiper shiper);
}
