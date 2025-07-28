package defpackage;

import android.view.Surface;

/* renamed from: o4f  reason: default package */
public abstract class o4f {
    public static void a(Surface surface, float f) {
        try {
            hia.r(surface, f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            oyb.b("Failed to call Surface.setFrameRate", e);
        }
    }
}
