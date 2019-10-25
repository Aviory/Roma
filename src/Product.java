public class Product {

   private String name;

    private int cost;


    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public void setName(String variable){

        name = variable;
    }

    public int getCost() {
        return cost;
    }

//    public void setCost(int cost) {
//        this.cost = cost;
//    }

public void upCost(){
        cost ++;

}


public void downCost(){
        if (cost>=0)
        cost --;

}


    public String getName(){
        return name;
    }
}
