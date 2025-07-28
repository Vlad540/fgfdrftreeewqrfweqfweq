package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ag0  reason: default package */
public final class ag0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fg0 Y;
    public final /* synthetic */ sf0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag0(fg0 fg0, fw2 fw2, Continuation continuation) {
        super(2, continuation);
        this.Y = fg0;
        this.Z = fw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ag0) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ag0(this.Y, (fw2) this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            fg0 fg0 = this.Y;
            fg0.getClass();
            Object f = n1g.f(new eg0(fg0, this.Z, (Continuation) null), this);
            if (f != pu3) {
                f = jue;
            }
            if (f == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
