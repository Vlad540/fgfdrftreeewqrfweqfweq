package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: fi8  reason: default package */
public final class fi8 extends chd {
    /* renamed from: F */
    public final void A(ei8 ei8) {
        String str;
        kh3 kh3 = this.a;
        long j = ei8.a;
        kh3.setId(Long.hashCode(j));
        kh3.setEnabled(ei8.y0);
        kh3.setName(ei8.b);
        kh3.setMessage(ei8.o.a(kh3.getContext()));
        kh3.setVerified(ei8.Z);
        mge mge = ei8.B0;
        kh3.setAlias(mge != null ? mge.a(kh3.getContext()) : null);
        kh3.N();
        kh3.setOnClickListener((View.OnClickListener) null);
        Uri uri = ei8.X;
        if (uri == null || (str = uri.toString()) == null) {
            str = Uri.EMPTY.toString();
        }
        kh3.O(j, ei8.Y, str);
        kh3.setSelectionEnabled(false);
    }
}
