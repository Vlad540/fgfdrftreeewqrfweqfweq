package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d1b  reason: default package */
public final class d1b extends l5e implements i26 {
    public final /* synthetic */ s16 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1b(nya nya, Continuation continuation) {
        super(2, continuation);
        this.X = nya;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((d1b) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d1b(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.X.invoke();
        return jue.a;
    }
}
