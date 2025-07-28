package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: x5b  reason: default package */
public final class x5b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x5b(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        x5b x5b = new x5b(continuation, this.Y);
        x5b.X = obj;
        return x5b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (((sg9) this.X) instanceof v03) {
            k77[] k77Arr = ProfileChangeLinkScreen.z0;
            ProfileChangeLinkScreen profileChangeLinkScreen = this.Y;
            View view = profileChangeLinkScreen.getView();
            if (view != null) {
                view.clearFocus();
            }
            bm3.p(profileChangeLinkScreen);
            profileChangeLinkScreen.getRouter().B(profileChangeLinkScreen);
        }
        return jue.a;
    }
}
