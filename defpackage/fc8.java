package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;

/* renamed from: fc8  reason: default package */
public abstract class fc8 {
    public static final int a = gmb.mr_dynamic_dialog_icon_light;

    public static ContextThemeWrapper a(Context context, boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, h(context, !z ? ylb.dialogTheme : ylb.alertDialogTheme));
        return h(contextThemeWrapper, tlb.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, f(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int b(ContextThemeWrapper contextThemeWrapper) {
        int h = h(contextThemeWrapper, tlb.mediaRouteTheme);
        return h == 0 ? f(contextThemeWrapper) : h;
    }

    public static int c(Context context) {
        return j33.c(-1, g(context, ylb.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static float d(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable e(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable n = am7.n(context, obtainStyledAttributes.getResourceId(0, 0));
        if (i(context)) {
            um4.g(n, hq3.a(context, a));
        }
        obtainStyledAttributes.recycle();
        return n;
    }

    public static int f(Context context) {
        return i(context) ? c(context) == -570425344 ? jvb.Theme_MediaRouter_Light : jvb.Theme_MediaRouter_Light_DarkControlPanel : c(context) == -570425344 ? jvb.Theme_MediaRouter_LightControlPanel : jvb.Theme_MediaRouter;
    }

    public static int g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int h(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean i(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(ylb.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static void j(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(hq3.a(context, i(context) ? gmb.mr_cast_progressbar_progress_and_thumb_light : gmb.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }
}
