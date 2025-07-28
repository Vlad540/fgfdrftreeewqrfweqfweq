package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;

/* renamed from: exb  reason: default package */
public final class exb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RaiseHandActionBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public exb(RaiseHandActionBottomSheet raiseHandActionBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.Y = raiseHandActionBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((exb) n((ixb) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        exb exb = new exb(this.Y, continuation);
        exb.X = obj;
        return exb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ixb ixb = (ixb) this.X;
        k77[] k77Arr = RaiseHandActionBottomSheet.F0;
        RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.Y;
        raiseHandActionBottomSheet.getClass();
        k77[] k77Arr2 = RaiseHandActionBottomSheet.F0;
        int i = 0;
        ((TextView) raiseHandActionBottomSheet.D0.T0(raiseHandActionBottomSheet, k77Arr2[0])).setText(ixb.a.a(raiseHandActionBottomSheet.getContext()));
        n0c n0c = raiseHandActionBottomSheet.E0;
        mge mge = ixb.b;
        if (mge != null) {
            ((TextView) n0c.T0(raiseHandActionBottomSheet, k77Arr2[1])).setText(mge.a(raiseHandActionBottomSheet.getContext()));
        }
        TextView textView = (TextView) n0c.T0(raiseHandActionBottomSheet, k77Arr2[1]);
        if (mge == null) {
            i = 8;
        }
        textView.setVisibility(i);
        return jue.a;
    }
}
