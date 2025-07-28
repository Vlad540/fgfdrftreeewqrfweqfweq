package defpackage;

/* renamed from: q53  reason: default package */
public final class q53 {
    public final int a;

    public q53(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q53) && this.a == ((q53) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("CommonStatesBackgroundActiveActionColors(themed="), this.a, ")");
    }
}
