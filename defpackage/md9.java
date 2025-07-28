package defpackage;

import java.util.Objects;
import ru.ok.messages.settings.locations.FrgLiveLocationSettings;

/* renamed from: md9  reason: default package */
public final class md9 extends u2 {
    public boolean A0;
    public final tt0 X;
    public final bd Y;
    public final duf Z;
    public final g2b c;
    public final di7 o;
    public final qmc w0;
    public final rf4 x0;
    public bx7 y0;
    public c97 z0;

    public md9(te9 te9, j2b j2b, t52 t52, di7 di7, zs7 zs7, bd bdVar, duf duf, qmc qmc, rf4 rf4, FrgLiveLocationSettings frgLiveLocationSettings) {
        super(0, (Object) te9);
        this.c = j2b;
        this.o = di7;
        this.X = zs7;
        this.Y = bdVar;
        this.Z = duf;
        this.w0 = qmc;
        this.x0 = rf4;
    }

    public final void Z1() {
        tic.b(this.y0);
        ((j2b) this.c).a.s();
        this.x0.a();
        this.o.getClass();
        rs9 v = new au9(new lx7(hx7.a.h(this.w0).f(de.a()), new dd9(3), 0), new ld9(this, 1), 3).v();
        dd9 dd9 = new dd9(4);
        bx7 bx7 = new bx7(new ld9(this, 2), new ld9(this, 3), new f5(13, this));
        Objects.requireNonNull(bx7, "observer is null");
        try {
            v.k(new mx7(bx7, dd9, 1));
            this.y0 = bx7;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ek8.a0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @a1e
    public void onEvent(lp3 lp3) {
        ((te9) ((ge9) this.b)).w0.m();
    }
}
