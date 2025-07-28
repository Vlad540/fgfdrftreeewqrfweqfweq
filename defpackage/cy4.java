package defpackage;

/* renamed from: cy4  reason: default package */
public final class cy4 {
    public final String a;

    public cy4(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy4)) {
            return false;
        }
        return this.a.equals(((cy4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return wn6.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
