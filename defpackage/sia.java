package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: sia  reason: default package */
public final class sia extends qbf {
    public final LinearLayoutManager a;
    public tbf b;

    public sia(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    public final void a(int i) {
    }

    public final void b(int i, float f, int i2) {
        if (this.b != null) {
            float f2 = -f;
            int i3 = 0;
            while (true) {
                LinearLayoutManager linearLayoutManager = this.a;
                if (i3 < linearLayoutManager.w()) {
                    View v = linearLayoutManager.v(i3);
                    if (v != null) {
                        float M = ((float) (a.M(v) - i)) + f2;
                        j9 j9Var = this.b;
                        tn3 tn3 = ((ig0) j9Var.c).K0;
                        boolean z = tn3.j() > 1;
                        int X = a24.X(((float) 20) * dh4.c().getDisplayMetrics().density);
                        int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                        int i4 = X + X2;
                        float f3 = M * ((float) (-i4));
                        ViewPager2 viewPager2 = (ViewPager2) j9Var.b;
                        if (viewPager2.getOrientation() == 0) {
                            ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                            if (layoutParams != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (v instanceof p4a) {
                                    marginLayoutParams.setMarginStart(0);
                                    marginLayoutParams.setMarginEnd(0);
                                } else if (!z) {
                                    marginLayoutParams.setMarginStart(X2);
                                    marginLayoutParams.setMarginEnd(X2);
                                } else if (viewPager2.getCurrentItem() == 0) {
                                    marginLayoutParams.setMarginStart(X2);
                                    marginLayoutParams.setMarginEnd(i4);
                                } else if (viewPager2.getCurrentItem() == tn3.j() - 1) {
                                    marginLayoutParams.setMarginStart(i4);
                                    marginLayoutParams.setMarginEnd(X2);
                                }
                                v.setLayoutParams(marginLayoutParams);
                                if (!z) {
                                    f3 = 0.0f;
                                } else if (xy6.w(viewPager2)) {
                                    f3 = -f3;
                                }
                                v.setTranslationX(f3);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                        }
                        i3++;
                    } else {
                        Locale locale = Locale.US;
                        throw new IllegalStateException(rf0.g("LayoutManager returned a null child at pos ", i3, "/", linearLayoutManager.w(), " while transforming pages"));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void c(int i) {
    }
}
