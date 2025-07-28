package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: aw5  reason: default package */
public final class aw5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aw5(ForwardPickerScreen forwardPickerScreen, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
        this.Z = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((aw5) n((kt8) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        aw5 aw5 = new aw5(this.Y, (ViewGroup) this.Z, continuation);
        aw5.X = obj;
        return aw5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kt8 kt8 = (kt8) this.X;
        ForwardPickerScreen forwardPickerScreen = this.Y;
        sgc sgc = forwardPickerScreen.I0;
        if (sgc != null) {
            int t = hr1.t(kt8.a);
            View view = this.Z;
            if (t == 0) {
                z68 z68 = forwardPickerScreen.K0;
                if (z68 != null) {
                    k77[] k77Arr = z68.m;
                    z68.e(true);
                }
                forwardPickerScreen.x0().setLeftIcon(phc.Z0);
                ek8.g(view, ForwardPickerScreen.N0, (u16) null);
            } else if (t == 1) {
                if (!sgc.n()) {
                    sgc.R(n06.f(new MediaKeyboardWidget(forwardPickerScreen.b, 0, true, 2, (x54) null), (wr3) null, (wr3) null));
                }
                WeakHashMap weakHashMap = eaf.a;
                t9f.u(view, (uw9) null);
                z68 z682 = forwardPickerScreen.K0;
                if (z682 != null) {
                    z682.f();
                }
                forwardPickerScreen.x0().setLeftIcon(phc.d1);
            } else if (t == 2) {
                nl0 nl0 = forwardPickerScreen.J0.b.E0;
                if (nl0.a()) {
                    ((jq8) nl0.getValue()).e(true);
                }
                forwardPickerScreen.x0().setLeftIcon(phc.Z0);
                ez3.N(new ck5(ez3.e0(new ik5(e87.f, 3), 1), new dw5((ViewGroup) view, (Continuation) null), 5), forwardPickerScreen.getViewLifecycleScope());
            }
        }
        return jue.a;
    }
}
