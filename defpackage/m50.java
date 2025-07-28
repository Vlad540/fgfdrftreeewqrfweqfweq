package defpackage;

import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: m50  reason: default package */
public final class m50 implements JavaAudioDeviceModule.AudioRecordStateCallback, JavaAudioDeviceModule.AudioRecordErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback, JavaAudioDeviceModule.AudioTrackErrorCallback {
    public final xwb a;

    public /* synthetic */ m50(xwb xwb) {
        this.a = xwb;
    }

    public void onWebRtcAudioRecordError(String str) {
        this.a.log("AudioRecordCallback", "Audio record error: " + str);
    }

    public void onWebRtcAudioRecordInitError(String str) {
        this.a.log("AudioRecordCallback", "Audio record init error: " + str);
    }

    public void onWebRtcAudioRecordStart() {
        this.a.log("AudioRecordCallback", "Audio record did start");
    }

    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        this.a.log("AudioRecordCallback", "Audio record start error: [" + audioRecordStartErrorCode + "] " + str);
    }

    public void onWebRtcAudioRecordStop() {
        this.a.log("AudioRecordCallback", "Audio record did stop");
    }

    public void onWebRtcAudioTrackError(String str) {
        this.a.log("AudioRecordCallback", "Audio track error: " + str);
    }

    public void onWebRtcAudioTrackInitError(String str) {
        this.a.log("AudioRecordCallback", "Audio track init error: " + str);
    }

    public void onWebRtcAudioTrackStart() {
        this.a.log("AudioRecordCallback", "Audio track did start");
    }

    public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        this.a.log("AudioRecordCallback", "Audio track start error: [" + audioTrackStartErrorCode + "] " + str);
    }

    public void onWebRtcAudioTrackStop() {
        this.a.log("AudioRecordCallback", "Audio track did stop");
    }
}
