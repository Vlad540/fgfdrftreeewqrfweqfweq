package defpackage;

import android.view.Surface;

/* renamed from: p4f  reason: default package */
public abstract class p4f {
    public static void a(Surface surface, float f) {
        try {
            hia.r(surface, f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            ez3.B("Failed to call Surface.setFrameRate", e);
        }
    }
}
