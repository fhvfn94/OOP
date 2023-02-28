import hogwarts.Hogwarts;
import hogwarts.PrintQualityOfCharacter;
import hogwarts.Puffinduy;
import hogwarts.Slizerin;

import static hogwarts.Slizerin.getMax;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Драко Малфой", 10, 10),
                new Hogwarts("Грэхэм Монтегю", 5, 5),
                new Hogwarts("Грегори Гойл", 3, 3),
                new Hogwarts("Драко Малфой", 100, 100),
                new Hogwarts("Падма Патил", 853, 743),
                new Hogwarts("Чжоу Чанг", 38, 99),
                new Hogwarts("Рон Уизли", 53, 63),
                new Hogwarts("Гермиона Грейнджер", 35, 36),
                new Hogwarts("Гарри Поттер", 30, 30),
        };

        System.out.println(Hogwarts.getMax(hogwarts));
        Slizerin[] studies = {
                new Slizerin("Драко Малфой", 10, 10, 12, 2, 10, 14, 54),
                new Slizerin("Грэхэм Монтегю", 5, 5, 5, 5, 5, 5, 5),
                new Slizerin("Грегори Гойл", 3, 3, 3, 3, 3, 4, 4)
        };

        Puffinduy[] studies1 = {
                new Puffinduy("Драко Малфой", 100, 100, 10, 10, 10),
                new Puffinduy("Грэхэм Монтегю", 5, 5, 5, 5, 5),
                new Puffinduy("Грегори Гойл", 3, 3, 3, 3, 3)
        };
        for (int i = 0; i < studies1.length; i++) {
            System.out.println(studies1[i].getPointsPuffinduy());
        }
        System.out.println(Puffinduy.getMax(studies1));



    }
}