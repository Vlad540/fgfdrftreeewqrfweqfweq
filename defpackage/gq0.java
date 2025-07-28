package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* renamed from: gq0  reason: default package */
public final /* synthetic */ class gq0 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetWidget b;

    public /* synthetic */ gq0(BottomSheetWidget bottomSheetWidget, int i) {
        this.a = i;
        this.b = bottomSheetWidget;
    }

    public final Object invoke() {
        Window window;
        View currentFocus;
        jue jue = jue.a;
        View view = null;
        BottomSheetWidget bottomSheetWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = BottomSheetWidget.B0;
                Activity activity = bottomSheetWidget.getActivity();
                if (!(activity == null || (window = activity.getWindow()) == null || (currentFocus = window.getCurrentFocus()) == null)) {
                    currentFocus.clearFocus();
                    int i = e87.a;
                    if (e87.b(e87.c)) {
                        boolean x0 = bottomSheetWidget.x0();
                        k77 k77 = BottomSheetWidget.B0[0];
                        bottomSheetWidget.z0.b(bottomSheetWidget, Boolean.valueOf(x0));
                        bm3.r(currentFocus);
                    }
                    view = currentFocus;
                }
                bottomSheetWidget.y0 = view;
                return jue;
            default:
                View view2 = bottomSheetWidget.y0;
                if (view2 != null) {
                    view2.requestFocus();
                    k77 k772 = BottomSheetWidget.B0[0];
                    if (((Boolean) bottomSheetWidget.z0.a(bottomSheetWidget)).booleanValue()) {
                        bm3.H(view2);
                    }
                }
                bottomSheetWidget.y0 = null;
                return jue;
        }
    }
}
