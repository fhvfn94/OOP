package hogwarts;

public class Grifendor extends Hogwarts {
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость

    public Grifendor(String name, int conjure, int move, int nobility, int honor, int bravery) {
        super(name, conjure, move);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

//    public int getPointsGrifendor() {
//        int r = 0;
//        r += getPoints() + getNobility() + getHonor() + getBravery();
//        return r;
//    }
//
//    public static int getMax(Grifendor[] studies) {
//        int max = studies[0].getPointsGrifendor();
//        for (int i = 0; i < studies.length; i++) {
//            if (max < studies[i].getPointsGrifendor()) {
//                max = studies[i].getPointsGrifendor();
//            }
//        }
//        return max;
//    }

    public int getPointsGrifendor() {
        int r = this.getPoints() + this.getNobility() + this.getHonor() + this.getBravery();
        return r;
    }

    public void getMaxGrifendor(Grifendor one) {
        int a = getPointsGrifendor();
        int b = one.getPointsGrifendor();
        if (a > b) {
            System.out.println(one.getName() + " - " + a);
        } else {
            System.out.println(one.getName() + " - " + b);
        }
    }

    @Override
    public String toString() {
        return "Меня зовут " + getName() + " мои характеристики: " + getConjure() +  " это колдовство, " + getMove() + " это трансгенерирование, " + getNobility() + " это благородство, " + getHonor() + " это честь, " + getBravery() + " это храбрость, итого" + getPointsGrifendor() + " баллов;";
    }
}
