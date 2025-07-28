package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: aa6  reason: default package */
public final class aa6 extends chd {
    /* JADX WARNING: type inference failed for: r4v0, types: [aa6, b7c] */
    /* renamed from: F */
    public final void A(z96 z96) {
        String str;
        kh3 kh3 = (kh3) this.a;
        kh3.setId(Long.hashCode(z96.y0));
        q1b q1b = z96.c;
        boolean M = kh3.M(q1b.a.toString());
        CharSequence charSequence = q1b.a;
        List list = z96.Z;
        if (M) {
            charSequence = udd.O(charSequence, list, q1b.b);
        }
        kh3.setName(charSequence);
        q1b q1b2 = z96.o;
        boolean L = kh3.L(q1b2.a.toString());
        CharSequence charSequence2 = q1b2.a;
        if (L) {
            charSequence2 = udd.O(charSequence2, list, q1b2.b);
        }
        kh3.setMessage(charSequence2);
        Uri uri = z96.X;
        if (uri == null || (str = uri.toString()) == null) {
            str = Uri.EMPTY.toString();
        }
        kh3.O(z96.a, z96.b, str);
    }
}
