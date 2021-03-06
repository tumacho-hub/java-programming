package day_65_collections;

public class PersonClass implements Comparable<PersonClass> {
    String name;
    int age;

    public PersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person [name =" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(PersonClass o) {
        return  (this.name.compareTo(o.name) == 0) ? Integer.compare(this.age, o.age)
                : this.name.compareTo(o.name);


//        if (this.name.charAt(0) > o.name.charAt(0)) {
//            return 1;
//        } else if (this.name.charAt(0) == o.name.charAt(0)) {
//
//            if (this.age > o.age){
//                return 1;
//            }else if (this.age == o.age){
//                return 0;
//            }else {
//                return -1;
//            }
//
//        } else {
//            return -1;
//        }
   }
}