package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* renamed from: p9  reason: default package */
public final class p9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddChatMembersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p9(Continuation continuation, AddChatMembersScreen addChatMembersScreen) {
        super(2, continuation);
        this.Y = addChatMembersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((Set) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p9 p9Var = new p9(continuation, this.Y);
        p9Var.X = obj;
        return p9Var;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [one.me.profile.screens.addmembers.AddChatMembersScreen, one.me.sdk.arch.Widget, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        long[] t0 = o23.t0((Set) this.X);
        k77[] k77Arr = AddChatMembersScreen.B0;
        ? r2 = this.Y;
        r2.getClass();
        k77 k77 = AddChatMembersScreen.B0[1];
        r2.y0.b(r2, t0);
        return jue.a;
    }
}
