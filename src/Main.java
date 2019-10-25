import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
            Product table = new Product(Console.getString(),Console.getInt());
            Product mouse = new Product("mouse",4);
                table.upCost();
                table.downCost();
            table.setName("red table");
        System.out.println(table.toString());
    }

}




















