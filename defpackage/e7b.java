package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e7b  reason: default package */
public final class e7b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ q7b Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e7b(q7b q7b, Continuation continuation) {
        super(2, continuation);
        this.Y = q7b;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((z6b) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e7b e7b = new e7b(this.Y, continuation);
        e7b.X = obj;
        return e7b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.B0.setValue((z6b) this.X);
        return jue.a;
    }
}
