package web.CarDAO;

import org.springframework.stereotype.Component;
import web.Car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private static int carCounter;
    private List<Car> carModel;
    {
        carModel = new ArrayList<>();
        carModel.add(new Car(++carCounter, "BMW", "Yelow"));
        carModel.add(new Car(++carCounter, "Volga", "Белая"));
        carModel.add(new Car(++carCounter, "KIA", "Red"));
        carModel.add(new Car(++carCounter, "LADA", "Вишневая"));
        carModel.add(new Car(++carCounter, "TAZ", "Black"));
    }


    public List<Car> showFullTable(){
        return carModel.stream().toList();
    }

    public List<Car> showCarTable (int id) {
        return carModel.stream()
                .limit(id)
                .toList();

    }
}
