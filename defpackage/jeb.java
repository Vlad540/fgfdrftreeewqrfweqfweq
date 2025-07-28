package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* renamed from: jeb  reason: default package */
public final class jeb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jeb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jeb jeb = new jeb(continuation, this.Y);
        jeb.X = obj;
        return jeb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        k77[] k77Arr = ProfileScreen.H0;
        seb adapter = this.Y.p0().getAdapter();
        seb seb = adapter instanceof seb ? adapter : null;
        if (seb != null) {
            seb.E(list);
        }
        return jue.a;
    }
}
