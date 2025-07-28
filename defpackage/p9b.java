package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;

/* renamed from: p9b  reason: default package */
public final class p9b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p9b(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((v9b) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p9b p9b = new p9b(this.Y, continuation);
        p9b.X = obj;
        return p9b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        v9b v9b = (v9b) this.X;
        if (v9b instanceof v9b) {
            mge mge = v9b.a;
            ProfileEditScreen profileEditScreen = this.Y;
            CharSequence a = mge.a(profileEditScreen.getContext());
            jue jue = jue.a;
            if (a == null) {
                return jue;
            }
            hba hba = new hba((Widget) profileEditScreen);
            hba.f(yba.a);
            hba.i(a);
            hba.g(aca.a);
            hba.c(new pba(0, v9b.b, 3));
            hba.d(v9b.c);
            hba.j();
            return jue;
        }
        throw new NoWhenBranchMatchedException();
    }
}
