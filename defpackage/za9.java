package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.Iterator;

/* renamed from: za9  reason: default package */
public final class za9 implements hya {
    public final /* synthetic */ nb9 a;

    public za9(nb9 nb9) {
        this.a = nb9;
    }

    public final void H(int i, l68 l68) {
        l68 R0;
        long l = this.a.l();
        m68 m = this.a.m();
        nb9 nb9 = this.a;
        nb9.B = l68;
        r38 r38 = nb9.m;
        nb9.x = r38 != null ? r38.a() : false;
        nb9 nb92 = this.a;
        r38 r382 = nb92.m;
        nb92.D = (r382 == null || (R0 = r382.R0()) == null) ? null : R0.d;
        nb9 nb93 = this.a;
        r38 r383 = nb93.m;
        int i2 = -1;
        nb93.C = nb9.d(nb93, r383 != null ? r383.h() : -1);
        nb9 nb94 = this.a;
        r38 r384 = nb94.m;
        if (r384 != null) {
            i2 = r384.i();
        }
        nb9.d(nb94, i2);
        r38 r385 = this.a.m;
        if (r385 != null) {
            r385.n1();
        }
        nb9 nb95 = this.a;
        udd.q("nb9", "notifyListeners");
        synchronized (nb95.o) {
            Iterator it = nb95.o.iterator();
            while (it.hasNext()) {
                ((ya9) it.next()).c(l, m, nb95.l(), nb95.m());
            }
        }
    }

    public final void Y(kya kya, fya fya) {
        float e = kya.e();
        nb9 nb9 = this.a;
        r38 r38 = nb9.m;
        if (r38 != null) {
            r38.g(e);
        }
        nb9.E = kya.c();
        kya.n();
        wi5 wi5 = fya.a;
        if (wi5.a.get(9)) {
            kya.E0();
        }
        if (wi5.a.get(8)) {
            kya.getRepeatMode();
        }
    }

    public final void b0(z78 z78) {
        nb9 nb9 = this.a;
        nb9.D = z78;
        int i = nb9.K;
        udd.q("nb9", "notifyListeners");
        synchronized (nb9.o) {
            Iterator it = nb9.o.iterator();
            while (it.hasNext()) {
                ya9 ya9 = (ya9) it.next();
            }
        }
    }

