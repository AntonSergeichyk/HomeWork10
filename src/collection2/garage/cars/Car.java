package collection2.garage.cars;

import collection2.garage.optionEnams.DriveUnit;
import collection2.garage.optionEnams.TypeEngine;

public class Car {
    private String Type;
    private String mark;
    private String model;
    private Integer year;
    private DriveUnit driveUnit;
    private TypeEngine typeEngine;

    public Car(String type, String mark, String model, Integer year, DriveUnit driveUnit) {
        Type = type;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.driveUnit = driveUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (Type != null ? !Type.equals(car.Type) : car.Type != null) return false;
        if (mark != null ? !mark.equals(car.mark) : car.mark != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (year != null ? !year.equals(car.year) : car.year != null) return false;
        if (driveUnit != car.driveUnit) return false;
        return typeEngine == car.typeEngine;
    }

    @Override
    public int hashCode() {
        int result = Type != null ? Type.hashCode() : 0;
        result = 31 * result + (mark != null ? mark.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (driveUnit != null ? driveUnit.hashCode() : 0);
        result = 31 * result + (typeEngine != null ? typeEngine.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Type='" + Type + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", driveUnit=" + driveUnit +
                ", typeEngine=" + typeEngine +
                '}';
    }
}
