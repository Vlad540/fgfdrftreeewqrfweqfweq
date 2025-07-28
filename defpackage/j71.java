package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* renamed from: j71  reason: default package */
public final class j71 extends FrameLayout implements bi1 {
    public final /* synthetic */ CallIncomingScreen a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j71(CallIncomingScreen callIncomingScreen, Context context) {
        super(context);
        this.a = callIncomingScreen;
        setId(uob.call_screen_incoming_container_id);
        setBackgroundColor(-15263716);
        gm1 gm1 = new gm1(getContext(), (AttributeSet) null);
        gm1.setId(uob.call_incoming_avatar);
        gm1.setMode(cm1.a);
        gm1.setBackgroundState(dm1.b);
        addView(gm1, -1, -1);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [rr3, one.me.calls.ui.ui.incoming.CallIncomingScreen, java.lang.Object] */
    public final void a(boolean z) {
        if (z) {
            ? r2 = this.a;
            if (r2.getView() != null) {
                ((gm1) r2.c.T0(r2, CallIncomingScreen.w0[0])).a(z);
            }
        }
    }

    public final void h(lg7 lg7, boolean z, long j) {
        mk9 mk9 = CallIncomingScreen.Z;
        CallIncomingScreen callIncomingScreen = this.a;
        callIncomingScreen.getClass();
        ((gm1) callIncomingScreen.c.T0(callIncomingScreen, CallIncomingScreen.w0[0])).h(lg7, z, j);
    }
}
