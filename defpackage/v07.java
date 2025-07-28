package defpackage;

import android.graphics.drawable.Drawable;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: v07  reason: default package */
public final class v07 extends chd {
    /* JADX WARNING: type inference failed for: r2v0, types: [v07, b7c] */
    /* renamed from: F */
    public final void A(t07 t07) {
        Drawable drawable;
        u07 u07 = (u07) this.a;
        CharSequence a = t07.b.a(u07.getContext());
        if (a == null) {
            a = BuildConfig.FLAVOR;
        }
        u07.setText(a);
        Integer num = t07.c;
        if (num != null) {
            drawable = gq3.b(u07.getContext(), num.intValue());
        } else {
            drawable = null;
        }
        u07.setIcon(drawable);
    }
}
