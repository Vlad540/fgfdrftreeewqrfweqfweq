package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: xi9  reason: default package */
public final class xi9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xi9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xi9 xi9 = new xi9(continuation, this.Y);
        xi9.X = obj;
        return xi9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.M0.E((List) this.X);
        return jue.a;
    }
}
