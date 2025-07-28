package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;

/* renamed from: fle  reason: default package */
public final class fle {
    public final int a;
    public volatile boolean b;
    public final tc9 c = uc9.a();
    public final t97 d;
    public final t97 e;
    public final String f;
    public cle g;
    public AsynchronousSocketChannel h;
    public final r7e i;
    public final r7e j;

    public fle(r7e r7e, t97 t97, int i2) {
        this.a = i2;
        this.d = r7e;
        this.e = t97;
        this.f = fle.class.getName();
        this.i = new r7e(new nya(t97, 26, this));
        this.j = new r7e(new r9c(10, t97));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dle
            if (r0 == 0) goto L_0x0013
            r0 = r5
            dle r0 = (defpackage.dle) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            dle r0 = new dle
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            fle r4 = r0.o
            wx3.H(r5)     // Catch:{ all -> 0x0029 }
            goto L_0x0045
        L_0x0029:
            r5 = move-exception
            goto L_0x0069
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            wx3.H(r5)
            cle r5 = r4.g     // Catch:{ all -> 0x0029 }
            if (r5 == 0) goto L_0x0045
            r0.o = r4     // Catch:{ all -> 0x0029 }
            r0.Z = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r5 = r5.e(r0)     // Catch:{ all -> 0x0029 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r5 = 0
            r4.b = r5     // Catch:{ all -> 0x0029 }
            t97 r5 = r4.e
            java.lang.Object r5 = r5.getValue()
            xr0 r5 = (defpackage.xr0) r5
            java.nio.ByteBuffer r0 = r4.c()
            r5.b(r0)
            t97 r5 = r4.e
            java.lang.Object r5 = r5.getValue()
            xr0 r5 = (defpackage.xr0) r5
            java.nio.ByteBuffer r4 = r4.d()
            r5.b(r4)
            jue r4 = jue.a
            return r4
        L_0x0069:
            t97 r0 = r4.e
            java.lang.Object r0 = r0.getValue()
            xr0 r0 = (defpackage.xr0) r0
            java.nio.ByteBuffer r1 = r4.c()
            r0.b(r1)
            t97 r0 = r4.e
            java.lang.Object r0 = r0.getValue()
            xr0 r0 = (defpackage.xr0) r0
            java.nio.ByteBuffer r4 = r4.d()
            r0.b(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fle.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:76|74|75|82|83|84|85|(1:87)|88|89) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x018e */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5 A[SYNTHETIC, Splitter:B:39:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f5 A[Catch:{ all -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0131 A[Catch:{ Exception -> 0x0143, all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0145 A[SYNTHETIC, Splitter:B:62:0x0145] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0173 A[SYNTHETIC, Splitter:B:77:0x0173] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018b A[Catch:{ all -> 0x018e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:82:0x0180=Splitter:B:82:0x0180, B:72:0x016d=Splitter:B:72:0x016d, B:88:0x018e=Splitter:B:88:0x018e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.ele
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ele r2 = (defpackage.ele) r2
            int r3 = r2.z0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.z0 = r3
            goto L_0x001c
        L_0x0017:
            ele r2 = new ele
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.x0
            pu3 r3 = pu3.a
            int r4 = r2.z0
            jue r5 = jue.a
            java.lang.String r6 = "Required value was null."
            r7 = 443(0x1bb, float:6.21E-43)
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r4 == 0) goto L_0x0094
            if (r4 == r11) goto L_0x0083
            if (r4 == r10) goto L_0x0064
            if (r4 == r9) goto L_0x004f
            if (r4 == r8) goto L_0x003f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.Object r0 = r2.X
            java.lang.Exception r0 = (java.lang.Exception) r0
            java.lang.Object r2 = r2.o
            qc9 r2 = (qc9) r2
            wx3.H(r1)     // Catch:{ all -> 0x004c }
            goto L_0x016d
        L_0x004c:
            r0 = move-exception
            goto L_0x0191
        L_0x004f:
            java.lang.Object r0 = r2.Y
            javax.net.ssl.SSLEngine r0 = (javax.net.ssl.SSLEngine) r0
            java.lang.Object r4 = r2.X
            qc9 r4 = (qc9) r4
            java.lang.Object r7 = r2.o
            fle r7 = (defpackage.fle) r7
            wx3.H(r1)     // Catch:{ all -> 0x0060 }
            goto L_0x0125
        L_0x0060:
            r0 = move-exception
            r2 = r4
            goto L_0x0180
        L_0x0064:
            fle r0 = r2.w0
            javax.net.ssl.SSLEngine r4 = r2.Z
            java.lang.Object r10 = r2.Y
            qc9 r10 = (qc9) r10
            java.lang.Object r13 = r2.X
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.o
            fle r14 = (defpackage.fle) r14
            wx3.H(r1)     // Catch:{ all -> 0x007e }
            r16 = r14
            r14 = r13
            r13 = r16
            goto L_0x00ed
        L_0x007e:
            r0 = move-exception
            r2 = r10
            r7 = r14
            goto L_0x0180
        L_0x0083:
            java.lang.Object r0 = r2.Y
            qc9 r0 = (qc9) r0
            java.lang.Object r4 = r2.X
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r13 = r2.o
            fle r13 = (defpackage.fle) r13
            wx3.H(r1)
            r1 = r0
            goto L_0x00ab
        L_0x0094:
            wx3.H(r1)
            tc9 r1 = r0.c
            r2.o = r0
            r4 = r18
            r2.X = r4
            r2.Y = r1
            r2.z0 = r11
            java.lang.Object r13 = r1.d(r2)
            if (r13 != r3) goto L_0x00aa
            return r3
        L_0x00aa:
            r13 = r0
        L_0x00ab:
            boolean r0 = r13.b     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x00b5
            tc9 r1 = (tc9) r1
            r1.e(r12)
            return r5
        L_0x00b5:
            t97 r0 = r13.d     // Catch:{ all -> 0x017d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x017d }
            javax.net.ssl.SSLContext r0 = (javax.net.ssl.SSLContext) r0     // Catch:{ all -> 0x017d }
            javax.net.ssl.SSLEngine r0 = r0.createSSLEngine(r4, r7)     // Catch:{ all -> 0x017d }
            r0.setUseClientMode(r11)     // Catch:{ all -> 0x017d }
            int r14 = r4.hashCode()     // Catch:{ all -> 0x017d }
            android.net.TrafficStats.setThreadStatsTag(r14)     // Catch:{ all -> 0x017d }
            opd r14 = new opd     // Catch:{ all -> 0x017d }
            r15 = 22
            r14.<init>(r15)     // Catch:{ all -> 0x017d }
            r2.o = r13     // Catch:{ all -> 0x017d }
            r2.X = r4     // Catch:{ all -> 0x017d }
            r2.Y = r1     // Catch:{ all -> 0x017d }
            r2.Z = r0     // Catch:{ all -> 0x017d }
            r2.w0 = r13     // Catch:{ all -> 0x017d }
            r2.z0 = r10     // Catch:{ all -> 0x017d }
            java.lang.Object r10 = udd.M(r14, r2)     // Catch:{ all -> 0x017d }
            if (r10 != r3) goto L_0x00e5
            return r3
        L_0x00e5:
            r14 = r4
            r4 = r0
            r0 = r13
            r16 = r10
            r10 = r1
            r1 = r16
        L_0x00ed:
            java.nio.channels.AsynchronousSocketChannel r1 = (java.nio.channels.AsynchronousSocketChannel) r1     // Catch:{ all -> 0x0171 }
            r0.h = r1     // Catch:{ all -> 0x0171 }
            java.nio.channels.AsynchronousSocketChannel r0 = r13.h     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x0173
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ all -> 0x0171 }
            r1.<init>(r14, r7)     // Catch:{ all -> 0x0171 }
            r2.o = r13     // Catch:{ all -> 0x0171 }
            r2.X = r10     // Catch:{ all -> 0x0171 }
            r2.Y = r4     // Catch:{ all -> 0x0171 }
            r2.Z = r12     // Catch:{ all -> 0x0171 }
            r2.w0 = r12     // Catch:{ all -> 0x0171 }
            r2.z0 = r9     // Catch:{ all -> 0x0171 }
            zv1 r7 = new zv1     // Catch:{ all -> 0x0171 }
            kotlin.coroutines.Continuation r9 = urd.y(r2)     // Catch:{ all -> 0x0171 }
            r7.<init>(r11, r9)     // Catch:{ all -> 0x0171 }
            r7.n()     // Catch:{ all -> 0x0171 }
            ju r9 = defpackage.ju.c     // Catch:{ all -> 0x0171 }
            r0.connect(r1, r7, r9)     // Catch:{ all -> 0x0171 }
            java.lang.Object r0 = r7.m()     // Catch:{ all -> 0x0171 }
            if (r0 != r3) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r0 = r5
        L_0x011f:
            if (r0 != r3) goto L_0x0122
            return r3
        L_0x0122:
            r0 = r4
            r4 = r10
            r7 = r13
        L_0x0125:
            t97 r1 = r7.e     // Catch:{ Exception -> 0x0143 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0143 }
            xr0 r1 = (defpackage.xr0) r1     // Catch:{ Exception -> 0x0143 }
            java.nio.channels.AsynchronousSocketChannel r9 = r7.h     // Catch:{ Exception -> 0x0143 }
            if (r9 == 0) goto L_0x0145
            cle r6 = new cle     // Catch:{ Exception -> 0x0143 }
            r6.<init>(r1, r0, r9)     // Catch:{ Exception -> 0x0143 }
            r7.g = r6     // Catch:{ Exception -> 0x0143 }
            r7.b = r11     // Catch:{ Exception -> 0x0143 }
            tc9 r4 = (tc9) r4
            r4.e(r12)
            return r5
        L_0x0140:
            r0 = move-exception
            r2 = r4
            goto L_0x0191
        L_0x0143:
            r0 = move-exception
            goto L_0x014f
        L_0x0145:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0143 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x0143 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0143 }
            throw r0     // Catch:{ Exception -> 0x0143 }
        L_0x014f:
            java.lang.String r1 = r7.f     // Catch:{ all -> 0x0140 }
            java.lang.String r5 = "Got exception during connecting"
            udd.s(r1, r5, r0)     // Catch:{ all -> 0x0140 }
            r1 = 0
            r7.b = r1     // Catch:{ all -> 0x0140 }
            cle r1 = r7.g     // Catch:{ all -> 0x0140 }
            if (r1 == 0) goto L_0x016c
            r2.o = r4     // Catch:{ all -> 0x0140 }
            r2.X = r0     // Catch:{ all -> 0x0140 }
            r2.Y = r12     // Catch:{ all -> 0x0140 }
            r2.z0 = r8     // Catch:{ all -> 0x0140 }
            java.lang.Object r1 = r1.e(r2)     // Catch:{ all -> 0x0140 }
            if (r1 != r3) goto L_0x016c
            return r3
        L_0x016c:
            r2 = r4
        L_0x016d:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x016e:
            r2 = r10
        L_0x016f:
            r7 = r13
            goto L_0x0180
        L_0x0171:
            r0 = move-exception
            goto L_0x016e
        L_0x0173:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0171 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0171 }
            r0.<init>(r1)     // Catch:{ all -> 0x0171 }
            throw r0     // Catch:{ all -> 0x0171 }
        L_0x017d:
            r0 = move-exception
            r2 = r1
            goto L_0x016f
        L_0x0180:
            java.lang.String r1 = r7.f     // Catch:{ all -> 0x004c }
            java.lang.String r3 = "Got exception during initialize and connect raw channel"
            udd.s(r1, r3, r0)     // Catch:{ all -> 0x004c }
            java.nio.channels.AsynchronousSocketChannel r1 = r7.h     // Catch:{ all -> 0x018e }
            if (r1 == 0) goto L_0x018e
            r1.close()     // Catch:{ all -> 0x018e }
        L_0x018e:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x018f:
            r0 = move-exception
            r2 = r1
        L_0x0191:
            tc9 r2 = (tc9) r2
            r2.e(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fle.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ByteBuffer c() {
        return (ByteBuffer) this.i.getValue();
    }

    public final ByteBuffer d() {
        return (ByteBuffer) this.j.getValue();
    }

    public final Object e(ByteBuffer byteBuffer, er3 er3) {
        cle cle = this.g;
        if (cle != null) {
            return cle.n(new mu0(byteBuffer), er3);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
