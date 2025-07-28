package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tu6  reason: default package */
public final class tu6 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ bv6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tu6(bv6 bv6, Continuation continuation) {
        super(2, continuation);
        this.Y = bv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tu6(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            String str = bv6.I0;
            bv6 bv6 = this.Y;
            bv6.getClass();
            Object f = n1g.f(new ou6(bv6, (Continuation) null), this);
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
