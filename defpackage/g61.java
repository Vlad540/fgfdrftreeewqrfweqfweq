package defpackage;

/* renamed from: g61  reason: default package */
public final class g61 implements i61 {
    public final m21 a;

    public g61(m21 m21) {
        this.a = m21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g61) && hhd.f(this.a, ((g61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreateJoinLinkEvent(event=" + this.a + ")";
    }
}
