package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: nbf  reason: default package */
public final class nbf extends qbf {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ nbf(ViewPager2 viewPager2, int i) {
        this.a = i;
        this.b = viewPager2;
    }

    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b.h();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(int i) {
        switch (this.a) {
            case 0:
                ViewPager2 viewPager2 = this.b;
                if (viewPager2.o != i) {
                    viewPager2.o = i;
                    viewPager2.L0.I();
                    return;
                }
                return;
            default:
                ViewPager2 viewPager22 = this.b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.B0.requestFocus(2);
                    return;
                }
                return;
        }
    }
}
