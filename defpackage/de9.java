package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* renamed from: de9  reason: default package */
public final class de9 extends u2 implements p98, o98, a9f {
    public c97 A0;
    public c97 B0;
    public boolean C0 = true;
    public final String X;
    public final q98 Y;
    public final long Z;
    public final FrgTrimVideo c;
    public final bd o;
    public long w0;
    public long x0;
    public long y0;
    public final ajb z0 = new ajb();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public de9(defpackage.jf9 r17, ru.ok.messages.media.trim.FrgTrimVideo r18, defpackage.bd r19, java.lang.String r20, defpackage.q98 r21, long r22, long r24, boolean r26) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            r3 = r21
            r4 = 0
            r0.<init>((int) r4, (java.lang.Object) r1)
            ajb r4 = new ajb
            r4.<init>()
            r0.z0 = r4
            r4 = 1
            r0.C0 = r4
            r4 = r18
            r0.c = r4
            r5 = r19
            r0.o = r5
            r0.X = r2
            r0.Y = r3
            r9 = r22
            r0.w0 = r9
            r11 = r24
            r0.x0 = r11
            r1.t(r0)
            r13 = r3
            al7 r13 = (defpackage.al7) r13
            r13.e = r0
            android.content.Context r3 = r18.e0()
            android.net.Uri r4 = android.net.Uri.parse(r20)
            long r14 = defpackage.x87.U(r3, r4)
            r0.Z = r14
            y79 r8 = new y79
            w79 r3 = new w79
            r4 = 0
            r3.<init>(r4, r2, r4, r4)
            java.util.List r7 = java.util.Collections.singletonList(r3)
            r2 = r8
            r3 = r22
            r5 = r14
            r1 = r8
            r8 = r26
            r2.<init>(r3, r5, r7, r8)
            r13.r(r1, r0)
            r1 = r17
            r2 = r22
            r4 = r22
            r6 = r24
            r8 = r14
            r1.A(r2, r4, r6, r8)
            r16.c2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de9.<init>(jf9, ru.ok.messages.media.trim.FrgTrimVideo, bd, java.lang.String, q98, long, long, boolean):void");
    }

    public final void D1(Throwable th) {
        int i = cic.f3;
        FrgTrimVideo frgTrimVideo = this.c;
        Context e0 = frgTrimVideo.e0();
        if (e0 != null) {
            a06.H(0, e0, frgTrimVideo.i0(i));
        }
    }

    public final void G(Surface surface) {
        ((al7) this.Y).q(surface);
    }

    public final int M0() {
        return ((al7) this.Y).g();
    }

    public final void P(int i, int i2, int i3) {
        ((jf9) ((ge9) this.b)).x0.d();
    }

    public final int R() {
        return ((al7) this.Y).i();
    }

    public final void W0() {
        udd.n("de9", "onMediaPlayerControllerDetach");
    }

    public final void Z1() {
        if (this.A0 == null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            qmc a = de.a();
            ajb ajb = this.z0;
            ajb.getClass();
            Objects.requireNonNull(timeUnit, "unit is null");
            nu9 n = new kv9(ajb, 300, timeUnit, a, false).n(de.a());
            q98 q98 = this.Y;
            Objects.requireNonNull(q98);
            ss8 ss8 = new ss8(7, (Object) q98);
            gf6 gf6 = z3d.j;
            z26 z26 = z3d.i;
            c97 c97 = new c97(gf6, z3d.k, z26);
            Objects.requireNonNull(c97, "observer is null");
            try {
                n.a(new jt9(c97, ss8, gf6, z26));
                this.A0 = c97;
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                ek8.a0(th);
                xs7.F(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
    }

    public final void a2() {
        pause();
        ((al7) this.Y).p(this.w0);
        ((jf9) ((ge9) this.b)).C0.setPointerPosition(this.w0);
    }

    public final void b2() {
        tic.b(this.A0);
        this.A0 = null;
    }

    public final void c1() {
    }

    public final void c2() {
        int i = (this.w0 > 0 ? 1 : (this.w0 == 0 ? 0 : -1));
        ge9 ge9 = (ge9) this.b;
        if (i == 0 && this.x0 == this.Z) {
            ((jf9) ge9).B(false);
        } else {
            ((jf9) ge9).B(true);
        }
    }

    public final void f1() {
    }

    public final void h() {
        jf9 jf9 = (jf9) ((ge9) this.b);
        ((View) jf9.c).setKeepScreenOn(false);
        tic.b(this.B0);
        this.B0 = null;
        jf9.y0.setVisibility(0);
        jf9.z0.setVisibility(4);
        jf9.C(true, ((al7) this.Y).j());
    }

    public final void i() {
        jf9 jf9 = (jf9) ((ge9) this.b);
        ((View) jf9.c).setKeepScreenOn(true);
        jf9.z0.setVisibility(0);
        jf9.y0.setVisibility(4);
    }

    public final int i1() {
        return ((al7) this.Y).h();
    }

    public final int j() {
        u2f u2f = ((al7) this.Y).f;
        if (u2f == null) {
            return 0;
        }
        return u2f.j();
    }

    public final void o() {
        a2();
    }

    public final void pause() {
        tic.b(this.B0);
        this.B0 = null;
        ((al7) this.Y).m();
    }
}
