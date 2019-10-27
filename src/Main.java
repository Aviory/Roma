import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
         Console console = new Console();
        Product table = new Product(console.getString(),console.getInt());
        Product mouse = new Product("mouse",4);
        Ingridient second = new Ingridient("mouse",4);

        mouse.setConsole(console);
        mouse.print();
        Receipt receipt = new Receipt();
        receipt.setIngrid(second);
       // console.vuvod (mouse.getName());


            table.upCost();
            table.downCost();
        table.setName("red table");

    }

}




















