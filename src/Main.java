import hogwarts.Grifendor;
import hogwarts.Hogwarts;
import hogwarts.PrintQualityOfCharacter;
import hogwarts.Slizerin;

public class Main {
    public static void main(String[] args) {
        Slizerin drako = new Slizerin("Драко Малфой", 10, 10, 12, 2, 10, 14, 54);
        Slizerin montegu = new Slizerin("Грэхэм Монтегю", 5, 5, 5, 5, 5, 5, 5);
        Slizerin goyl = new Slizerin("Грегори Гойл", 3, 3, 3, 3, 3, 4, 4);
        Grifendor harry = new Grifendor("Гарии Поттер", 2, 2, 2, 1, 1);
        System.out.println(harry.getMax(drako));
    }
}