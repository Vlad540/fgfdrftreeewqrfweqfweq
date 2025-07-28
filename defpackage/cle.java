package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;
import javax.net.ssl.SSLEngine;

/* renamed from: cle  reason: default package */
public final class cle {
    public final SSLEngine a;
    public final AsynchronousByteChannel b;
    public final String c = cle.class.getName();
    public final tc9 d = uc9.a();
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public final ds0 i;
    public final ds0 j;
    public final ds0 k;
    public mu0 l;
    public int m;
    public final mu0 n;

    public cle(xr0 xr0, SSLEngine sSLEngine, AsynchronousByteChannel asynchronousByteChannel) {
        this.a = sSLEngine;
        this.b = asynchronousByteChannel;
        this.i = new ds0("inEncrypted", true, xr0);
        this.j = new ds0("outEncrypted", false, xr0);
        this.k = new ds0("inPlain", true, xr0);
        this.n = new mu0(new ByteBuffer[]{ByteBuffer.allocate(0)});
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080 A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082 A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.nio.ByteBuffer r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Read from channel; response: "
            boolean r1 = r10 instanceof defpackage.lke
            if (r1 == 0) goto L_0x0015
            r1 = r10
            lke r1 = (defpackage.lke) r1
            int r2 = r1.x0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.x0 = r2
            goto L_0x001a
        L_0x0015:
            lke r1 = new lke
            r1.<init>(r8, r10)
        L_0x001a:
            java.lang.Object r10 = r1.Z
            pu3 r2 = pu3.a
            int r3 = r1.x0
            jue r4 = jue.a
            r5 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r5) goto L_0x0033
            cle r8 = r1.Y
            java.nio.ByteBuffer r9 = r1.X
            cle r1 = r1.o
            wx3.H(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x005e
        L_0x0031:
            r8 = move-exception
            goto L_0x008b
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            wx3.H(r10)
            java.lang.String r10 = r8.c     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "Reading from channel"
            udd.Q(r10, r3)     // Catch:{ all -> 0x0088 }
            mke r10 = new mke     // Catch:{ all -> 0x0088 }
            r3 = 0
            r10.<init>(r8, r9, r3)     // Catch:{ all -> 0x0088 }
            r1.o = r8     // Catch:{ all -> 0x0088 }
            r1.X = r9     // Catch:{ all -> 0x0088 }
            r1.Y = r8     // Catch:{ all -> 0x0088 }
            r1.x0 = r5     // Catch:{ all -> 0x0088 }
            r6 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r10 = ez3.l0(r6, r10, r1)     // Catch:{ all -> 0x0088 }
            if (r10 != r2) goto L_0x005d
            return r2
        L_0x005d:
            r1 = r8
        L_0x005e:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ all -> 0x0031 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0031 }
            java.lang.String r8 = r8.c     // Catch:{ all -> 0x0031 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0031 }
            r2.<init>(r0)     // Catch:{ all -> 0x0031 }
            r2.append(r10)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = ", buffer: "
            r2.append(r0)     // Catch:{ all -> 0x0031 }
            r2.append(r9)     // Catch:{ all -> 0x0031 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x0031 }
            udd.Q(r8, r9)     // Catch:{ all -> 0x0031 }
            r8 = -1
            if (r10 == r8) goto L_0x0082
            r9 = r4
            goto L_0x0090
        L_0x0082:
            jke r8 = new jke     // Catch:{ all -> 0x0031 }
            r8.<init>()     // Catch:{ all -> 0x0031 }
            throw r8     // Catch:{ all -> 0x0031 }
        L_0x0088:
            r9 = move-exception
            r1 = r8
            r8 = r9
        L_0x008b:
            kcc r9 = new kcc
            r9.<init>(r8)
        L_0x0090:
            java.lang.Throwable r8 = mcc.a(r9)
            if (r8 == 0) goto L_0x0098
            r1.f = r5
        L_0x0098:
            wx3.H(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.a(java.nio.ByteBuffer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.nio.ByteBuffer r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.nke
            if (r0 == 0) goto L_0x0013
            r0 = r11
            nke r0 = (defpackage.nke) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            nke r0 = new nke
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.nio.ByteBuffer r9 = r0.X
            cle r10 = r0.o
            wx3.H(r11)
            r8 = r10
            r10 = r9
            r9 = r8
            goto L_0x0039
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            wx3.H(r11)
        L_0x0039:
            boolean r11 = r10.hasRemaining()
            if (r11 == 0) goto L_0x007a
            java.lang.String r11 = r9.c
            fn6 r2 = udd.e
            r4 = 0
            if (r2 != 0) goto L_0x0047
            goto L_0x0065
        L_0x0047:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0065
            tn7 r5 = defpackage.tn7.o
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "calling channel.write("
            r6.<init>(r7)
            r6.append(r10)
            java.lang.String r7 = ")"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.d(r5, r11, r6, r4)
        L_0x0065:
            oke r11 = new oke
            r11.<init>(r9, r10, r4)
            r0.o = r9
            r0.X = r10
            r0.w0 = r3
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r11 = ez3.l0(r4, r11, r0)
            if (r11 != r1) goto L_0x0039
            return r1
        L_0x007a:
            jue r9 = jue.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.b(java.nio.ByteBuffer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[Catch:{ SSLException -> 0x0030, all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062 A[Catch:{ SSLException -> 0x0030, all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.mu0 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            java.lang.String r0 = "engine.unwrap() result="
            boolean r1 = r10 instanceof defpackage.pke
            if (r1 == 0) goto L_0x0015
            r1 = r10
            pke r1 = (defpackage.pke) r1
            int r2 = r1.w0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.w0 = r2
            goto L_0x001a
        L_0x0015:
            pke r1 = new pke
            r1.<init>(r8, r10)
        L_0x001a:
            java.lang.Object r10 = r1.Y
            pu3 r2 = pu3.a
            int r3 = r1.w0
            r4 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r4) goto L_0x0032
            mu0 r9 = r1.X
            cle r8 = r1.o
            wx3.H(r10)     // Catch:{ SSLException -> 0x0030 }
            goto L_0x0059
        L_0x002d:
            r9 = move-exception
            goto L_0x00a7
        L_0x0030:
            r9 = move-exception
            goto L_0x00a4
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            wx3.H(r10)
            ds0 r10 = r8.i
            java.nio.ByteBuffer r10 = r10.e()
            r10.flip()
            hke r10 = new hke     // Catch:{ SSLException -> 0x0030 }
            r3 = 0
            r10.<init>(r8, r9, r3)     // Catch:{ SSLException -> 0x0030 }
            r1.o = r8     // Catch:{ SSLException -> 0x0030 }
            r1.X = r9     // Catch:{ SSLException -> 0x0030 }
            r1.w0 = r4     // Catch:{ SSLException -> 0x0030 }
            java.lang.Object r10 = udd.M(r10, r1)     // Catch:{ SSLException -> 0x0030 }
            if (r10 != r2) goto L_0x0059
            return r2
        L_0x0059:
            javax.net.ssl.SSLEngineResult r10 = (javax.net.ssl.SSLEngineResult) r10     // Catch:{ SSLException -> 0x0030 }
            java.lang.String r1 = r8.c     // Catch:{ SSLException -> 0x0030 }
            fn6 r2 = udd.e     // Catch:{ SSLException -> 0x0030 }
            if (r2 != 0) goto L_0x0062
            goto L_0x009a
        L_0x0062:
            boolean r3 = r2.c()     // Catch:{ SSLException -> 0x0030 }
            if (r3 == 0) goto L_0x009a
            tn7 r3 = defpackage.tn7.o     // Catch:{ SSLException -> 0x0030 }
            javax.net.ssl.SSLEngine r5 = r8.a     // Catch:{ SSLException -> 0x0030 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r5.getHandshakeStatus()     // Catch:{ SSLException -> 0x0030 }
            ds0 r6 = r8.i     // Catch:{ SSLException -> 0x0030 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SSLException -> 0x0030 }
            r7.<init>(r0)     // Catch:{ SSLException -> 0x0030 }
            r7.append(r10)     // Catch:{ SSLException -> 0x0030 }
            java.lang.String r0 = ", engineStatus="
            r7.append(r0)     // Catch:{ SSLException -> 0x0030 }
            r7.append(r5)     // Catch:{ SSLException -> 0x0030 }
            java.lang.String r0 = ", inEncrypted="
            r7.append(r0)     // Catch:{ SSLException -> 0x0030 }
            r7.append(r6)     // Catch:{ SSLException -> 0x0030 }
            java.lang.String r0 = ", dest="
            r7.append(r0)     // Catch:{ SSLException -> 0x0030 }
            r7.append(r9)     // Catch:{ SSLException -> 0x0030 }
            java.lang.String r9 = r7.toString()     // Catch:{ SSLException -> 0x0030 }
            r0 = 0
            r2.d(r3, r1, r9, r0)     // Catch:{ SSLException -> 0x0030 }
        L_0x009a:
            ds0 r8 = r8.i
            java.nio.ByteBuffer r8 = r8.e()
            r8.compact()
            return r10
        L_0x00a4:
            r8.f = r4     // Catch:{ all -> 0x002d }
            throw r9     // Catch:{ all -> 0x002d }
        L_0x00a7:
            ds0 r8 = r8.i
            java.nio.ByteBuffer r8 = r8.e()
            r8.compact()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.c(mu0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.mu0 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            java.lang.String r0 = "engine.wrap() result: ["
            boolean r1 = r8 instanceof defpackage.qke
            if (r1 == 0) goto L_0x0015
            r1 = r8
            qke r1 = (defpackage.qke) r1
            int r2 = r1.w0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.w0 = r2
            goto L_0x001a
        L_0x0015:
            qke r1 = new qke
            r1.<init>(r6, r8)
        L_0x001a:
            java.lang.Object r8 = r1.Y
            pu3 r2 = pu3.a
            int r3 = r1.w0
            r4 = 1
            if (r3 == 0) goto L_0x0037
            if (r3 != r4) goto L_0x002f
            mu0 r7 = r1.X
            cle r6 = r1.o
            wx3.H(r8)     // Catch:{ SSLException -> 0x002d }
            goto L_0x004d
        L_0x002d:
            r7 = move-exception
            goto L_0x0081
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            wx3.H(r8)
            hke r8 = new hke     // Catch:{ SSLException -> 0x002d }
            r3 = 1
            r8.<init>(r6, r7, r3)     // Catch:{ SSLException -> 0x002d }
            r1.o = r6     // Catch:{ SSLException -> 0x002d }
            r1.X = r7     // Catch:{ SSLException -> 0x002d }
            r1.w0 = r4     // Catch:{ SSLException -> 0x002d }
            java.lang.Object r8 = udd.M(r8, r1)     // Catch:{ SSLException -> 0x002d }
            if (r8 != r2) goto L_0x004d
            return r2
        L_0x004d:
            javax.net.ssl.SSLEngineResult r8 = (javax.net.ssl.SSLEngineResult) r8     // Catch:{ SSLException -> 0x002d }
            java.lang.String r1 = r6.c     // Catch:{ SSLException -> 0x002d }
            javax.net.ssl.SSLEngine r2 = r6.a     // Catch:{ SSLException -> 0x002d }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r2.getHandshakeStatus()     // Catch:{ SSLException -> 0x002d }
            ds0 r3 = r6.j     // Catch:{ SSLException -> 0x002d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SSLException -> 0x002d }
            r5.<init>(r0)     // Catch:{ SSLException -> 0x002d }
            r5.append(r8)     // Catch:{ SSLException -> 0x002d }
            java.lang.String r0 = "]; engine status: "
            r5.append(r0)     // Catch:{ SSLException -> 0x002d }
            r5.append(r2)     // Catch:{ SSLException -> 0x002d }
            java.lang.String r0 = "; srcBuffer: "
            r5.append(r0)     // Catch:{ SSLException -> 0x002d }
            r5.append(r7)     // Catch:{ SSLException -> 0x002d }
            java.lang.String r7 = ", outEncrypted: "
            r5.append(r7)     // Catch:{ SSLException -> 0x002d }
            r5.append(r3)     // Catch:{ SSLException -> 0x002d }
            java.lang.String r7 = r5.toString()     // Catch:{ SSLException -> 0x002d }
            udd.Q(r1, r7)     // Catch:{ SSLException -> 0x002d }
            return r8
        L_0x0081:
            r6.f = r4
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.d(mu0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073 A[Catch:{ all -> 0x002f, all -> 0x00a6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e A[Catch:{ all -> 0x002f, all -> 0x00a6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.rke
            if (r0 == 0) goto L_0x0013
            r0 = r7
            rke r0 = (defpackage.rke) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            rke r0 = new rke
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            cle r6 = r0.o
            wx3.H(r7)     // Catch:{ all -> 0x002f }
            goto L_0x007f
        L_0x002f:
            r7 = move-exception
            goto L_0x009b
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            cle r6 = r0.o
            wx3.H(r7)     // Catch:{ all -> 0x002f }
            goto L_0x0074
        L_0x003f:
            cle r6 = r0.o
            wx3.H(r7)     // Catch:{ all -> 0x002f }
            goto L_0x0062
        L_0x0045:
            wx3.H(r7)
            boolean r7 = r6.g     // Catch:{ all -> 0x002f }
            if (r7 != 0) goto L_0x008b
            boolean r7 = r6.f     // Catch:{ all -> 0x002f }
            if (r7 != 0) goto L_0x0085
            r6.g = r5     // Catch:{ all -> 0x002f }
            ds0 r7 = r6.j     // Catch:{ all -> 0x002f }
            r7.c()     // Catch:{ all -> 0x002f }
            r0.o = r6     // Catch:{ all -> 0x002f }
            r0.Z = r5     // Catch:{ all -> 0x002f }
            java.lang.Object r7 = r6.p(r0)     // Catch:{ all -> 0x002f }
            if (r7 != r1) goto L_0x0062
            return r1
        L_0x0062:
            javax.net.ssl.SSLEngine r7 = r6.a     // Catch:{ all -> 0x002f }
            r7.closeOutbound()     // Catch:{ all -> 0x002f }
            mu0 r7 = r6.n     // Catch:{ all -> 0x002f }
            r0.o = r6     // Catch:{ all -> 0x002f }
            r0.Z = r4     // Catch:{ all -> 0x002f }
            java.lang.Object r7 = r6.m(r7, r0)     // Catch:{ all -> 0x002f }
            if (r7 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r0.o = r6     // Catch:{ all -> 0x002f }
            r0.Z = r3     // Catch:{ all -> 0x002f }
            java.lang.Object r7 = r6.p(r0)     // Catch:{ all -> 0x002f }
            if (r7 != r1) goto L_0x007f
            return r1
        L_0x007f:
            java.nio.channels.AsynchronousByteChannel r7 = r6.b     // Catch:{ all -> 0x002f }
            r7.close()     // Catch:{ all -> 0x002f }
            goto L_0x008b
        L_0x0085:
            java.nio.channels.ClosedChannelException r7 = new java.nio.channels.ClosedChannelException     // Catch:{ all -> 0x002f }
            r7.<init>()     // Catch:{ all -> 0x002f }
            throw r7     // Catch:{ all -> 0x002f }
        L_0x008b:
            ds0 r7 = r6.i
            r7.a()
            ds0 r7 = r6.k
            r7.a()
            ds0 r6 = r6.j
            r6.a()
            goto L_0x00a3
        L_0x009b:
            java.lang.String r0 = r6.c     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "error doing TLS shutdown on close(), continuing"
            udd.s(r0, r1, r7)     // Catch:{ all -> 0x00a6 }
            goto L_0x008b
        L_0x00a3:
            jue r6 = jue.a
            return r6
        L_0x00a6:
            r7 = move-exception
            ds0 r0 = r6.i
            r0.a()
            ds0 r0 = r6.k
            r0.a()
            ds0 r6 = r6.j
            r6.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:11|12|13|46|47|48) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00af */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[SYNTHETIC, Splitter:B:33:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e A[Catch:{ jke -> 0x00af }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[Catch:{ jke -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.ske
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ske r0 = (defpackage.ske) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            ske r0 = new ske
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0052
            if (r2 == r6) goto L_0x0048
            if (r2 == r5) goto L_0x0040
            if (r2 != r4) goto L_0x0038
            qc9 r10 = r0.X
            cle r0 = r0.o
            wx3.H(r11)     // Catch:{ jke -> 0x00af }
            goto L_0x00a0
        L_0x0035:
            r11 = move-exception
            goto L_0x00b9
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0040:
            qc9 r10 = r0.X
            cle r2 = r0.o
            wx3.H(r11)     // Catch:{ all -> 0x0035 }
            goto L_0x0092
        L_0x0048:
            qc9 r10 = r0.X
            cle r2 = r0.o
            wx3.H(r11)
            r11 = r10
            r10 = r2
            goto L_0x006c
        L_0x0052:
            wx3.H(r11)
            boolean r11 = r10.f
            if (r11 != 0) goto L_0x00bf
            boolean r11 = r10.g
            if (r11 != 0) goto L_0x00bf
            tc9 r11 = r10.d
            r0.o = r10
            r0.X = r11
            r0.w0 = r6
            java.lang.Object r2 = r11.d(r0)
            if (r2 != r1) goto L_0x006c
            return r1
        L_0x006c:
            boolean r2 = r10.e     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x0076
            tc9 r11 = (tc9) r11
            r11.e(r7)
            return r3
        L_0x0076:
            java.lang.String r2 = r10.c     // Catch:{ all -> 0x00b5 }
            java.lang.String r8 = "Starting SSLEngine.beginHandshake()"
            udd.q(r2, r8)     // Catch:{ all -> 0x00b5 }
            ike r2 = new ike     // Catch:{ all -> 0x00b5 }
            r8 = 1
            r2.<init>(r10, r8)     // Catch:{ all -> 0x00b5 }
            r0.o = r10     // Catch:{ all -> 0x00b5 }
            r0.X = r11     // Catch:{ all -> 0x00b5 }
            r0.w0 = r5     // Catch:{ all -> 0x00b5 }
            java.lang.Object r2 = udd.M(r2, r0)     // Catch:{ all -> 0x00b5 }
            if (r2 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r2 = r10
            r10 = r11
        L_0x0092:
            r0.o = r2     // Catch:{ jke -> 0x00af }
            r0.X = r10     // Catch:{ jke -> 0x00af }
            r0.w0 = r4     // Catch:{ jke -> 0x00af }
            java.lang.Object r11 = r2.o(r0)     // Catch:{ jke -> 0x00af }
            if (r11 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r0 = r2
        L_0x00a0:
            java.lang.String r11 = r0.c     // Catch:{ jke -> 0x00af }
            java.lang.String r1 = "Ended SSLEngine.beginHandshake()"
            udd.q(r11, r1)     // Catch:{ jke -> 0x00af }
            r0.e = r6     // Catch:{ jke -> 0x00af }
            tc9 r10 = (tc9) r10
            r10.e(r7)
            return r3
        L_0x00af:
            java.nio.channels.ClosedChannelException r11 = new java.nio.channels.ClosedChannelException     // Catch:{ all -> 0x0035 }
            r11.<init>()     // Catch:{ all -> 0x0035 }
            throw r11     // Catch:{ all -> 0x0035 }
        L_0x00b5:
            r10 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x00b9:
            tc9 r10 = (tc9) r10
            r10.e(r7)
            throw r11
        L_0x00bf:
            java.nio.channels.ClosedChannelException r10 = new java.nio.channels.ClosedChannelException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.tke
            if (r0 == 0) goto L_0x0013
            r0 = r9
            tke r0 = (defpackage.tke) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            tke r0 = new tke
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r7) goto L_0x0046
            if (r2 == r6) goto L_0x0043
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            cle r8 = r0.o
            wx3.H(r9)
            goto L_0x007d
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            cle r8 = r0.o
            wx3.H(r9)
            goto L_0x00bc
        L_0x0043:
            cle r8 = r0.o
            goto L_0x004c
        L_0x0046:
            cle r8 = r0.o
            wx3.H(r9)
            goto L_0x00a6
        L_0x004c:
            wx3.H(r9)
        L_0x004f:
            javax.net.ssl.SSLEngine r9 = r8.a
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = r9.getHandshakeStatus()
            if (r9 != 0) goto L_0x0059
            r9 = -1
            goto L_0x0061
        L_0x0059:
            int[] r2 = defpackage.kke.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r2[r9]
        L_0x0061:
            if (r9 == r7) goto L_0x00b1
            if (r9 == r6) goto L_0x0099
            if (r9 == r5) goto L_0x0098
            if (r9 == r4) goto L_0x008c
            r2 = 5
            if (r9 != r2) goto L_0x0080
            ike r9 = new ike
            r2 = 0
            r9.<init>(r8, r2)
            r0.o = r8
            r0.Z = r4
            java.lang.Object r9 = udd.M(r9, r0)
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x007d:
            jue r9 = (jue) r9
            goto L_0x004f
        L_0x0080:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unsupported usage"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x008c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unreachable status"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0098:
            return r3
        L_0x0099:
            r0.o = r8
            r0.Z = r7
            mu0 r9 = r8.n
            java.lang.Object r9 = r8.m(r9, r0)
            if (r9 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            r0.o = r8
            r0.Z = r6
            java.lang.Object r9 = r8.p(r0)
            if (r9 != r1) goto L_0x004f
            return r1
        L_0x00b1:
            r0.o = r8
            r0.Z = r5
            java.lang.Object r9 = r8.i(r0)
            if (r9 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            int r9 = r8.m
            if (r9 <= 0) goto L_0x004f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:(1:(1:(3:12|13|14)(2:16|17))(3:18|19|20))(3:21|22|23)|115|116|117|118) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x018f */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0180 A[Catch:{ jke -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0189 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0 A[Catch:{ jke -> 0x00e3, all -> 0x0186 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[Catch:{ jke -> 0x00e3, all -> 0x0186 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c6 A[Catch:{ jke -> 0x00e3, all -> 0x0186 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6 A[Catch:{ jke -> 0x00e3, all -> 0x0186 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ed A[SYNTHETIC, Splitter:B:62:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.mu0 r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.uke
            if (r3 == 0) goto L_0x0019
            r3 = r2
            uke r3 = (defpackage.uke) r3
            int r4 = r3.x0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.x0 = r4
            goto L_0x001e
        L_0x0019:
            uke r3 = new uke
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.Z
            pu3 r4 = pu3.a
            int r5 = r3.x0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = -1
            if (r5 == 0) goto L_0x0069
            if (r5 == r8) goto L_0x0061
            if (r5 == r11) goto L_0x0056
            if (r5 == r10) goto L_0x004b
            if (r5 != r9) goto L_0x0043
            int r0 = r3.Y
            mu0 r1 = r3.X
            cle r5 = r3.o
            wx3.H(r2)     // Catch:{ jke -> 0x018f }
            goto L_0x014e
        L_0x0040:
            r0 = move-exception
            goto L_0x0199
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            int r0 = r3.Y
            mu0 r1 = r3.X
            cle r5 = r3.o
            wx3.H(r2)     // Catch:{ jke -> 0x018f }
            goto L_0x0160
        L_0x0056:
            int r0 = r3.Y
            mu0 r1 = r3.X
            cle r5 = r3.o
            wx3.H(r2)     // Catch:{ jke -> 0x018f }
            goto L_0x017d
        L_0x0061:
            mu0 r0 = r3.X
            cle r1 = r3.o
            wx3.H(r2)
            goto L_0x00a8
        L_0x0069:
            wx3.H(r2)
            java.lang.String r2 = r0.c
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x0073
            goto L_0x008c
        L_0x0073:
            boolean r13 = r5.c()
            if (r13 == 0) goto L_0x008c
            tn7 r13 = defpackage.tn7.X
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "read: dest="
            r14.<init>(r15)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            r5.d(r13, r2, r14, r6)
        L_0x008c:
            long r13 = r19.c()
            r15 = 0
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x019e
            r3.o = r0
            r3.X = r1
            r3.x0 = r8
            java.lang.Object r2 = r0.f(r3)
            if (r2 != r4) goto L_0x00a3
            return r4
        L_0x00a3:
            r17 = r1
            r1 = r0
            r0 = r17
        L_0x00a8:
            boolean r2 = r1.f     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            if (r2 != 0) goto L_0x0189
            boolean r2 = r1.g     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            if (r2 != 0) goto L_0x0189
            r1.l = r0     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            ds0 r2 = r1.k     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            java.nio.ByteBuffer r2 = r2.f     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            if (r2 == 0) goto L_0x00c1
            int r2 = r2.position()     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            if (r2 != 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r2 = r7
            goto L_0x00c2
        L_0x00c1:
            r2 = r8
        L_0x00c2:
            if (r2 == 0) goto L_0x00c6
            r2 = r7
            goto L_0x00d0
        L_0x00c6:
            ds0 r2 = r1.k     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            java.nio.ByteBuffer r2 = r2.e()     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            int r2 = r2.position()     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
        L_0x00d0:
            r1.m = r2     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            boolean r2 = r1.h     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            if (r2 == 0) goto L_0x00e6
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            r0.<init>(r12)     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            r1.m = r7
            r1.l = r6
            return r0
        L_0x00e0:
            r5 = r1
            goto L_0x0199
        L_0x00e3:
            r5 = r1
            goto L_0x018f
        L_0x00e6:
            r5 = r1
            r1 = r0
            r0 = r7
        L_0x00e9:
            r2 = 150(0x96, float:2.1E-43)
            if (r0 == r2) goto L_0x0180
            int r2 = r5.m     // Catch:{ jke -> 0x018f }
            if (r2 <= 0) goto L_0x0112
            ds0 r0 = r5.k     // Catch:{ jke -> 0x018f }
            java.nio.ByteBuffer r0 = r0.f     // Catch:{ jke -> 0x018f }
            if (r0 == 0) goto L_0x00ff
            int r0 = r0.position()     // Catch:{ jke -> 0x018f }
            if (r0 != 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r8 = r7
        L_0x00ff:
            if (r8 == 0) goto L_0x0104
            int r0 = r5.m     // Catch:{ jke -> 0x018f }
            goto L_0x0108
        L_0x0104:
            int r0 = r5.j(r1)     // Catch:{ jke -> 0x018f }
        L_0x0108:
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ jke -> 0x018f }
            r1.<init>(r0)     // Catch:{ jke -> 0x018f }
            r5.m = r7
            r5.l = r6
            return r1
        L_0x0112:
            javax.net.ssl.SSLEngine r2 = r5.a     // Catch:{ jke -> 0x018f }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r2.getHandshakeStatus()     // Catch:{ jke -> 0x018f }
            if (r2 != 0) goto L_0x011c
            r2 = r12
            goto L_0x0124
        L_0x011c:
            int[] r13 = defpackage.kke.$EnumSwitchMapping$0     // Catch:{ jke -> 0x018f }
            int r2 = r2.ordinal()     // Catch:{ jke -> 0x018f }
            r2 = r13[r2]     // Catch:{ jke -> 0x018f }
        L_0x0124:
            if (r2 == r8) goto L_0x016e
            if (r2 == r11) goto L_0x016e
            if (r2 == r10) goto L_0x0151
            if (r2 == r9) goto L_0x0151
            r13 = 5
            if (r2 == r13) goto L_0x0139
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ jke -> 0x018f }
            r0.<init>(r12)     // Catch:{ jke -> 0x018f }
            r5.m = r7
            r5.l = r6
            return r0
        L_0x0139:
            ike r2 = new ike     // Catch:{ jke -> 0x018f }
            r13 = 2
            r2.<init>(r5, r13)     // Catch:{ jke -> 0x018f }
            r3.o = r5     // Catch:{ jke -> 0x018f }
            r3.X = r1     // Catch:{ jke -> 0x018f }
            r3.Y = r0     // Catch:{ jke -> 0x018f }
            r3.x0 = r9     // Catch:{ jke -> 0x018f }
            java.lang.Object r2 = udd.M(r2, r3)     // Catch:{ jke -> 0x018f }
            if (r2 != r4) goto L_0x014e
            return r4
        L_0x014e:
            jue r2 = (jue) r2     // Catch:{ jke -> 0x018f }
            goto L_0x017d
        L_0x0151:
            r3.o = r5     // Catch:{ jke -> 0x018f }
            r3.X = r1     // Catch:{ jke -> 0x018f }
            r3.Y = r0     // Catch:{ jke -> 0x018f }
            r3.x0 = r10     // Catch:{ jke -> 0x018f }
            java.lang.Object r2 = r5.i(r3)     // Catch:{ jke -> 0x018f }
            if (r2 != r4) goto L_0x0160
            return r4
        L_0x0160:
            boolean r2 = r5.h     // Catch:{ jke -> 0x018f }
            if (r2 == 0) goto L_0x017d
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ jke -> 0x018f }
            r0.<init>(r12)     // Catch:{ jke -> 0x018f }
            r5.m = r7
            r5.l = r6
            return r0
        L_0x016e:
            r3.o = r5     // Catch:{ jke -> 0x018f }
            r3.X = r1     // Catch:{ jke -> 0x018f }
            r3.Y = r0     // Catch:{ jke -> 0x018f }
            r3.x0 = r11     // Catch:{ jke -> 0x018f }
            java.lang.Object r2 = r5.o(r3)     // Catch:{ jke -> 0x018f }
            if (r2 != r4) goto L_0x017d
            return r4
        L_0x017d:
            int r0 = r0 + r8
            goto L_0x00e9
        L_0x0180:
            one.me.sdk.transfer.upload.network.InfiniteLoopException r0 = new one.me.sdk.transfer.upload.network.InfiniteLoopException     // Catch:{ jke -> 0x018f }
            r0.<init>()     // Catch:{ jke -> 0x018f }
            throw r0     // Catch:{ jke -> 0x018f }
        L_0x0186:
            r0 = move-exception
            goto L_0x00e0
        L_0x0189:
            java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            r0.<init>()     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
            throw r0     // Catch:{ jke -> 0x00e3, all -> 0x0186 }
        L_0x018f:
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x0040 }
            r0.<init>(r12)     // Catch:{ all -> 0x0040 }
            r5.m = r7
            r5.l = r6
            return r0
        L_0x0199:
            r5.m = r7
            r5.l = r6
            throw r0
        L_0x019e:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.h(mu0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f A[Catch:{ all -> 0x002c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC, Splitter:B:27:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c A[SYNTHETIC, Splitter:B:31:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.vke
            if (r0 == 0) goto L_0x0013
            r0 = r9
            vke r0 = (defpackage.vke) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            vke r0 = new vke
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            cle r8 = r0.o
            wx3.H(r9)     // Catch:{ all -> 0x002c }
            goto L_0x0045
        L_0x002c:
            r9 = move-exception
            goto L_0x00aa
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            cle r8 = r0.o
            wx3.H(r9)     // Catch:{ all -> 0x002c }
            goto L_0x0050
        L_0x003d:
            wx3.H(r9)
            ds0 r9 = r8.i
            r9.c()
        L_0x0045:
            r0.o = r8     // Catch:{ all -> 0x002c }
            r0.Z = r4     // Catch:{ all -> 0x002c }
            java.lang.Object r9 = r8.k(r0)     // Catch:{ all -> 0x002c }
            if (r9 != r1) goto L_0x0050
            return r1
        L_0x0050:
            javax.net.ssl.SSLEngineResult r9 = (javax.net.ssl.SSLEngineResult) r9     // Catch:{ all -> 0x002c }
            javax.net.ssl.SSLEngine r2 = r8.a     // Catch:{ all -> 0x002c }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r2.getHandshakeStatus()     // Catch:{ all -> 0x002c }
            int r5 = r9.bytesProduced()     // Catch:{ all -> 0x002c }
            jue r6 = jue.a
            if (r5 <= 0) goto L_0x006c
            int r9 = r9.bytesProduced()     // Catch:{ all -> 0x002c }
            r8.m = r9     // Catch:{ all -> 0x002c }
        L_0x0066:
            ds0 r8 = r8.i
            r8.d()
            return r6
        L_0x006c:
            javax.net.ssl.SSLEngineResult$Status r5 = r9.getStatus()     // Catch:{ all -> 0x002c }
            javax.net.ssl.SSLEngineResult$Status r7 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x002c }
            if (r5 != r7) goto L_0x0077
            r8.h = r4     // Catch:{ all -> 0x002c }
            goto L_0x0066
        L_0x0077:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = r9.getHandshakeStatus()     // Catch:{ all -> 0x002c }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x002c }
            if (r9 == r5) goto L_0x0066
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ all -> 0x002c }
            if (r2 == r9) goto L_0x0066
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x002c }
            if (r2 != r9) goto L_0x0088
            goto L_0x0066
        L_0x0088:
            ds0 r9 = r8.i     // Catch:{ all -> 0x002c }
            java.nio.ByteBuffer r9 = r9.e()     // Catch:{ all -> 0x002c }
            boolean r9 = r9.hasRemaining()     // Catch:{ all -> 0x002c }
            if (r9 != 0) goto L_0x0099
            ds0 r9 = r8.i     // Catch:{ all -> 0x002c }
            r9.b()     // Catch:{ all -> 0x002c }
        L_0x0099:
            ds0 r9 = r8.i     // Catch:{ all -> 0x002c }
            java.nio.ByteBuffer r9 = r9.e()     // Catch:{ all -> 0x002c }
            r0.o = r8     // Catch:{ all -> 0x002c }
            r0.Z = r3     // Catch:{ all -> 0x002c }
            java.lang.Object r9 = r8.a(r9, r0)     // Catch:{ all -> 0x002c }
            if (r9 != r1) goto L_0x0045
            return r1
        L_0x00aa:
            ds0 r8 = r8.i
            r8.d()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int j(mu0 mu0) {
        ds0 ds0 = this.k;
        ds0.e().flip();
        ByteBuffer e2 = ds0.e();
        int i2 = 0;
        for (int i3 = mu0.b; i3 < mu0.d; i3++) {
            ByteBuffer byteBuffer = ((ByteBuffer[]) mu0.e)[i3];
            if (e2.hasRemaining()) {
                int min = Math.min(e2.remaining(), byteBuffer.remaining());
                if (min < 0) {
                    throw new IllegalArgumentException("negative length".toString());
                } else if (e2.remaining() < min) {
                    throw new IllegalArgumentException(rf0.g("source buffer does not have enough remaining capacity (", e2.remaining(), " < ", min, ")").toString());
                } else if (byteBuffer.remaining() >= min) {
                    if (min != 0) {
                        byteBuffer.put(e2.array(), e2.position(), min);
                        e2.position(e2.position() + min);
                    }
                    i2 += min;
                } else {
                    throw new IllegalArgumentException(rf0.g("destination buffer does not have enough remaining capacity (", byteBuffer.remaining(), " < ", min, ")").toString());
                }
            }
        }
        ds0.e().compact();
        if (!ds0.d() && ds0.f != null) {
            ds0.f(ds0.e().position());
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.wke
            if (r0 == 0) goto L_0x0013
            r0 = r11
            wke r0 = (defpackage.wke) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            wke r0 = new wke
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            mu0 r10 = r0.X
            cle r2 = r0.o
            wx3.H(r11)
            r9 = r0
            r0 = r10
            r10 = r2
        L_0x002d:
            r2 = r9
            goto L_0x005f
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0037:
            wx3.H(r11)
            mu0 r11 = r10.l
            if (r11 == 0) goto L_0x003f
            goto L_0x004e
        L_0x003f:
            ds0 r11 = r10.k
            r11.c()
            mu0 r2 = new mu0
            java.nio.ByteBuffer r11 = r11.e()
            r2.<init>((java.nio.ByteBuffer) r11)
            r11 = r2
        L_0x004e:
            r0.o = r10
            r0.X = r11
            r0.w0 = r3
            java.lang.Object r2 = r10.c(r11, r0)
            if (r2 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r9 = r0
            r0 = r11
            r11 = r2
            goto L_0x002d
        L_0x005f:
            javax.net.ssl.SSLEngineResult r11 = (javax.net.ssl.SSLEngineResult) r11
            javax.net.ssl.SSLEngine r4 = r10.a
            javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = r4.getHandshakeStatus()
            int r5 = r11.bytesProduced()
            if (r5 <= 0) goto L_0x006e
            return r11
        L_0x006e:
            javax.net.ssl.SSLEngineResult$Status r5 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            if (r5 != r6) goto L_0x0077
            return r11
        L_0x0077:
            javax.net.ssl.SSLEngineResult$Status r5 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW
            if (r5 != r6) goto L_0x0080
            return r11
        L_0x0080:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r11.getHandshakeStatus()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            if (r5 == r6) goto L_0x00cb
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
            if (r4 == r5) goto L_0x00cb
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            if (r4 != r5) goto L_0x0091
            goto L_0x00cb
        L_0x0091:
            javax.net.ssl.SSLEngineResult$Status r11 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW
            if (r11 != r4) goto L_0x00c9
            mu0 r11 = r10.l
            boolean r11 = hhd.f(r0, r11)
            ds0 r4 = r10.k
            if (r11 == 0) goto L_0x00bb
            r4.c()
            java.nio.ByteBuffer r11 = r4.e()
            int r11 = r11.capacity()
            long r5 = (long) r11
            long r7 = r0.c()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x00be
            r4.b()
            goto L_0x00be
        L_0x00bb:
            r4.b()
        L_0x00be:
            mu0 r11 = new mu0
            java.nio.ByteBuffer r0 = r4.e()
            r11.<init>((java.nio.ByteBuffer) r0)
        L_0x00c7:
            r0 = r2
            goto L_0x004e
        L_0x00c9:
            r11 = r0
            goto L_0x00c7
        L_0x00cb:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[SYNTHETIC, Splitter:B:22:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098 A[SYNTHETIC, Splitter:B:39:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c6 A[SYNTHETIC, Splitter:B:49:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(defpackage.mu0 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.xke
            if (r0 == 0) goto L_0x0013
            r0 = r13
            xke r0 = (defpackage.xke) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            xke r0 = new xke
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.w0
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r11 = r0.Z
            long r5 = r0.Y
            mu0 r12 = r0.X
            cle r2 = r0.o
            wx3.H(r13)     // Catch:{ all -> 0x0033 }
            goto L_0x00a9
        L_0x0033:
            r11 = move-exception
            goto L_0x00cc
        L_0x0036:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003e:
            int r11 = r0.Z
            long r5 = r0.Y
            mu0 r12 = r0.X
            cle r2 = r0.o
            wx3.H(r13)     // Catch:{ all -> 0x0033 }
            goto L_0x006e
        L_0x004a:
            wx3.H(r13)
            long r5 = r12.c()
            ds0 r13 = r11.j
            r13.c()
            r13 = 0
        L_0x0057:
            r2 = 150(0x96, float:2.1E-43)
            if (r13 == r2) goto L_0x00c6
            r0.o = r11     // Catch:{ all -> 0x00c2 }
            r0.X = r12     // Catch:{ all -> 0x00c2 }
            r0.Y = r5     // Catch:{ all -> 0x00c2 }
            r0.Z = r13     // Catch:{ all -> 0x00c2 }
            r0.y0 = r4     // Catch:{ all -> 0x00c2 }
            java.lang.Object r2 = r11.p(r0)     // Catch:{ all -> 0x00c2 }
            if (r2 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r2 = r11
            r11 = r13
        L_0x006e:
            long r7 = r12.c()     // Catch:{ all -> 0x0033 }
            r9 = 0
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x0098
            java.lang.String r11 = r2.c     // Catch:{ all -> 0x0033 }
            fn6 r12 = udd.e     // Catch:{ all -> 0x0033 }
            if (r12 != 0) goto L_0x007f
            goto L_0x008d
        L_0x007f:
            boolean r13 = r12.c()     // Catch:{ all -> 0x0033 }
            if (r13 == 0) goto L_0x008d
            tn7 r13 = defpackage.tn7.o     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "wrapAndWrite: remaining=0, exiting loop"
            r1 = 0
            r12.d(r13, r11, r0, r1)     // Catch:{ all -> 0x0033 }
        L_0x008d:
            java.lang.Long r11 = new java.lang.Long     // Catch:{ all -> 0x0033 }
            r11.<init>(r5)     // Catch:{ all -> 0x0033 }
        L_0x0092:
            ds0 r12 = r2.j
            r12.d()
            return r11
        L_0x0098:
            r0.o = r2     // Catch:{ all -> 0x0033 }
            r0.X = r12     // Catch:{ all -> 0x0033 }
            r0.Y = r5     // Catch:{ all -> 0x0033 }
            r0.Z = r11     // Catch:{ all -> 0x0033 }
            r0.y0 = r3     // Catch:{ all -> 0x0033 }
            java.lang.Object r13 = r2.m(r12, r0)     // Catch:{ all -> 0x0033 }
            if (r13 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            javax.net.ssl.SSLEngineResult r13 = (javax.net.ssl.SSLEngineResult) r13     // Catch:{ all -> 0x0033 }
            javax.net.ssl.SSLEngineResult$Status r13 = r13.getStatus()     // Catch:{ all -> 0x0033 }
            javax.net.ssl.SSLEngineResult$Status r7 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x0033 }
            if (r13 != r7) goto L_0x00be
            long r11 = r12.c()     // Catch:{ all -> 0x0033 }
            long r5 = r5 - r11
            java.lang.Long r11 = new java.lang.Long     // Catch:{ all -> 0x0033 }
            r11.<init>(r5)     // Catch:{ all -> 0x0033 }
            goto L_0x0092
        L_0x00be:
            int r13 = r11 + 1
            r11 = r2
            goto L_0x0057
        L_0x00c2:
            r12 = move-exception
            r2 = r11
            r11 = r12
            goto L_0x00cc
        L_0x00c6:
            one.me.sdk.transfer.upload.network.InfiniteLoopException r12 = new one.me.sdk.transfer.upload.network.InfiniteLoopException     // Catch:{ all -> 0x00c2 }
            r12.<init>()     // Catch:{ all -> 0x00c2 }
            throw r12     // Catch:{ all -> 0x00c2 }
        L_0x00cc:
            ds0 r12 = r2.j
            r12.d()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.l(mu0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(defpackage.mu0 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yke
            if (r0 == 0) goto L_0x0013
            r0 = r8
            yke r0 = (defpackage.yke) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            yke r0 = new yke
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            mu0 r6 = r0.X
            cle r7 = r0.o
            wx3.H(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x0046
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            wx3.H(r8)
        L_0x0039:
            r0.o = r6
            r0.X = r7
            r0.w0 = r3
            java.lang.Object r8 = r6.d(r7, r0)
            if (r8 != r1) goto L_0x0046
            return r1
        L_0x0046:
            javax.net.ssl.SSLEngineResult r8 = (javax.net.ssl.SSLEngineResult) r8
            javax.net.ssl.SSLEngineResult$Status r2 = r8.getStatus()
            if (r2 != 0) goto L_0x0050
            r2 = -1
            goto L_0x0058
        L_0x0050:
            int[] r4 = defpackage.kke.$EnumSwitchMapping$1
            int r2 = r2.ordinal()
            r2 = r4[r2]
        L_0x0058:
            if (r2 == r3) goto L_0x007b
            r4 = 2
            if (r2 == r4) goto L_0x007b
            r8 = 3
            if (r2 == r8) goto L_0x0075
            r6 = 4
            if (r2 == r6) goto L_0x0069
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0069:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Undefined status"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0075:
            ds0 r8 = r6.j
            r8.b()
            goto L_0x0039
        L_0x007b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.m(mu0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(defpackage.mu0 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.zke
            if (r0 == 0) goto L_0x0013
            r0 = r11
            zke r0 = (defpackage.zke) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            zke r0 = new zke
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            wx3.H(r11)
            goto L_0x0080
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            mu0 r10 = r0.X
            cle r9 = r0.o
            wx3.H(r11)
            goto L_0x006b
        L_0x003b:
            wx3.H(r11)
            java.lang.String r11 = r9.c
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x0045
            goto L_0x005e
        L_0x0045:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x005e
            tn7 r6 = defpackage.tn7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "write: "
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r2.d(r6, r11, r7, r3)
        L_0x005e:
            r0.o = r9
            r0.X = r10
            r0.w0 = r5
            java.lang.Object r11 = r9.f(r0)
            if (r11 != r1) goto L_0x006b
            return r1
        L_0x006b:
            boolean r11 = r9.f
            if (r11 != 0) goto L_0x0081
            boolean r11 = r9.g
            if (r11 != 0) goto L_0x0081
            r0.o = r3
            r0.X = r3
            r0.w0 = r4
            java.lang.Object r11 = r9.l(r10, r0)
            if (r11 != r1) goto L_0x0080
            return r1
        L_0x0080:
            return r11
        L_0x0081:
            java.nio.channels.ClosedChannelException r9 = new java.nio.channels.ClosedChannelException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.n(mu0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ale
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ale r0 = (defpackage.ale) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            ale r0 = new ale
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            cle r5 = r0.o
            wx3.H(r6)     // Catch:{ all -> 0x002c }
            goto L_0x005a
        L_0x002c:
            r6 = move-exception
            goto L_0x0062
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            cle r5 = r0.o
            wx3.H(r6)     // Catch:{ all -> 0x002c }
            goto L_0x004f
        L_0x003c:
            wx3.H(r6)
            ds0 r6 = r5.j
            r6.c()
            r0.o = r5     // Catch:{ all -> 0x002c }
            r0.Z = r4     // Catch:{ all -> 0x002c }
            java.lang.Object r6 = r5.p(r0)     // Catch:{ all -> 0x002c }
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r0.o = r5     // Catch:{ all -> 0x002c }
            r0.Z = r3     // Catch:{ all -> 0x002c }
            java.lang.Object r6 = r5.g(r0)     // Catch:{ all -> 0x002c }
            if (r6 != r1) goto L_0x005a
            return r1
        L_0x005a:
            ds0 r5 = r5.j
            r5.d()
            jue r5 = jue.a
            return r5
        L_0x0062:
            ds0 r5 = r5.j
            r5.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ble
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ble r0 = (defpackage.ble) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            ble r0 = new ble
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            cle r5 = r0.o
            wx3.H(r6)     // Catch:{ all -> 0x002b }
            goto L_0x005f
        L_0x002b:
            r6 = move-exception
            goto L_0x0061
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            wx3.H(r6)
            ds0 r6 = r5.j
            java.nio.ByteBuffer r6 = r6.e()
            int r6 = r6.position()
            if (r6 != 0) goto L_0x0045
            return r3
        L_0x0045:
            ds0 r6 = r5.j
            java.nio.ByteBuffer r6 = r6.e()
            r6.flip()
            ds0 r6 = r5.j     // Catch:{ all -> 0x002b }
            java.nio.ByteBuffer r6 = r6.e()     // Catch:{ all -> 0x002b }
            r0.o = r5     // Catch:{ all -> 0x002b }
            r0.Z = r4     // Catch:{ all -> 0x002b }
            java.lang.Object r6 = r5.b(r6, r0)     // Catch:{ all -> 0x002b }
            if (r6 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r0 = r3
            goto L_0x0066
        L_0x0061:
            kcc r0 = new kcc
            r0.<init>(r6)
        L_0x0066:
            java.lang.Throwable r6 = mcc.a(r0)
            if (r6 == 0) goto L_0x006e
            r5.f = r4
        L_0x006e:
            ds0 r5 = r5.j
            java.nio.ByteBuffer r5 = r5.e()
            r5.compact()
            wx3.H(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.p(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
