package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: jra  reason: default package */
public final class jra extends chd {
    /* JADX WARNING: type inference failed for: r4v0, types: [jra, b7c] */
    /* renamed from: F */
    public final void A(ira ira) {
        String str;
        kh3 kh3 = (kh3) this.a;
        kh3.setId(Long.hashCode(ira.z0));
        kh3.setEnabled(ira.y0);
        kh3.setName(ira.c);
        mge mge = ira.o;
        kh3.setMessage(mge != null ? mge.a(kh3.getContext()) : null);
        kh3.setOnClickListener((View.OnClickListener) null);
        Uri uri = ira.X;
        if (uri == null || (str = uri.toString()) == null) {
            str = Uri.EMPTY.toString();
        }
        kh3.O(ira.b, ira.x0, str);
        kh3.setVerified(ira.Z);
    }
}
