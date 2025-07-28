package defpackage;

/* renamed from: w46  reason: default package */
public final class w46 implements x46 {
    public final qwc a;

    public w46(qwc qwc) {
        this.a = qwc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w46) && hhd.f(this.a, ((w46) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
