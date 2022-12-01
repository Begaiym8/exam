package constructot;

public class Main {
    public static void main(String[] args) {

   /**Phone**/

  /* Phone phone = new Phone("Apple","Iphone 12", 65000 );
   Phone phone1 = new Phone("Sony","Zet", 30000 );
        System.out.println(phone.getName()+"  "+phone.getModel()+"   "+phone.getPrice());
        System.out.println(phone1.getName()+"  "+phone1.getModel()+"  "+phone1.getPrice()); */

        /**Cat Dog**/

        Cat cat = new Cat("Tom","Black");
        Cat cat1 = new Cat("Smoki","Grey");
        System.out.println("Cats: ");
        System.out.println(cat.getName() + "  " + cat.getColor() + "\n" +
                cat1.getName() + "  " + cat1.getColor());

        System.out.println("----------------");

        Dog dog = new Dog("Botsman","Brown");
        Dog dog1 = new Dog("Rexs","white");
        System.out.println("Dogs: ");
        System.out.println(dog.getName() + "  " + dog.getColor() + "\n" +
                dog1.getName() + "  " + dog1.getColor());



    }
}