package defpackage;

import android.widget.ImageView;

/* renamed from: da2  reason: default package */
public final class da2 extends ifb {
    public final void A(pg7 pg7) {
        z92 z92 = (z92) this.a;
        p92 p92 = ((ccb) pg7).a;
        z92.setLink(p92.d);
        z92.setLoading(p92.e);
        String str = p92.c;
        z92.setChatTitle(str);
        ub0 ub0 = new ub0(str, p92.b);
        int i = mz9.O0;
        mz9 mz9 = z92.M0;
        boolean z = true;
        mz9.g(ub0, true);
        mz9.setAvatarUrl(p92.a);
        int i2 = 0;
        if (!p92.f || !p92.g) {
            z = false;
        }
        ImageView imageView = z92.P0;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        z92.w();
    }
}
