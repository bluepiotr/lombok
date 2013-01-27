package cplusplus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
//@AllArgsConstructor
@EqualsAndHashCode(exclude={"grade"})
public class Person {
    @NonNull
    private String name;
    @NonNull
    private int id;
    private double grade;
    
}

//    public Person(){
////        this.name = "Bob";
////        this.id = 5;
//        this("Bob",5);
//    }
//
//    public Person(String name, int id){
//        this.setName(name);
//        this.setId(id);
//    }
//
//    @Override
//    public boolean equals(Object o){
//        if (!(o instanceof Person))  return false;
//        Person p = (Person)o;
//        return this.getId() == p.getId() && this.getName().equals(p.getName());
//    }
//
//    @Override
//    public String toString(){
//        return "Name: " + getName() + " ID: " + getId() + " Grade: " + getGrade();
//    }
//
//    public void setGrade(double value){
//        this.grade = value;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public double getGrade() {
//        return grade;
//    }
//}