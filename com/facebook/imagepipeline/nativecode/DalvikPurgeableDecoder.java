package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;

@lj4
public abstract class DalvikPurgeableDecoder implements nxa {
    public static final byte[] b = {-1, -39};
    public final mm0 a;

    @kj4
    public static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        int i = jr6.a;
        kjd.D("imagepipeline");
    }

    public DalvikPurgeableDecoder() {
        if (nm0.c == null) {
            synchronized (nm0.class) {
                if (nm0.c == null) {
                    nm0.c = new mm0(nm0.b, nm0.a);
                }
            }
        }
        this.a = nm0.c;
    }

    public static boolean d(int i, e13 e13) {
        jl8 jl8 = (jl8) e13.e0();
        return i >= 2 && jl8.o(i + -2) == -1 && jl8.o(i - 1) == -39;
    }

    @lj4
    private static native void nativePinBitmap(Bitmap bitmap);

    public final e13 a(ax4 ax4, Bitmap.Config config) {
        int i = ax4.w0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        e13 o = e13.o(ax4.a);
        o.getClass();
        try {
            return f(b(o, options));
        } finally {
            e13.S(o);
        }
    }

    public abstract Bitmap b(e13 e13, BitmapFactory.Options options);

    public abstract Bitmap c(e13 e13, int i, BitmapFactory.Options options);

    public final e13 e(ax4 ax4, Bitmap.Config config, int i, ColorSpace colorSpace) {
        int i2 = ax4.w0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        options.inMutable = true;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        e13 o = e13.o(ax4.a);
        o.getClass();
        try {
            return f(c(o, i, options));
        } finally {
            e13.S(o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        r0 = defpackage.mn0.d(r8);
        r8.recycle();
        r8 = java.util.Locale.US;
        r8 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r2 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3 = r2.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r8 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2 = r8.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        r7 = r7.a.b();
        r8 = rf0.i("Attempted to pin a bitmap of size ", r0, " bytes. The current pool count is ", r1, ", the current pool size is ");
        r8.append(r3);
        r8.append(" bytes. The current pool max count is ");
        r8.append(r2);
        r8.append(", the current pool max size is ");
        r8.append(r7);
        r8.append(" bytes.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        throw new java.lang.RuntimeException(r8.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.t54 f(android.graphics.Bitmap r8) {
        /*
            r7 = this;
            r8.getClass()
            nativePinBitmap(r8)     // Catch:{ Exception -> 0x008b }
            mm0 r0 = r7.a
            monitor-enter(r0)
            int r1 = defpackage.mn0.d(r8)     // Catch:{ all -> 0x0030 }
            int r2 = r0.a     // Catch:{ all -> 0x0030 }
            int r3 = r0.c     // Catch:{ all -> 0x0030 }
            if (r2 >= r3) goto L_0x0032
            long r3 = r0.b     // Catch:{ all -> 0x0030 }
            long r5 = (long) r1     // Catch:{ all -> 0x0030 }
            long r3 = r3 + r5
            int r1 = r0.d     // Catch:{ all -> 0x0030 }
            long r5 = (long) r1     // Catch:{ all -> 0x0030 }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0032
            int r2 = r2 + 1
            r0.a = r2     // Catch:{ all -> 0x0030 }
            r0.b = r3     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)
            mm0 r7 = r7.a
            wwc r7 = r7.e
            kk9 r0 = defpackage.e13.Y
            t54 r7 = defpackage.e13.p0(r8, r7, r0)
            return r7
        L_0x0030:
            r7 = move-exception
            goto L_0x0089
        L_0x0032:
            monitor-exit(r0)
            int r0 = defpackage.mn0.d(r8)
            r8.recycle()
            java.util.Locale r8 = java.util.Locale.US
            mm0 r8 = r7.a
            monitor-enter(r8)
            int r1 = r8.a     // Catch:{ all -> 0x0086 }
            monitor-exit(r8)
            mm0 r2 = r7.a
            monitor-enter(r2)
            long r3 = r2.b     // Catch:{ all -> 0x0083 }
            monitor-exit(r2)
            mm0 r8 = r7.a
            monitor-enter(r8)
            int r2 = r8.c     // Catch:{ all -> 0x0080 }
            monitor-exit(r8)
            mm0 r7 = r7.a
            int r7 = r7.b()
            java.lang.String r8 = "Attempted to pin a bitmap of size "
            java.lang.String r5 = " bytes. The current pool count is "
            java.lang.String r6 = ", the current pool size is "
            java.lang.StringBuilder r8 = rf0.i(r8, r0, r5, r1, r6)
            r8.append(r3)
            java.lang.String r0 = " bytes. The current pool max count is "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r0 = ", the current pool max size is "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = " bytes."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.facebook.imagepipeline.common.TooManyBitmapsException r8 = new com.facebook.imagepipeline.common.TooManyBitmapsException
            r8.<init>(r7)
            throw r8
        L_0x0080:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0080 }
            throw r7
        L_0x0083:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0083 }
            throw r7
        L_0x0086:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0086 }
            throw r7
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r7
        L_0x008b:
            r7 = move-exception
            r8.recycle()
            bm3.z(r7)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder.f(android.graphics.Bitmap):t54");
    }
}
