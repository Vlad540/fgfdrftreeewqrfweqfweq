package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kk5  reason: default package */
public final class kk5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pc7 Z;
    public final /* synthetic */ ob7 w0;
    public final /* synthetic */ pj5 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kk5(pc7 pc7, ob7 ob7, pj5 pj5, Continuation continuation) {
        super(2, continuation);
        this.Z = pc7;
        this.w0 = ob7;
        this.x0 = pj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kk5) n((d5b) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kk5 kk5 = new kk5(this.Z, this.w0, this.x0, continuation);
        kk5.Y = obj;
        return kk5;
    }

    public final Object o(Object obj) {
        d5b d5b;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            d5b d5b2 = (d5b) this.Y;
            jk5 jk5 = new jk5(this.x0, d5b2, (Continuation) null);
            this.Y = d5b2;
            this.X = 1;
            if (gt0.H(this.Z, this.w0, jk5, this) == pu3) {
                return pu3;
            }
            d5b = d5b2;
        } else if (i == 1) {
            d5b = (d5b) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((a5b) d5b).i((Throwable) null);
        return jue.a;
    }
}
