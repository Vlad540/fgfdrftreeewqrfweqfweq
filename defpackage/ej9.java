package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: ej9  reason: default package */
public final class ej9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ej9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ej9 ej9 = new ej9(continuation, this.Y);
        ej9.X = obj;
        return ej9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kwc kwc = (kwc) this.X;
        jwc jwc = kwc.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (jwc != null) {
            k77[] k77Arr = NeuroAvatarsScreen.Q0;
            neuroAvatarsScreen.o0().setAvatarUrl(kwc.a.a());
        } else {
            k77[] k77Arr2 = NeuroAvatarsScreen.Q0;
            neuroAvatarsScreen.o0().setCloseBadgeVisibility(false);
            cxa cxa = cxa.a;
            fxa fxa = kwc.b;
            if (hhd.f(fxa, cxa)) {
                neuroAvatarsScreen.o0().setAvatarUrl((String) null);
                mz9.h(neuroAvatarsScreen.o0(), (Drawable) neuroAvatarsScreen.P0.getValue(), (gz9) null, 30);
            } else if (fxa instanceof bxa) {
                neuroAvatarsScreen.o0().setAvatarUrl((String) null);
                bxa bxa = (bxa) fxa;
                neuroAvatarsScreen.o0().g(new ub0(bxa.a, bxa.b), true);
            } else if (fxa instanceof exa) {
                neuroAvatarsScreen.o0().setAvatarUrl(((exa) fxa).a);
            } else if (fxa instanceof dxa) {
                neuroAvatarsScreen.o0().setAvatarUrl(((dxa) fxa).a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
