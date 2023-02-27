public class Customer extends Person {
    private int cardNum;

    public Customer(String name, int age, int phone) {
        super(name, age, phone);
        this.setCardNum(cardNum);
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }
}
