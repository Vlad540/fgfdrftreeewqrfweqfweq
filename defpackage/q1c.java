package defpackage;

/* renamed from: q1c  reason: default package */
public final class q1c extends d8 {
    public final CharSequence f;

    public q1c(String str) {
        super(16);
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1c) && hhd.f(this.f, ((q1c) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Name(name=" + this.f + ")";
    }
}
