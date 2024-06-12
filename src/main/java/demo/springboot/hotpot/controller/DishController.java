package demo.springboot.hotpot.controller;

import demo.springboot.hotpot.entities.Dish;
import demo.springboot.hotpot.exception.HttpErrorException;
import demo.springboot.hotpot.exception.ResourceNotFoundException;
import demo.springboot.hotpot.models.SaveDishRQ;
import demo.springboot.hotpot.repositories.DishRepository;
import demo.springboot.hotpot.services.DishService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/dishes")
public class DishController {
    private final DishService service;

    @Autowired
    private DishRepository dishRepository;




    @GetMapping
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    // create employee rest api
    @ApiResponse(responseCode = "201")
    @PostMapping
    ResponseEntity<Dish> create(@Valid @RequestBody SaveDishRQ body) throws HttpErrorException {
        var createDish = service.create(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(createDish);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Dish> getDishById(@PathVariable Long id) {
        Dish dish = dishRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Dish not exist with id :" + id));
        ;
        return ResponseEntity.ok(dish);
    }



    @PutMapping("/{id}")
    public ResponseEntity<Dish> updateDish(@PathVariable Long id, @RequestBody SaveDishRQ dishDetails) throws HttpErrorException{
       var updatedDish = service.update(id, dishDetails);
        return ResponseEntity.status(HttpStatus.OK).body(updatedDish);
    }

    // delete employee rest api

}