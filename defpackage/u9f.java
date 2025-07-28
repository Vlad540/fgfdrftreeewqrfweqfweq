package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: u9f  reason: default package */
public abstract class u9f {
    public static nsf a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        nsf f = nsf.f((View) null, rootWindowInsets);
        lsf lsf = f.a;
        lsf.q(f);
        lsf.d(view.getRootView());
        return f;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
