package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yid  reason: default package */
public final class yid extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zid Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yid(zid zid, Continuation continuation) {
        super(2, continuation);
        this.Y = zid;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ez) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yid yid = new yid(this.Y, continuation);
        yid.X = obj;
        return yid;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        zid.v(this.Y, (ez) this.X);
        return jue.a;
    }
}
