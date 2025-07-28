package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vgf  reason: default package */
public final class vgf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zgf Y;
    public final /* synthetic */ hm0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vgf(zgf zgf, hm0 hm0, Continuation continuation) {
        super(2, continuation);
        this.Y = zgf;
        this.Z = hm0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vgf(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        zgf zgf = this.Y;
        if (i == 0) {
            wx3.H(obj);
            xff a = zgf.a(zgf);
            this.X = 1;
            obj = a.a(zgf.a, zgf.b, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahf ahf = (ahf) obj;
        String str = ahf != null ? ahf.d : null;
        if (str == null || str.length() == 0) {
            this.Z.b(new Throwable());
            return jue;
        }
        if (ahf != null) {
            ahf a2 = ahf.a(ahf, false, false, 55);
            xff a3 = zgf.a(zgf);
            this.X = 2;
            a3.getClass();
            if (r1g.h(a3.a, new wff(a3, a2, 1), this) == pu3) {
                return pu3;
            }
        }
        return jue;
    }
}
