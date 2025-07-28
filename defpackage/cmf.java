package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cmf  reason: default package */
public final class cmf extends l5e implements i26 {
    public final /* synthetic */ kmf X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cmf(kmf kmf, Continuation continuation) {
        super(2, continuation);
        this.X = kmf;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cmf(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        oia oia = oia.a;
        kmf kmf = this.X;
        kmf.H0.m((Object) null, oia);
        taf.o(kmf.O0, olf.a);
        iff iff = (iff) kmf.B0.getValue();
        jff jff = kmf.E0;
        if (jff != null) {
            iff.a(3, jff.a, jff.b, jff.c, jff.d, (String) null);
        }
        return jue.a;
    }
}
