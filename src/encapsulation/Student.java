package encapsulation;

public class Student {
   private String name;
   private String surname;
   private int age;
   private String [ ] courses;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String [ ] getCourses() {
      return courses;
   }

   public void setCourses(String [ ] courses) {
      this.courses = courses;
   }
}
