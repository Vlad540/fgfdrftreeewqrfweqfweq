package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mm5  reason: default package */
public final class mm5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ vcd Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ lc9 w0;
    public final /* synthetic */ Object x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mm5(vcd vcd, pj5 pj5, grd grd, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = vcd;
        this.Z = pj5;
        this.w0 = grd;
        this.x0 = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mm5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mm5(this.Y, this.Z, (grd) this.w0, this.x0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [km5, l5e] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        pj5 pj5 = this.Z;
        lc9 lc9 = this.w0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    wx3.H(obj);
                } else if (!(i == 3 || i == 4)) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            wx3.H(obj);
            return jue.a;
        }
        wx3.H(obj);
        y76 y76 = ucd.a;
        y76 y762 = this.Y;
        if (y762 == y76) {
            this.X = 1;
            if (pj5.c(lc9, this) == obj2) {
                return obj2;
            }
        } else if (y762 == ucd.b) {
            zqd i2 = lc9.i();
            ? l5e = new l5e(2, (Continuation) null);
            this.X = 2;
            if (ez3.E(i2, l5e, this) == obj2) {
                return obj2;
            }
        } else {
            pj5 z = ez3.z(y762.j(lc9.i()));
            lm5 lm5 = new lm5(pj5, (grd) lc9, this.x0, (Continuation) null);
            this.X = 4;
            if (ez3.q(z, lm5, this) == obj2) {
                return obj2;
            }
        }
        return jue.a;
        this.X = 3;
        if (pj5.c(lc9, this) == obj2) {
            return obj2;
        }
        return jue.a;
    }
}
