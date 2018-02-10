package collection2.garage.cars;

import collection2.garage.optionEnams.DriveUnit;
import collection2.garage.optionEnams.State;

public class Niva extends Car {
    private State state;

    public Niva(String type, String mark, String model, Integer yearOfIssue, DriveUnit driveUnit, State state) {
        super(type, mark, model, yearOfIssue, driveUnit);
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Niva)) return false;
        if (!super.equals(o)) return false;

        Niva niva = (Niva) o;

        return state == niva.state;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Niva{" +
                "state=" + state +
                "} " + super.toString();
    }
}
