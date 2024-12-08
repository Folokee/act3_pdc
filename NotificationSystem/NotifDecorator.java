abstract class NotifDecorator extends Notification{
    protected Notification notification;
    public NotifDecorator(Notification notification){
        super(notification.message);
        this.notification = notification;
    }
    @Override
    abstract public void send();
}
