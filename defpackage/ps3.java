package defpackage;

import android.os.Build;
import android.view.View;

/* renamed from: ps3  reason: default package */
public final /* synthetic */ class ps3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs3 b;

    public /* synthetic */ ps3(rs3 rs3, int i) {
        this.a = i;
        this.b = rs3;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                int measuredHeight = view.getMeasuredHeight();
                rs3 rs3 = this.b;
                ls3 ls3 = rs3.k;
                if (measuredHeight != ls3.a) {
                    rs3.k = ls3.a(ls3, measuredHeight, Build.VERSION.SDK_INT >= 30 ? hia.f(view.getRootWindowInsets(), hia.z()).bottom : view.getRootWindowInsets().getStableInsetBottom(), false, 4);
                    for (ms3 u : rs3.a) {
                        u.u(rs3.k);
                    }
                    return;
                }
                return;
            default:
                int measuredHeight2 = view.getMeasuredHeight();
                int measuredHeight3 = view.getMeasuredHeight();
                rs3 rs32 = this.b;
                ls3 ls32 = rs32.j;
                if (measuredHeight3 != ls32.a) {
                    rs32.j = ls3.a(ls32, measuredHeight2, Build.VERSION.SDK_INT >= 30 ? hia.f(view.getRootWindowInsets(), hia.z()).top : view.getRootWindowInsets().getStableInsetTop(), false, 4);
                    for (ms3 D : rs32.a) {
                        D.D(rs32.j);
                    }
                    return;
                }
                return;
        }
    }
}
