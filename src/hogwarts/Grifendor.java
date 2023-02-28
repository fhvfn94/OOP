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

    public int getPointsGrifendor() {
        int r = 0;
        r += getPoints() + getNobility() + getHonor() + getBravery();
        return r;
    }

    public static int getMax(Grifendor[] studies) {
        int max = studies[0].getPointsGrifendor();
        for (int i = 0; i < studies.length; i++) {
            if (max < studies[i].getPointsGrifendor()) {
                max = studies[i].getPointsGrifendor();
            }
        }
        return max;
    }
}
