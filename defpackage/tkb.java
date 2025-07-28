package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tkb  reason: default package */
public final class tkb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vkb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tkb(Continuation continuation, vkb vkb) {
        super(2, continuation);
        this.Y = vkb;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tkb tkb = new tkb(continuation, this.Y);
        tkb.X = obj;
        return tkb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        vkb.a(this.Y, (ns1) this.X);
        return jue.a;
    }
}
