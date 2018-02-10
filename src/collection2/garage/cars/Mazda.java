package collection2.garage.cars;

import collection2.garage.optionEnams.DriveUnit;

public class Mazda extends Car {
private boolean presenceOfNavigation;

    public Mazda(String type, String mark, String model, Integer yearOfIssue, DriveUnit driveUnit, boolean presenceOfNavigation) {
        super(type, mark, model, yearOfIssue, driveUnit);
        this.presenceOfNavigation = presenceOfNavigation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mazda)) return false;
        if (!super.equals(o)) return false;

        Mazda mazda = (Mazda) o;

        return presenceOfNavigation == mazda.presenceOfNavigation;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (presenceOfNavigation ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Mazda{" +
                "presenceOfNavigation=" + presenceOfNavigation +
                "} " + super.toString();
    }
}
