package hogwarts;

public class Puffinduy extends Hogwarts {
    private int industrious; // трудолюбивы
    private int loyalty; // верность
    private int honest; // честный

    public Puffinduy(String name, int conjure, int move, int industrious, int loyalty, int honest) {
        super(name, conjure, move);
        this.industrious = industrious;
        this.loyalty = loyalty;
        this.honest = honest;
    }

    public int getIndustrious() {
        return industrious;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
