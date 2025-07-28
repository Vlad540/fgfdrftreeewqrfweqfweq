package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: gbd  reason: default package */
public final class gbd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ShareDataPickerScreen Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gbd(ShareDataPickerScreen shareDataPickerScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = shareDataPickerScreen;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((Set) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gbd gbd = new gbd(this.Y, this.Z, continuation);
        gbd.X = obj;
        return gbd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int size = ((Set) this.X).size();
        k77[] k77Arr = ShareDataPickerScreen.H0;
        ShareDataPickerScreen shareDataPickerScreen = this.Y;
        boolean z = shareDataPickerScreen.w0().getVisibility() == 0;
        AutoTransition autoTransition = shareDataPickerScreen.A0;
        View view = this.Z;
        if (!z && size > 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            shareDataPickerScreen.w0().setVisibility(0);
        } else if (z && size == 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            nl0 nl0 = shareDataPickerScreen.B0;
            if (nl0.a()) {
                ((jq8) nl0.getValue()).setVisibility(8);
            }
            sgc sgc = shareDataPickerScreen.E0;
            if (sgc == null || !sgc.n()) {
                int i = e87.a;
                if (e87.b(e87.c)) {
                    shareDataPickerScreen.F0.m();
                }
            } else {
                shareDataPickerScreen.u0().c.k.K(1);
            }
        }
        return jue.a;
    }
}
