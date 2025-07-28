package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;
import one.me.sdk.arch.Widget;

/* renamed from: qx6  reason: default package */
public final class qx6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputNameScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qx6(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.Y = inputNameScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qx6 qx6 = new qx6(continuation, this.Y);
        qx6.X = obj;
        return qx6;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        h05 h05 = (h05) this.X;
        k77[] k77Arr = InputNameScreen.F0;
        InputNameScreen inputNameScreen = this.Y;
        inputNameScreen.l0().setActiveButtonLoaderState(false);
        boolean z = h05 instanceof ix6;
        kda kda = kda.a;
        if (z) {
            ix6 ix6 = (ix6) h05;
            String valueOf = String.valueOf(((mge) ix6.a).a(inputNameScreen.getContext()));
            int t = hr1.t(ix6.c);
            if (t == 0) {
                inputNameScreen.m0().d(valueOf, kda);
            } else if (t == 1) {
                inputNameScreen.n0().d(valueOf, kda);
            } else if (t != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (h05 instanceof uf6) {
            int t2 = hr1.t(((uf6) h05).a);
            if (t2 == 0) {
                inputNameScreen.m0().a();
            } else if (t2 == 1) {
                inputNameScreen.n0().a();
            } else if (t2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (h05 instanceof a8c) {
            so7 so7 = (so7) ((a8c) h05).a;
            if (so7 instanceof ro7) {
                ro7 ro7 = (ro7) so7;
                ((c70) inputNameScreen.x0.getValue()).a(new b70(ro7.e));
                inputNameScreen.a.getClass();
                CharSequence a = ro7.c.a(inputNameScreen.getContext());
                if (a != null) {
                    mge mge = ro7.d;
                    CharSequence a2 = mge != null ? mge.a(inputNameScreen.getContext()) : null;
                    hba hba = new hba((Widget) inputNameScreen);
                    hba.i(a);
                    hba.b(a2);
                    hba.e(1);
                    hba.j();
                }
            } else if (so7 instanceof qo7) {
                inputNameScreen.m0().d(String.valueOf(((qo7) so7).c.a(inputNameScreen.getContext())), kda);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (h05 instanceof hed) {
            inputNameScreen.n0().setHint(d8.u(inputNameScreen.getContext(), utb.oneme_login_input_name_hint_surname_short));
            inputNameScreen.n0().d(d8.u(inputNameScreen.getContext(), utb.oneme_login_input_name_surname_placeholder), kda.b);
        } else if (h05 instanceof vf6) {
            inputNameScreen.n0().setHint(d8.u(inputNameScreen.getContext(), utb.oneme_login_input_name_hint_surname));
            inputNameScreen.n0().a();
        } else if (h05 instanceof ged) {
            bm3.H(inputNameScreen.m0().a);
        }
        return jue.a;
    }
}
