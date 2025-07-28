package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: fj9  reason: default package */
public final class fj9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fj9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fj9 fj9 = new fj9(continuation, this.Y);
        fj9.X = obj;
        return fj9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        Object obj2 = this.X;
        boolean z = obj2 instanceof qo7;
        CharSequence charSequence = null;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        if (z) {
            mge mge = ((qo7) obj2).c;
            neuroAvatarsScreen.a.getClass();
            CharSequence a = mge.a(neuroAvatarsScreen.getContext());
            if (a != null) {
                hba hba = new hba((Widget) neuroAvatarsScreen);
                hba.i(a);
                hba.b((CharSequence) null);
                hba.e(1);
                hba.j();
            }
        } else if (obj2 instanceof ro7) {
            ro7 ro7 = (ro7) obj2;
            int i = ro7.e;
            k77[] k77Arr = NeuroAvatarsScreen.Q0;
            if (neuroAvatarsScreen.n0() != null) {
                ((c70) neuroAvatarsScreen.o.getValue()).a(new b70(i));
            }
            neuroAvatarsScreen.a.getClass();
            CharSequence a2 = ro7.c.a(neuroAvatarsScreen.getContext());
            if (a2 != null) {
                mge mge2 = ro7.d;
                if (mge2 != null) {
                    charSequence = mge2.a(neuroAvatarsScreen.getContext());
                }
                hba hba2 = new hba((Widget) neuroAvatarsScreen);
                hba2.i(a2);
                hba2.b(charSequence);
                hba2.e(1);
                hba2.j();
            }
        }
        k77[] k77Arr2 = NeuroAvatarsScreen.Q0;
        neuroAvatarsScreen.getClass();
        OneMeButton oneMeButton = (OneMeButton) neuroAvatarsScreen.A0.T0(neuroAvatarsScreen, NeuroAvatarsScreen.Q0[7]);
        oneMeButton.setProgressEnabled(false);
        oneMeButton.setClickable(true);
        return jue.a;
    }
}
