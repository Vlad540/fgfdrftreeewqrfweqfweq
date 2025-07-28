package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: egf  reason: default package */
public final class egf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zgf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public egf(zgf zgf, Continuation continuation) {
        super(2, continuation);
        this.Y = zgf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new egf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            e57 e57 = this.Y.l;
            if (e57 instanceof dm0) {
                this.X = 1;
                if (zgf.b(this.Y, (dm0) e57, this) == pu3) {
                    return pu3;
                }
            } else if (e57 instanceof hm0) {
                this.X = 2;
                if (zgf.d(this.Y, (hm0) e57, this) == pu3) {
                    return pu3;
                }
            } else if (e57 instanceof em0) {
                this.X = 3;
                if (zgf.c(this.Y, (em0) e57, this) == pu3) {
                    return pu3;
                }
            } else {
                e57 e572 = this.Y.l;
                if (e572 != null) {
                    e572.b(new s0());
                }
            }
        } else if (i == 1 || i == 2 || i == 3) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Y.l = null;
        return jue.a;
    }
}
