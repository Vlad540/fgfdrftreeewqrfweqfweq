package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* renamed from: ixa  reason: default package */
public final class ixa extends Surface {
    public static boolean X;
    public static int o;
    public final boolean a;
    public final vp4 b;
    public boolean c;

    public ixa(vp4 vp4, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = vp4;
        this.a = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[Catch:{ all -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r7) {
        /*
            java.lang.Class<ixa> r0 = defpackage.ixa.class
            monitor-enter(r0)
            boolean r1 = X     // Catch:{ all -> 0x0053 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0055
            int r1 = defpackage.oze.a     // Catch:{ all -> 0x0053 }
            r4 = 24
            if (r1 >= r4) goto L_0x0011
        L_0x000f:
            r7 = r2
            goto L_0x003f
        L_0x0011:
            r4 = 26
            if (r1 >= r4) goto L_0x002a
            java.lang.String r5 = "samsung"
            java.lang.String r6 = defpackage.oze.c     // Catch:{ all -> 0x0053 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0053 }
            if (r5 != 0) goto L_0x000f
            java.lang.String r5 = "XT1650"
            java.lang.String r6 = defpackage.oze.d     // Catch:{ all -> 0x0053 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0053 }
            if (r5 == 0) goto L_0x002a
            goto L_0x000f
        L_0x002a:
            if (r1 >= r4) goto L_0x0039
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r1)     // Catch:{ all -> 0x0053 }
            if (r7 != 0) goto L_0x0039
            goto L_0x000f
        L_0x0039:
            java.lang.String r7 = "EGL_EXT_protected_content"
            boolean r7 = defpackage.gt0.B(r7)     // Catch:{ all -> 0x0053 }
        L_0x003f:
            if (r7 == 0) goto L_0x004d
            java.lang.String r7 = "EGL_KHR_surfaceless_context"
            boolean r7 = defpackage.gt0.B(r7)     // Catch:{ all -> 0x0053 }
            if (r7 == 0) goto L_0x004b
            r7 = r3
            goto L_0x004e
        L_0x004b:
            r7 = 2
            goto L_0x004e
        L_0x004d:
            r7 = r2
        L_0x004e:
            o = r7     // Catch:{ all -> 0x0053 }
            X = r3     // Catch:{ all -> 0x0053 }
            goto L_0x0055
        L_0x0053:
            r7 = move-exception
            goto L_0x005c
        L_0x0055:
            int r7 = o     // Catch:{ all -> 0x0053 }
            if (r7 == 0) goto L_0x005a
            r2 = r3
        L_0x005a:
            monitor-exit(r0)
            return r2
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixa.a(android.content.Context):boolean");
    }

    public static ixa b(Context context, boolean z) {
        boolean z2 = false;
        oyb.k(!z || a(context));
        vp4 vp4 = new vp4("ExoPlayer:PlaceholderSurface", 1);
        int i = z ? o : 0;
        vp4.start();
        Handler handler = new Handler(vp4.getLooper(), vp4);
        vp4.b = handler;
        vp4.X = new hr4(handler, 1);
        synchronized (vp4) {
            vp4.b.obtainMessage(1, i, 0).sendToTarget();
            while (((ixa) vp4.Y) == null && vp4.o == null && vp4.c == null) {
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
                ixa ixa = (ixa) vp4.Y;
                ixa.getClass();
                return ixa;
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
