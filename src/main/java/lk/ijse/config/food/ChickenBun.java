package lk.ijse.config.food;

import lk.ijse.config.FoodLover;
import org.springframework.stereotype.Component;

@Component
public class ChickenBun implements FoodLover {
    @Override
    public void loveFood() {
        System.out.println("Chicken Bun");
    }
}
