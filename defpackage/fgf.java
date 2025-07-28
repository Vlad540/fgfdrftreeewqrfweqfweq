package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fgf  reason: default package */
public final class fgf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zgf Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fgf(zgf zgf, Continuation continuation, boolean z) {
        super(2, continuation);
        this.Y = zgf;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fgf(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            e57 e57 = this.Y.l;
            gm0 gm0 = e57 instanceof gm0 ? (gm0) e57 : null;
            if (gm0 == null) {
                e57 e572 = this.Y.l;
                if (e572 != null) {
                    e572.b(new s0());
                }
                this.Y.l = null;
                return jue;
            } else if (this.Z) {
                gm0.a(jue);
                hcd hcd = this.Y.j;
                zff zff = zff.a;
                this.X = 1;
                if (hcd.a(zff, this) == pu3) {
                    return pu3;
                }
            } else {
                gm0.b(new Throwable());
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Y.l = null;
        return jue;
    }
}
