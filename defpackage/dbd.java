package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: dbd  reason: default package */
public final class dbd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ShareDataPickerScreen Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dbd(ShareDataPickerScreen shareDataPickerScreen, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.Y = shareDataPickerScreen;
        this.Z = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((kt8) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dbd dbd = new dbd(this.Y, (ViewGroup) this.Z, continuation);
        dbd.X = obj;
        return dbd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kt8 kt8 = (kt8) this.X;
        AbstractPickerScreen abstractPickerScreen = this.Y;
        sgc sgc = abstractPickerScreen.E0;
        if (sgc != null) {
            int t = hr1.t(kt8.a);
            View view = this.Z;
            if (t == 0) {
                z68 z68 = abstractPickerScreen.G0;
                if (z68 != null) {
                    k77[] k77Arr = z68.m;
                    z68.e(true);
                }
                abstractPickerScreen.w0().setLeftIcon(phc.Z0);
                ek8.g(view, ShareDataPickerScreen.I0, (u16) null);
            } else if (t == 1) {
                if (!sgc.n()) {
                    sgc.R(n06.f(new MediaKeyboardWidget(abstractPickerScreen.b, 0, true, 2, (x54) null), (wr3) null, (wr3) null));
                }
                WeakHashMap weakHashMap = eaf.a;
                t9f.u(view, (uw9) null);
                z68 z682 = abstractPickerScreen.G0;
                if (z682 != null) {
                    z682.f();
                }
                abstractPickerScreen.w0().setLeftIcon(phc.d1);
            } else if (t == 2) {
                nl0 nl0 = ((ShareDataPickerScreen) abstractPickerScreen.F0.b).B0;
                if (nl0.a()) {
                    ((jq8) nl0.getValue()).e(true);
                }
                abstractPickerScreen.w0().setLeftIcon(phc.Z0);
                ez3.N(new ck5(ez3.e0(new u09(e87.f, 26), 1), new fbd((ViewGroup) view, (Continuation) null), 5), abstractPickerScreen.getViewLifecycleScope());
            }
        }
        return jue.a;
    }
}
