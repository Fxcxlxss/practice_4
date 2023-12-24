package lab4;

public class Atelier {
    public void dressMan (Clothes[] clothes) {
        for (Clothes clothe: clothes) {
            if (clothe instanceof MenClothing)
                System.out.println(clothe);
        }
    }

    public void dreeWomen(Clothes[] clothes) {
        for (Clothes clothe: clothes) {
            if (clothe instanceof WomenClothing)
                System.out.println(clothe);
        }
    }
}
