package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: jc6  reason: default package */
public final class jc6 {
    public final ViewPager2 a;
    public final nc6 b;
    public boolean c;
    public f6c d;
    public ic6 e;
    public jw4 f;

    public jc6(ViewPager2 viewPager2, nc6 nc6) {
        this.a = viewPager2;
        this.b = nc6;
    }

    public final void a() {
        f6c f6c = this.d;
        if (f6c != null) {
            try {
                int j = f6c.j();
                this.b.b(j, j == 0 ? 0 : Math.min(this.a.getCurrentItem(), j - 1));
            } catch (IllegalArgumentException e2) {
                String name = jc6.class.getName();
                String message = e2.getMessage();
                udd.S(name, "updatePagesNumber error: " + message, e2);
            }
        }
    }
}
