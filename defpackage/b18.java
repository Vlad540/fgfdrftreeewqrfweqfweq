package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: b18  reason: default package */
public final class b18 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ uwc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b18(Continuation continuation, uwc uwc) {
        super(2, continuation);
        this.Y = uwc;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((b18) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b18 b18 = new b18(continuation, this.Y);
        b18.X = obj;
        return b18;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.E((List) this.X);
        return jue.a;
    }
}
