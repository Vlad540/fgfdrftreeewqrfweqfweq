package defpackage;

/* renamed from: rr5  reason: default package */
public final class rr5 implements pg7 {
    public final String X;
    public final qr5 Y;
    public final int Z;
    public final long a;
    public final CharSequence b;
    public final int c;
    public final CharSequence o;
    public final long w0;

    public rr5(long j, CharSequence charSequence, int i, CharSequence charSequence2, String str, qr5 qr5, int i2) {
        this.a = j;
        this.b = charSequence;
        this.c = i;
        this.o = charSequence2;
        this.X = str;
        this.Y = qr5;
        this.Z = i2;
        this.w0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr5)) {
            return false;
        }
        rr5 rr5 = (rr5) obj;
        return this.a == rr5.a && hhd.f(this.b, rr5.b) && this.c == rr5.c && hhd.f(this.o, rr5.o) && hhd.f(this.X, rr5.X) && hhd.f(this.Y, rr5.Y) && this.Z == rr5.Z;
    }

    public final long getItemId() {
        return this.w0;
    }

    public final int hashCode() {
        int d = c3d.d(this.c, me4.f(this.b, Long.hashCode(this.a) * 31, 31), 31);
        int i = 0;
        CharSequence charSequence = this.o;
        int hashCode = (d + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.X;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        qr5 qr5 = this.Y;
        if (qr5 != null) {
            i = qr5.hashCode();
        }
        return Integer.hashCode(this.Z) + ((hashCode2 + i) * 31);
    }

    public final int l() {
        return this.Z;
    }

    public final String toString() {
        return "FolderWidgetItem(id=" + this.a + ", name=" + this.b + ", backgroundColor=" + this.c + ", description=" + this.o + ", iconUrl=" + this.X + ", clickAction=" + this.Y + ", viewType=" + this.Z + ")";
    }
}
