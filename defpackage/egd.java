package defpackage;

/* renamed from: egd  reason: default package */
public final class egd {
    public final ge1 a;
    public final String b;

    public egd(ge1 ge1, String str) {
        this.a = ge1;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egd)) {
            return false;
        }
        egd egd = (egd) obj;
        return hhd.f(this.a, egd.a) && hhd.f(this.b, egd.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ")";
    }
}
