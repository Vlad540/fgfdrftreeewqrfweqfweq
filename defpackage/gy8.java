package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gy8  reason: default package */
public final class gy8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gy8(zz8 zz8, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gy8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        long j = this.Z;
        zz8 zz8 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = n76.a((n76) zz8.d1.getValue(), j, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tf3 tf3 = (tf3) obj;
        int i2 = (j > ((lqc) zz8.D0).s() ? 1 : (j == ((lqc) zz8.D0).s() ? 0 : -1));
        l05 l05 = zz8.y1;
        if (i2 == 0) {
            taf.o(l05, new ked(new hge(cic.w2), 0, (hge) null, 6));
        } else if (tf3 == null || tf3.k() != 0 || tf3.w()) {
            taf.o(l05, new ked(new hge(c7a.M0), 0, (hge) null, 6));
        } else {
            bx8.c.getClass();
            taf.o(zz8.B1, new a34(":profile?id=" + j + "&type=contact"));
        }
        return jue.a;
    }
}
