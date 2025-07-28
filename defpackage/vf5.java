package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: vf5  reason: default package */
public final class vf5 extends l5e implements i26 {
    public final /* synthetic */ ag5 A0;
    public Object X;
    public ag5 Y;
    public Object Z;
    public Object w0;
    public AtomicReference x0;
    public int y0;
    public /* synthetic */ Object z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vf5(ag5 ag5, Continuation continuation) {
        super(2, continuation);
        this.A0 = ag5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((d5b) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vf5 vf5 = new vf5(this.A0, continuation);
        vf5.z0 = obj;
        return vf5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0104, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0128, code lost:
        r6 = new defpackage.qf5(r1.A0, 1);
        r1.z0 = r0;
        r1.y0 = 3;
        r5 = udd.M(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0138, code lost:
        if (r5 != r2) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013b, code lost:
        r5 = (java.io.Closeable) r5;
        r6 = r1.A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r7 = (java.nio.channels.AsynchronousFileChannel) r5;
        r18 = new java.util.concurrent.atomic.AtomicBoolean(true);
        r8 = r0;
        r0 = new java.util.concurrent.atomic.AtomicReference((java.lang.Object) null);
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0156, code lost:
        if (r3.get() == false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0158, code lost:
        lp.m(r1.b);
        r4 = r9;
        r17 = r2;
        r9 = new defpackage.uf5(r3, r6, r7, r0, r8, (kotlin.coroutines.Continuation) null);
        r1.z0 = r8;
        r1.X = r5;
        r1.Y = r6;
        r1.Z = r7;
        r1.w0 = r3;
        r1.x0 = r0;
        r1.y0 = 4;
        r2 = ((defpackage.ile) r6.f.getValue()).a(r4, r1);
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x018e, code lost:
        if (r2 != r4) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0190, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0191, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0194, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0197, code lost:
        r4 = r2;
        r3 = r0;
        r0 = r6.p.getChildren().iterator();
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a9, code lost:
        if (r0.hasNext() == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ab, code lost:
        r1.z0 = r7;
        r1.X = r5;
        r1.Y = r6;
        r1.Z = r3;
        r1.w0 = r0;
        r1.x0 = null;
        r1.y0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c5, code lost:
        if (((g37) r0.next()).join(r1) != r4) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c7, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c8, code lost:
        r0 = (java.lang.Throwable) r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ce, code lost:
        if (r0 != null) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d0, code lost:
        r0 = new mcc(new defpackage.ixe(100.0f, r6.j, r6.s));
        r1.z0 = r5;
        r1.X = r6;
        r1.Y = null;
        r1.Z = null;
        r1.w0 = null;
        r1.x0 = null;
        r1.y0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f8, code lost:
        if (r7.a.o(r0, r1) != r4) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fa, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01fb, code lost:
        r1 = r5;
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fe, code lost:
        r0 = new mcc(new kcc(r0));
        r1.z0 = r5;
        r1.X = r6;
        r1.Y = null;
        r1.Z = null;
        r1.w0 = null;
        r1.x0 = null;
        r1.y0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        wx3.H(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0220, code lost:
        if (r7.a.o(r0, r1) != r4) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0222, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r2 = java.lang.System.currentTimeMillis() - r0.r;
        r0 = r0.d;
        r4 = udd.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x022e, code lost:
        if (r4 != null) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0236, code lost:
        if (r4.c() == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0238, code lost:
        r5 = defpackage.tn7.X;
        r6 = zp4.o;
        r2 = zp4.j(mt0.Q(r2, eq4.c));
        r4.d(r5, r0, "FileUploadOperation worked for " + r2, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025c, code lost:
        urd.l(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0261, code lost:
        return jue.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r1 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            pu3 r2 = pu3.a
            int r0 = r1.y0
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0093;
                case 1: goto L_0x0088;
                case 2: goto L_0x007f;
                case 3: goto L_0x0074;
                case 4: goto L_0x0050;
                case 5: goto L_0x002e;
                case 6: goto L_0x0025;
                case 7: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0013:
            java.lang.Object r0 = r1.X
            ag5 r0 = (defpackage.ag5) r0
            java.lang.Object r1 = r1.z0
            java.io.Closeable r1 = (java.io.Closeable) r1
        L_0x001b:
            wx3.H(r20)     // Catch:{ all -> 0x0020 }
            goto L_0x0223
        L_0x0020:
            r0 = move-exception
            r5 = r1
        L_0x0022:
            r1 = r0
            goto L_0x0262
        L_0x0025:
            java.lang.Object r0 = r1.X
            ag5 r0 = (defpackage.ag5) r0
            java.lang.Object r1 = r1.z0
            java.io.Closeable r1 = (java.io.Closeable) r1
            goto L_0x001b
        L_0x002e:
            java.lang.Object r0 = r1.w0
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r3 = r1.Z
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            ag5 r5 = r1.Y
            java.lang.Object r6 = r1.X
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r7 = r1.z0
            d5b r7 = (d5b) r7
            wx3.H(r20)     // Catch:{ all -> 0x004b }
            r4 = r2
            r18 = r6
            r6 = r5
            r5 = r18
            goto L_0x01a5
        L_0x004b:
            r0 = move-exception
            r1 = r0
            r5 = r6
            goto L_0x0262
        L_0x0050:
            java.util.concurrent.atomic.AtomicReference r0 = r1.x0
            java.lang.Object r3 = r1.w0
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.lang.Object r5 = r1.Z
            java.nio.channels.AsynchronousFileChannel r5 = (java.nio.channels.AsynchronousFileChannel) r5
            ag5 r6 = r1.Y
            java.lang.Object r7 = r1.X
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r8 = r1.z0
            d5b r8 = (d5b) r8
            wx3.H(r20)     // Catch:{ all -> 0x006f }
            r4 = r2
            r18 = r7
            r7 = r5
            r5 = r18
            goto L_0x0191
        L_0x006f:
            r0 = move-exception
            r1 = r0
            r5 = r7
            goto L_0x0262
        L_0x0074:
            java.lang.Object r0 = r1.z0
            d5b r0 = (d5b) r0
            wx3.H(r20)
            r5 = r20
            goto L_0x013b
        L_0x007f:
            java.lang.Object r0 = r1.z0
            d5b r0 = (d5b) r0
            wx3.H(r20)
            goto L_0x0128
        L_0x0088:
            java.lang.Object r0 = r1.z0
            r5 = r0
            d5b r5 = (d5b) r5
            wx3.H(r20)     // Catch:{ all -> 0x0091 }
            goto L_0x0104
        L_0x0091:
            r0 = move-exception
            goto L_0x0106
        L_0x0093:
            wx3.H(r20)
            java.lang.Object r0 = r1.z0
            r5 = r0
            d5b r5 = (d5b) r5
            ag5 r0 = r1.A0
            java.lang.String r6 = r0.d
            fn6 r7 = udd.e
            if (r7 != 0) goto L_0x00a4
            goto L_0x00db
        L_0x00a4:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x00db
            tn7 r8 = defpackage.tn7.X
            java.io.File r9 = r0.i
            java.lang.String r9 = r9.getPath()
            long r10 = r0.j
            zpe r0 = r0.c
            wd3 r0 = r0.c()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Uploading file="
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r9 = " with size="
            r12.append(r9)
            r12.append(r10)
            java.lang.String r9 = " on network="
            r12.append(r9)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r7.d(r8, r6, r0, r4)
        L_0x00db:
            ag5 r0 = r1.A0
            long r6 = java.lang.System.currentTimeMillis()
            r0.r = r6
            ag5 r0 = r1.A0     // Catch:{ all -> 0x0091 }
            oxe r6 = r0.t     // Catch:{ all -> 0x0091 }
            java.net.URI r0 = r0.h     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0091 }
            u93 r7 = new u93     // Catch:{ all -> 0x0091 }
            r7.<init>()     // Catch:{ all -> 0x0091 }
            r7.j(r4, r0)     // Catch:{ all -> 0x0091 }
            sm6 r0 = r7.b()     // Catch:{ all -> 0x0091 }
            r1.z0 = r5     // Catch:{ all -> 0x0091 }
            r1.y0 = r3     // Catch:{ all -> 0x0091 }
            java.lang.Object r0 = r6.g(r0, r1)     // Catch:{ all -> 0x0091 }
            if (r0 != r2) goto L_0x0104
            return r2
        L_0x0104:
            r0 = r5
            goto L_0x0128
        L_0x0106:
            ag5 r6 = r1.A0
            zpe r6 = r6.c
            r6.e(r0)
            kcc r6 = new kcc
            r6.<init>(r0)
            mcc r0 = new mcc
            r0.<init>(r6)
            r1.z0 = r5
            r6 = 2
            r1.y0 = r6
            r6 = r5
            a5b r6 = (a5b) r6
            i02 r6 = r6.a
            java.lang.Object r0 = r6.o(r0, r1)
            if (r0 != r2) goto L_0x0104
            return r2
        L_0x0128:
            ag5 r5 = r1.A0
            qf5 r6 = new qf5
            r6.<init>(r5, r3)
            r1.z0 = r0
            r5 = 3
            r1.y0 = r5
            java.lang.Object r5 = udd.M(r6, r1)
            if (r5 != r2) goto L_0x013b
            return r2
        L_0x013b:
            java.io.Closeable r5 = (java.io.Closeable) r5
            ag5 r6 = r1.A0
            r7 = r5
            java.nio.channels.AsynchronousFileChannel r7 = (java.nio.channels.AsynchronousFileChannel) r7     // Catch:{ all -> 0x0194 }
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0194 }
            r8.<init>(r3)     // Catch:{ all -> 0x0194 }
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x0194 }
            r3.<init>(r4)     // Catch:{ all -> 0x0194 }
            r18 = r8
            r8 = r0
            r0 = r3
            r3 = r18
        L_0x0152:
            boolean r9 = r3.get()     // Catch:{ all -> 0x0194 }
            if (r9 == 0) goto L_0x0197
            hu3 r9 = r1.b     // Catch:{ all -> 0x0194 }
            lp.m(r9)     // Catch:{ all -> 0x0194 }
            t97 r9 = r6.f     // Catch:{ all -> 0x0194 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x0194 }
            r15 = r9
            ile r15 = (defpackage.ile) r15     // Catch:{ all -> 0x0194 }
            uf5 r14 = new uf5     // Catch:{ all -> 0x0194 }
            r16 = 0
            r9 = r14
            r10 = r3
            r11 = r6
            r12 = r7
            r13 = r0
            r4 = r14
            r14 = r8
            r17 = r2
            r2 = r15
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0194 }
            r1.z0 = r8     // Catch:{ all -> 0x0194 }
            r1.X = r5     // Catch:{ all -> 0x0194 }
            r1.Y = r6     // Catch:{ all -> 0x0194 }
            r1.Z = r7     // Catch:{ all -> 0x0194 }
            r1.w0 = r3     // Catch:{ all -> 0x0194 }
            r1.x0 = r0     // Catch:{ all -> 0x0194 }
            r9 = 4
            r1.y0 = r9     // Catch:{ all -> 0x0194 }
            java.lang.Object r2 = r2.a(r4, r1)     // Catch:{ all -> 0x0194 }
            r4 = r17
            if (r2 != r4) goto L_0x0191
            return r4
        L_0x0191:
            r2 = r4
            r4 = 0
            goto L_0x0152
        L_0x0194:
            r0 = move-exception
            goto L_0x0022
        L_0x0197:
            r4 = r2
            h37 r2 = r6.p     // Catch:{ all -> 0x0194 }
            dyc r2 = r2.getChildren()     // Catch:{ all -> 0x0194 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0194 }
            r3 = r0
            r0 = r2
            r7 = r8
        L_0x01a5:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0194 }
            if (r2 == 0) goto L_0x01c8
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0194 }
            g37 r2 = (g37) r2     // Catch:{ all -> 0x0194 }
            r1.z0 = r7     // Catch:{ all -> 0x0194 }
            r1.X = r5     // Catch:{ all -> 0x0194 }
            r1.Y = r6     // Catch:{ all -> 0x0194 }
            r1.Z = r3     // Catch:{ all -> 0x0194 }
            r1.w0 = r0     // Catch:{ all -> 0x0194 }
            r8 = 0
            r1.x0 = r8     // Catch:{ all -> 0x0194 }
            r8 = 5
            r1.y0 = r8     // Catch:{ all -> 0x0194 }
            java.lang.Object r2 = r2.join(r1)     // Catch:{ all -> 0x0194 }
            if (r2 != r4) goto L_0x01a5
            return r4
        L_0x01c8:
            java.lang.Object r0 = r3.get()     // Catch:{ all -> 0x0194 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0194 }
            if (r0 != 0) goto L_0x01fe
            long r2 = r6.j     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = r6.s     // Catch:{ all -> 0x0194 }
            ixe r8 = new ixe     // Catch:{ all -> 0x0194 }
            r9 = 1120403456(0x42c80000, float:100.0)
            r8.<init>(r9, r2, r0)     // Catch:{ all -> 0x0194 }
            mcc r0 = new mcc     // Catch:{ all -> 0x0194 }
            r0.<init>(r8)     // Catch:{ all -> 0x0194 }
            r1.z0 = r5     // Catch:{ all -> 0x0194 }
            r1.X = r6     // Catch:{ all -> 0x0194 }
            r2 = 0
            r1.Y = r2     // Catch:{ all -> 0x0194 }
            r1.Z = r2     // Catch:{ all -> 0x0194 }
            r1.w0 = r2     // Catch:{ all -> 0x0194 }
            r1.x0 = r2     // Catch:{ all -> 0x0194 }
            r2 = 6
            r1.y0 = r2     // Catch:{ all -> 0x0194 }
            a5b r7 = (a5b) r7     // Catch:{ all -> 0x0194 }
            i02 r2 = r7.a     // Catch:{ all -> 0x0194 }
            java.lang.Object r0 = r2.o(r0, r1)     // Catch:{ all -> 0x0194 }
            if (r0 != r4) goto L_0x01fb
            return r4
        L_0x01fb:
            r1 = r5
            r0 = r6
            goto L_0x0223
        L_0x01fe:
            kcc r2 = new kcc     // Catch:{ all -> 0x0194 }
            r2.<init>(r0)     // Catch:{ all -> 0x0194 }
            mcc r0 = new mcc     // Catch:{ all -> 0x0194 }
            r0.<init>(r2)     // Catch:{ all -> 0x0194 }
            r1.z0 = r5     // Catch:{ all -> 0x0194 }
            r1.X = r6     // Catch:{ all -> 0x0194 }
            r2 = 0
            r1.Y = r2     // Catch:{ all -> 0x0194 }
            r1.Z = r2     // Catch:{ all -> 0x0194 }
            r1.w0 = r2     // Catch:{ all -> 0x0194 }
            r1.x0 = r2     // Catch:{ all -> 0x0194 }
            r2 = 7
            r1.y0 = r2     // Catch:{ all -> 0x0194 }
            a5b r7 = (a5b) r7     // Catch:{ all -> 0x0194 }
            i02 r2 = r7.a     // Catch:{ all -> 0x0194 }
            java.lang.Object r0 = r2.o(r0, r1)     // Catch:{ all -> 0x0194 }
            if (r0 != r4) goto L_0x01fb
            return r4
        L_0x0223:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0020 }
            long r4 = r0.r     // Catch:{ all -> 0x0020 }
            long r2 = r2 - r4
            java.lang.String r0 = r0.d     // Catch:{ all -> 0x0020 }
            fn6 r4 = udd.e     // Catch:{ all -> 0x0020 }
            if (r4 != 0) goto L_0x0232
        L_0x0230:
            r2 = 0
            goto L_0x025c
        L_0x0232:
            boolean r5 = r4.c()     // Catch:{ all -> 0x0020 }
            if (r5 == 0) goto L_0x0230
            tn7 r5 = defpackage.tn7.X     // Catch:{ all -> 0x0020 }
            int r6 = zp4.o     // Catch:{ all -> 0x0020 }
            eq4 r6 = eq4.c     // Catch:{ all -> 0x0020 }
            long r2 = mt0.Q(r2, r6)     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = zp4.j(r2)     // Catch:{ all -> 0x0020 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0020 }
            r3.<init>()     // Catch:{ all -> 0x0020 }
            java.lang.String r6 = "FileUploadOperation worked for "
            r3.append(r6)     // Catch:{ all -> 0x0020 }
            r3.append(r2)     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0020 }
            r3 = 0
            r4.d(r5, r0, r2, r3)     // Catch:{ all -> 0x0020 }
            goto L_0x0230
        L_0x025c:
            urd.l(r1, r2)
            jue r0 = jue.a
            return r0
        L_0x0262:
            throw r1     // Catch:{ all -> 0x0263 }
        L_0x0263:
            r0 = move-exception
            r2 = r0
            urd.l(r5, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf5.o(java.lang.Object):java.lang.Object");
    }
}
