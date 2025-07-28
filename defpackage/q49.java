package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.logout.a;

/* renamed from: q49  reason: default package */
public final class q49 implements lr2 {
    public final s5a a;
    public final int b = 10;
    public final t97 c;
    public final ju3 d;
    public final ju3 e;
    public final ContextScope f;
    public final r7e g;
    public qod h;

    public q49(s5a s5a, pae pae, a aVar, t97 t97, t97 t972) {
        this.a = s5a;
        this.c = t97;
        n3a n3a = (n3a) pae;
        ju3 limitedParallelism = n3a.b().limitedParallelism(1, "mini-chats-io");
        this.d = limitedParallelism;
        this.e = n3a.a().limitedParallelism(1, "mini-chats-computation");
        ContextScope a2 = n1g.a(limitedParallelism);
        this.f = a2;
        this.g = new r7e(new zu4(this, t972, 18));
        String name = q49.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, name, "instance created " + this, (Throwable) null);
        }
        xs7.E(a2, (hu3) null, (ru3) null, new i49(aVar, this, (Continuation) null), 3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:9|26|(1:28)(1:29)|30|31|34|(1:36)(1:37)|38|(1:40)|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0093, code lost:
        if (r8 == r3) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        if (r8 == r3) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
        defpackage.udd.s(r7.getClass().getName(), "fail to decode protospans", r0);
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.q49 r39, java.util.List r40, kotlin.coroutines.Continuation r41) {
        /*
            r0 = r41
            r39.getClass()
            boolean r1 = r0 instanceof defpackage.p49
            if (r1 == 0) goto L_0x001a
            r1 = r0
            p49 r1 = (defpackage.p49) r1
            int r2 = r1.z0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.z0 = r2
            r2 = r39
            goto L_0x0021
        L_0x001a:
            p49 r1 = new p49
            r2 = r39
            r1.<init>(r2, r0)
        L_0x0021:
            java.lang.Object r0 = r1.x0
            pu3 r3 = defpackage.pu3.a
            int r4 = r1.z0
            r5 = 1
            if (r4 == 0) goto L_0x004a
            if (r4 != r5) goto L_0x0042
            pi2 r2 = r1.w0
            java.util.Iterator r4 = r1.Z
            java.util.Collection r6 = r1.Y
            java.util.List r7 = r1.X
            q49 r8 = r1.o
            defpackage.wx3.H(r0)
            r38 = r4
            r4 = r2
            r2 = r8
            r8 = r6
            r6 = r38
            goto L_0x00bc
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004a:
            defpackage.wx3.H(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r40.iterator()
            r6 = r0
            r0 = r40
        L_0x0059:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x016d
            java.lang.Object r7 = r4.next()
            pi2 r7 = (defpackage.pi2) r7
            r7e r8 = r2.g
            java.lang.Object r8 = r8.getValue()
            zb0 r8 = (defpackage.zb0) r8
            r1.o = r2
            r1.X = r0
            r1.Y = r6
            r1.Z = r4
            r1.w0 = r7
            r1.z0 = r5
            r8.getClass()
            long r9 = r7.a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            q16 r9 = r8.b
            java.lang.Object r10 = r9.get(r11)
            wia r10 = (defpackage.wia) r10
            jue r11 = defpackage.jue.a
            if (r10 != 0) goto L_0x0097
            java.lang.Object r8 = r8.a(r7, r1)
            if (r8 != r3) goto L_0x00b4
        L_0x0095:
            r11 = r8
            goto L_0x00b4
        L_0x0097:
            java.lang.Object r10 = r10.a
            android.net.Uri r10 = (android.net.Uri) r10
            android.net.Uri r12 = r7.b
            boolean r10 = defpackage.hhd.f(r10, r12)
            if (r10 != 0) goto L_0x00b4
            java.lang.Long r10 = new java.lang.Long
            long r12 = r7.a
            r10.<init>(r12)
            r9.remove(r10)
            java.lang.Object r8 = r8.a(r7, r1)
            if (r8 != r3) goto L_0x00b4
            goto L_0x0095
        L_0x00b4:
            if (r11 != r3) goto L_0x00b8
            goto L_0x0170
        L_0x00b8:
            r8 = r6
            r6 = r4
            r4 = r7
            r7 = r0
        L_0x00bc:
            r7e r0 = r2.g
            java.lang.Object r0 = r0.getValue()
            zb0 r0 = (defpackage.zb0) r0
            r0.getClass()
            long r9 = r4.a
            java.lang.CharSequence r11 = r4.X
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            q16 r0 = r0.b
            java.lang.Object r0 = r0.get(r9)
            wia r0 = (defpackage.wia) r0
            r9 = 0
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r0.b
            byte[] r0 = (byte[]) r0
            r35 = r0
            goto L_0x00e3
        L_0x00e1:
            r35 = r9
        L_0x00e3:
            t97 r0 = r2.c     // Catch:{ all -> 0x00f0 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00f0 }
            qhb r0 = (defpackage.qhb) r0     // Catch:{ all -> 0x00f0 }
            java.util.ArrayList r0 = r0.b(r11)     // Catch:{ all -> 0x00f0 }
            goto L_0x00ff
        L_0x00f0:
            r0 = move-exception
            java.lang.Class r10 = r7.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r12 = "fail to decode protospans"
            defpackage.udd.s(r10, r12, r0)
            r0 = r9
        L_0x00ff:
            java.lang.String r17 = r11.toString()
            if (r0 == 0) goto L_0x0111
            r10 = 0
            mw6[] r10 = new defpackage.mw6[r10]
            java.lang.Object[] r0 = r0.toArray(r10)
            mw6[] r0 = (defpackage.mw6[]) r0
            r18 = r0
            goto L_0x0113
        L_0x0111:
            r18 = r9
        L_0x0113:
            oi2 r0 = r4.A0
            int r23 = r0.ordinal()
            android.net.Uri r0 = r4.b
            if (r0 == 0) goto L_0x0121
            java.lang.String r9 = r0.toString()
        L_0x0121:
            r34 = r9
            g49 r0 = new g49
            r12 = r0
            java.lang.CharSequence r9 = r4.X
            r36 = r9
            boolean r9 = r4.y0
            r37 = r9
            long r13 = r4.a
            java.lang.CharSequence r15 = r4.c
            java.lang.CharSequence r9 = r4.o
            r16 = r9
            java.lang.CharSequence r9 = r4.Y
            r19 = r9
            java.lang.String r9 = r4.w0
            r20 = r9
            long r9 = r4.z0
            r21 = r9
            int r9 = r4.B0
            r24 = r9
            boolean r9 = r4.C0
            r25 = r9
            boolean r9 = r4.D0
            r26 = r9
            boolean r9 = r4.E0
            r27 = r9
            long r9 = r4.F0
            r28 = r9
            java.lang.Long r9 = r4.G0
            r30 = r9
            long r9 = r4.H0
            r31 = r9
            java.lang.CharSequence r4 = r4.I0
            r33 = r4
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r30, r31, r33, r34, r35, r36, r37)
            r8.add(r0)
            r4 = r6
            r0 = r7
            r6 = r8
            goto L_0x0059
        L_0x016d:
            r3 = r6
            java.util.List r3 = (java.util.List) r3
        L_0x0170:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q49.a(q49, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
