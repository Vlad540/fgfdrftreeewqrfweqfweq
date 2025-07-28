package defpackage;

import android.content.Context;
import java.util.HashMap;

/* renamed from: n94  reason: default package */
public final class n94 implements qe8 {
    public final pd a;
    public nz3 b;
    public s1e c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    /* JADX WARNING: type inference failed for: r1v1, types: [pd, java.lang.Object] */
    public n94(Context context, t74 t74) {
        nz3 f64 = new f64(context);
        this.b = f64;
        smc smc = new smc(9);
        this.c = smc;
        ? obj = new Object();
        obj.b = t74;
        obj.Y = smc;
        obj.c = new HashMap();
        obj.o = new HashMap();
        obj.a = true;
        this.a = obj;
        if (f64 != ((nz3) obj.X)) {
            obj.X = f64;
            ((HashMap) obj.c).clear();
            ((HashMap) obj.o).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static qe8 f(Class cls, nz3 nz3) {
        try {
            return (qe8) cls.getConstructor(new Class[]{nz3.class}).newInstance(new Object[]{nz3});
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final qe8 a() {
        oyb.h((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void b(boolean z) {
        this.i = z;
        pd pdVar = this.a;
        pdVar.a = z;
        ((k75) pdVar.b).k(z);
        for (qe8 b2 : ((HashMap) pdVar.o).values()) {
            b2.b(z);
        }
    }

    public final qe8 c() {
        oyb.h((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void d(smc smc) {
        smc.getClass();
        this.c = smc;
        pd pdVar = this.a;
        pdVar.Y = smc;
        ((k75) pdVar.b).d(smc);
        for (qe8 d2 : ((HashMap) pdVar.o).values()) {
            d2.d(smc);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: t03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: t58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: v58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: z64} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: jo4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.zh0 e(defpackage.l68 r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = 9
            r3 = 1
            a68 r4 = r1.b
            r4.getClass()
            a68 r4 = r1.b
            android.net.Uri r4 = r4.a
            java.lang.String r4 = r4.getScheme()
            r5 = 0
            if (r4 == 0) goto L_0x0021
            java.lang.String r6 = "ssai"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            throw r5
        L_0x0021:
            a68 r4 = r1.b
            java.lang.String r4 = r4.b
            java.lang.String r6 = "application/x-image-uri"
            boolean r4 = java.util.Objects.equals(r4, r6)
            if (r4 != 0) goto L_0x0261
            a68 r4 = r1.b
            android.net.Uri r6 = r4.a
            java.lang.String r4 = r4.b
            int r4 = defpackage.oze.J(r6, r4)
            a68 r6 = r1.b
            long r6 = r6.i
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0058
            pd r6 = r0.a
            java.lang.Object r6 = r6.b
            k75 r6 = (defpackage.k75) r6
            boolean r7 = r6 instanceof defpackage.t74
            if (r7 == 0) goto L_0x0058
            t74 r6 = (defpackage.t74) r6
            monitor-enter(r6)
            r6.Z = r3     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            goto L_0x0058
        L_0x0055:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0055 }
            throw r0
        L_0x0058:
            pd r6 = r0.a     // Catch:{ ClassNotFoundException -> 0x025a }
            qe8 r4 = r6.c(r4)     // Catch:{ ClassNotFoundException -> 0x025a }
            z58 r6 = r1.c
            x58 r6 = r6.a()
            z58 r7 = r1.c
            long r10 = r7.a
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0070
            long r10 = r0.d
            r6.a = r10
        L_0x0070:
            float r10 = r7.d
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x007d
            float r10 = r0.g
            r6.d = r10
        L_0x007d:
            float r10 = r7.e
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0087
            float r10 = r0.h
            r6.e = r10
        L_0x0087:
            long r10 = r7.b
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0091
            long r10 = r0.e
            r6.b = r10
        L_0x0091:
            long r10 = r7.c
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x009b
            long r7 = r0.f
            r6.c = r7
        L_0x009b:
            z58 r7 = new z58
            r7.<init>(r6)
            z58 r6 = r1.c
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x00b6
            q58 r1 = r35.a()
            x58 r6 = r7.a()
            r1.m = r6
            l68 r1 = r1.a()
        L_0x00b6:
            zh0 r4 = r4.e(r1)
            a68 r6 = r1.b
            ws6 r6 = r6.g
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x021c
            int r7 = r6.size()
            int r7 = r7 + r3
            zh0[] r7 = new defpackage.zh0[r7]
            r8 = 0
            r7[r8] = r4
            r4 = r8
        L_0x00cf:
            int r9 = r6.size()
            if (r4 >= r9) goto L_0x0217
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x01f8
            uu5 r9 = new uu5
            r9.<init>()
            java.lang.Object r10 = r6.get(r4)
            h68 r10 = (defpackage.h68) r10
            java.lang.String r10 = r10.b
            java.lang.String r10 = defpackage.c49.l(r10)
            r9.m = r10
            java.lang.Object r10 = r6.get(r4)
            h68 r10 = (defpackage.h68) r10
            java.lang.String r10 = r10.c
            r9.d = r10
            java.lang.Object r10 = r6.get(r4)
            h68 r10 = (defpackage.h68) r10
            int r10 = r10.d
            r9.e = r10
            java.lang.Object r10 = r6.get(r4)
            h68 r10 = (defpackage.h68) r10
            int r10 = r10.e
            r9.f = r10
            java.lang.Object r10 = r6.get(r4)
            h68 r10 = (defpackage.h68) r10
            java.lang.String r10 = r10.f
            r9.b = r10
            java.lang.Object r10 = r6.get(r4)
            h68 r10 = (defpackage.h68) r10
            java.lang.String r10 = r10.g
            r9.a = r10
            xu5 r10 = new xu5
            r10.<init>(r9)
            e44 r9 = new e44
            r9.<init>(r0, r3, r10)
            nz3 r13 = r0.b
            ss8 r14 = new ss8
            r10 = 24
            r14.<init>(r10, r9)
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            mk9 r10 = new mk9
            r10.<init>(r2)
            int r18 = r4 + 1
            java.lang.Object r11 = r6.get(r4)
            h68 r11 = (defpackage.h68) r11
            android.net.Uri r11 = r11.a
            java.lang.String r11 = r11.toString()
            r58 r12 = new r58
            r12.<init>()
            q44 r15 = new q44
            r15.<init>()
            java.util.List r24 = java.util.Collections.emptyList()
            e8c r26 = defpackage.e8c.X
            x58 r8 = new x58
            r8.<init>()
            d68 r33 = defpackage.d68.d
            if (r11 != 0) goto L_0x0165
            r20 = r5
            goto L_0x016b
        L_0x0165:
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r20 = r11
        L_0x016b:
            java.lang.Object r11 = r15.e
            android.net.Uri r11 = (android.net.Uri) r11
            if (r11 == 0) goto L_0x017a
            java.lang.Object r11 = r15.d
            java.util.UUID r11 = (java.util.UUID) r11
            if (r11 == 0) goto L_0x0178
            goto L_0x017a
        L_0x0178:
            r11 = 0
            goto L_0x017b
        L_0x017a:
            r11 = r3
        L_0x017b:
            defpackage.oyb.k(r11)
            if (r20 == 0) goto L_0x01a5
            a68 r11 = new a68
            java.lang.Object r3 = r15.d
            java.util.UUID r3 = (java.util.UUID) r3
            if (r3 == 0) goto L_0x0190
            w58 r3 = new w58
            r3.<init>(r15)
            r22 = r3
            goto L_0x0192
        L_0x0190:
            r22 = r5
        L_0x0192:
            r23 = 0
            r25 = 0
            r21 = 0
            r27 = 0
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x01a6
        L_0x01a5:
            r11 = r5
        L_0x01a6:
            l68 r3 = new l68
            v58 r15 = new v58
            r15.<init>(r12)
            z58 r12 = new z58
            r12.<init>(r8)
            z78 r32 = defpackage.z78.J
            java.lang.String r28 = ""
            r27 = r3
            r29 = r15
            r30 = r11
            r31 = r12
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r11.getClass()
            dhb r8 = new dhb
            a68 r11 = r3.b
            r11.getClass()
            a68 r11 = r3.b
            w58 r11 = r11.c
            if (r11 != 0) goto L_0x01d5
            jo4 r9 = defpackage.no4.a
            r15 = r9
            goto L_0x01e9
        L_0x01d5:
            monitor-enter(r9)
            boolean r12 = r11.equals(r5)     // Catch:{ all -> 0x01e1 }
            if (r12 != 0) goto L_0x01e3
            z64 r11 = ydc.u(r11)     // Catch:{ all -> 0x01e1 }
            goto L_0x01e4
        L_0x01e1:
            r0 = move-exception
            goto L_0x01f6
        L_0x01e3:
            r11 = r5
        L_0x01e4:
            r11.getClass()     // Catch:{ all -> 0x01e1 }
            monitor-exit(r9)     // Catch:{ all -> 0x01e1 }
            r15 = r11
        L_0x01e9:
            r17 = 1048576(0x100000, float:1.469368E-39)
            r11 = r8
            r12 = r3
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7[r18] = r8
            r9 = 1
            goto L_0x0212
        L_0x01f6:
            monitor-exit(r9)     // Catch:{ all -> 0x01e1 }
            throw r0
        L_0x01f8:
            nz3 r3 = r0.b
            r3.getClass()
            mk9 r8 = new mk9
            r8.<init>(r2)
            r9 = 1
            int r10 = r4 + 1
            java.lang.Object r11 = r6.get(r4)
            h68 r11 = (defpackage.h68) r11
            lid r12 = new lid
            r12.<init>(r11, r3, r8)
            r7[r10] = r12
        L_0x0212:
            int r4 = r4 + r9
            r3 = r9
            r8 = 0
            goto L_0x00cf
        L_0x0217:
            vm8 r4 = new vm8
            r4.<init>(r7)
        L_0x021c:
            r9 = r4
            v58 r0 = r1.e
            long r10 = r0.b
            r2 = 0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0234
            long r2 = r0.d
            r4 = -9223372036854775808
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0234
            boolean r2 = r0.f
            if (r2 != 0) goto L_0x0234
            goto L_0x0248
        L_0x0234:
            t03 r2 = new t03
            long r12 = r0.d
            boolean r3 = r0.g
            r4 = 1
            r14 = r3 ^ 1
            boolean r15 = r0.e
            boolean r0 = r0.f
            r8 = r2
            r16 = r0
            r8.<init>(r9, r10, r12, r14, r15, r16)
            r9 = r2
        L_0x0248:
            a68 r0 = r1.b
            r0.getClass()
            a68 r0 = r1.b
            p58 r0 = r0.d
            if (r0 != 0) goto L_0x0254
            goto L_0x0259
        L_0x0254:
            java.lang.String r0 = "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider."
            defpackage.ez3.j0(r0)
        L_0x0259:
            return r9
        L_0x025a:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0261:
            a68 r0 = r1.b
            long r0 = r0.i
            int r0 = defpackage.oze.a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n94.e(l68):zh0");
    }
}
