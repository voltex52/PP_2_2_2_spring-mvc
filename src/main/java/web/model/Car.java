package web.model;

public class Car {
    private final String model;
    private final int seria;
    private final int age;

    public Car(String model, int seria, int age) {
        this.model = model;
        this.seria = seria;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public int getSeria() {
        return seria;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", seria=" + seria +
                ", age=" + age +
                '}';
    }
}
