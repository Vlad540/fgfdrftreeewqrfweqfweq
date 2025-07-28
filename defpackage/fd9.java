package defpackage;

import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.tamtam.util.HandledException;

/* renamed from: fd9  reason: default package */
public final class fd9 extends u2 implements kf9, fe9, a9f, p98, o98 {
    public final tf4 A0;
    public vo8 B0;
    public o10 C0;
    public p7f D0;
    public n10 E0;
    public d1c F0;
    public pn1 G0;
    public c97 H0;
    public c97 I0;
    public c97 J0;
    public long K0;
    public long L0;
    public boolean M0;
    public final mbe X;
    public final oa7 Y;
    public final r10 Z;
    public final q98 c;
    public final l8f o;
    public final to8 w0;
    public final g2b x0;
    public final ed9 y0;
    public final g15 z0;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, o7f] */
    public fd9(lf9 lf9, q98 q98, l8f l8f, mbe mbe, oa7 oa7, r10 r10, to8 to8, g2b g2b, ed9 ed9, g15 g15, tf4 tf4, boolean z, boolean z2) {
        super(0, (Object) lf9);
        this.c = q98;
        this.o = l8f;
        this.X = mbe;
        this.Y = oa7;
        this.Z = r10;
        this.w0 = to8;
        this.x0 = g2b;
        this.y0 = ed9;
        this.z0 = g15;
        this.A0 = tf4;
        ? obj = new Object();
        al7 al7 = (al7) q98;
        obj.e = al7.k();
        obj.a = z;
        obj.d = z2;
        this.D0 = new p7f(obj);
        ((v2) lf9).t(this);
        al7.e = this;
    }

    public final boolean B0(int i, KeyEvent keyEvent) {
        fd9 fd9;
        boolean c2 = c2();
        q98 q98 = this.c;
        if (c2 || !((al7) q98).k()) {
            al7 al7 = (al7) q98;
            if (al7.f != null) {
                s98 s98 = al7.c;
                s98.getClass();
                t98 t98 = t98.c;
                t98 t982 = al7.a;
                if (((t982 == t98 && s98.p()) || t982 == t98.b) && (((fd9 = s98.y0.F0) == null || !fd9.a()) && !s98.Z.c.x)) {
                    if (i != 24 && i != 25) {
                        return false;
                    }
                    oa7 oa7 = this.Y;
                    if (oa7.get() != null) {
                        ((bd) oa7.get()).f("ENABLE_VIDEO_AUTO_PLAY_SOUND_BY_VOLUME_BUTTON");
                    }
                    al7.s(1.0f);
                    o7f a = this.D0.a();
                    a.e = true;
                    p7f p7f = new p7f(a);
                    this.D0 = p7f;
                    ((lf9) ((ge9) this.b)).d(p7f);
                    d1c d1c = this.F0;
                    if (d1c != null) {
                        oa7 oa72 = (oa7) d1c.e;
                        if (oa72.get() != null) {
                            ((bd) oa72.get()).d(1, "SWITCH_AUDIO_MODE");
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void D1(Throwable th) {
        udd.n("fd9", "onPlaybackError");
        d1c d1c = this.F0;
        if (d1c != null) {
            d1c.d(th);
        }
        o7f a = this.D0.a();
        a.b = false;
        a.c = false;
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            n10 n10 = this.E0;
            if (n10 != null) {
                String str = n10.h;
                if (!r1g.p(str)) {
                    ed9.g(str);
                    return;
                }
            }
            ed9.Y(th);
        }
    }

    public final void F1() {
        d1c d1c = this.F0;
        if (d1c != null) {
            String str = d1c.b == 2 ? "message" : "viewer";
            oa7 oa7 = (oa7) d1c.e;
            if (oa7.get() != null) {
                ((bd) oa7.get()).g("ACTION_PIP_OPEN", str);
            }
            e2();
        }
    }

    public final void G(Surface surface) {
        ((al7) this.c).q(surface);
    }

    public final void H1() {
        udd.q("fd9", "onPauseClick");
        pause();
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.q(true);
        }
        f2(true);
    }

    public final void I1() {
        udd.q("fd9", "onPipClick");
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.m();
        }
        f2(true);
    }

    public final void J1() {
        udd.q("fd9", "onFullScreenClick");
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.r();
        }
        f2(false);
    }

    public final void K() {
        udd.q("fd9", "onTrackChanged");
        n2();
        o7f a = this.D0.a();
        a.r = c2();
        a.j = ((al7) this.c).f();
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.K();
        }
    }

    public final int M0() {
        if (!b2()) {
            return 0;
        }
        return ((al7) this.c).g();
    }

    public final void P(int i, int i2, int i3) {
        ((lf9) ((ge9) this.b)).a(i, i2);
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.P(i, i2, i3);
        }
    }

    public final int R() {
        if (!b2()) {
            return 0;
        }
        return ((al7) this.c).i();
    }

    public final void S0() {
        udd.q("fd9", "onPlayClick");
        d1c d1c = this.F0;
        if (d1c != null) {
            udd.q("d1c", "sendVideoPlayToggleStat");
            d1c.e((Object) null, "play_toggle");
        }
        q98 q98 = this.c;
        ((al7) q98).n();
        q98.getClass();
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.q(true);
        }
        f2(false);
    }

    public final void T() {
        udd.n("fd9", "onVideoViewClick");
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.T();
        }
    }

    public final void V0() {
        udd.q("fd9", "onCloseClick");
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.H();
        }
    }

    public final void W() {
        udd.n("fd9", "onVideoViewLongClick");
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.W();
        }
    }

    public final void W0() {
        udd.q("fd9", "onMediaPlayerControllerDetach");
        e2();
    }

    public final void X0() {
        if (this.F0 != null) {
            al7 al7 = (al7) this.c;
            al7.m();
            d1c d1c = this.F0;
            String str = d1c.b == 2 ? "message" : "pip";
            oa7 oa7 = (oa7) d1c.e;
            if (oa7.get() != null) {
                ((bd) oa7.get()).g("ACTION_FULLSCREEN_OPEN", str);
            }
            e2();
            if (b2()) {
                al7.q((Surface) null);
            }
        }
    }

    public final void Y0(long j) {
        q98 q98 = this.c;
        ((al7) q98).p(j);
        o7f a = this.D0.a();
        al7 al7 = (al7) q98;
        a.k = al7.e();
        a.l = al7.c();
        a.q = null;
        a.p = null;
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
    }

    public final void Z0() {
        this.M0 = true;
        m2();
        l2();
    }

    public final void Z1(o10 o10, long j, vo8 vo8, int i, boolean z) {
        q98 q98 = this.c;
        ((al7) q98).j = z;
        udd.p("fd9", "Bind attach %s", new Object[]{o10.q});
        this.M0 = false;
        this.L0 = System.currentTimeMillis();
        tic.b(this.G0);
        m2();
        l2();
        tic.b(this.J0);
        this.C0 = o10;
        this.K0 = j;
        n10 n10 = ete.L(o10) ? o10.j.d.d : o10.d;
        this.E0 = n10;
        this.B0 = vo8;
        ge9 ge9 = (ge9) this.b;
        if (n10 == null) {
            d2(new FetcherException(11, "Video is null"));
            o7f a = this.D0.a();
            a.b = false;
            a.c = false;
            a.h = false;
            p7f p7f = new p7f(a);
            this.D0 = p7f;
            ((lf9) ge9).d(p7f);
            return;
        }
        boolean O = ete.O(this.x0, n10);
        if (O) {
            tic.b(this.J0);
            nu9 n = ms9.l(1, TimeUnit.SECONDS).n(de.a());
            c97 c97 = new c97(new bd9(this, 3), new dd9(0), z3d.i);
            n.a(c97);
            this.J0 = c97;
        }
        o2(new cd9(this, O, this.Z.a(o10)));
        o7f a2 = this.D0.a();
        a2.p = null;
        a2.q = null;
        p7f p7f2 = new p7f(a2);
        this.D0 = p7f2;
        ((lf9) ge9).d(p7f2);
        q98.getClass();
        n10 n102 = this.E0;
        this.F0 = new d1c(n102.a, i, n102.i, this.Y);
        if (!O) {
            i2();
        }
    }

    public final boolean a() {
        if (!b2()) {
            return false;
        }
        return ((al7) this.c).j();
    }

    public final List a2() {
        vu5 vu5;
        al7 al7 = (al7) this.c;
        if (al7.f == null) {
            return Collections.emptyList();
        }
        kv2 kv2 = al7.b.b;
        tgd tgd = (tgd) kv2.b;
        tgd.Z1();
        m45 m45 = tgd.c;
        m45.s2();
        f55[] f55Arr = (f55[]) m45.o1.i.X;
        int length = f55Arr.length;
        poe poe = null;
        vu5 vu52 = null;
        for (int i = 0; i < length; i++) {
            if (i < length) {
                f55 f55 = f55Arr[i];
                if (f55 instanceof f55) {
                    vu5 = f55.j();
                    if (vu5 != null && b49.g(vu5.A0) == 2) {
                        vu52 = vu5;
                    }
                }
            }
            vu5 = null;
            vu52 = vu5;
        }
        if (vu52 == null) {
            return Collections.emptyList();
        }
        Iterator it = ((List) kv2.o).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            poe poe2 = (poe) it.next();
            if (kv2.e(poe2.a, vu52)) {
                poe = poe2;
                break;
            }
        }
        return poe == null ? Collections.emptyList() : poe.b;
    }

    public final boolean b2() {
        return ((al7) this.c).g == this;
    }

    public final long c() {
        if (!b2()) {
            return 0;
        }
        return ((al7) this.c).f();
    }

    public final boolean c0() {
        if (!b2()) {
            return false;
        }
        al7 al7 = (al7) this.c;
        if (al7.f == null) {
            return false;
        }
        n35 n35 = al7.b;
        tgd tgd = n35.a;
        uje O1 = tgd.O1();
        return (!O1.q() && O1.n(tgd.p0(), (sje) tgd.b, 0).x0) || n35.v() == -9223372036854775807L;
    }

    public final void c1() {
        udd.q("fd9", "onMediaPlayerControllerOwnerChanged");
        if (this.C0 != null) {
            g2();
            this.c.getClass();
            h2();
            o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c2() {
        /*
            r1 = this;
            n10 r0 = r1.E0
            if (r0 == 0) goto L_0x000c
            m10 r0 = r0.l
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.d
            if (r0 != 0) goto L_0x0018
        L_0x000c:
            q98 r1 = r1.c
            al7 r1 = (defpackage.al7) r1
            ooe r1 = r1.d()
            ooe r0 = defpackage.ooe.y0
            if (r1 != r0) goto L_0x001a
        L_0x0018:
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd9.c2():boolean");
    }

    public final void d1() {
        udd.n("fd9", "onVolumeChange");
        o7f a = this.D0.a();
        a.e = ((al7) this.c).k();
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
    }

    public final void d2(Throwable th) {
        n10 n10;
        d1c d1c = this.F0;
        if (d1c != null) {
            d1c.d(th);
        }
        o7f a = this.D0.a();
        a.b = false;
        a.c = false;
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        ed9 ed9 = this.y0;
        if (ed9 != null && (n10 = this.E0) != null) {
            String str = n10.h;
            if (this.o.a(th) || this.E0 == null || r1g.p(str)) {
                ed9.Y(th);
            } else {
                ed9.g(str);
            }
        }
    }

    public final void e1() {
        udd.n("fd9", "onSettingsClick");
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.M();
        }
    }

    public final void e2() {
        if (b2()) {
            this.c.getClass();
            h2();
            g2();
        }
    }

    public final void f1() {
        if (b2()) {
            q98 q98 = this.c;
            if (((al7) q98).j()) {
                q98.getClass();
                h2();
            }
        }
    }

    public final void f2(boolean z) {
        vo8 vo8;
        o10 o10;
        if (((al7) this.c).c.p() && (vo8 = this.B0) != null && (o10 = this.C0) != null) {
            to8 to8 = this.w0;
            to8.getClass();
            to8.t(vo8, o10.q, new cz0(z, 11));
        }
    }

    public final void g1() {
        udd.q("fd9", "onSoundClick");
        if (c2()) {
            this.z0.c(new HandledException(new IllegalStateException("Receive onSoundClick but video is muted")), true);
            return;
        }
        al7 al7 = (al7) this.c;
        if (al7.k()) {
            al7.s(0.0f);
        } else {
            al7.s(1.0f);
        }
        boolean k = al7.k();
        oa7 oa7 = this.Y;
        if (oa7.get() != null) {
            ((bd) oa7.get()).d(k ? 1 : 0, "VIDEO_AUTO_PLAY_SOUND_CLICK");
        }
    }

    public final void g2() {
        o10 o10;
        vo8 vo8;
        udd.q("fd9", "saveVideoPosition");
        if (!c0()) {
            long k = k();
            long c2 = c();
            if ((k > 0 || c2 > 0) && (o10 = this.C0) != null && (vo8 = this.B0) != null) {
                boolean c0 = c0();
                to8 to8 = this.w0;
                to8.getClass();
                to8.t(vo8, o10.q, new so8(k, c2, c0));
            }
        }
    }

    public final void h() {
        udd.q("fd9", "onVideoPaused");
        m2();
        l2();
        tic.b(this.J0);
        o7f a = this.D0.a();
        a.b = false;
        a.c = false;
        a.a = true;
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.h();
            ed9.q(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r5 = (defpackage.lf9) ((defpackage.ge9) r11.b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h2() {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "fd9"
            java.lang.String r4 = "saveVideoScreenShot"
            udd.q(r3, r4)
            o10 r3 = r11.C0
            if (r3 == 0) goto L_0x0109
            boolean r3 = r11.c0()
            if (r3 == 0) goto L_0x0016
            goto L_0x0109
        L_0x0016:
            long r3 = r11.k()
            long r5 = r11.c()
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0029
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0029
            return
        L_0x0029:
            o10 r5 = r11.C0
            r10 r6 = r11.Z
            java.util.HashMap r7 = r6.d
            java.lang.String r5 = r5.q
            boolean r8 = r7.containsKey(r5)
            if (r8 != 0) goto L_0x0038
            goto L_0x004e
        L_0x0038:
            java.lang.Object r5 = r7.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            long r7 = r5.longValue()
            long r7 = r7 - r3
            long r7 = java.lang.Math.abs(r7)
            r9 = 50
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x004e
            return
        L_0x004e:
            tf4 r5 = r11.A0
            vf4 r5 = r5.b()
            r5.getClass()
            vf4 r7 = defpackage.vf4.c
            if (r5 != r7) goto L_0x005c
            return
        L_0x005c:
            java.lang.Object r5 = r11.b
            ge9 r5 = (defpackage.ge9) r5
            lf9 r5 = (defpackage.lf9) r5
            android.graphics.drawable.BitmapDrawable r7 = r5.e()
            if (r7 != 0) goto L_0x0069
            return
        L_0x0069:
            o10 r8 = r11.C0
            android.graphics.Bitmap r9 = r7.getBitmap()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.HashMap r4 = r6.d
            java.lang.String r10 = r8.q
            r4.put(r10, r3)
            b00 r3 = r6.b
            r3.getClass()
            xz r4 = new xz
            r4.<init>((java.lang.Object) r3, (java.lang.Object) r8, (java.lang.Object) r9, (int) r2)
            mv9 r9 = new mv9
            r9.<init>(r1, r4)
            pv0 r4 = new pv0
            r10 = 24
            r4.<init>(r10)
            phd r4 = r9.h(r4)
            y15 r9 = r3.e
            yhd r4 = r4.m(r9)
            mbe r9 = r3.a
            nbe r9 = (defpackage.nbe) r9
            qmc r9 = r9.b()
            yhd r4 = r4.i(r9)
            zz r9 = new zz
            r9.<init>(r3, r8, r2)
            mhd r2 = new mhd
            r2.<init>(r4, r9, r0)
            a00 r4 = new a00
            r4.<init>(r3)
            mhd r9 = new mhd
            r9.<init>(r2, r4, r1)
            n83 r1 = r3.f
            java.util.Objects.requireNonNull(r1)
            rgc r2 = new rgc
            r3 = 5
            r2.<init>(r3, r1)
            afc r1 = new afc
            r1.<init>((java.lang.Object) r6, (java.lang.Object) r8)
            lu7 r3 = z3d.k
            pn1 r4 = new pn1
            r4.<init>(r1, r0, r3)
            java.lang.String r0 = "observer is null"
            java.util.Objects.requireNonNull(r4, r0)
            ud r0 = new ud     // Catch:{ NullPointerException -> 0x0107, all -> 0x00f8 }
            r1 = 15
            r0.<init>(r4, r1, r2)     // Catch:{ NullPointerException -> 0x0107, all -> 0x00f8 }
            r9.k(r0)     // Catch:{ NullPointerException -> 0x0107, all -> 0x00f8 }
            n83 r0 = r6.h
            r0.a(r4)
            p7f r0 = r11.D0
            o7f r0 = r0.a()
            r0.p = r7
            p7f r1 = new p7f
            r1.<init>(r0)
            r11.D0 = r1
            r5.d(r1)
            return
        L_0x00f8:
            r11 = move-exception
            defpackage.ek8.a0(r11)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "subscribeActual failed"
            r0.<init>(r1)
            r0.initCause(r11)
            throw r0
        L_0x0107:
            r11 = move-exception
            throw r11
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd9.h2():void");
    }

    public final void i() {
        udd.q("fd9", "onVideoPlay");
        q98 q98 = this.c;
        boolean j = ((al7) q98).j();
        o7f a = this.D0.a();
        a.b = j;
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        if (j) {
            k2();
            q98.getClass();
            j2();
        }
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.i();
        }
    }

    public final void i0() {
        udd.n("fd9", "onRenderedFirstFrame");
        d1c d1c = this.F0;
        if (d1c != null) {
            long j = this.L0;
            d1c.getClass();
            long currentTimeMillis = System.currentTimeMillis() - j;
            d1c.e(Long.valueOf(currentTimeMillis), "first_frame");
            udd.p("d1c", "sendVideoFirstFrameStat: %d", new Object[]{Long.valueOf(currentTimeMillis)});
            d1c.e((Object) null, "play");
        }
        j1();
    }

    public final int i1() {
        if (!b2()) {
            return 0;
        }
        return ((al7) this.c).h();
    }

    public final void i2() {
        tic.b(this.G0);
        if (this.C0 != null && this.B0 != null) {
            o7f a = this.D0.a();
            a.c = true;
            a.b = ((al7) this.c).j;
            p7f p7f = new p7f(a);
            this.D0 = p7f;
            ((lf9) ((ge9) this.b)).d(p7f);
            phd c2 = this.o.c(this.C0, this.K0, this.B0.c);
            nbe nbe = (nbe) this.X;
            yhd i = c2.m(nbe.a()).i(nbe.b());
            pn1 pn1 = new pn1(new bd9(this, 1), 2, new bd9(this, 2));
            i.k(pn1);
            this.G0 = pn1;
        }
    }

    public final int j() {
        u2f u2f;
        if (b2() && (u2f = ((al7) this.c).f) != null) {
            return u2f.j();
        }
        return 0;
    }

    public final void j1() {
        udd.n("fd9", "onPlaybackPrepared");
        q98 q98 = this.c;
        boolean j = ((al7) q98).j();
        o7f a = this.D0.a();
        a.b = j;
        a.t = true;
        a.c = false;
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        if (j) {
            k2();
            q98.getClass();
            j2();
        }
    }

    public final void j2() {
        l2();
        if (this.D0.a) {
            nu9 n = ms9.l(2, TimeUnit.SECONDS).n(de.a());
            c97 c97 = new c97(new bd9(this, 0), new be8(29), z3d.i);
            n.a(c97);
            this.I0 = c97;
        }
    }

    public final long k() {
        if (!b2()) {
            return 0;
        }
        return ((al7) this.c).e();
    }

    public final void k1(boolean z) {
        if (z != this.D0.a) {
            o7f a = this.D0.a();
            a.a = z;
            p7f p7f = new p7f(a);
            this.D0 = p7f;
            ((lf9) ((ge9) this.b)).d(p7f);
            ed9 ed9 = this.y0;
            if (ed9 != null) {
                ed9.q(z);
            }
        }
        if (!z) {
            l2();
        } else if (this.D0.b) {
            this.c.getClass();
            j2();
        }
    }

    public final void k2() {
        m2();
        if (!this.M0) {
            nu9 n = ms9.l(100, TimeUnit.MILLISECONDS).n(de.a());
            c97 c97 = new c97(new bd9(this, 4), new dd9(1), z3d.i);
            n.a(c97);
            this.H0 = c97;
        }
    }

    public final void l1(boolean z) {
        udd.q("fd9", "Release");
        d1c d1c = this.F0;
        if (d1c != null) {
            udd.p("d1c", "sendVideoStopStat userAction: %s", new Object[]{Boolean.valueOf(z)});
            d1c.e(z ? "user" : "scroll", "stop");
        }
        tic.b(this.G0);
        m2();
        l2();
        tic.b(this.J0);
        e2();
        this.C0 = null;
        this.B0 = null;
        this.F0 = null;
        this.K0 = 0;
        this.M0 = false;
        if (b2()) {
            q98 q98 = this.c;
            q98.getClass();
            al7 al7 = (al7) q98;
            al7.t();
            al7.e = null;
            al7.q((Surface) null);
            al7.g = null;
        }
        lf9 lf9 = (lf9) ((ge9) this.b);
        ((Set) ((v2) lf9).a).remove(this);
        lf9.release();
    }

    public final void l2() {
        tic.b(this.I0);
    }

    public final void m1(int i) {
        this.M0 = false;
        long j = (long) i;
        q98 q98 = this.c;
        al7 al7 = (al7) q98;
        al7.p(j);
        o7f a = this.D0.a();
        al7 al72 = (al7) q98;
        a.k = al72.e();
        a.l = al72.c();
        a.q = null;
        a.p = null;
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        if (al7.j()) {
            k2();
            q98.getClass();
            j2();
        }
    }

    public final void m2() {
        tic.b(this.H0);
    }

    public final void n2() {
        qjb qjb;
        q98 q98 = this.c;
        al7 al7 = (al7) q98;
        if ((al7.f == null ? Collections.emptyList() : (List) al7.b.b.o).size() > 1) {
            q98.getClass();
            al7 al72 = (al7) q98;
            poe j = al72.f == null ? poe.c : al72.b.b.j();
            if (j != poe.c) {
                ooe ooe = j.a;
                qjb = ete.W(ooe.o, ooe.X);
                o7f a = this.D0.a();
                a.f = false;
                a.m = qjb;
                p7f p7f = new p7f(a);
                this.D0 = p7f;
                ((lf9) ((ge9) this.b)).d(p7f);
            }
        }
        qjb = null;
        o7f a2 = this.D0.a();
        a2.f = false;
        a2.m = qjb;
        p7f p7f2 = new p7f(a2);
        this.D0 = p7f2;
        ((lf9) ((ge9) this.b)).d(p7f2);
    }

    public final void o() {
        udd.n("fd9", "onPlaybackEnded");
        m2();
        l2();
        o7f a = this.D0.a();
        a.b = false;
        a.c = false;
        a.a = true;
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
        ed9 ed9 = this.y0;
        if (ed9 != null) {
            ed9.X();
        }
    }

    public final void o2(rf3 rf3) {
        o7f a = this.D0.a();
        rf3.accept(a);
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
    }

    public final void pause() {
        udd.n("fd9", "Pause");
        if (b2()) {
            d1c d1c = this.F0;
            q98 q98 = this.c;
            if (d1c != null) {
                long e = ((al7) q98).e();
                d1c.getClass();
                long j = 0;
                if (e > 0) {
                    j = e / 1000;
                }
                udd.p("d1c", "sendVideoPauseStat: %d", new Object[]{Long.valueOf(j)});
                d1c.e(Long.valueOf(j), "pause");
            }
            ((al7) q98).m();
            q98.getClass();
        }
    }

    public final View u1() {
        View view = (View) ((v2) ((lf9) ((ge9) this.b))).c;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Mvc view root is null");
    }

    public final void y0() {
        udd.n("fd9", "onPlaybackBuffering");
        o7f a = this.D0.a();
        a.c = true;
        p7f p7f = new p7f(a);
        this.D0 = p7f;
        ((lf9) ((ge9) this.b)).d(p7f);
    }
}
