package exam;

public class Student implements StudentAble {
    String fullName;
    int age;
    String email;
    Gender gender;


    public Student(String fullName, int age, String email, Gender gender) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "Student: " + "\n" +
                "fullName: " + fullName + '\n' +
                "age: " + age + "\n" +
                "email: " + email + '\n' +
                "gender: " + gender;
    }
}
