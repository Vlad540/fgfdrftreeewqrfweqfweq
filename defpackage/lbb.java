package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lbb  reason: default package */
public final class lbb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ubb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lbb(ubb ubb, Continuation continuation) {
        super(2, continuation);
        this.Y = ubb;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((nab) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lbb lbb = new lbb(this.Y, continuation);
        lbb.X = obj;
        return lbb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        nab nab = (nab) this.X;
        if (nab instanceof lab) {
            Long l = ((lab) nab).a;
            ubb ubb = this.Y;
            long j = ubb.A0.get();
            if (l != null && l.longValue() == j) {
                taf.o(ubb.G0, new zab(phc.A, new hge(l8a.W0)));
            }
        }
        return jue.a;
    }
}
