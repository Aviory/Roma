public class Ingridient extends Product{

    public String getConcetr() {
        return concetr;
    }

    public void setConcetr(String concetr) {
        this.concetr = concetr;
    }

    private String concetr;




    public Ingridient(String name, int cost) {
        super(name, cost);
    }



}
