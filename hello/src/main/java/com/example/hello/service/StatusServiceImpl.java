package com.example.hello.service;

import com.example.hello.model.Status;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StatusServiceImpl implements StatusService {
    @Override
    public void saveStatus(Status status) {

    }

    @Override
    public Status getStatusById(UUID uuid) {
        return null;
    }

    @Override
    public boolean deleteStatusById(UUID uuid) {
        return false;
    }

    @Override
    public List<Status> getAllStatus() {
        return null;
    }

    @Override
    public boolean isStatusExist(Status status) {
        return false;
    }
}
