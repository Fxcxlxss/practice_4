package lab4;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return String.format("%11s%8s%25s%8s%8.2f%5s%8s%13s","TShirt: ","size - ",getSize(),", cost = ",getCost()," руб ","color - ",getColor());
    }
}
