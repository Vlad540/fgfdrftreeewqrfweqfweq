package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: s9f  reason: default package */
public final class s9f implements View.OnApplyWindowInsetsListener {
    public nsf a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ uw9 c;

    public s9f(View view, uw9 uw9) {
        this.b = view;
        this.c = uw9;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        nsf f = nsf.f(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        uw9 uw9 = this.c;
        if (i < 30) {
            t9f.a(windowInsets, this.b);
            if (f.equals(this.a)) {
                return uw9.M(view, f).e();
            }
        }
        this.a = f;
        nsf M = uw9.M(view, f);
        if (i >= 30) {
            return M.e();
        }
        WeakHashMap weakHashMap = eaf.a;
        r9f.c(view);
        return M.e();
    }
}
