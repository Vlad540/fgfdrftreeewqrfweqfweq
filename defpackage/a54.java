package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* renamed from: a54  reason: default package */
public final class a54 {
    public final Handler a = new Handler(Looper.myLooper());
    public final z44 b = new z44(1, this);
    public final /* synthetic */ c54 c;

    public a54(c54 c54) {
        this.c = c54;
    }

    public void a(AudioTrack audioTrack) {
        Handler handler = this.a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new y44(handler, 0), this.b);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages((Object) null);
    }
}
