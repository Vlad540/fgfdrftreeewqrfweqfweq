package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* renamed from: zq3  reason: default package */
public class zq3 extends PopupWindow {
    public static final /* synthetic */ k77[] g;
    public final vq3 a;
    public s16 b;
    public final boolean c;
    public boolean d;
    public final float e;
    public final yj f;

    static {
        k77 hc9 = new hc9(zq3.class, "customTheme", "getCustomTheme()Lru/ok/tamtam/themes/TamTheme;");
        m7c.a.getClass();
        g = new k77[]{hc9};
    }

    public /* synthetic */ zq3(Context context) {
        this(context, -2);
    }

    public final void a(wce wce) {
        Integer valueOf = Integer.valueOf(wce.m);
        Context context = getContentView().getContext();
        float dimension = context.getResources().getDimension(qmb.bottom_sheet_corner_radius);
        setBackgroundDrawable(swb.M(valueOf, (Integer) null, (Integer) null, new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension}));
    }

    public final void b() {
        if (this.d) {
            View rootView = getContentView().getRootView();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = this.e;
            ek8.F(getContentView().getContext()).updateViewLayout(rootView, layoutParams);
        }
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        b();
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        b();
    }

    public zq3(Context context, int i) {
        super(new vq3(context), i, -2);
        vq3 vq3 = (vq3) getContentView();
        this.a = vq3;
        this.c = true;
        this.d = true;
        this.e = 0.5f;
        this.f = new yj(7, this);
        setOnDismissListener(new b01(3, this));
        setFocusable(true);
        setElevation(dh4.c().getDisplayMetrics().density * 8.0f);
        wce customTheme = vq3.getCustomTheme();
        if (customTheme == null) {
            View contentView = getContentView();
            if (contentView.isInEditMode()) {
                customTheme = db4.e0;
            } else {
                Context context2 = contentView.getContext();
                r7e r7e = wce.a0;
                customTheme = fja.E(context2);
            }
        }
        a(customTheme);
    }
}
