package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: s9d  reason: default package */
public final class s9d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t9d Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s9d(t9d t9d, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = t9d;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new s9d(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        t9d t9d = this.Y;
        if (i == 0) {
            wx3.H(obj);
            lve lve = (lve) t9d.A0.getValue();
            this.X = 1;
            Object U = xs7.U(((pae) lve.c.getValue()).b(), new kve(lve, this.Z, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.X = 2;
        return t9d.q(t9d, this) == pu3 ? pu3 : jue;
    }
}
