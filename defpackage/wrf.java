package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* renamed from: wrf  reason: default package */
public final class wrf extends zrf {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final o85 f = new o85(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view, asf asf) {
        u12 j = j(view);
        if (j != null) {
            j.b(asf);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), asf);
            }
        }
    }

    public static void f(View view, asf asf, WindowInsets windowInsets, boolean z) {
        u12 j = j(view);
        if (j != null) {
            j.b = windowInsets;
            if (!z) {
                j.c(asf);
                z = j.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), asf, windowInsets, z);
            }
        }
    }

    public static void g(View view, nsf nsf, List list) {
        u12 j = j(view);
        if (j != null) {
            nsf = j.d(nsf, list);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), nsf, list);
            }
        }
    }

    public static void h(View view, asf asf, s5c s5c) {
        u12 j = j(view);
        if (j != null) {
            j.e(asf, s5c);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), asf, s5c);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(wpb.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static u12 j(View view) {
        Object tag = view.getTag(wpb.tag_window_insets_animation_callback);
        if (tag instanceof vrf) {
            return ((vrf) tag).a;
        }
        return null;
    }
}
