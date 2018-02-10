package collection2.garage;

import collection2.garage.cars.BMW;
import collection2.garage.cars.Mazda;
import collection2.garage.cars.Niva;
import collection2.garage.cars.Toyota;
import collection2.garage.optionEnams.DriveUnit;
import collection2.garage.optionEnams.State;
import collection2.garage.optionEnams.Transmission;

public class Main {

    public static void main(String[] args) {
        Garage.parkingCar(new BMW("Внедорожник", "БМВ", "Х6", 2011, DriveUnit.REAR_DRIVE, true));
        Garage.parkingCar(new Toyota("Седан", "Тайота", "Камри", 2012, DriveUnit.FRONT_WHEEL_DRIVE, Transmission.AUTOMATIC));
        Garage.parkingCar(new Toyota("Седан", "Тайота", "Камри", 2012, DriveUnit.FRONT_WHEEL_DRIVE, Transmission.AUTOMATIC));
        Garage.parkingCar(new Mazda("Хетчбэк", "Мазда", "636", 2001, DriveUnit.FRONT_WHEEL_DRIVE, true));
        Garage.parkingCar(new Niva("Cедан", "Нива", "2131", 1996, DriveUnit.REAR_DRIVE, State.EMERGENCY));
        Garage.parkingCar(new Niva("Cедан", "Нива", "2131", 1996, DriveUnit.REAR_DRIVE, State.EMERGENCY));
        Garage.parkingCar(new Niva("Cедан", "Нива", "2131", 1996, DriveUnit.REAR_DRIVE, State.EMERGENCY));

        Garage.exitCar(new Niva("Cедан", "Нива", "2131", 1996, DriveUnit.REAR_DRIVE, State.EMERGENCY));

        System.out.printf("В гараже находится %s Нивы\n", Garage.getNumberIdenticalCars(new Niva("Cедан", "Нива", "2131", 1996, DriveUnit.REAR_DRIVE, State.EMERGENCY)));
        System.out.printf("В гараже находится %s Тайоты\n", Garage.getNumberIdenticalCars(new Toyota("Седан", "Тайота", "Камри", 2012, DriveUnit.FRONT_WHEEL_DRIVE, Transmission.AUTOMATIC)));
    }
}
