package one.me.calls.ui.ui.incoming;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/calls/ui/ui/incoming/CallIncomingScreen;", "Lone/me/sdk/arch/Widget;", "Ldk9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "mk9", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallIncomingScreen extends Widget implements dk9 {
    public static final mk9 Z = new mk9(7);
    public static final /* synthetic */ k77[] w0;
    public final t97 X;
    public final t97 Y;
    public final so1 a = z11.a.c();
    public final t97 b;
    public final n0c c;
    public final t97 o;

    static {
        khb khb = new khb(CallIncomingScreen.class, "avatarView", "getAvatarView()Lone/me/calls/ui/view/CallUserLargeView;", 0);
        m7c.a.getClass();
        w0 = new k77[]{khb};
    }

    public CallIncomingScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.b = createViewModelLazy(p71.class, new s(11, new x2(bundle, (Widget) this, 8)));
        this.c = viewBinding(uob.call_incoming_avatar);
        this.o = ez3.O(3, new a01(11));
        this.X = bh1.a.getAccessor().d(iq1.class);
        this.Y = ez3.O(3, new c6(22, this));
    }

    public final p71 l0() {
        return (p71) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new j71(this, getContext());
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [rr3, one.me.calls.ui.ui.incoming.CallIncomingScreen] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        CallIncomingScreen.super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 160) {
            if (qna.l((qna) this.o.getValue(), (jrf) this.Y.getValue(), strArr, iArr, qna.h, r1a.D, r1a.C)) {
                l0().q();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rr3, one.me.calls.ui.ui.incoming.CallIncomingScreen, one.me.sdk.arch.Widget] */
    public final void onViewCreated(View view) {
        CallIncomingScreen.super.onViewCreated(view);
        kjd.B(requireActivity(), true);
        ex9 h = getRouter().h();
        if (h != null) {
            h.a(getViewLifecycleOwner(), new or3((Widget) this, 1));
        }
        ez3.N(new ck5(l0().y0, new k71(this, (Continuation) null), 5), getViewLifecycleScope());
    }
}
