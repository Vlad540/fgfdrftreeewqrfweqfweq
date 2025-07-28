package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t4d  reason: default package */
public final class t4d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ v4d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t4d(v4d v4d, Continuation continuation) {
        super(2, continuation);
        this.Y = v4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t4d(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Comparable comparable = pu3.a;
        int i = this.X;
        v4d v4d = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (((aw2) ((bv2) v4d.z0.getValue())).g(this) == comparable) {
                return comparable;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l05 l05 = v4d.B0;
        w7d.c.getClass();
        taf.o(l05, new a34(":saved-messages"));
        return jue.a;
    }
}
