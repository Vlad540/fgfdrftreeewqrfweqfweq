package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.coroutines.Continuation;

/* renamed from: n98  reason: default package */
public final class n98 extends taf {
    public final t0c A0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final q46 b;
    public final qvc c;
    public final f56 o;
    public final t97 w0;
    public final pna x0;
    public final pna y0;
    public final l05 z0;

    public n98(q46 q46, qvc qvc, f56 f56) {
        a98 a98 = a98.a;
        r7e d = a98.getAccessor().d(pae.class);
        r7e d2 = a98.getAccessor().d(bf5.class);
        r7e d3 = a98.getAccessor().d(xzc.class);
        r7e d4 = a98.getAccessor().d(Context.class);
        this.b = q46;
        this.c = qvc;
        this.o = f56;
        this.X = d;
        this.Y = d2;
        this.Z = d3;
        this.w0 = d4;
        String[] strArr = qna.m;
        pna pna = new pna(strArr);
        this.x0 = pna;
        pna pna2 = new pna(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.y0 = pna2;
        this.z0 = new l05(0);
        this.A0 = ez3.d0(new ik5(new bc(new v11(new v11(pna, pna2, new c08(3, (Continuation) null, 2), 4), qvc.Z, new ah1(3, (Continuation) null, 3), 4), 28, this), 2), this.a, ucd.a, new aq3(new hge(q46.w0 ? r6a.b : r6a.a)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.n98 r5, java.io.File r6, android.net.Uri r7, kotlin.coroutines.Continuation r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof defpackage.k98
            if (r0 == 0) goto L_0x0016
            r0 = r8
            k98 r0 = (defpackage.k98) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            k98 r0 = new k98
            r0.<init>(r5, r8)
        L_0x001b:
            java.lang.Object r8 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            n98 r5 = r0.o
            wx3.H(r8)     // Catch:{ all -> 0x002e }
            goto L_0x0062
        L_0x002e:
            r6 = move-exception
            goto L_0x0064
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            wx3.H(r8)
            boolean r8 = r6.exists()     // Catch:{ all -> 0x002e }
            if (r8 != 0) goto L_0x0062
            if (r7 == 0) goto L_0x0062
            t97 r8 = r5.w0     // Catch:{ all -> 0x002e }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x002e }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x002e }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x002e }
            java.io.InputStream r7 = r8.openInputStream(r7)     // Catch:{ all -> 0x002e }
            if (r7 == 0) goto L_0x0062
            zl3 r8 = defpackage.zl3.c     // Catch:{ all -> 0x002e }
            r0.o = r5     // Catch:{ all -> 0x002e }
            r0.Z = r4     // Catch:{ all -> 0x002e }
            java.lang.Object r6 = r8.h(r6, r7, r0)     // Catch:{ all -> 0x002e }
            if (r6 != r1) goto L_0x0062
            goto L_0x007d
        L_0x0062:
            r7 = r3
            goto L_0x0069
        L_0x0064:
            kcc r7 = new kcc
            r7.<init>(r6)
        L_0x0069:
            java.lang.Throwable r6 = mcc.a(r7)
            if (r6 == 0) goto L_0x007c
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r7 = "failed to copy picked image"
            udd.s(r5, r7, r6)
        L_0x007c:
            r1 = r3
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n98.q(n98, java.io.File, android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
