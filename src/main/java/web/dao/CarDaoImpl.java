package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    public static final List <Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Car1", 1000, 1991));
        carList.add(new Car("Car2", 2000, 1992));
        carList.add(new Car("Car3", 3000, 1993));
        carList.add(new Car("Car4", 4000, 1994));
        carList.add(new Car("Car5", 5000, 1995));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count > 4) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
