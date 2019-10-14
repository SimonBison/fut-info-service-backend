package com.gmail.spbisoft.futinfoservicebackend.service;

import com.gmail.spbisoft.futinfoservicebackend.model.FuturesModel;

import java.util.List;

public interface FuturesService {

    List<FuturesModel> findByFuturesMarginLessThan(int margin);  // dan RC
}
