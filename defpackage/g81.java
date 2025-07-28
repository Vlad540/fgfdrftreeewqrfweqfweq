package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: g81  reason: default package */
public final /* synthetic */ class g81 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallIndicatorWidget b;

    public /* synthetic */ g81(CallIndicatorWidget callIndicatorWidget, int i) {
        this.a = i;
        this.b = callIndicatorWidget;
    }

    public final Object invoke() {
        CallIndicatorWidget callIndicatorWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallIndicatorWidget.X;
                z71 z71 = new z71(callIndicatorWidget.getContext(), (AttributeSet) null);
                z71.setId(o1a.M);
                z71.setLayoutParams(new ViewGroup.LayoutParams(-1, a24.X(((float) 100) * dh4.c().getDisplayMetrics().density)));
                a24.Z(z71, 300, new d5(9, callIndicatorWidget));
                ek8.g(z71, new sy6(3, (up0) null, 2), (u16) null);
                return z71;
            case 1:
                k77[] k77Arr2 = CallIndicatorWidget.X;
                View view = new View(callIndicatorWidget.getContext());
                view.setId(o1a.O);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, me4.p((float) 15, dh4.c().getDisplayMetrics().density, a24.X(((float) 100) * dh4.c().getDisplayMetrics().density))));
                view.setBackground(new ColorDrawable(-15263716));
                return view;
            default:
                k77[] k77Arr3 = CallIndicatorWidget.X;
                z11 z11 = z11.a;
                return new d81((dq4) z11.getAccessor().c(dq4.class), (n11) z11.getAccessor().c(n11.class), z11.c(), new xk1(callIndicatorWidget.getContext()), (aka) z11.getAccessor().c(aka.class), (pae) bh1.a.getAccessor().c(pae.class));
        }
    }
}
