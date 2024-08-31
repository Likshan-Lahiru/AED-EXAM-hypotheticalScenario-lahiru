package lk.ijse.config.customer;

import jakarta.annotation.PostConstruct;
import lk.ijse.config.FoodLover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {

    private FoodLover foodLover;

    @Autowired
    @Qualifier("food-fishBun")
    public void setGoodGirl(FoodLover foodLover) {
        this.foodLover = foodLover;
    }

    @PostConstruct
    public void init(){
        System.out.println(foodLover);
        foodLover.loveFood();
    }

}
