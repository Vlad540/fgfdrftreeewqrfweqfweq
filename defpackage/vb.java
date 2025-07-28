package defpackage;

import android.view.View;

/* renamed from: vb  reason: default package */
public final class vb extends chd {
    /* renamed from: F */
    public final void A(fa faVar) {
        kh3 kh3 = this.a;
        kh3.setId(Long.hashCode(faVar.Z));
        kh3.setName(faVar.b);
        mge mge = faVar.c;
        kh3.setMessage(mge != null ? mge.a(kh3.getContext()) : null);
        kh3.N();
        kh3.setOnClickListener((View.OnClickListener) null);
        kh3.setVerified(faVar.Y);
        kh3.O(faVar.a, faVar.X, faVar.o);
        kh3.setSelectionEnabled(false);
    }
}
