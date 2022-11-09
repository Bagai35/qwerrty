package manager;

import entity.Product;
import java.util.Scanner;

public class product_manager {
    private Scanner scanner;

    public product_manager(){
        this.scanner = new Scanner(System.in);
    }
    public Product create_product(){
        Product product = new Product();
        System.out.println("Введите название продукта: ");
        product.setName(scanner.nextLine());
        System.out.println("Введите цену товара: ");
        product.setPrice(scanner.nextInt());
        System.out.println("Введите колличество");
        product.setQuantity(scanner.nextInt());
        scanner.nextLine();
        return product;

        }
    }