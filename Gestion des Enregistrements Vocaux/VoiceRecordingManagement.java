import java.util.Set;
import java.util.HashSet;
import java.text.SimpleDateFormat;
import java.util.Date;

// Package principal
package com.discord.voicerecording;

// Interface attendu par le client (Discord) pour la gestion des enregistrements
interface VoiceRecordingManager {
    void startRecording(String channelId);
    void stopRecording(String channelId);
    void saveRecording(String channelId, String destinationPath);
}

// Interface qui provient du système d'enregistrement externe
interface ExternalRecorderService {
    void beginRecording(String channelName);
    void terminateRecording(String channelName);
    void exportRecording(String channelName, String filePath);
}


// Adaptateur pour intégrer le service externe
class ExternalRecorderAdapter implements VoiceRecordingManager {
    private final ExternalRecorderService externalRecorder;
    private String currentChannelId;

    public ExternalRecorderAdapter(ExternalRecorderService externalRecorder) {
        this.externalRecorder = externalRecorder;
    }

    @Override
    public void startRecording(String channelId) {
        this.currentChannelId = channelId;
        externalRecorder.beginRecording("Discord_" + channelId);
    }

    @Override
    public void stopRecording(String channelId) {
        if (channelId.equals(this.currentChannelId)) {
            externalRecorder.terminateRecording("Discord_" + channelId);
            this.currentChannelId = null;
        }
    }

    @Override
    public void saveRecording(String channelId, String destinationPath) {
        if (channelId.equals(this.currentChannelId)) {
            externalRecorder.exportRecording("Discord_" + channelId, destinationPath);
        }
    }
}

// Gestionnaire de canaux vocaux
class VoiceChannelManager {
    private final VoiceRecordingManager recordingManager;
    private final Set<String> activeRecordings;

    public VoiceChannelManager(VoiceRecordingManager recordingManager) {
        this.recordingManager = recordingManager;
        this.activeRecordings = new HashSet<>();
    }

    public void initiateVoiceRecording(String channelId) {
        if (!activeRecordings.contains(channelId)) {
            recordingManager.startRecording(channelId);
            activeRecordings.add(channelId);
        }
    }

    public void terminateVoiceRecording(String channelId) {
        if (activeRecordings.contains(channelId)) {
            recordingManager.stopRecording(channelId);
            
            // Génération dynamique du chemin de sauvegarde
            String destinationPath = generateRecordingPath(channelId);
            recordingManager.saveRecording(channelId, destinationPath);
            
            activeRecordings.remove(channelId);
        }
    }

    private String generateRecordingPath(String channelId) {
        return "/recordings/discord_channel_" + channelId + "_" 
               + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".wav";
    }
}

// Classe principale de démonstration
public class VoiceRecordingDemo {
    public static void main(String[] args) {
        // Configuration des composants
        ExternalRecorderService externalRecorder = new ExternalAudioRecorder();
        VoiceRecordingManager recordingAdapter = new ExternalRecorderAdapter(externalRecorder);
        VoiceChannelManager voiceChannelManager = new VoiceChannelManager(recordingAdapter);

        // Simulation d'un enregistrement vocal
        String channelId = "general-chat-12345";
        
        voiceChannelManager.initiateVoiceRecording(channelId);
        
        // Simulation d'un délai d'enregistrement
        try {
            Thread.sleep(3000); // 3 secondes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        voiceChannelManager.terminateVoiceRecording(channelId);
    }
}