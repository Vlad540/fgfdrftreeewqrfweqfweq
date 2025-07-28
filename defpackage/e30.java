package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e30  reason: default package */
public final class e30 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ h30 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e30(h30 h30, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = h30;
        this.Z = j;
        this.w0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e30(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        jj7 jj7;
        o10 x;
        l00 l00;
        pu3 pu3 = pu3.a;
        int i = this.X;
        h30 h30 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ju3 b = ((pae) h30.Z.getValue()).b();
            d30 d30 = new d30(h30, this.w0, (Continuation) null);
            this.X = 1;
            obj = xs7.U(b, d30, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj;
        jue jue = jue.a;
        if (vo8 == null || !vo8.s() || (jj7 = vo8.D0) == null || (x = jj7.x(j10.X)) == null || (l00 = x.e) == null) {
            return jue;
        }
        to8 to8 = (to8) h30.Y.getValue();
        to8.getClass();
        to8.t(vo8, x.q, new z42(to8, this.Z, l00.c));
        return jue;
    }
}
