package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nj9  reason: default package */
public final class nj9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ rj9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nj9(rj9 rj9, Continuation continuation) {
        super(2, continuation);
        this.Y = rj9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((y2b) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nj9 nj9 = new nj9(this.Y, continuation);
        nj9.X = obj;
        return nj9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        y2b y2b = (y2b) this.X;
        jue jue = jue.a;
        if (y2b == null) {
            return jue;
        }
        mi9 mi9 = y2b.c;
        this.Y.C0.setValue(y2b.a);
        this.Y.X.setValue(y2b.b);
        if (mi9 == null) {
            return jue;
        }
        this.Y.o = mi9;
        this.Y.c.d(mi9);
        return jue;
    }
}
