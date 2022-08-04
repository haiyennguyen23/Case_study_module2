package payroll;

import main.Staff;

public class Partime extends Staff {
    private int hourWork;

    public Partime() {
    }
    public Partime(int hourWork) {
        super();
        this.hourWork = hourWork;
    }
    public int getHourwwork() {
        return hourWork;
    }

    public void setHourwwork(int hourwwork) {
        this.hourWork = hourwwork;
    }

    @Override
    public String toString() {
        return "Partime{" +
                "hourWork=" + hourWork +
                '}';
    }
}
