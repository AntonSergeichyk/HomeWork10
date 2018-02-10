package collection2.garage.cars;

import collection2.garage.optionEnams.DriveUnit;
import collection2.garage.optionEnams.Transmission;

public class Toyota extends Car {
    private Transmission transmission;

    public Toyota(String type, String mark, String model, Integer yearOfIssue, DriveUnit driveUnit, Transmission transmission) {
        super(type, mark, model, yearOfIssue, driveUnit);
        this.transmission = transmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toyota)) return false;
        if (!super.equals(o)) return false;

        Toyota toyota = (Toyota) o;

        return transmission == toyota.transmission;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (transmission != null ? transmission.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "transmission=" + transmission +
                "} " + super.toString();
    }
}
