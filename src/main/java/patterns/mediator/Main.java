package patterns.mediator;

public class Main {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat,"admin");
        User user1 = new SimpleUser(chat,"User1");
        User user2 = new SimpleUser(chat,"User2");
        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("hello I m user 1");

    }
}
