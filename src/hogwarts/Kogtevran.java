package hogwarts;

public class Kogtevran extends Hogwarts {
    private int smart; // умный
    private int wise; // мудрый
    private int witty; // остроумный
    private int creative; // полны творчества

    public Kogtevran(String name, int conjure, int move, int smart, int wise, int witty, int creative) {
        super(name, conjure, move);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

//    public int getPointsKogtevran() {
//        int r = 0;
//        r += getPoints() + getSmart() + getWise() + getWitty() + getCreative();
//        return r;
//    }
//
//    public static int getMax(Kogtevran[] studies) {
//        int max = studies[0].getPointsKogtevran();
//        for (int i = 0; i < studies.length; i++) {
//            if (max < studies[i].getPointsKogtevran()) {
//                max = studies[i].getPointsKogtevran();
//            }
//        }
//        return max;
//    }
public int getPointsKogtevran() {
    int r = this.getPoints() + this.getSmart() + this.getWise() + this.getWitty() + this.getCreative();
    return r;
}

    public void getMaxKogtevran(Kogtevran one) {
        int a = getPointsKogtevran();
        int b = one.getPointsKogtevran();
        if (a > b) {
            System.out.println(one.getName() + " - " + a);
        } else {
            System.out.println(one.getName() + " - " + b);
        }
    }

    @Override
    public String toString() {
        return "Меня зовут " + getName() + " мои характеристики: " + getConjure() +  " это колдовство, " + getMove() + " это трансгенерирование, " + getSmart() + " это ум, " + getWise() + " это мудрость, " + getWitty() + " это остроумие, " + getCreative() + " это творчество, итого " + getPointsKogtevran() + " баллов;";
    }
}
