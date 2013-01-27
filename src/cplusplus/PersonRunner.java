package cplusplus;

public class PersonRunner {
    public static void main(String[] args) {
        Person p = new Person("Fred", 123);
        Person p1 = new Person("Fred", 123);
        System.out.println(p);
        //p1.setGrade(97);
        System.out.println(p1);
        if (p.equals(p1))
            System.out.println("Duplicate");
        else
            System.out.println("Different");
    }
}