package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: zx6  reason: default package */
public final class zx6 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zx6(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((so7) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zx6 zx6 = new zx6(continuation, this.Y);
        zx6.X = obj;
        return zx6;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        so7 so7 = (so7) this.X;
        k77[] k77Arr = InputPhoneScreen.I0;
        InputPhoneScreen inputPhoneScreen = this.Y;
        OneMeButton n0 = inputPhoneScreen.n0();
        n0.setProgressEnabled(false);
        n0.setClickable(true);
        if (so7 instanceof no7) {
            InputPhoneScreen.m0(inputPhoneScreen, ((no7) so7).c.a(inputPhoneScreen.getContext()));
        } else if (so7 instanceof oo7) {
            InputPhoneScreen.m0(inputPhoneScreen, ((oo7) so7).c.a(inputPhoneScreen.getContext()));
        } else if (so7 instanceof po7) {
            fja.y(inputPhoneScreen);
        } else {
            CharSequence charSequence = null;
            if (so7 instanceof ro7) {
                ro7 ro7 = (ro7) so7;
                ((c70) inputPhoneScreen.F0.getValue()).a(new b70(ro7.e));
                inputPhoneScreen.a.getClass();
                CharSequence a = ro7.c.a(inputPhoneScreen.getContext());
                if (a != null) {
                    mge mge = ro7.d;
                    if (mge != null) {
                        charSequence = mge.a(inputPhoneScreen.getContext());
                    }
                    hba hba = new hba((Widget) inputPhoneScreen);
                    hba.i(a);
                    hba.b(charSequence);
                    hba.e(1);
                    hba.j();
                }
            } else if (so7 == null) {
                InputPhoneScreen.m0(inputPhoneScreen, (CharSequence) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
