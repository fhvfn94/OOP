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
}
