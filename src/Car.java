public class Car {
    protected String model;
    protected String mark;
    protected int year;
    protected double engine_volume;

    public Car(String model, String mark, int year, double engine_volume) {
        this.model = model;
        this.mark = mark;
        this.year = year;
        this.engine_volume = engine_volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngine_volume() {
        return engine_volume;
    }

    public void setEngine_volume(double engine_volume) {
        this.engine_volume = engine_volume;
    }
}
