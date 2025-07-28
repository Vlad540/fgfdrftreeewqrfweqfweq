package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jbb  reason: default package */
public final class jbb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ubb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jbb(ubb ubb, Continuation continuation) {
        super(2, continuation);
        this.Y = ubb;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((i22) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jbb jbb = new jbb(this.Y, continuation);
        jbb.X = obj;
        return jbb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        i22 i22 = (i22) this.X;
        if (i22.H() && !i22.x()) {
            taf.o(this.Y.F0, v03.b);
        }
        return jue.a;
    }
}
