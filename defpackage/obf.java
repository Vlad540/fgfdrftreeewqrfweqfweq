package defpackage;

import android.view.View;

/* renamed from: obf  reason: default package */
public final class obf implements o6c {
    public final void b(View view) {
    }

    public final void d(View view) {
        n6c n6c = (n6c) view.getLayoutParams();
        if (n6c.width != -1 || n6c.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
