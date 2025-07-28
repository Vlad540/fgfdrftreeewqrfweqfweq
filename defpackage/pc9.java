package defpackage;

/* renamed from: pc9  reason: default package */
public final class pc9 {
    public final oc9 a;
    public final boolean b;

    public pc9(oc9 oc9, boolean z) {
        this.a = oc9;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc9)) {
            return false;
        }
        pc9 pc9 = (pc9) obj;
        return hhd.f(this.a, pc9.a) && this.b == pc9.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MuteState(muteEvent=" + this.a + ", isForAll=" + this.b + ")";
    }
}
