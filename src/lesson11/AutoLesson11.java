package lesson11;

public class AutoLesson11 implements Comparable<AutoLesson11> {

    private int price;
    private String producer;
    private long weight;

    public AutoLesson11(int price, String producer, long weight) {
        this.price = price;
        this.producer = producer;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(AutoLesson11 o) {
        return this.price-o.getPrice();
    }

    @Override
    public String toString() {
        return "AutoLesson11{" +
                "price=" + price +
                ", producer='" + producer + '\'' +
                ", weight=" + weight +
                '}';
    }
}
