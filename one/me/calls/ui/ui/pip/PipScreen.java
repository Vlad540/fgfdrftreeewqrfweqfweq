package one.me.calls.ui.ui.pip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calls/ui/ui/pip/PipScreen;", "Lone/me/sdk/arch/Widget;", "Ldk9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class PipScreen extends Widget implements dk9 {
    public static final /* synthetic */ k77[] o;
    public final nl0 a = binding(new twa(this, 0));
    public final t97 b = ez3.O(3, new twa(this, 1));
    public final t97 c = ez3.O(3, new qga(18));

    static {
        khb khb = new khb(PipScreen.class, "fakePipView", "getFakePipView()Lone/me/calls/ui/view/pip/CallPipView;", 0);
        m7c.a.getClass();
        o = new k77[]{khb};
    }

    public PipScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((oed) this.c.getValue()).getClass();
        oed.a();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(o1a.p0);
        k77 k77 = o[0];
        frameLayout.addView((cf1) this.a.getValue());
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.calls.ui.ui.pip.PipScreen] */
    public final void onDestroy() {
        PipScreen.super.onDestroy();
        nwa nwa = (nwa) this.b.getValue();
        nwa.a.c(nwa);
        nwa.c = null;
        ((f5f) nwa.Y.getValue()).b();
    }

    public final void onViewCreated(View view) {
        PipScreen.super.onViewCreated(view);
        t97 t97 = this.b;
        k77 k77 = o[0];
        ((nwa) t97.getValue()).c = (cf1) this.a.getValue();
        ez3.N(new ck5(((nwa) t97.getValue()).X, new uwa(this, (Continuation) null), 5), getViewLifecycleScope());
    }
}
