package defpackage;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: q30  reason: default package */
public final /* synthetic */ class q30 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s30 b;

    public /* synthetic */ q30(s30 s30, int i) {
        this.a = i;
        this.b = s30;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new an(2, this.b);
            default:
                return (AudioManager) ((Context) this.b.a).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }
    }
}
