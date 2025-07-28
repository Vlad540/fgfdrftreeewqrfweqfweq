package defpackage;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import java.util.Iterator;
import java.util.Map;

/* renamed from: d6f  reason: default package */
public final class d6f implements SurfaceTexture.OnFrameAvailableListener {
    public final boolean a;
    public final /* synthetic */ h6f b;

    public d6f(h6f h6f, boolean z) {
        this.b = h6f;
        this.a = z;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            udd.s(this.b.a, "onFrameAvailable, surface texture is null!", (Throwable) null);
            return;
        }
        h6f h6f = this.b;
        if (h6f.z0 || h6f.b.get()) {
            udd.s(this.b.a, "onFrameAvailable, called in released state", (Throwable) null);
            return;
        }
        h6f h6f2 = this.b;
        s6f s6f = h6f2.y0;
        if (s6f != null) {
            boolean z = false;
            boolean z2 = false;
            for (Map.Entry entry : h6f2.Z.entrySet()) {
                q4e q4e = (q4e) entry.getKey();
                Surface surface = (Surface) entry.getValue();
                int i = q4e.c;
                if (i == 34) {
                    if (!z2) {
                        surfaceTexture.updateTexImage();
                        surfaceTexture.getTransformMatrix(h6f2.w0);
                        z2 = true;
                    }
                    q4e.n(h6f2.x0, h6f2.w0);
                    try {
                        s6f.w(surfaceTexture, surface, h6f2.x0, this.a);
                        z = true;
                    } catch (RuntimeException e) {
                        udd.s(h6f2.a, "failed to render with GL renderer", e);
                    }
                } else {
                    udd.U(h6f2.a, "onFrameAvailable, unsupported format=" + i + " for surfaceOutput=" + q4e);
                }
            }
            if (z) {
                h6f h6f3 = this.b;
                if (!h6f3.B0) {
                    h6f3.B0 = true;
                    String str = h6f3.a;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        tn7 tn7 = tn7.X;
                        e6f e6f = h6f3.c;
                        e6f.getClass();
                        fn6.d(tn7, str, us8.j(SystemClock.elapsedRealtime() - e6f.c, "notifyFirstFrameRendered, in ", " ms after video message processor started"), (Throwable) null);
                    }
                    Iterator it = h6f3.Y.iterator();
                    while (it.hasNext()) {
                        ((i6f) it.next()).c();
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
