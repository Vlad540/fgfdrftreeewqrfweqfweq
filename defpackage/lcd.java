package defpackage;

import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: lcd  reason: default package */
public final /* synthetic */ class lcd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ocd b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lcd(ocd ocd, boolean z, int i) {
        this.a = i;
        this.b = ocd;
        this.c = z;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                JavaAudioDeviceModule javaAudioDeviceModule = this.b.g;
                if (javaAudioDeviceModule != null) {
                    javaAudioDeviceModule.setMicrophoneMute(this.c);
                    return;
                }
                return;
            case 1:
                JavaAudioDeviceModule javaAudioDeviceModule2 = this.b.g;
                if (javaAudioDeviceModule2 != null) {
                    javaAudioDeviceModule2.setSpeakerMute(this.c);
                    return;
                }
                return;
            default:
                JavaAudioDeviceModule javaAudioDeviceModule3 = this.b.g;
                if (javaAudioDeviceModule3 != null) {
                    javaAudioDeviceModule3.setNoiseSuppressorEnabled(this.c);
                    return;
                }
                return;
        }
    }
}
