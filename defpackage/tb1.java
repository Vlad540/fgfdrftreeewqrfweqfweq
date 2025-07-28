package defpackage;

import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: tb1  reason: default package */
public final class tb1 extends qbf {
    public final ViewPager2 a;
    public final ViewStub b;
    public final g11 c;
    public final bc1 d;
    public final u16 e;
    public final s16 f;
    public boolean g = true;
    public int h;
    public boolean i;

    public tb1(ViewPager2 viewPager2, ViewStub viewStub, g11 g11, bc1 bc1, ig1 ig1, hg1 hg1) {
        this.a = viewPager2;
        this.b = viewStub;
        this.c = g11;
        this.d = bc1;
        this.e = ig1;
        this.f = hg1;
    }

    public final void a(int i2) {
        this.g = i2 == 0;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [bc1, ig7] */
    public final void b(int i2, float f2, int i3) {
        int i4 = i2;
        if (f2 == 0.0f) {
            this.h = i4;
        }
        int j = this.d.j() - 1;
        int i5 = this.h;
        boolean z = false;
        ViewStub viewStub = this.b;
        g11 g11 = this.c;
        if (j == i5) {
            if (!ek8.K(viewStub)) {
                ek8.I(viewStub, g11, (s16) null);
            }
            if (this.h > i4) {
                z = true;
            }
            float f3 = 1.0f;
            float f4 = z ? 1.0f - f2 : f2;
            double d2 = (double) f4;
            if (0.1d > d2 || d2 > 0.6d) {
                if (0.6d <= d2 && d2 <= 0.99d && !this.i) {
                    this.i = true;
                    int i6 = Build.VERSION.SDK_INT;
                    ViewPager2 viewPager2 = this.a;
                    if (i6 >= 30) {
                        lp.K(viewPager2, ie6.X);
                    }
                    int i7 = this.h;
                    viewPager2.e(z ? i7 - 1 : i7 + 1, true);
                } else if (ek8.K(viewStub)) {
                    g11.setVisibility(8);
                }
            } else if (g11.getVisibility() != 0) {
                mt0.k(this.c, true, 0, (u16) null, 6);
            }
            g11.setTranslationY((((Number) this.f.invoke()).floatValue() - ((float) i3)) + (dh4.c().getDisplayMetrics().density * -50.0f));
            int i8 = g11.c;
            float f5 = (((float) (g11.x0 - i8)) * f4) + ((float) i8);
            int i9 = g11.a;
            float f6 = (((float) (g11.o - i9)) * f4) + ((float) i9);
            int i10 = g11.b;
            float f7 = (((float) (g11.w0 - i10)) * f4) + ((float) i10);
            int X = a24.X(f5);
            h11 h11 = g11.z0;
            h11.setPadding(X, X, X, X);
            ViewGroup.LayoutParams layoutParams = h11.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = a24.X(f6);
                layoutParams.height = a24.X(f7);
                h11.setLayoutParams(layoutParams);
                float f8 = f4 * 3.0f;
                if (f8 <= 1.0f) {
                    f3 = f8;
                }
                g11.y0.setAlpha(f3);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (ek8.K(viewStub)) {
            g11.setVisibility(8);
        }
        this.i = false;
    }

    public final void c(int i2) {
        ac1 G;
        raf raf;
        ViewPager2 viewPager2 = this.a;
        boolean z = viewPager2.J0;
        udd.p("CallModeScrollTag", "viewpager position changed position=" + i2 + " isUserInputEnabled=" + z, new Object[0]);
        if (!(!z || (G = this.d.G(i2)) == null || (raf = G.a) == null || raf == raf.b)) {
            this.e.invoke(raf);
        }
        viewPager2.setUserInputEnabled(true);
    }
}
