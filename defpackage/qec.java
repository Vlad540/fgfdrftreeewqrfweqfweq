package defpackage;

/* renamed from: qec  reason: default package */
public final class qec {
    public final ge1 a;
    public final String b;
    public final w2d c;

    public qec(ge1 ge1, String str, w2d w2d) {
        this.a = ge1;
        this.b = str;
        this.c = w2d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qec)) {
            return false;
        }
        qec qec = (qec) obj;
        return hhd.f(this.a, qec.a) && hhd.f(this.b, qec.b) && hhd.f(this.c, qec.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "RoomSignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ", roomId=" + this.c + ")";
    }
}
