
public class Main {
    public static void main(String[] args) {
        Person[] mens = {
                new Person("Sasha", 24, 1234),
                new Person("Sarah", 12, 7890),
                new Person("Jane", 13, 45454545)
        };
        PrintService printService = new PrintService();
        printService.PrintService(mens);

        Customer[] customers = {
                new Customer("Yana", 12, 1234),
                new Customer("Janna", 42, 567),
                new Customer("Ivan", 80, 6543),
                new Customer("Petr", 6, 987),
        };
        printService.PrintService(customers);
    }
}