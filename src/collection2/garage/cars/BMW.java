package collection2.garage.cars;

import collection2.garage.optionEnams.DriveUnit;

public class BMW extends Car {
    private boolean alarmPresence;

    public BMW(String type, String mark, String model, Integer yearOfIssue, DriveUnit driveUnit, boolean alarmPresence) {
        super(type, mark, model, yearOfIssue, driveUnit);
        this.alarmPresence = alarmPresence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BMW)) return false;
        if (!super.equals(o)) return false;

        BMW bmw = (BMW) o;

        return alarmPresence == bmw.alarmPresence;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (alarmPresence ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "alarmPresence=" + alarmPresence +
                "} " + super.toString();
    }
}
