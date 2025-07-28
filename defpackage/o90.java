package defpackage;

/* renamed from: o90  reason: default package */
public final class o90 {
    public final Object a;

    public o90(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o90)) {
            return false;
        }
        return this.a.equals(((o90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.a + "}";
    }
}
