package com.gmail.spbisoft.futinfoservicebackend.controller;


import com.gmail.spbisoft.futinfoservicebackend.model.FuturesModel;
import com.gmail.spbisoft.futinfoservicebackend.repository.FuturesRepository;
import com.gmail.spbisoft.futinfoservicebackend.service.FuturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController()
@RequestMapping("/futures")
public class FuturesController {

    @Autowired
    FuturesRepository futuresRepository;

    @Autowired
    FuturesService futuresService;

    @GetMapping("/all")
    public List<FuturesModel> getAll() {
        return futuresRepository.findAll();
    }

    @PostMapping("/create")
    public List<FuturesModel> persist(@RequestBody final FuturesModel futuresModel) {
        futuresRepository.save(futuresModel);

        return futuresRepository.findAll();
    }

    @GetMapping("/affordable/{margin}")
    public List<FuturesModel> getAffordable(@PathVariable int margin) {
        return futuresService.findByFuturesMarginLessThan(margin);
    }

    @DeleteMapping("/delete/{id}")
    public List<FuturesModel> remove(@PathVariable int id) {
        futuresRepository.deleteById(id);

        return futuresRepository.findAll();
    }

    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
