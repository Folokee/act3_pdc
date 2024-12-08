import java.util.Date;

public class BasicNotification extends Notification {
    public BasicNotification(String message) {
        super(message);
        this.createdAt = new Date();
    }
    public void send() {
        System.out.println("====================================");
        System.out.println("Sending a basic notification");
        System.out.println(this.message);

    }
}
