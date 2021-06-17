package day52_inheritance.mobileParctice.discordusers;

public class Admin extends User{

    public Admin(){
        System.out.println("admin constructor");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
