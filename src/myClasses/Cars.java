package myClasses;

import java.util.Objects;

public class Cars {
    public String brand;
    public String model;
    public int price;
    public int weight;
    public String color;

    public Cars(){ // sosdaem otdelno konstruktor chtob6 rabot s NISSAN

    }
    public Cars(String brand, String model, int price, int weight, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() { //Chto eto daet???
        return "Cars_L4_HW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cars)) return false;
        Cars that = (Cars) o;
        return price == that.price &&
                weight == that.weight &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(model, that.model) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price, weight, color);
    }


}
