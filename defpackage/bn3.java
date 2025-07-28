package defpackage;

import android.view.ViewGroup;

/* renamed from: bn3  reason: default package */
public final class bn3 extends w9b {
    public final void A(pg7 pg7) {
        xj3 xj3 = (xj3) pg7;
        kh3 kh3 = this.a;
        if (xj3.x0 && xj3.Z == b7b.CHANGE_ADMIN) {
            int X = a24.X(((float) 64) * dh4.c().getDisplayMetrics().density);
            int X2 = a24.X(((float) 80) * dh4.c().getDisplayMetrics().density);
            kh3.f1.b = smc.Y;
            ViewGroup.LayoutParams layoutParams = kh3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = X2;
                kh3.setLayoutParams(layoutParams);
                kh3.k1 = X;
                kh3.K();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        kh3.O(xj3.a, xj3.Y, xj3.o);
        kh3.setName(xj3.b);
        kh3.setMessage(xj3.c.a(kh3.getContext()));
    }
}
