package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y68  reason: default package */
public final class y68 extends l5e implements i26 {
    public final /* synthetic */ z68 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y68(z68 z68, Continuation continuation) {
        super(2, continuation);
        this.X = z68;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((y68) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y68(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        z68 z68 = this.X;
        z68.e(!z68.e);
        z68.h.invoke();
        return jue.a;
    }
}
