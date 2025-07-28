package defpackage;

/* renamed from: m57  reason: default package */
public final class m57 extends o57 {
    public final p57 d;

    public m57(p57 p57) {
        super("client", 1, p57);
        this.d = p57;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m57) && hhd.f(this.d, ((m57) obj).d);
    }

    public final int hashCode() {
        p57 p57 = this.d;
        if (p57 == null) {
            return 0;
        }
        return p57.hashCode();
    }

    public final p57 l() {
        return this.d;
    }

    public final String toString() {
        return "ClientError(reason=" + this.d + ")";
    }
}
