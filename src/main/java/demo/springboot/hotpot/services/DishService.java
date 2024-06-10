package demo.springboot.hotpot.services;

import demo.springboot.hotpot.entities.Dish;
import demo.springboot.hotpot.exception.HttpErrorException;
import demo.springboot.hotpot.models.SaveDishRQ;
import demo.springboot.hotpot.repositories.DishRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DishService {

    @Autowired
    private DishRepository repository;

    public String generateSlug( String name) {
        return "D" + repository.fetchNextDishSlug();
    }

    public Dish create(@Valid SaveDishRQ data) throws HttpErrorException {
        var dataToCreate = Dish.builder()
                .name(data.getName())
                .note(data.getNote())
                .priceUnit(data.getPriceUnit())
                .slug(generateSlug(data.getName()))
                .build();
        Dish createDish = repository.save(dataToCreate);
        return createDish;
    }



    public Dish update(Long id, SaveDishRQ dishDetails) throws HttpErrorException {
        Dish dish = repository.findById(id).orElseThrow();
        dish.setName(dishDetails.getName());
        dish.setNote(dishDetails.getNote());
        dish.setPriceUnit(dishDetails.getPriceUnit());
        Dish updatedDish = repository.save(dish);
        return updatedDish;
    }

}
