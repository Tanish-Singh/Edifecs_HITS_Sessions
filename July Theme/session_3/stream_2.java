import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



class prod{
    private int id;
    private String name;
    private int price;
    
    @Override // to string method to output all as a string
    public String toString() {
        return "prod [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    // generate this constructor also by source action then generate constructor
    public prod(int id, String name, int price) {
        super();
        this.id = id;// this is instance variable
        this.name = name;
        this.price = price;
    }
    // rightclick -> source -> generate getters setters
    public int getId() {
        return id;
    }
    public void setId(int id) { // here int id is a local variable
        this.id = id;// here we need to assign a value id from local to instance variable
        // but if we dont use this it will traet both as local variable
        // but we need to id local to assign value to id instance hence this will
        // do that for me
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
public class stream_2 {
    private static List<prod> getProds(){
        List<prod> prodlist = new ArrayList<prod>();
        prodlist.add(new prod(1,"marker",20));
        prodlist.add(new prod(2,"pencil",8));
        prodlist.add(new prod(3,"scale",15));
        prodlist.add(new prod(4,"Eraser",10));

        return prodlist;
    }
    public static void main(String[] args) {

        System.out.println("Filtering..");
        // using stream api
        getProds().stream().filter((prod)-> prod.getPrice() > 10).forEach(System.out::println);
                        // stream.filter to apply filter
                        //for each to get output
        System.out.println("Sorting by price");
        // sorting 
        getProds().stream().sorted((o1,o2)->(o1.getPrice()-o2.getPrice()))
        .forEach(System.out::println);

        System.out.println("SOrting by name");
        getProds().stream().sorted(Comparator.comparing(prod::getName))
        .forEach(System.out::println);
    }
}
