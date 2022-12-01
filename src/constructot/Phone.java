package constructot;

public class Phone {

    String name;
    String model;
    int price;


   public Phone(String name, String model, int price) {
       this.name = name;
       this.model = model;
       this.price = price;
   }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

}
