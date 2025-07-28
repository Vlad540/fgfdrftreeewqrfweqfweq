package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: xk3  reason: default package */
public final class xk3 extends chd {
    /* JADX WARNING: type inference failed for: r4v0, types: [xk3, b7c] */
    /* renamed from: F */
    public final void A(lk3 lk3) {
        kh3 kh3 = (kh3) this.a;
        long j = lk3.a;
        kh3.setId(Long.hashCode(j));
        kh3.setName(lk3.b);
        kh3.setMessage(lk3.X);
        kh3.setVerified(lk3.x0);
        kh3.N();
        String str = null;
        kh3.setOnClickListener((View.OnClickListener) null);
        Uri uri = lk3.Z;
        if (uri != null) {
            str = uri.toString();
        }
        kh3.O(j, lk3.y0, str);
        kh3.setSelectionEnabled(false);
    }
}
