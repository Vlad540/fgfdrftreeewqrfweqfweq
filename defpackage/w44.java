package defpackage;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* renamed from: w44  reason: default package */
public final class w44 {
    public final AudioTrack a;
    public final a30 b;
    public v44 c = new v44(this);

    public w44(AudioTrack audioTrack, a30 a30) {
        this.a = audioTrack;
        this.b = a30;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }

    /* access modifiers changed from: private */
    public void b(AudioRouting audioRouting) {
        if (this.c != null && audioRouting.getRoutedDevice() != null) {
            this.b.h(audioRouting.getRoutedDevice());
        }
    }

    public void c() {
        v44 v44 = this.c;
        v44.getClass();
        this.a.removeOnRoutingChangedListener(v44);
        this.c = null;
    }
}
