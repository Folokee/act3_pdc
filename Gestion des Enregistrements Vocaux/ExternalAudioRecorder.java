
// Implémentation concrète du service externe d'enregistrement
class ExternalAudioRecorder implements ExternalRecorderService {
    @Override
    public void beginRecording(String channelName) {
        System.out.println("Démarrage de l'enregistrement pour le canal : " + channelName);
    }

    @Override
    public void terminateRecording(String channelName) {
        System.out.println("Arrêt de l'enregistrement pour le canal : " + channelName);
    }

    @Override
    public void exportRecording(String channelName, String filePath) {
        System.out.println("Exportation de l'enregistrement du canal " + channelName + " vers " + filePath);
    }
}