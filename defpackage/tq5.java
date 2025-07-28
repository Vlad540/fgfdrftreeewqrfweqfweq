package defpackage;

/* renamed from: tq5  reason: default package */
public final class tq5 implements pg7 {
    public final CharSequence X;
    public final boolean Y;
    public final int Z;
    public final long a;
    public final String b;
    public final CharSequence c;
    public final long o;

    public tq5(long j, String str, CharSequence charSequence, long j2, CharSequence charSequence2, boolean z, int i) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
        this.o = j2;
        this.X = charSequence2;
        this.Y = z;
        this.Z = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq5)) {
            return false;
        }
        tq5 tq5 = (tq5) obj;
        return this.a == tq5.a && hhd.f(this.b, tq5.b) && hhd.f(this.c, tq5.c) && this.o == tq5.o && hhd.f(this.X, tq5.X) && this.Y == tq5.Y && this.Z == tq5.Z;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.Z) + th2.f(me4.f(this.X, sxe.m(me4.f(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.o), 31), 31, this.Y);
    }

    public final int l() {
        return this.Z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderMemberItem(itemId=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", avatarSourceId=");
        sb.append(this.o);
        sb.append(", abbreviation=");
        sb.append(this.X);
        sb.append(", isVerified=");
        sb.append(this.Y);
        sb.append(", viewType=");
        return wn6.j(sb, this.Z, ")");
    }
}
