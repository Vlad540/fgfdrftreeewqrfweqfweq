package defpackage;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: wt5  reason: default package */
public abstract class wt5 {
    public static final kr7 a = new kr7(16);
    public static final ThreadPoolExecutor b;
    public static final Object c = new Object();
    public static final kgd d = new kgd(0);

    /* JADX WARNING: type inference failed for: r9v0, types: [pac, java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ? obj = new Object();
        obj.a = "fonts-androidx";
        obj.b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.vt5 a(java.lang.String r6, android.content.Context r7, defpackage.bd4 r8, int r9) {
        /*
            kr7 r0 = a
            java.lang.Object r1 = r0.c(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0010
            vt5 r6 = new vt5
            r6.<init>((android.graphics.Typeface) r1)
            return r6
        L_0x0010:
            og0 r8 = defpackage.js.r(r7, r8)     // Catch:{ NameNotFoundException -> 0x005a }
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.c
            cu5[] r3 = (defpackage.cu5[]) r3
            int r8 = r8.b
            if (r8 == 0) goto L_0x0024
            if (r8 == r1) goto L_0x0022
        L_0x0020:
            r1 = r2
            goto L_0x003d
        L_0x0022:
            r1 = -2
            goto L_0x003d
        L_0x0024:
            if (r3 == 0) goto L_0x003d
            int r8 = r3.length
            if (r8 != 0) goto L_0x002a
            goto L_0x003d
        L_0x002a:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L_0x002d:
            if (r4 >= r8) goto L_0x003d
            r5 = r3[r4]
            int r5 = r5.e
            if (r5 == 0) goto L_0x003a
            if (r5 >= 0) goto L_0x0038
            goto L_0x0020
        L_0x0038:
            r1 = r5
            goto L_0x003d
        L_0x003a:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x003d:
            if (r1 == 0) goto L_0x0045
            vt5 r6 = new vt5
            r6.<init>((int) r1)
            return r6
        L_0x0045:
            android.graphics.Typeface r7 = defpackage.gte.a(r7, r3, r9)
            if (r7 == 0) goto L_0x0054
            r0.d(r6, r7)
            vt5 r6 = new vt5
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x0054:
            vt5 r6 = new vt5
            r6.<init>((int) r2)
            return r6
        L_0x005a:
            vt5 r6 = new vt5
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt5.a(java.lang.String, android.content.Context, bd4, int):vt5");
    }
}
