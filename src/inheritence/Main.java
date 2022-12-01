package inheritence;

public class Main {
    public static void main(String[] args) {

        /** обычный Getter Setter**/

       /* Cat cat = new Cat();
        cat.setName("Snow");
        cat.setAge(3);
        cat.setColor("white");

        System.out.println(cat.getName() + "  " + cat.getAge() + "  " + cat.getColor());

        Dog dog = new Dog();
        dog.setName("Berti");
        dog.setAge(5);
        dog.setWeight("30");

        System.out.println(dog.getName() + "  " + dog.getAge() + "  " + dog.getWeight());
        */



        /**Конструктор**/

      /*Cat cat = new Cat("Snow",3,"White");
        Dog dog = new Dog("Berti",5,"30");

        System.out.println(cat.getName() + "  " + cat.getAge() + "  " + cat.getColor());
        System.out.println(dog.getName() + "  " + dog.getAge() + "  " + dog.getWeight());
       */

        /** toString  **/
        Cat cat = new Cat("Snow",3,"White");
        Dog dog = new Dog("Berti",5,"30");
        System.out.println(cat);
        System.out.println(dog);
    }
}
