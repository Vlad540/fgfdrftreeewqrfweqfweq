package defpackage;

import java.util.List;

/* renamed from: x2e  reason: default package */
public final class x2e implements pg7 {
    public final String X;
    public final List Y;
    public final int Z;
    public final long a;
    public final CharSequence b;
    public final String c;
    public final CharSequence o;

    public x2e(long j, CharSequence charSequence, String str, CharSequence charSequence2, String str2, List list, int i) {
        this.a = j;
        this.b = charSequence;
        this.c = str;
        this.o = charSequence2;
        this.X = str2;
        this.Y = list;
        this.Z = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2e)) {
            return false;
        }
        x2e x2e = (x2e) obj;
        return this.a == x2e.a && hhd.f(this.b, x2e.b) && hhd.f(this.c, x2e.c) && hhd.f(this.o, x2e.o) && hhd.f(this.X, x2e.X) && hhd.f(this.Y, x2e.Y) && this.Z == x2e.Z;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return hr1.t(this.Z) + c3d.f(this.Y, me4.d(me4.f(this.o, me4.d(me4.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31), 31, this.X), 31);
    }

    public final CharSequence k() {
        int i = this.Z;
        CharSequence charSequence = this.b;
        if (i == 3) {
            return charSequence;
        }
        CharSequence charSequence2 = this.o;
        return charSequence2.length() == 0 ? charSequence : charSequence2;
    }

    public final int l() {
        return 1;
    }

    public final String toString() {
        return "SuggestionsState(id=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", shortName=" + this.o + ", query=" + this.X + ", contextActions=" + this.Y + ", type=" + c3d.t(this.Z) + ")";
    }
}
