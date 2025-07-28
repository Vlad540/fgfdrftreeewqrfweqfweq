package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: d2f  reason: default package */
public final class d2f extends ps1 {
    public boolean a = true;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ sn1 c;
    public final /* synthetic */ y1d d;

    public d2f(AtomicBoolean atomicBoolean, sn1 sn1, y1d y1d) {
        this.b = atomicBoolean;
        this.c = sn1;
        this.d = y1d;
    }

    public final void b(int i, ws1 ws1) {
        Object obj;
        if (this.a) {
            this.a = false;
            ws1.getTimestamp();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
        }
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get() && (obj = ws1.e().a.get("androidx.camera.video.VideoCapture.streamUpdate")) != null) {
            int intValue = ((Integer) obj).intValue();
            sn1 sn1 = this.c;
            if (intValue == sn1.hashCode() && sn1.b((Object) null) && !atomicBoolean.getAndSet(true)) {
                pa2.A().execute(new zbe(this, 7, this.d));
            }
        }
    }
}
