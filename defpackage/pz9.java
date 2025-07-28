package defpackage;

/* renamed from: pz9  reason: default package */
public final class pz9 extends fja {
    public final int e;

    public pz9(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pz9) && this.e == ((pz9) obj).e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("Counter(value="), this.e, ")");
    }
}
