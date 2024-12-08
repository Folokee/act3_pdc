import java.util.Date;

abstract class Notification {
    protected String message;
    protected Date createdAt;
    public Notification(String message) {
        this.message = message;
    }
    public abstract void send();
}
