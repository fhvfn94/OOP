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
//    public int getPointsPuffinduy() {
//        int r = 0;
//        r += getPoints() + getIndustrious() + getLoyalty() + getHonest();
//        return r;
//    }

//    public static int getMax(Puffinduy[] studies1) {
//        int max = studies1[0].getPointsPuffinduy();
//        for (int i = 0; i < studies1.length; i++) {
//            if (max < studies1[i].getPointsPuffinduy()) {
//                max = studies1[i].getPointsPuffinduy();
//            }
//        }
//        return max;
//    }
public int getPointsPuffinduy() {
    int r = this.getPoints() + this.getIndustrious() + this.getLoyalty() + this.getHonest();
    return r;
}

    public static String getMax(Puffinduy puffinduy, Puffinduy puffinduy2) {
        if (puffinduy.getPointsPuffinduy() > puffinduy2.getPointsPuffinduy()) {
            return puffinduy.getName() + " - " + puffinduy.getPointsPuffinduy();
        }
        return puffinduy2.getName() + " - " + puffinduy2.getPointsPuffinduy();
    }
}
