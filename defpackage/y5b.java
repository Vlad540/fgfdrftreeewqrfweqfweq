package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: y5b  reason: default package */
public final class y5b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileChangeLinkScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y5b(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.Y = profileChangeLinkScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((qz1) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y5b y5b = new y5b(continuation, this.Y);
        y5b.X = obj;
        return y5b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        qz1 qz1 = (qz1) this.X;
        k77[] k77Arr = ProfileChangeLinkScreen.z0;
        ProfileChangeLinkScreen profileChangeLinkScreen = this.Y;
        profileChangeLinkScreen.n0().setTitle(qz1.a);
        ProfileChangeLinkScreen.l0(profileChangeLinkScreen).setEnabled(qz1.c);
        ProfileChangeLinkScreen.l0(profileChangeLinkScreen).setProgressEnabled(qz1.d);
        int ordinal = profileChangeLinkScreen.m0().ordinal();
        int i = 0;
        if (ordinal == 0) {
            ProfileChangeLinkScreen.l0(profileChangeLinkScreen).setVisibility(0);
        } else if (ordinal == 1) {
            OneMeButton l0 = ProfileChangeLinkScreen.l0(profileChangeLinkScreen);
            if (!qz1.b) {
                i = 8;
            }
            l0.setVisibility(i);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
