package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* renamed from: wp4  reason: default package */
public final class wp4 extends Surface {
    public static boolean X;
    public static int o;
    public final boolean a;
    public final vp4 b;
    public boolean c;

    public wp4(vp4 vp4, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = vp4;
        this.a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r5 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r5) {
        /*
            int r0 = defpackage.mze.a
            r1 = 24
            r2 = 0
            if (r0 >= r1) goto L_0x0008
            goto L_0x005f
        L_0x0008:
            r1 = 26
            if (r0 >= r1) goto L_0x0021
            java.lang.String r3 = "samsung"
            java.lang.String r4 = defpackage.mze.c
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x005f
            java.lang.String r3 = "XT1650"
            java.lang.String r4 = defpackage.mze.d
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0021
            goto L_0x005f
        L_0x0021:
            if (r0 >= r1) goto L_0x0030
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r5 != 0) goto L_0x0030
            goto L_0x005f
        L_0x0030:
            android.opengl.EGLDisplay r5 = android.opengl.EGL14.eglGetDisplay(r2)
            r1 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r5 = android.opengl.EGL14.eglQueryString(r5, r1)
            if (r5 == 0) goto L_0x005f
            java.lang.String r3 = "EGL_EXT_protected_content"
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L_0x005f
            r5 = 17
            if (r0 >= r5) goto L_0x0049
            goto L_0x005d
        L_0x0049:
            android.opengl.EGLDisplay r5 = android.opengl.EGL14.eglGetDisplay(r2)
            java.lang.String r5 = android.opengl.EGL14.eglQueryString(r5, r1)
            if (r5 == 0) goto L_0x005d
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L_0x005d
            r5 = 1
            return r5
        L_0x005d:
            r5 = 2
            return r5
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp4.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (wp4.class) {
            try {
                z = true;
                if (!X) {
                    o = a(context);
                    X = true;
                }
                if (o == 0) {
                    z = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return z;
    }

    public static wp4 c(Context context, boolean z) {
        boolean z2 = false;
        swb.h(!z || b(context));
        vp4 vp4 = new vp4("ExoPlayer:DummySurface", 0);
        int i = z ? o : 0;
        vp4.start();
        Handler handler = new Handler(vp4.getLooper(), vp4);
        vp4.b = handler;
        vp4.X = new hr4(handler, 0);
        synchronized (vp4) {
            vp4.b.obtainMessage(1, i, 0).sendToTarget();
            while (((wp4) vp4.Y) == null && vp4.o == null && vp4.c == null) {
                try {
                    vp4.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = vp4.o;
        if (runtimeException == null) {
            Error error = vp4.c;
            if (error == null) {
                wp4 wp4 = (wp4) vp4.Y;
                wp4.getClass();
                return wp4;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    vp4 vp4 = this.b;
                    vp4.b.getClass();
                    vp4.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
