package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: k9e  reason: default package */
public final class k9e implements kbf {
    public final WeakReference a;
    public int b;
    public int c;

    public k9e(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    public final void k(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.m1 = this.c;
        }
    }

    public final void m(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
            int i2 = this.c;
            tabLayout.o(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }
    }

    public final void q(int i, float f) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i2 = this.c;
            tabLayout.q(i, f, i2 != 2 || this.b == 1, (i2 == 2 && this.b == 0) ? false : true, false);
        }
    }
}
