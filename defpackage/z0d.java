package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z0d  reason: default package */
public final class z0d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ b1d Y;
    public final /* synthetic */ j7c Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z0d(b1d b1d, j7c j7c, Continuation continuation) {
        super(2, continuation);
        this.Y = b1d;
        this.Z = j7c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z0d(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        Object obj3 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            b1d b1d = this.Y;
            d0d d0d = b1d.a;
            if (d0d == null) {
                d0d = null;
            }
            lxc lxc = new lxc((Object) b1d, 1, (Object) this.Z);
            this.X = 1;
            zec b = ((in7) d0d.w.getValue()).b();
            Object U = xs7.U(b.a.b(), new wec(b, lxc, (Continuation) null), this);
            if (U != obj2) {
                U = obj3;
            }
            if (U != obj2) {
                U = obj3;
            }
            if (U == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj3;
    }
}
