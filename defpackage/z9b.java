package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z9b  reason: default package */
public final class z9b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hab Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z9b(hab hab, Continuation continuation) {
        super(2, continuation);
        this.Y = hab;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((v9b) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z9b z9b = new z9b(this.Y, continuation);
        z9b.X = obj;
        return z9b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        taf.o(this.Y.B0, (v9b) this.X);
        return jue.a;
    }
}
