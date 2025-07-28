package defpackage;

/* renamed from: fa  reason: default package */
public final class fa implements pg7 {
    public final CharSequence X;
    public final boolean Y;
    public final long Z;
    public final long a;
    public final CharSequence b;
    public final mge c;
    public final String o;

    public fa(long j, String str, mge mge, String str2, CharSequence charSequence, boolean z) {
        this.a = j;
        this.b = str;
        this.c = mge;
        this.o = str2;
        this.X = charSequence;
        this.Y = z;
        this.Z = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return this.a == faVar.a && hhd.f(this.b, faVar.b) && hhd.f(this.c, faVar.c) && hhd.f(this.o, faVar.o) && hhd.f(this.X, faVar.X) && this.Y == faVar.Y;
    }

    public final long getItemId() {
        return this.Z;
    }

    public final int hashCode() {
        int f = me4.f(this.b, Long.hashCode(this.a) * 31, 31);
        mge mge = this.c;
        return Boolean.hashCode(this.Y) + me4.f(this.X, me4.d((f + (mge == null ? 0 : mge.hashCode())) * 31, 31, this.o), 31);
    }

    public final int l() {
        return 0;
    }

    public final String toString() {
        return "AdminFromContactsItem(id=" + this.a + ", name=" + this.b + ", subtitle=" + this.c + ", avatar=" + this.o + ", abbreviation=" + this.X + ", isVerified=" + this.Y + ")";
    }
}
