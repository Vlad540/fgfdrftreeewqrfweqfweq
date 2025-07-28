package defpackage;

import android.view.ViewGroup;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: ifc  reason: default package */
public final class ifc implements ygc {
    public final /* synthetic */ RootController X;
    public final /* synthetic */ int a;
    public final sgc b;
    public final sgc c;
    public final int o;

    public ifc(RootController rootController, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.X = rootController;
                this.b = rootController.C();
                this.c = rootController.S();
                rootController.s0();
                ViewGroup.LayoutParams layoutParams = rootController.r0().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                this.o = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                return;
            default:
                this.X = rootController;
                this.b = rootController.C();
                this.c = rootController.S();
                rootController.s0();
                ViewGroup.LayoutParams layoutParams2 = rootController.r0().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                this.o = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
                return;
        }
    }

    public final boolean B(boolean z) {
        switch (this.a) {
            case 0:
                return this.X.B(z);
            default:
                return this.X.B(z);
        }
    }

    public final sgc C() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final boolean F() {
        switch (this.a) {
            case 0:
                return this.X.F();
            default:
                return this.X.F();
        }
    }

    public final sgc S() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final boolean b(CallIndicatorWidget callIndicatorWidget, boolean z) {
        switch (this.a) {
            case 0:
                return this.X.b(callIndicatorWidget, z);
            default:
                return this.X.b(callIndicatorWidget, z);
        }
    }

    public final boolean l(CallIndicatorWidget callIndicatorWidget) {
        switch (this.a) {
            case 0:
                return this.X.l(callIndicatorWidget);
            default:
                return this.X.l(callIndicatorWidget);
        }
    }

    public final int s() {
        switch (this.a) {
            case 0:
                return this.o;
            default:
                return this.o;
        }
    }
}
