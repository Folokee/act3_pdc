public class Txt_channel {
    public void sendMessage(String message) {
        System.out.println("Message " + message + " succefully sent!");
    }

    public void reacttoMessage(String message, String emoji){
        System.err.println("Message " + message + " reacted with " +emoji);
    }
}
