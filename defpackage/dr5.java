package defpackage;

import java.util.Set;

/* renamed from: dr5  reason: default package */
public final class dr5 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final dv3 d;
    public final Set e;

    public dr5(String str, CharSequence charSequence, CharSequence charSequence2, dv3 dv3, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = dv3;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr5)) {
            return false;
        }
        dr5 dr5 = (dr5) obj;
        return hhd.f(this.a, dr5.a) && hhd.f(this.b, dr5.b) && hhd.f(this.c, dr5.c) && hhd.f(this.d, dr5.d) && hhd.f(this.e, dr5.e);
    }

    public final int hashCode() {
        int f = me4.f(this.b, this.a.hashCode() * 31, 31);
        CharSequence charSequence = this.c;
        return this.e.hashCode() + c3d.d(this.d.a, (f + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "FolderModel(id=" + this.a + ", name=" + this.b + ", emoji=" + this.c + ", counter=" + this.d + ", options=" + this.e + ")";
    }
}
