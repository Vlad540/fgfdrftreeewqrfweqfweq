package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jgf  reason: default package */
public final class jgf extends l5e implements i26 {
    public ahf X;
    public int Y;
    public final /* synthetic */ zgf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jgf(zgf zgf, Continuation continuation) {
        super(2, continuation);
        this.Z = zgf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jgf(this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.Y;
        zgf zgf = this.Z;
        if (i == 0) {
            wx3.H(obj);
            xff a = zgf.a(zgf);
            this.Y = 1;
            obj = a.a(zgf.a, zgf.b, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            ahf ahf = this.X;
            wx3.H(obj);
            return ahf;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahf ahf2 = (ahf) obj;
        ahf a2 = ahf2 != null ? ahf.a(ahf2, true, true, 15) : new ahf(zgf.a, zgf.b, true);
        xff a3 = zgf.a(zgf);
        this.X = a2;
        this.Y = 2;
        a3.getClass();
        return r1g.h(a3.a, new wff(a3, a2, 0), this) == pu3 ? pu3 : a2;
    }
}
