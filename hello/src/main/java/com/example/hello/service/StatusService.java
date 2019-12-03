package com.example.hello.service;

import com.example.hello.model.Status;

import java.util.List;
import java.util.UUID;

public interface StatusService {
    void saveStatus(Status status);

    Status getStatusById(UUID uuid);

    boolean deleteStatusById(UUID uuid);

    List<Status> getAllStatus();

    boolean isStatusExist(Status status);
}
