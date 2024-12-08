import java.util.Date;

public class DMNotification extends Notification {
    public String sender;

    public DMNotification(String message, String sender) {
        super(message);
        this.createdAt = new Date();
        this.sender = sender;
    }
    public void send() {
        System.out.println("====================================");
        System.out.println("Sending a direct message notification");
        System.out.println("From : " + this.sender);
        System.out.println(this.message);
    }
}
