package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: vs4  reason: default package */
public final class vs4 extends j06 {
    public final /* synthetic */ int w0;

    public /* synthetic */ vs4(int i) {
        this.w0 = i;
    }

    public final void g(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float f3;
        switch (this.w0) {
            case 0:
                RectF c = j06.c(tabLayout, view);
                RectF c2 = j06.c(tabLayout, view2);
                if (c.left < c2.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    f2 = (float) (1.0d - Math.cos(d));
                    f3 = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    f2 = (float) Math.sin(d2);
                    f3 = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(og.c((int) c.left, f2, (int) c2.left), drawable.getBounds().top, og.c((int) c.right, f3, (int) c2.right), drawable.getBounds().bottom);
                return;
            default:
                int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
                if (i >= 0) {
                    view = view2;
                }
                RectF c3 = j06.c(tabLayout, view);
                float b = i < 0 ? og.b(1.0f, 0.0f, 0.0f, 0.5f, f) : og.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) c3.left, drawable.getBounds().top, (int) c3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b * 255.0f));
                return;
        }
    }
}
