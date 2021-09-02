import java.util.ArrayList;
import java.util.List;

public class Car {

    private final String brand;

    private int velocity;

    private final List<String> goods;

    public Car(String brand) {
        this.brand = brand;
        this.velocity = 0;
        this.goods = new ArrayList<>();
    }

    public String getBrand() {
        return brand;
    }

    public int getVelocity() {
        return velocity;
    }

    public List<String> getGoods() {
        return goods;
    }

    public void accelerate() {
        this.velocity++;
    }

    public void throttle() {
        if (velocity > 0)
            this.velocity--;
        else
            System.out.println("Already standing");
    }

    public void putToLuggageSpace(String good) {
        this.goods.add(good);
    }

    public void removeFromLuggageSpace(String good) {
        if (goods.contains(good))
            goods.remove(good);
        else
            System.out.println("Not present");
    }

    @Override
    public String toString() {
        return "Ich bin ein Auto" +
                " vom Typ='" + brand + '\'' +
                ", fahre aktuell " + velocity + " km/h " +
                ", und habe im Kofferraum " + goods;
    }
}
