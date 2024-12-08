public class Main {
    public static void main(String[] args) {
        BasicNotification basicNotification = new BasicNotification("Basic Notification");
        ChannelNotification notchnl = new ChannelNotification("Channel Notification","general");
        DMNotification dmnotif = new DMNotification("Direct Message Notification","user123");

        PriorityNotif priorityNotif = new PriorityNotif(basicNotification, 1);
        PersonalizedRingtoneNotif ringtoneNotif = new PersonalizedRingtoneNotif(basicNotification, "ringtone.mp3");

        PriorityNotif priorityNotif2 = new PriorityNotif(dmnotif, 10);
        priorityNotif2.send();
        notchnl.send();


        priorityNotif.send();
        ringtoneNotif.send();
    }

}
