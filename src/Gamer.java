public class Gamer  extends Person{
    private String platform;
    public Gamer(String name, int age, int phone, String platform) {
        super(name, age, phone);
        this.setPlatform(platform);
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
