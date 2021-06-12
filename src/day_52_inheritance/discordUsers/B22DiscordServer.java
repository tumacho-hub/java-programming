package day_52_inheritance.discordUsers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setID(1234);
        user1.setName("Pojo");
        user1.setRole("Student");

        Admin admin = new Admin();
        admin.setID(43145);
        admin.setName("burak kara");
        admin.setRole("Admin");
        System.out.println(user1);
        System.out.println(admin);

Admin admin1 = new Admin("Gullia", 4138);
        System.out.println(admin1.toString());

    }
}
