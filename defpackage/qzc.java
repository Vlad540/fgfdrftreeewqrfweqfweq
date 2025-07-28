package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;

/* renamed from: qzc  reason: default package */
public final class qzc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ServerHostBottomSheet Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qzc(Continuation continuation, ServerHostBottomSheet serverHostBottomSheet, View view) {
        super(2, continuation);
        this.Y = serverHostBottomSheet;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((qzc) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qzc qzc = new qzc(continuation, this.Y, this.Z);
        qzc.X = obj;
        return qzc;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ik6 ik6 = (ik6) this.X;
        boolean z = ik6 instanceof fk6;
        BaseBottomSheetWidget baseBottomSheetWidget = this.Y;
        if (z) {
            bm3.p(baseBottomSheetWidget);
            baseBottomSheetWidget.r0(true);
        } else {
            boolean z2 = ik6 instanceof gk6;
            View view = this.Z;
            if (z2) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, baseBottomSheetWidget.D0);
                k77[] k77Arr = ServerHostBottomSheet.K0;
                ((RecyclerView) baseBottomSheetWidget.F0.T0(baseBottomSheetWidget, k77Arr[0])).setVisibility(8);
                ((LinearLayout) baseBottomSheetWidget.H0.T0(baseBottomSheetWidget, k77Arr[2])).setVisibility(0);
                mda mda = (mda) baseBottomSheetWidget.I0.T0(baseBottomSheetWidget, k77Arr[3]);
                String str = ((gk6) ik6).a;
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
                mda.setText(str);
            } else if (ik6 instanceof hk6) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, baseBottomSheetWidget.D0);
                k77[] k77Arr2 = ServerHostBottomSheet.K0;
                ((RecyclerView) baseBottomSheetWidget.F0.T0(baseBottomSheetWidget, k77Arr2[0])).setVisibility(8);
                ((LinearLayout) baseBottomSheetWidget.H0.T0(baseBottomSheetWidget, k77Arr2[2])).setVisibility(8);
                ((a9a) baseBottomSheetWidget.G0.T0(baseBottomSheetWidget, k77Arr2[1])).setVisibility(0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
