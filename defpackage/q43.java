package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q43  reason: default package */
public final class q43 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ r43 Y;
    public final /* synthetic */ gv6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q43(r43 r43, gv6 gv6, Continuation continuation) {
        super(2, continuation);
        this.Y = r43;
        this.Z = gv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new q43(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        o10 a;
        t00 t00;
        pu3 pu3 = pu3.a;
        int i = this.X;
        m43 m43 = null;
        gv6 gv6 = this.Z;
        r43 r43 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ju3 b = r43.b.b();
            p43 p43 = new p43(r43, gv6, (Continuation) null);
            this.X = 1;
            obj = xs7.U(b, p43, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xm8 xm8 = (xm8) obj;
        jue jue = jue.a;
        if (!(xm8 == null || (a = xm8.a.a(j10.b)) == null || (t00 = a.c) == null)) {
            s00 s00 = t00.a;
            int i2 = s00 == null ? -1 : o43.$EnumSwitchMapping$0[s00.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                m43 = new k43(gv6.b);
            } else if (i2 == 4 || i2 == 5) {
                m43 = new l43(gv6.b);
            }
            if (m43 == null) {
                return jue;
            }
            r43.a(m43);
        }
        return jue;
    }
}
