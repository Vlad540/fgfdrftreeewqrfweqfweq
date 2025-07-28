package defpackage;

import android.os.SystemClock;
import org.webrtc.Size;

/* renamed from: xu1  reason: default package */
public final class xu1 implements yu1 {
    public final xwb a;
    public final lje b = new lje();
    public volatile Size c = new Size(0, 0);
    public long d = SystemClock.elapsedRealtime();

    public xu1(xwb xwb) {
        this.a = xwb;
    }

    public final String toString() {
        double b2 = this.b.b();
        Size size = this.c;
        return "fps estimation: " + b2 + ", frame size: " + size;
    }
}
