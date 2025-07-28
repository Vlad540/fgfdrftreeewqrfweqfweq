package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: gb1  reason: default package */
public final class gb1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallLinkInfoScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gb1(Continuation continuation, CallLinkInfoScreen callLinkInfoScreen) {
        super(2, continuation);
        this.Y = callLinkInfoScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((gb1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gb1 gb1 = new gb1(continuation, this.Y);
        gb1.X = obj;
        return gb1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        za1 za1 = (za1) this.X;
        k77[] k77Arr = CallLinkInfoScreen.F0;
        CallLinkInfoScreen callLinkInfoScreen = this.Y;
        callLinkInfoScreen.getClass();
        k77[] k77Arr2 = CallLinkInfoScreen.F0;
        ((TextView) callLinkInfoScreen.y0.T0(callLinkInfoScreen, k77Arr2[3])).setText(za1.e.a(callLinkInfoScreen.getContext()));
        ((TextView) callLinkInfoScreen.z0.T0(callLinkInfoScreen, k77Arr2[4])).setText(za1.f.a(callLinkInfoScreen.getContext()));
        callLinkInfoScreen.D0.E(za1.g);
        nea nea = (nea) callLinkInfoScreen.x0.T0(callLinkInfoScreen, k77Arr2[2]);
        CharSequence a = za1.e.a(callLinkInfoScreen.getContext());
        if (a == null) {
            a = BuildConfig.FLAVOR;
        }
        nea.setTitle(a);
        mz9 mz9 = (mz9) callLinkInfoScreen.C0.T0(callLinkInfoScreen, k77Arr2[7]);
        int i = mz9.O0;
        ub0 ub0 = za1.b;
        mz9.g(ub0, true);
        mz9.setAvatarUrl(za1.a);
        if (ub0 == null) {
            mz9.setCustomPlaceholder((rc0) callLinkInfoScreen.o.getValue());
            mz9.setCustomOverlay((oc0) null);
        } else {
            mz9.setCustomPlaceholder((rc0) null);
            mz9.setCustomOverlay((oc0) callLinkInfoScreen.X.getValue());
        }
        TextView textView = (TextView) callLinkInfoScreen.A0.T0(callLinkInfoScreen, k77Arr2[5]);
        textView.setText(za1.d.getText().a(textView.getContext()));
        textView.setOnLongClickListener(new eb1(za1, 0, callLinkInfoScreen));
        a24.Z(textView, 300, new bb1(za1, callLinkInfoScreen));
        OneMeButton oneMeButton = (OneMeButton) callLinkInfoScreen.B0.T0(callLinkInfoScreen, k77Arr2[6]);
        oneMeButton.setText(za1.h.getTitle().a(oneMeButton.getContext()));
        a24.Z(oneMeButton, 300, new bb1(callLinkInfoScreen, za1));
        return jue.a;
    }
}
