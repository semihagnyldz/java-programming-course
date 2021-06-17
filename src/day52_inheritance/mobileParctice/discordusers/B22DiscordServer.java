package day52_inheritance.mobileParctice.discordusers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1= new User();
        user1.setId(1234);
        user1.setName("semiha");
        user1.setRole("student");

        Admin admin1= new Admin();
        admin1.setId(3456);
        admin1.setName("suheyla");
        admin1.setRole("admin");

        System.out.println(admin1);
        System.out.println(user1);
    }
}
