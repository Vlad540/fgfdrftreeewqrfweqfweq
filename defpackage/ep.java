package defpackage;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* renamed from: ep  reason: default package */
public final /* synthetic */ class ep implements r3e, c4e {
    public final /* synthetic */ Context a;

    public /* synthetic */ ep(Context context) {
        this.a = context;
    }

    public d4e c(lga lga) {
        ope ope = (ope) lga.X;
        if (ope != null) {
            String str = (String) lga.o;
            if (str != null && str.length() != 0) {
                return new wz5(this.a, str, ope, true, true);
            }
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
    }

    public Object get() {
        return (AudioManager) this.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }
}
