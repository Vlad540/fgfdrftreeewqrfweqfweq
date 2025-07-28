package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: eva  reason: default package */
public final class eva extends l5e implements o26 {
    public /* synthetic */ v49 X;
    public /* synthetic */ yva Y;
    public /* synthetic */ lue Z;
    public /* synthetic */ wc6 w0;
    public final /* synthetic */ PinBarsWidget x0;
    public final /* synthetic */ View y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eva(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(5, continuation);
        this.x0 = pinBarsWidget;
        this.y0 = view;
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        PinBarsWidget pinBarsWidget = this.x0;
        eva eva = new eva(this.y0, (Continuation) obj5, pinBarsWidget);
        eva.X = (v49) obj;
        eva.Y = (yva) obj2;
        eva.Z = (lue) obj3;
        eva.w0 = (wc6) obj4;
        jue jue = jue.a;
        eva.o(jue);
        return jue;
    }

    public final Object o(Object obj) {
        lue lue;
        lue lue2;
        int i = 0;
        wx3.H(obj);
        v49 v49 = this.X;
        yva yva = this.Y;
        lue lue3 = this.Z;
        wc6 wc6 = this.w0;
        boolean z = yva instanceof wva;
        View view = this.y0;
        PinBarsWidget pinBarsWidget = this.x0;
        if (!z || !(v49 instanceof t49) || lue3 == null || !(wc6 instanceof vc6)) {
            View findViewById = view.findViewById(z7a.i);
            if (findViewById != null) {
                int i2 = PinBarsWidget.x0;
                oue oue = pinBarsWidget.l0().o;
                if (!(oue == null || (lue = (lue) oue.i.a.getValue()) == null)) {
                    di3 di3 = oue.b.a;
                    di3.getClass();
                    tic.a(new ci3(0, lue.a, 0, di3), di3.m, (j6) null, new ak0(28), (qmc) null);
                }
                ((ViewGroup) view).removeView(findViewById);
                pinBarsWidget.Z = null;
            }
        } else {
            if (pinBarsWidget.Z == null) {
                pue pue = new pue(pinBarsWidget.getContext());
                pue.setId(z7a.i);
                pue.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                pue.setOnAddContactClickListener(new uua(pinBarsWidget, 5));
                pue.setOnBlockContactClickListener(new uua(pinBarsWidget, 6));
                urd.B(new wua(3, (Continuation) null, 0), pue);
                pinBarsWidget.Z = pue;
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                if (childCount < 0) {
                    i = childCount;
                }
                viewGroup.addView(pue, i);
            }
            oue oue2 = pinBarsWidget.l0().o;
            if (!(oue2 == null || (lue2 = (lue) oue2.i.a.getValue()) == null)) {
                long m = ((lqc) ((f03) oue2.g.getValue())).m();
                di3 di32 = oue2.b.a;
                di32.getClass();
                tic.a(new ci3(0, lue2.a, m, di32), di32.m, (j6) null, new ak0(28), (qmc) null);
            }
        }
        return jue.a;
    }
}
