package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: v5b  reason: default package */
public final class v5b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v5b(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v5b v5b = new v5b(continuation, this.Y);
        v5b.X = obj;
        return v5b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.Y.E((List) this.X);
        return jue.a;
    }
}
