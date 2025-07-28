package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* renamed from: r9  reason: default package */
public final class r9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddChatMembersScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r9(Continuation continuation, AddChatMembersScreen addChatMembersScreen) {
        super(2, continuation);
        this.Y = addChatMembersScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r9 r9Var = new r9(continuation, this.Y);
        r9Var.X = obj;
        return r9Var;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (((sg9) this.X) instanceof v03) {
            this.Y.getRouter().C();
        }
        return jue.a;
    }
}
