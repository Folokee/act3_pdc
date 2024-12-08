public class User {
    public static void main(String[] args) {
        // Création de la facade
        Server server = new Server();

        // Utilisation simplifiée de l'interface unifiée
        System.out.println("Discord channels management :");
        server.sendtextmessage("Buonos Dias todo el mundo");
        server.reacttotextmessage("Buonos Dias todo el mundo!", "❤️");

        server.join_voicechannel();
        server.leave_voicechannel();

        server.launch_vidstreaming();
        server.stop_vidstreaming();
    }  
}
