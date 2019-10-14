package com.gmail.spbisoft.futinfoservicebackend.service;

import com.gmail.spbisoft.futinfoservicebackend.model.FuturesModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutureServiceImpl implements FuturesService{
    @Override
    public List<FuturesModel> findByFuturesMarginLessThan(int margin) {
        return null;
    }
}
