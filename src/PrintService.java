public class PrintService {


    public void PrintService(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println(person.getName() + "; " + person.getAge() + "; " + person.getPhone());
        }
    }

    public static void PrintService(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println(customer.getName() + "; " + customer.getAge() + "; " + customer.getCardNum());
        }
    }

}

