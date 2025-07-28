package defpackage;

import java.util.ArrayList;

/* renamed from: t1c  reason: default package */
public final class t1c implements pg7 {
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final long a;
    public final CharSequence b;
    public final String c;
    public final CharSequence o;
    public final boolean w0;
    public final long x0;

    public t1c(long j, String str, String str2, CharSequence charSequence, boolean z, boolean z2, boolean z3, int i) {
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        z3 = (i & 64) != 0 ? false : z3;
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = charSequence;
        this.X = z;
        this.Y = z2;
        this.Z = z3;
        this.w0 = false;
        this.x0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1c)) {
            return false;
        }
        t1c t1c = (t1c) obj;
        return this.a == t1c.a && hhd.f(this.b, t1c.b) && hhd.f(this.c, t1c.c) && hhd.f(this.o, t1c.o) && this.X == t1c.X && this.Y == t1c.Y && this.Z == t1c.Z && this.w0 == t1c.w0;
    }

    public final boolean g(pg7 pg7) {
        return this.a == pg7.getItemId();
    }

    public final long getItemId() {
        return this.x0;
    }

    public final int hashCode() {
        int f = me4.f(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.w0) + th2.f(th2.f(th2.f(me4.f(this.o, (f + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.X), 31, this.Y), 31, this.Z);
    }

    public final int l() {
        return 0;
    }

    public final Object n(Object obj) {
        t1c t1c = (pg7) obj;
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = this.b;
        CharSequence charSequence2 = t1c.b;
        if (!hhd.f(charSequence, charSequence2)) {
            arrayList.add(new q1c((String) charSequence2));
        }
        boolean z = this.Y;
        boolean z2 = t1c.Y;
        if (z != z2) {
            arrayList.add(new s1c(z2));
        }
        String str = this.c;
        String str2 = t1c.c;
        if (!hhd.f(str, str2)) {
            arrayList.add(new p1c(str2));
        }
        CharSequence charSequence3 = this.o;
        CharSequence charSequence4 = t1c.o;
        if (!hhd.f(charSequence3, charSequence4)) {
            arrayList.add(new o1c(charSequence4));
        }
        boolean z3 = this.X;
        boolean z4 = t1c.X;
        if (z3 != z4) {
            arrayList.add(new r1c(z4));
        }
        return arrayList;
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        return "RecentContactModel(id=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", abbreviation=" + this.o + ", isOnline=" + this.X + ", isVerified=" + this.Y + ", isWebapp=" + this.Z + ", isSavedMessages=" + this.w0 + ")";
    }
}
