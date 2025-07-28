package defpackage;

import android.content.Context;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;

/* renamed from: pq1  reason: default package */
public final class pq1 extends ibe {
    public final CameraEnumerator X;
    public final /* synthetic */ int o = 1;

    public pq1(xwb xwb, boolean z) {
        super(xwb);
        this.X = new Camera1Enumerator(z);
    }

    public final CameraEnumerator H() {
        switch (this.o) {
            case 0:
                return (Camera1Enumerator) this.X;
            default:
                return (Camera2Enumerator) this.X;
        }
    }

    public pq1(Context context, xwb xwb) {
        super(xwb);
        this.X = new Camera2Enumerator(context);
    }
}
