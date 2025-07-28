package defpackage;

/* renamed from: b3c  reason: default package */
public final class b3c implements g3c {
    public final o2 a;

    public b3c(o2 o2Var) {
        this.a = o2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3c) && hhd.f(this.a, ((b3c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnMediaMessageSend(media=" + this.a + ")";
    }
}
