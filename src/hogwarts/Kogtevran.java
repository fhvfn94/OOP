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
}
