package defpackage;

/* renamed from: bdd  reason: default package */
public final class bdd implements pg7 {
    public final int a;
    public final int b = s6a.d;
    public final long c;

    public bdd(int i) {
        this.a = i;
        this.c = (long) i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdd) && this.a == ((bdd) obj).a;
    }

    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int l() {
        return this.b;
    }

    public final String toString() {
        return wn6.j(new StringBuilder("ShimmerMemberListItem(pos="), this.a, ")");
    }
}
