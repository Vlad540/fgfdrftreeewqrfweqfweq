package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: sz9  reason: default package */
public final class sz9 {
    public static final r7e g = new r7e(new my9(19));
    public final String a;
    public final CharSequence b;
    public final int c;
    public final fja d;
    public final Drawable e;
    public final Drawable f;

    public sz9(String str, CharSequence charSequence, int i, fja fja, Drawable drawable, Drawable drawable2) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.d = fja;
        this.e = drawable;
        this.f = drawable2;
    }

    public static sz9 a(sz9 sz9, CharSequence charSequence, int i, pz9 pz9, int i2) {
        String str = sz9.a;
        if ((i2 & 2) != 0) {
            charSequence = sz9.b;
        }
        CharSequence charSequence2 = charSequence;
        fja fja = pz9;
        if ((i2 & 8) != 0) {
            fja = sz9.d;
        }
        Drawable drawable = sz9.e;
        Drawable drawable2 = sz9.f;
        sz9.getClass();
        return new sz9(str, charSequence2, i, fja, drawable, drawable2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz9)) {
            return false;
        }
        sz9 sz9 = (sz9) obj;
        return hhd.f(this.a, sz9.a) && hhd.f(this.b, sz9.b) && this.c == sz9.c && hhd.f(this.d, sz9.d) && hhd.f(this.e, sz9.e) && hhd.f(this.f, sz9.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + us8.h(this.c, me4.f(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        int i = 0;
        Drawable drawable = this.e;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            i = drawable2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneMeBaseTabItemModel(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", state=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Disabled" : "Inactive" : "Active");
        sb.append(", indicator=");
        sb.append(this.d);
        sb.append(", startIcon=");
        sb.append(this.e);
        sb.append(", endIcon=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ sz9(String str, int i, int i2, String str2) {
        this(str, str2, i, rz9.e, (Drawable) null, (Drawable) null);
    }
}
