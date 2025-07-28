package defpackage;

import java.util.List;

/* renamed from: qa  reason: default package */
public final class qa {
    public static final qa c = new qa(mge.a, hw4.a);
    public final mge a;
    public final List b;

    public qa(mge mge, List list) {
        this.a = mge;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        return hhd.f(this.a, qaVar.a) && hhd.f(this.b, qaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdminWaitingRoomState(subtitle=" + this.a + ", list=" + this.b + ")";
    }
}
