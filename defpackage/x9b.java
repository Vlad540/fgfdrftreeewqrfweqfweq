package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x9b  reason: default package */
public final class x9b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hab Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x9b(hab hab, Continuation continuation) {
        super(2, continuation);
        this.Y = hab;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((as4) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        x9b x9b = new x9b(this.Y, continuation);
        x9b.X = obj;
        return x9b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        as4 as4 = (as4) this.X;
        hab hab = this.Y;
        hab.y0.setValue(as4.a);
        hab.w0.setValue(as4.b);
        return jue.a;
    }
}
