package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dgf  reason: default package */
public final class dgf extends l5e implements i26 {
    public final /* synthetic */ zgf X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dgf(zgf zgf, Continuation continuation) {
        super(2, continuation);
        this.X = zgf;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dgf(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        e57 e57 = this.X.l;
        if (e57 instanceof dm0) {
            ((dm0) e57).b(new ehf(phf.REQUEST_ACCESS));
        } else if (e57 instanceof hm0) {
            ((hm0) e57).b(new ehf(phf.UPDATE_TOKEN));
        } else if (e57 instanceof em0) {
            ((em0) e57).b(new Throwable());
        }
        this.X.l = null;
        return jue.a;
    }
}
