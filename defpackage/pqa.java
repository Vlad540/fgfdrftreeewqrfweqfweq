package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: pqa  reason: default package */
public final class pqa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickSubscribersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pqa(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pickSubscribersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((Set) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pqa pqa = new pqa(this.Y, continuation);
        pqa.X = obj;
        return pqa;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [one.me.startconversation.channel.PickSubscribersScreen, one.me.sdk.arch.Widget, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        long[] t0 = o23.t0((Set) this.X);
        k77[] k77Arr = PickSubscribersScreen.D0;
        ? r2 = this.Y;
        r2.getClass();
        k77 k77 = PickSubscribersScreen.D0[0];
        r2.x0.b(r2, t0);
        return jue.a;
    }
}
