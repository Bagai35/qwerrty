package manager;
import entity.Customer;
import java.util.Scanner;

public class customer_manager {

    private Scanner scanner;

    public customer_manager(){
        this.scanner = new Scanner(System.in);
    }
    public Customer create_customer(){
        Customer customer = new Customer();
        System.out.println("Введите имя: ");
        customer.setFirstname(scanner.nextLine());
        System.out.println("Введите фамилию: ");
        customer.setLastname(scanner.nextLine());
        System.out.println("Добавьте на счёт денег: ");
        customer.setMoney(scanner.nextInt());
        scanner.nextLine();
        return customer;
    }
}
