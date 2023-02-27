import hogwarts.PrintQualityOfCharacter;
import hogwarts.Slizerin;

public class Main {
    public static void main(String[] args) {
        Slizerin[] studies = {
                new Slizerin("Драко Малфой", 10, 10, 12, 2, 10, 14, 54),
                new Slizerin("Грэхэм Монтегю", 5, 5, 5, 5, 5, 5, 5),
                new Slizerin("Грегори Гойл", 3, 3, 3, 3, 3, 4, 4)
        };
        PrintQualityOfCharacter printQualityOfCharacter = new PrintQualityOfCharacter();
        printQualityOfCharacter.print(studies);

    }
}