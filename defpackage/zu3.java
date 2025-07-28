package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* renamed from: zu3  reason: default package */
public final class zu3 extends l5e implements i26 {
    public final /* synthetic */ Callable X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zu3(Callable callable, Continuation continuation) {
        super(2, continuation);
        this.X = callable;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zu3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zu3(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return this.X.call();
    }
}
