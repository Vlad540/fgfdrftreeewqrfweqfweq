package defpackage;

/* renamed from: xy7  reason: default package */
public final class xy7 implements ez7 {
    public final qwc a;

    public xy7(qwc qwc) {
        this.a = qwc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy7) && hhd.f(this.a, ((xy7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