    public final void h(int i) {
        l68 R0;
        int i2 = nb9.K;
        udd.q("nb9", "onPlaybackStateChanged " + i);
        nb9 nb9 = this.a;
        nb9.v = i;
        r38 r38 = nb9.m;
        nb9.y = r38 != null && r38.getPlaybackState() == 2;
        nb9 nb92 = this.a;
        r38 r382 = nb92.m;
        nb92.x = r382 != null ? r382.a() : false;
        nb9 nb93 = this.a;
        r38 r383 = nb93.m;
        nb93.A = r383 != null && r383.getPlaybackState() == 4;
        nb9 nb94 = this.a;
        r38 r384 = nb94.m;
        nb94.B = r384 != null ? r384.R0() : null;
        nb9 nb95 = this.a;
        r38 r385 = nb95.m;
        nb95.D = (r385 == null || (R0 = r385.R0()) == null) ? null : R0.d;
        if (i == 1) {
            this.a.G.m((Object) null, Float.valueOf(0.0f));
            nb9 nb96 = this.a;
            nb96.w = false;
            nb96.f();
            nb9 nb97 = this.a;
            udd.q("nb9", "notifyListeners");
            synchronized (nb97.o) {
                Iterator it = nb97.o.iterator();
                while (it.hasNext()) {
                    ((ya9) it.next()).e(nb97.l(), nb97.m(), nb97.o());
                }
            }
        } else if (i == 2) {
            nb9 nb98 = this.a;
            udd.q("nb9", "notifyListeners");
            synchronized (nb98.o) {
                Iterator it2 = nb98.o.iterator();
                while (it2.hasNext()) {
                    ((ya9) it2.next()).d(nb98.l(), nb98.m());
                }
            }
        } else if (i == 4) {
            this.a.f();
            nb9 nb99 = this.a;
            udd.q("nb9", "notifyListeners");
            synchronized (nb99.o) {
                Iterator it3 = nb99.o.iterator();
                while (it3.hasNext()) {
                    nb99.G.m((Object) null, Float.valueOf(1.0f));
                    ((ya9) it3.next()).f(nb99.l(), nb99.m());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        r1 = r0.m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(boolean r6) {
        /*
            r5 = this;
            int r0 = defpackage.nb9.K
            java.lang.String r0 = "nb9"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onIsPlayingChanged "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            udd.q(r0, r1)
            nb9 r0 = r5.a
            if (r6 != 0) goto L_0x0026
            r38 r1 = r0.m
            if (r1 == 0) goto L_0x0026
            int r1 = r1.getPlaybackState()
            r2 = 3
            if (r1 != r2) goto L_0x0026
            r1 = 1
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            r0.w = r1
            nb9 r0 = r5.a
            r38 r0 = r0.m
            if (r0 == 0) goto L_0x0032
            r0.n1()
        L_0x0032:
            nb9 r0 = r5.a
            r0.x = r6
            if (r6 == 0) goto L_0x006b
            r0.u()
            nb9 r5 = r5.a
            java.lang.String r6 = "nb9"
            java.lang.String r0 = "notifyListeners"
            udd.q(r6, r0)
            java.util.concurrent.CopyOnWriteArraySet r6 = r5.o
            monitor-enter(r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.o     // Catch:{ all -> 0x0065 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0065 }
        L_0x004d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0067
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0065 }
            ya9 r1 = (defpackage.ya9) r1     // Catch:{ all -> 0x0065 }
            long r2 = r5.l()     // Catch:{ all -> 0x0065 }
            m68 r4 = r5.m()     // Catch:{ all -> 0x0065 }
            r1.h(r2, r4)     // Catch:{ all -> 0x0065 }
            goto L_0x004d
        L_0x0065:
            r5 = move-exception
            goto L_0x0069
        L_0x0067:
            monitor-exit(r6)
            goto L_0x00a2
        L_0x0069:
            monitor-exit(r6)
            throw r5
        L_0x006b:
            boolean r6 = r0.w
            if (r6 == 0) goto L_0x00a2
            r0.f()
            nb9 r5 = r5.a
            java.lang.String r6 = "nb9"
            java.lang.String r0 = "notifyListeners"
            udd.q(r6, r0)
            java.util.concurrent.CopyOnWriteArraySet r6 = r5.o
            monitor-enter(r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.o     // Catch:{ all -> 0x009c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009c }
        L_0x0084:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x009e
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x009c }
            ya9 r1 = (defpackage.ya9) r1     // Catch:{ all -> 0x009c }
            long r2 = r5.l()     // Catch:{ all -> 0x009c }
            m68 r4 = r5.m()     // Catch:{ all -> 0x009c }
            r1.i(r2, r4)     // Catch:{ all -> 0x009c }
            goto L_0x0084
        L_0x009c:
            r5 = move-exception
            goto L_0x00a0
        L_0x009e:
            monitor-exit(r6)
            goto L_0x00a2
        L_0x00a0:
            monitor-exit(r6)
            throw r5
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za9.n(boolean):void");
    }

    public final void onRepeatModeChanged(int i) {
        nb9 nb9 = this.a;
        int i2 = nb9.K;
        udd.q("nb9", "notifyListeners");
        synchronized (nb9.o) {
            Iterator it = nb9.o.iterator();
            while (it.hasNext()) {
                ((ya9) it.next()).getClass();
            }
        }
    }

    public final void p0(wxa wxa) {
        float f = wxa.a;
        nb9 nb9 = this.a;
        if (!(f == nb9.F)) {
            nb9.F = f;
            int i = nb9.K;
            udd.q("nb9", "notifyListeners");
            synchronized (nb9.o) {
                Iterator it = nb9.o.iterator();
                while (it.hasNext()) {
                    ((ya9) it.next()).q();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r5 = o0e.H((r5 = r5.a));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(jya r4, jya r5, int r6) {
        /*
            r3 = this;
            r0 = 1
            if (r6 != r0) goto L_0x00a9
            int r6 = r4.b
            int r5 = r5.b
            if (r6 == r5) goto L_0x00a9
            l68 r5 = r4.c
            if (r5 == 0) goto L_0x001c
            java.lang.String r5 = r5.a
            if (r5 == 0) goto L_0x001c
            java.lang.Long r5 = o0e.H(r5)
            if (r5 == 0) goto L_0x001c
            long r5 = r5.longValue()
            goto L_0x001e
        L_0x001c:
            r5 = -1
        L_0x001e:
            ns7 r0 = m68.a
            l68 r1 = r4.c
            if (r1 == 0) goto L_0x0031
            z78 r1 = r1.d
            if (r1 == 0) goto L_0x0031
            java.lang.Integer r1 = r1.H
            if (r1 == 0) goto L_0x0031
            int r1 = r1.intValue()
            goto L_0x0032
        L_0x0031:
            r1 = -1
        L_0x0032:
            r0.getClass()
            m68 r0 = defpackage.ns7.c(r1)
            nb9 r1 = r3.a
            r38 r1 = r1.m
            if (r1 == 0) goto L_0x0071
            int r2 = r4.b
            int r1 = r1.i()
            if (r2 != r1) goto L_0x0071
            nb9 r3 = r3.a
            int r4 = defpackage.nb9.K
            java.lang.String r4 = "nb9"
            java.lang.String r1 = "notifyListeners"
            udd.q(r4, r1)
            java.util.concurrent.CopyOnWriteArraySet r4 = r3.o
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.o     // Catch:{ all -> 0x006b }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x006b }
        L_0x005b:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x006d
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x006b }
            ya9 r1 = (defpackage.ya9) r1     // Catch:{ all -> 0x006b }
            r1.j(r5, r0)     // Catch:{ all -> 0x006b }
            goto L_0x005b
        L_0x006b:
            r3 = move-exception
            goto L_0x006f
        L_0x006d:
            monitor-exit(r4)
            goto L_0x00a9
        L_0x006f:
            monitor-exit(r4)
            throw r3
        L_0x0071:
            nb9 r1 = r3.a
            r38 r1 = r1.m
            if (r1 == 0) goto L_0x00a9
            int r4 = r4.b
            int r1 = r1.h()
            if (r4 != r1) goto L_0x00a9
            nb9 r3 = r3.a
            int r4 = defpackage.nb9.K
            java.lang.String r4 = "nb9"
            java.lang.String r1 = "notifyListeners"
            udd.q(r4, r1)
            java.util.concurrent.CopyOnWriteArraySet r4 = r3.o
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.o     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x0093:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x00a3 }
            ya9 r1 = (defpackage.ya9) r1     // Catch:{ all -> 0x00a3 }
            r1.g(r5, r0)     // Catch:{ all -> 0x00a3 }
            goto L_0x0093
        L_0x00a3:
            r3 = move-exception
            goto L_0x00a7
        L_0x00a5:
            monitor-exit(r4)
            goto L_0x00a9
        L_0x00a7:
            monitor-exit(r4)
            throw r3
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za9.q(jya, jya, int):void");
    }

    public final void x0(PlaybackException playbackException) {
        nb9 nb9 = this.a;
        int i = nb9.K;
        udd.q("nb9", "notifyListeners");
        synchronized (nb9.o) {
            Iterator it = nb9.o.iterator();
            while (it.hasNext()) {
                ((ya9) it.next()).b(nb9.l(), nb9.m());
            }
        }
    }
}
