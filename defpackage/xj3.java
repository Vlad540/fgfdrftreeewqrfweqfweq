package defpackage;

/* renamed from: xj3  reason: default package */
public final class xj3 implements q8b {
    public final boolean X;
    public final CharSequence Y;
    public final b7b Z;
    public final long a;
    public final String b;
    public final mge c;
    public final String o;
    public final int w0;
    public final boolean x0;

    public xj3(long j, String str, mge mge, String str2, boolean z, CharSequence charSequence, b7b b7b, int i, boolean z2, int i2) {
        i = (i2 & 128) != 0 ? 32768 : i;
        z2 = (i2 & 256) != 0 ? false : z2;
        this.a = j;
        this.b = str;
        this.c = mge;
        this.o = str2;
        this.X = z;
        this.Y = charSequence;
        this.Z = b7b;
        this.w0 = i;
        this.x0 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj3)) {
            return false;
        }
        xj3 xj3 = (xj3) obj;
        return this.a == xj3.a && hhd.f(this.b, xj3.b) && hhd.f(this.c, xj3.c) && hhd.f(this.o, xj3.o) && this.X == xj3.X && hhd.f(this.Y, xj3.Y) && this.Z == xj3.Z && jjd.m(this.w0, xj3.w0) && this.x0 == xj3.x0;
    }

    public final boolean g(pg7 pg7) {
        return this.a == pg7.getItemId();
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int f = me4.f(this.Y, th2.f(me4.d(c3d.e(me4.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.X), 31);
        return Boolean.hashCode(this.x0) + c3d.d(this.w0, (this.Z.hashCode() + f) * 31, 31);
    }

    public final int l() {
        return this.w0;
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        String R = jjd.R(this.w0);
        StringBuilder sb = new StringBuilder("ContactInfoItem(id=");
        sb.append(this.a);
        sb.append(", fullName=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.o);
        sb.append(", isOnline=");
        sb.append(this.X);
        sb.append(", abbreviation=");
        sb.append(this.Y);
        sb.append(", type=");
        sb.append(this.Z);
        sb.append(", itemViewType=");
        sb.append(R);
        sb.append(", newPermissions=");
        return hr1.j(sb, this.x0, ")");
    }
}
