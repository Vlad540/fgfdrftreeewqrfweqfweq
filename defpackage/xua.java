package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: xua  reason: default package */
public final class xua extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xua(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xua xua = new xua(this.Z, continuation, this.Y);
        xua.X = obj;
        return xua;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.View, xc6] */
    public final Object o(Object obj) {
        wx3.H(obj);
        wc6 wc6 = (wc6) this.X;
        ViewGroup viewGroup = (ViewGroup) this.Z;
        int i = PinBarsWidget.x0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        if (!(wc6 instanceof uc6)) {
            viewGroup.removeView(viewGroup.findViewById(z7a.a));
            pinBarsWidget.w0 = null;
        } else {
            if (pinBarsWidget.w0 == null) {
                ConstraintLayout xc6 = new xc6(pinBarsWidget.getContext());
                xc6.setId(z7a.a);
                xc6.setJoinAction(new tua(pinBarsWidget, 0));
                pinBarsWidget.w0 = xc6;
                viewGroup.addView(xc6, viewGroup.getChildCount());
            }
            ? r4 = pinBarsWidget.w0;
            if (r4 != 0) {
                uc6 uc6 = (uc6) wc6;
                r4.K0.setAvatars(uc6.c);
                r4.M0.setText(uc6.b.c(r4));
            }
        }
        return jue.a;
    }
}
