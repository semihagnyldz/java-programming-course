package day48_constructors_static;

public class Customer {
    private String fullName;
    private int id;

    //No argumant constructor
    public Customer (){
        System.out.println("no-args constructor");//normally we dont print anything here
        fullName= "new costumer";
        id= -1;

    }
    public Customer(String fullName, int id){//instead of this we can use setter method which is better
        System.out.println("2-args constructor");
        this.fullName=fullName;//also:setFullName(fullName)
        this.id=id;//also: setId(id)

    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
