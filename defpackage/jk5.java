package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jk5  reason: default package */
public final class jk5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ pj5 Y;
    public final /* synthetic */ d5b Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jk5(pj5 pj5, d5b d5b, Continuation continuation) {
        super(2, continuation);
        this.Y = pj5;
        this.Z = d5b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jk5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jk5(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            wj5 wj5 = new wj5(this.Z, 1);
            this.X = 1;
            if (this.Y.c(wj5, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
