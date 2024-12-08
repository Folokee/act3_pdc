public class PersonalizedRingtoneNotif extends NotifDecorator {
    private String FileName;
    public PersonalizedRingtoneNotif(Notification notification, String FileName) {
        super(notification);
        this.FileName = FileName;
    }
    @Override
    public void send() {
        this.notification.send();
        System.out.println("Ringtone: " + this.FileName);
    }
}
