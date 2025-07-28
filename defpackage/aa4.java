package defpackage;

import android.net.TrafficStats;
import java.net.Socket;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aa4  reason: default package */
public final class aa4 implements zz2 {
    public final it4 a;
    public final AtomicBoolean b = new AtomicBoolean();
    public final LinkedHashMap c;
    public final LinkedHashSet d;
    public final yd3 e;
    public final qmc f;
    public final und g;
    public volatile Iterator h;
    public volatile pib i;
    public final cd3 j;
    public rc3 k;

    public aa4(it4 it4, String str, String str2, und und, zl3 zl3, yd3 yd3, qmc qmc) {
        new AtomicBoolean();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashSet();
        this.k = new rc3(false);
        this.a = it4;
        this.e = yd3;
        this.f = qmc;
        this.g = und;
        this.j = new cd3(str, str2, true);
    }

    public final yd3 a() {
        return this.e;
    }

    public final void c(Socket socket) {
        if (socket != null) {
            TrafficStats.untagSocket(socket);
        }
    }

    public final void close() {
        udd.n("aa4", "close request");
        l((pib) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e A[SYNTHETIC, Splitter:B:27:0x008e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.Socket connect() {
        /*
            r11 = this;
            r0 = 1
            java.lang.String r1 = "aa4"
            java.lang.String r2 = "connect request"
            udd.q(r1, r2)
            rc3 r1 = new rc3
            r1.<init>(r0)
            r11.k = r1
            r11.close()
            it4 r1 = r11.a
            java.lang.Object r1 = r1.c
            ed3 r1 = (defpackage.ed3) r1
            boolean r1 = r1.f()
            r2 = 0
            if (r1 == 0) goto L_0x0029
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.b
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0029
            r1 = r0
            goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            r3 = 0
            if (r1 != 0) goto L_0x0036
            java.lang.String r0 = "aa4"
            java.lang.String r1 = "should not connect, breaking"
            udd.q(r0, r1)
            goto L_0x021b
        L_0x0036:
            monitor-enter(r11)
            java.lang.String r1 = "hosts updated: "
            java.lang.String r4 = "aa4"
            java.lang.String r5 = "update hosts"
            udd.q(r4, r5)     // Catch:{ all -> 0x010a }
            java.util.LinkedHashSet r4 = r11.d     // Catch:{ all -> 0x010a }
            monitor-enter(r4)     // Catch:{ all -> 0x010a }
            java.util.LinkedHashSet r5 = r11.d     // Catch:{ all -> 0x0056 }
            r5.clear()     // Catch:{ all -> 0x0056 }
            it4 r5 = r11.a     // Catch:{ all -> 0x0056 }
            cd3 r5 = hhd.r(r5)     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x0059
            java.util.LinkedHashSet r6 = r11.d     // Catch:{ all -> 0x0056 }
            r6.add(r5)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            goto L_0x024f
        L_0x0059:
            it4 r5 = r11.a     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r5.a     // Catch:{ all -> 0x0056 }
            rf4 r5 = (defpackage.rf4) r5     // Catch:{ all -> 0x0056 }
            r5.e()     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r5 = r11.d     // Catch:{ all -> 0x0056 }
            cd3 r6 = r11.j     // Catch:{ all -> 0x0056 }
            r5.add(r6)     // Catch:{ all -> 0x0056 }
            it4 r5 = r11.a     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r5.b     // Catch:{ all -> 0x0056 }
            g2b r5 = (defpackage.g2b) r5     // Catch:{ all -> 0x0056 }
            j2b r5 = (defpackage.j2b) r5     // Catch:{ all -> 0x0056 }
            i03 r5 = r5.a     // Catch:{ all -> 0x0056 }
            x97 r5 = r5.g     // Catch:{ all -> 0x0056 }
            java.lang.String r6 = "app.lastSuccessProxy"
            java.lang.String r5 = r5.getString(r6, r3)     // Catch:{ all -> 0x0056 }
            boolean r6 = hhd.F(r5)     // Catch:{ all -> 0x0056 }
            if (r6 != 0) goto L_0x008b
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008b }
            r6.<init>((java.lang.String) r5)     // Catch:{ JSONException -> 0x008b }
            cd3 r5 = defpackage.cd3.a(r6)     // Catch:{ JSONException -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r5 = r3
        L_0x008c:
            if (r5 == 0) goto L_0x0093
            java.util.LinkedHashSet r6 = r11.d     // Catch:{ all -> 0x0056 }
            r6.add(r5)     // Catch:{ all -> 0x0056 }
        L_0x0093:
            it4 r5 = r11.a     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r6 = r11.d     // Catch:{ all -> 0x0056 }
            hhd.c(r5, r6)     // Catch:{ all -> 0x0056 }
            it4 r5 = r11.a     // Catch:{ all -> 0x0056 }
            java.util.List r5 = hhd.v(r5)     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x00ad
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0056 }
            if (r6 != 0) goto L_0x00ad
            java.util.LinkedHashSet r6 = r11.d     // Catch:{ all -> 0x0056 }
            r6.addAll(r5)     // Catch:{ all -> 0x0056 }
        L_0x00ad:
            java.util.LinkedHashSet r5 = r11.d     // Catch:{ all -> 0x0056 }
            cd3 r6 = r11.j     // Catch:{ all -> 0x0056 }
            r5.add(r6)     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r5 = r11.d     // Catch:{ all -> 0x0056 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0056 }
            r11.h = r5     // Catch:{ all -> 0x0056 }
            java.lang.String r5 = "aa4"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            r6.<init>(r1)     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r1 = r11.d     // Catch:{ all -> 0x0056 }
            int r1 = r1.size()     // Catch:{ all -> 0x0056 }
            r6.append(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0056 }
            udd.q(r5, r1)     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
        L_0x00d4:
            java.util.LinkedHashSet r1 = r11.d     // Catch:{ all -> 0x010a }
            monitor-enter(r1)     // Catch:{ all -> 0x010a }
            java.util.Iterator r4 = r11.h     // Catch:{ all -> 0x024c }
            boolean r4 = r4.hasNext()     // Catch:{ all -> 0x024c }
            monitor-exit(r1)     // Catch:{ all -> 0x024c }
            if (r4 == 0) goto L_0x0213
            java.lang.String r1 = "aa4"
            java.lang.String r4 = "iterate connectClient: hasMoreProxies"
            udd.q(r1, r4)     // Catch:{ all -> 0x010a }
            it4 r1 = r11.a     // Catch:{ all -> 0x010a }
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x010a }
            ed3 r1 = (defpackage.ed3) r1     // Catch:{ all -> 0x010a }
            boolean r1 = r1.f()     // Catch:{ all -> 0x010a }
            if (r1 == 0) goto L_0x00fd
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.b     // Catch:{ all -> 0x010a }
            boolean r1 = r1.get()     // Catch:{ all -> 0x010a }
            if (r1 == 0) goto L_0x00fd
            r1 = r0
            goto L_0x00fe
        L_0x00fd:
            r1 = r2
        L_0x00fe:
            if (r1 != 0) goto L_0x010d
            java.lang.String r0 = "aa4"
            java.lang.String r1 = "should not connect, breaking"
            udd.q(r0, r1)     // Catch:{ all -> 0x010a }
            monitor-exit(r11)     // Catch:{ all -> 0x010a }
            goto L_0x021b
        L_0x010a:
            r0 = move-exception
            goto L_0x0251
        L_0x010d:
            it4 r1 = r11.a     // Catch:{ all -> 0x010a }
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x010a }
            ed3 r1 = (defpackage.ed3) r1     // Catch:{ all -> 0x010a }
            wd3 r1 = r1.b()     // Catch:{ all -> 0x010a }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x010a }
            r4 = 4
            if (r1 == r0) goto L_0x0122
            if (r1 == r4) goto L_0x0122
            r1 = r2
            goto L_0x0123
        L_0x0122:
            r1 = r0
        L_0x0123:
            if (r1 == 0) goto L_0x0128
            r1 = 10000(0x2710, float:1.4013E-41)
            goto L_0x012a
        L_0x0128:
            r1 = 15000(0x3a98, float:2.102E-41)
        L_0x012a:
            it4 r5 = r11.a     // Catch:{ all -> 0x010a }
            java.lang.Object r5 = r5.c     // Catch:{ all -> 0x010a }
            ed3 r5 = (defpackage.ed3) r5     // Catch:{ all -> 0x010a }
            wd3 r5 = r5.b()     // Catch:{ all -> 0x010a }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x010a }
            if (r5 == r0) goto L_0x013e
            if (r5 == r4) goto L_0x013e
            r4 = r2
            goto L_0x013f
        L_0x013e:
            r4 = r0
        L_0x013f:
            if (r4 == 0) goto L_0x0144
            r4 = 1500(0x5dc, float:2.102E-42)
            goto L_0x0146
        L_0x0144:
            r4 = 3000(0xbb8, float:4.204E-42)
        L_0x0146:
            java.util.LinkedHashSet r5 = r11.d     // Catch:{ all -> 0x010a }
            monitor-enter(r5)     // Catch:{ all -> 0x010a }
            r6 = r2
        L_0x014a:
            r7 = 3
            if (r6 >= r7) goto L_0x0189
            java.util.Iterator r7 = r11.h     // Catch:{ all -> 0x0184 }
            boolean r7 = r7.hasNext()     // Catch:{ all -> 0x0184 }
            if (r7 != 0) goto L_0x0156
            goto L_0x0189
        L_0x0156:
            java.util.Iterator r7 = r11.h     // Catch:{ all -> 0x0184 }
            java.lang.Object r7 = r7.next()     // Catch:{ all -> 0x0184 }
            cd3 r7 = (defpackage.cd3) r7     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = "aa4"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r9.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r10 = "step 2 "
            r9.append(r10)     // Catch:{ all -> 0x0184 }
            r9.append(r7)     // Catch:{ all -> 0x0184 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0184 }
            udd.q(r8, r9)     // Catch:{ all -> 0x0184 }
            java.util.LinkedHashMap r8 = r11.c     // Catch:{ all -> 0x0184 }
            boolean r8 = r8.containsKey(r7)     // Catch:{ all -> 0x0184 }
            if (r8 != 0) goto L_0x0187
            int r8 = r4 * r6
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0184 }
            r11.n(r7, r1, r8, r9)     // Catch:{ all -> 0x0184 }
            goto L_0x0187
        L_0x0184:
            r0 = move-exception
            goto L_0x0211
        L_0x0187:
            int r6 = r6 + r0
            goto L_0x014a
        L_0x0189:
            monitor-exit(r5)     // Catch:{ all -> 0x0184 }
            pib r1 = r11.m()     // Catch:{ all -> 0x010a }
            if (r1 != 0) goto L_0x0199
            java.lang.String r1 = "aa4"
            java.lang.String r4 = "continue looking for available hosts"
            udd.q(r1, r4)     // Catch:{ all -> 0x010a }
            goto L_0x00d4
        L_0x0199:
            rc3 r0 = r11.k     // Catch:{ all -> 0x010a }
            r0.getClass()     // Catch:{ all -> 0x010a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x010a }
            r0.b = r2     // Catch:{ all -> 0x010a }
            rc3 r0 = r11.k     // Catch:{ all -> 0x010a }
            rc3 r2 = r1.g     // Catch:{ all -> 0x010a }
            r0.getClass()     // Catch:{ all -> 0x010a }
            long r3 = r2.d     // Catch:{ all -> 0x010a }
            r0.d = r3     // Catch:{ all -> 0x010a }
            long r3 = r2.e     // Catch:{ all -> 0x010a }
            r0.e = r3     // Catch:{ all -> 0x010a }
            long r3 = r2.f     // Catch:{ all -> 0x010a }
            r0.f = r3     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r2.g     // Catch:{ all -> 0x010a }
            r0.g = r3     // Catch:{ all -> 0x010a }
            int r3 = r2.h     // Catch:{ all -> 0x010a }
            r0.h = r3     // Catch:{ all -> 0x010a }
            int r2 = r2.c     // Catch:{ all -> 0x010a }
            r0.c = r2     // Catch:{ all -> 0x010a }
            it4 r0 = r11.a     // Catch:{ all -> 0x010a }
            cd3 r2 = r1.f     // Catch:{ all -> 0x010a }
            int r3 = hhd.d     // Catch:{ all -> 0x010a }
            r2.getClass()     // Catch:{ all -> 0x010a }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x010a }
            r3.<init>()     // Catch:{ all -> 0x010a }
            java.lang.String r4 = "host"
            java.lang.String r5 = r2.a     // Catch:{ all -> 0x010a }
            r3.put((java.lang.String) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x010a }
            java.lang.String r4 = "port"
            java.lang.String r5 = r2.b     // Catch:{ all -> 0x010a }
            r3.put((java.lang.String) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x010a }
            java.lang.String r4 = "tls"
            boolean r2 = r2.c     // Catch:{ all -> 0x010a }
            r3.put((java.lang.String) r4, (boolean) r2)     // Catch:{ all -> 0x010a }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x010a }
            boolean r3 = hhd.F(r2)     // Catch:{ all -> 0x010a }
            if (r3 != 0) goto L_0x01fd
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x010a }
            g2b r0 = (defpackage.g2b) r0     // Catch:{ all -> 0x010a }
            j2b r0 = (defpackage.j2b) r0     // Catch:{ all -> 0x010a }
            i03 r0 = r0.a     // Catch:{ all -> 0x010a }
            java.lang.String r3 = "app.lastSuccessProxy"
            r0.l(r3, r2)     // Catch:{ all -> 0x010a }
        L_0x01fd:
            java.lang.String r0 = "aa4"
            java.lang.String r2 = "connected to %s"
            cd3 r3 = r1.f     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x010a }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x010a }
            udd.p(r0, r2, r3)     // Catch:{ all -> 0x010a }
            monitor-exit(r11)     // Catch:{ all -> 0x010a }
            r3 = r1
            goto L_0x021b
        L_0x0211:
            monitor-exit(r5)     // Catch:{ all -> 0x0184 }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x0213:
            monitor-exit(r11)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "aa4"
            java.lang.String r1 = "connection failed"
            udd.s(r0, r1, r3)
        L_0x021b:
            r11.i = r3
            pib r0 = r11.i
            if (r0 == 0) goto L_0x0236
            pib r0 = r11.i
            java.net.Socket r0 = r0.d
            if (r0 == 0) goto L_0x0236
            pib r0 = r11.i
            java.net.Socket r0 = r0.d
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0236
            pib r11 = r11.i
            java.net.Socket r11 = r11.d
            return r11
        L_0x0236:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "host connection failed "
            r1.<init>(r2)
            pib r11 = r11.i
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L_0x024c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x024c }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x024f:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x0251:
            monitor-exit(r11)     // Catch:{ all -> 0x010a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa4.connect():java.net.Socket");
    }

    public final int d() {
        if (this.i != null) {
            return ((Number) this.i.f.d.getValue()).intValue();
        }
        return -1;
    }

    public final boolean e() {
        return true;
    }

    public final void g(boolean z) {
        this.b.set(z);
    }

    public final long h(int i2) {
        return yg0.p(i2, ((rf4) this.a.a).d());
    }

    public final String i() {
        return this.i != null ? this.i.f.a : "unresolved";
    }

    public final rc3 k() {
        return this.k;
    }

    public final void l(pib pib) {
        udd.q("aa4", "cancel tasks".concat(pib != null ? rf0.h(", except ", pib.f.toString()) : ""));
        synchronized (this.d) {
            try {
                for (Map.Entry entry : this.c.entrySet()) {
                    if (pib == null) {
                        ((Future) entry.getValue()).cancel(true);
                    } else if (!((cd3) entry.getKey()).equals(pib.f)) {
                        ((Future) entry.getValue()).cancel(true);
                    }
                }
            } finally {
            }
        }
    }

    public final pib m() {
        pib pib;
        Iterator it = this.c.values().iterator();
        while (true) {
            pib = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                pib pib2 = (pib) ((Future) it.next()).get();
                if (!(pib2 == null || pib2.d == null)) {
                    pib = pib2;
                    break;
                }
            } catch (CancellationException e2) {
                String obj = e2.toString();
                udd.q("aa4", "skip cancelled task, error: " + obj);
            } catch (Exception e3) {
                String obj2 = e3.toString();
                udd.s("aa4", "execution error: " + obj2, (Throwable) null);
                udd.q("aa4", "connection error");
            }
        }
        synchronized (this.d) {
            this.c.clear();
        }
        return pib;
    }

    public final void n(cd3 cd3, int i2, int i3, TimeUnit timeUnit) {
        udd.p("aa4", "schedule connection: delay = %d host = %s", new Object[]{Integer.valueOf(i3), cd3.toString()});
        cd3 cd32 = cd3;
        pib pib = new pib(this.a, cd32, this.g, this.e, i2);
        mv9 mv9 = new mv9(1, new e44(this, 2, pib));
        qmc qmc = this.f;
        o73 o73 = new o73(new mhd(mv9.m(qmc), new r34(2, this), 2), 4, new sz(this, 1, pib));
        zv9 u = ms9.u((long) i3, timeUnit, qmc);
        k36 k36 = new k36();
        Objects.requireNonNull(k36, "observer is null");
        try {
            u.a(new khd(k36, o73));
            this.c.put(cd3, k36);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            ek8.a0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
