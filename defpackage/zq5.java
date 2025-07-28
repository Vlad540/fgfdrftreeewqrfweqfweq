package defpackage;

import android.view.View;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: zq5  reason: default package */
public final class zq5 extends chd {
    /* JADX WARNING: type inference failed for: r1v0, types: [zq5, b7c] */
    public final void D() {
        this.a.setOnTrailClick((View.OnClickListener) null);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [zq5, b7c] */
    /* renamed from: F */
    public final void A(tq5 tq5) {
        hy1 hy1 = this.a;
        hy1.setTitle(tq5.c);
        String str = tq5.b;
        mz9 mz9 = hy1.a;
        mz9.setAvatarUrl(str);
        CharSequence charSequence = tq5.X;
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        mz9.g(new ub0(charSequence, tq5.o), true);
        hy1.requestLayout();
        hy1.invalidate();
        hy1.setVerified(tq5.Y);
    }
}
