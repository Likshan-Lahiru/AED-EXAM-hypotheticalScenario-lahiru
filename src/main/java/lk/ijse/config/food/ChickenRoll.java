package lk.ijse.config.food;


import lk.ijse.config.FoodLover;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("food-fishBun")
public class ChickenRoll implements FoodLover {
    @Override
    public void loveFood() {
        System.out.println("Chicken roll ");
    }
}
