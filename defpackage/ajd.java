package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ajd  reason: default package */
public final class ajd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bjd Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajd(bjd bjd, Continuation continuation) {
        super(2, continuation);
        this.Y = bjd;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ez) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ajd ajd = new ajd(this.Y, continuation);
        ajd.X = obj;
        return ajd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        bjd.x(this.Y, (ez) this.X);
        return jue.a;
    }
}
