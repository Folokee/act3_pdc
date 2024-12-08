public class Server {
    private Txt_channel textchannel;
    private Voice_channel voicechannel;
    private Video_channel videochannel;

    public Server() {
        this.textchannel = new Txt_channel();
        this.voicechannel = new Voice_channel();
        this.videochannel = new Video_channel();
    }

    public void sendtextmessage(String message){
        textchannel.sendMessage(message);
    }
    public void reacttotextmessage(String message, String emoji){
        textchannel.reacttoMessage(message, emoji);
    }
    public void join_voicechannel(){
        voicechannel.joinvoicechannel();
    }
    public void leave_voicechannel(){
        voicechannel.leavevoicechannel();
    }
    public void launch_vidstreaming(){
        videochannel.startstreaming();
    }
    public void stop_vidstreaming(){
        videochannel.endstreaming();
    }
}
