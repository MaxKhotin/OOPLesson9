import java.util.Objects;

public class Car {
//    Создать класс Car со следующими полями:
//            • id,
//            • Марка,
//            • Модель,
//            • Год выпуска,
//            • Цвет,
//            • Цена,
//            • Регистрационный номер.
//
//    Определить конструкторы и методы setТип(), getТип(), toString(). В классе Car переопределить методы equals и hashCode.


    private int id;
    private String brand;
    private String model;
    private int productionYear;
    private String color;
    private int price;
    private String licencePlate;

    @Override
    public String toString() {
        return "ID: " + id + " Марка: " + brand + " Модель: " + model + " Год выпуска: " + productionYear + " Цвет: " + color + " Цена: " + price + " Рег.Номер: " + licencePlate;
    }

    public int getId() {
        return id;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public int getProductionYear() {
        return productionYear;
    }


    public String getColor() {
        return color;
    }


    public int getPrice() {
        return price;
    }


    public String getLicencePlate() {
        return licencePlate;
    }


    public Car(){};

    public Car(int id, String brand, String model, int productionYear, String color, int price, String licencePlate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.price = price;
        this.licencePlate = licencePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getId() == car.getId() && getProductionYear() == car.getProductionYear() && getPrice() == car.getPrice() && getBrand().equals(car.getBrand()) && getModel().equals(car.getModel()) && getColor().equals(car.getColor()) && getLicencePlate().equals(car.getLicencePlate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBrand(), getModel(), getProductionYear(), getColor(), getPrice(), getLicencePlate());
    }
}
