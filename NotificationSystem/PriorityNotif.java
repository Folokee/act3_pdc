public class PriorityNotif extends NotifDecorator {
    private int priority;
    public PriorityNotif(Notification notification, int priority) {
        super(notification);
        this.priority = priority;
    }
    @Override
    public void send() {
        this.notification.send();
        System.out.println("Priority: " + this.priority);

    }
}
