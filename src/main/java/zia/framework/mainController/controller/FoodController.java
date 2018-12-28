package zia.framework.mainController.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zia.framework.mainController.domain.Food;
import zia.framework.mainController.repository.FoodRepository;


import java.util.List;

@RestController
@Slf4j
public class FoodController {

    FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @GetMapping("/id/{id}")
    public Food getFood(@PathVariable String id) {
        log.debug("Getting Food id : " + id);

        return foodRepository.getOne(id);
    }

    @GetMapping("/list/spicylevel/{spicylevel}")
    public List<Food> getFood(@PathVariable Integer spicylevel) {
        log.debug("Getting Food List by spicylevel : " + spicylevel);


        return foodRepository.findAllBySpicylevelOrderById(spicylevel);

    }

}