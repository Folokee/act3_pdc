import java.util.Date;

public class ChannelNotification extends Notification {
    public String channelName;

    public ChannelNotification(String message, String channelName) {
        super(message);
        this.createdAt = new Date();
        this.channelName = channelName;
    }
    public void send() {
        System.out.println("====================================");
        System.out.println("Sending a channel notification");
        System.out.println("Channel : " + this.channelName);
        System.out.println(this.message);
    }
}
