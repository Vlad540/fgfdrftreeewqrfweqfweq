package defpackage;

import android.text.Layout;

/* renamed from: nq8  reason: default package */
public final class nq8 implements qq8 {
    public final Layout a;
    public final Layout b;
    public final long c;
    public final CharSequence d;
    public final String e;

    public nq8(Layout layout, Layout layout2, long j, CharSequence charSequence, String str) {
        this.a = layout;
        this.b = layout2;
        this.c = j;
        this.d = charSequence;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq8)) {
            return false;
        }
        nq8 nq8 = (nq8) obj;
        return hhd.f(this.a, nq8.a) && hhd.f(this.b, nq8.b) && this.c == nq8.c && hhd.f(this.d, nq8.d) && hhd.f(this.e, nq8.e);
    }

    public final int hashCode() {
        int f = me4.f(this.d, sxe.m((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
        String str = this.e;
        return f + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(contactTitleLayout=");
        sb.append(this.a);
        sb.append(", contactNameLayout=");
        sb.append(this.b);
        sb.append(", contactId=");
        sb.append(this.c);
        sb.append(", nameForAbbreviation=");
        sb.append(this.d);
        sb.append(", url=");
        return wn6.l(sb, this.e, ")");
    }
}
