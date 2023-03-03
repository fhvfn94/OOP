package hogwarts;

public class Hogwarts {
    private int conjure; // колдовать
    private int move; // транс генерировать
    private String name; // имя ученика

    public Hogwarts(String name, int conjure, int move) {
        this.setName(name);
        this.setConjure(conjure);
        this.setMove(move);
    }

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getPoints() {
//        int r = 0;
//        r += getConjure() + getMove();
//        return r;
//    }
//    public static int getMax(Hogwarts[] hogwarts) {
//        int max = hogwarts[0].getPoints();
//        for (int i = 0; i < hogwarts.length; i++) {
//            if (max < hogwarts[i].getPoints()) {
//                max = hogwarts[i].getPoints();
//            }
//        }
//        return max;
//    }

    public  int getPoints(){
        int r = this.getConjure() + this.getMove();
        return r;
    }

    public static String getMax(Hogwarts one, Hogwarts two) {
        if (one.getPoints() > two.getPoints()) {
            return one.getName() + " - " + one.getPoints();
        }
        return two.getName() + " - " + two.getPoints();
    }

    @Override
    public String toString() {
        return "Меня зовут " + getName() + " мои характеристики: " + getConjure() +  " это колдовство, " + getMove() + " это трансгенерирование, итого " + getPoints() + " баллов;";
    }
}
