package defpackage;

/* renamed from: dv3  reason: default package */
public final class dv3 {
    public static final dv3 b = new dv3(0);
    public final int a;

    public dv3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv3) && this.a == ((dv3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("Counter(count="), this.a, ")");
    }
}
