package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* renamed from: rr7  reason: default package */
public final class rr7 extends l5e implements i26 {
    public final /* synthetic */ MainActivity X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rr7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer valueOf = Integer.valueOf(((Number) obj).intValue());
        jue jue = jue.a;
        ((rr7) n(valueOf, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rr7(this.X, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [one.me.android.MainActivity, android.app.Activity] */
    public final Object o(Object obj) {
        wx3.H(obj);
        ? r0 = this.X;
        r0.b1.b(r0);
        return jue.a;
    }
}
