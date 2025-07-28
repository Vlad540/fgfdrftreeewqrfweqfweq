package one.me.calls.ui.ui.indicator;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/ui/indicator/CallIndicatorWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallIndicatorWidget extends Widget {
    public static final /* synthetic */ k77[] X;
    public final t97 a = bh1.a.c();
    public final nl0 b = binding(new g81(this, 0));
    public final nl0 c = binding(new g81(this, 1));
    public final t97 o = createViewModelLazy(d81.class, new s(12, new g81(this, 2)));

    static {
        Class<CallIndicatorWidget> cls = CallIndicatorWidget.class;
        X = new k77[]{new khb(cls, "indicatorView", "getIndicatorView()Lone/me/calls/ui/view/indicator/CallIndicatorView;", 0), wn6.e(m7c.a, cls, "fakeIndicatorView", "getFakeIndicatorView()Landroid/view/View;", 0)};
    }

    public CallIndicatorWidget() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public static final z71 l0(CallIndicatorWidget callIndicatorWidget) {
        callIndicatorWidget.getClass();
        k77 k77 = X[0];
        return (z71) callIndicatorWidget.b.getValue();
    }

    public static final void m0(CallIndicatorWidget callIndicatorWidget, boolean z) {
        int i;
        if (z) {
            callIndicatorWidget.getClass();
            i = -15263716;
        } else {
            i = 0;
        }
        callIndicatorWidget.getClass();
        k77 k77 = X[1];
        Drawable background = ((View) callIndicatorWidget.c.getValue()).getBackground();
        ColorDrawable colorDrawable = null;
        ColorDrawable colorDrawable2 = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable2 != null) {
            if (colorDrawable2.getColor() != i) {
                colorDrawable = colorDrawable2;
            }
            if (colorDrawable != null) {
                colorDrawable.setColor(i);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new i81(this, getContext());
    }

    public final void onViewCreated(View view) {
        CallIndicatorWidget.super.onViewCreated(view);
        t97 t97 = this.o;
        ez3.N(new ck5(((d81) t97.getValue()).Y, new j81(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(((d81) t97.getValue()).w0, new k81(this, (Continuation) null), 5), getViewLifecycleScope());
    }
}
