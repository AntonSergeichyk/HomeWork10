package collection2.garage;

import collection2.garage.cars.Car;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private static Map<Car, Integer> garage = new HashMap<>();

    public static void parkingCar(Car car) {
        if (!garage.containsKey(car)) {
            garage.put(car, 1);
        } else {
            garage.put(car, garage.get(car) + 1);
        }
    }

    public static void exitCar(Car car) {
        if (garage.get(car)>1) {
            garage.put(car, garage.get(car) - 1);
        } else {
            garage.remove(car);
        }
    }

    public static int getNumberIdenticalCars(Car car) {
        return garage.get(car);
    }

    public static Map<Car, Integer> getGarage() {
        return garage;
    }
}
