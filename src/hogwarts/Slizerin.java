package hogwarts;

public class Slizerin extends Hogwarts {
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int lustForPower; // жажда власти

    public Slizerin(String name, int conjure, int move, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, conjure, move);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    //    public int getPointsSlizerin() {
//        int r = 0;
//        r += getPoints() + getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForPower();
//        return r;
//    }
//
//    public static int getMax(Slizerin[] studies) {
//        int max = studies[0].getPointsSlizerin();
//        for (int i = 0; i < studies.length; i++) {
//            if (max < studies[i].getPointsSlizerin()) {
//                max = studies[i].getPointsSlizerin();
//            }
//        }
//        return max;
//    }
    public int getPointsSlizerin() {
        int r = this.getPoints() + this.getCunning() + this.getLustForPower() + this.getAmbition() + this.getResourcefulness();
        return r;
    }

    public void getMaxSlizerin(Slizerin one) {
        int a = getPointsSlizerin();
        int b = one.getPointsSlizerin();
        if (a > b) {
            System.out.println(one.getName() + " - " + a);
        } else {
            System.out.println(one.getName() + " - " + b);
        }
    }

    @Override
    public String toString() {
        return "Меня зовут " + getName() + " мои характеристики: " + getConjure() +  " это колдовство, " + getMove() + " это трансгенерирование, " + getCunning() + " это хитрость, " + getDetermination() + " это амбициозность, " + getAmbition() + " это амбициозность, " + getResourcefulness() + " это находчивость, "  + getLustForPower() + " это жажда власти, итого " + getPointsSlizerin() + " баллов;";
    }
}
