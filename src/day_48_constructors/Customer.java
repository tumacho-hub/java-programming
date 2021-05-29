package day_48_constructors;

public class Customer {
    public String name;
    private int id;

    public Customer(){
        System.out.println("No args constructor");
      name =  "new customer";
        id = -1;


    }
    public Customer(String name, int id){
        System.out.println("second args");
        this.name = name;// setName(name)
        this.id = id;//  setid(id)

    }









    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
