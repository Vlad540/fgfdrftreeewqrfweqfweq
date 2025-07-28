package defpackage;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* renamed from: f60  reason: default package */
public final class f60 extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ g60 a;

    public f60(g60 g60) {
        this.a = g60;
    }

    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
            g60 g60 = this.a;
            if (clientAudioSessionId == g60.a.getAudioSessionId()) {
                g60.d(audioRecordingConfiguration.isClientSilenced());
                return;
            }
        }
    }
}
