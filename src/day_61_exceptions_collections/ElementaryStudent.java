package day_61_exceptions_collections;
/*
add new class ElementaryStudent

-> name, age
-> encapsulate the data.

in the setter classes:
    setName(String name) :
        if name is empty
            throw illegalArgument Exception
                with message: "Name cannot be empty"
        else
            this.name = name;

    setAge(int age)
        if age is < 5 or more than 12
            throw new illegalArgumentException
                with message: Age cannot be < 5 or > 12
        else
            this.age = age
 */
public class ElementaryStudent {

    private String name;
    private int age;

    public ElementaryStudent(){} // once we create our first constructor then we need to add a empty constructor to avoid errors

    public ElementaryStudent(String name, int age) {//  <<----- constructor is method with the same name class and it allow me to
        // create object or new names
        setName(name);
       setAge(age);

    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // check if name is null first otherwise we will get nullpointer exception
        if (name == null ||name.isEmpty()){
            throw new IllegalArgumentException("Name is not empty or null");

        }
        //if name is all number, or starts with the number
          this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 12) {
            throw new IllegalArgumentException("Age cannot be < 5 or > 12");
        }
        this.age = age;
    }
}
