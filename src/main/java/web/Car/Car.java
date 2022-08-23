package web.Car;


public class Car {
    int number;
    String model;
    String color;

    public Car() {
    }

    public Car(int number, String model, String color) {
        this.number = number;
        this.model = model;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
