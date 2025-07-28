package defpackage;

import java.util.List;

/* renamed from: q2d  reason: default package */
public final class q2d {
    public final v2d a;
    public final String b;
    public final boolean c;
    public final int d;
    public final List e;
    public final ge1 f;
    public final Long g;

    public q2d(int i, ge1 ge1, v2d v2d, Long l, String str, List list, boolean z) {
        this.a = v2d;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = list;
        this.f = ge1;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2d)) {
            return false;
        }
        q2d q2d = (q2d) obj;
        return hhd.f(this.a, q2d.a) && hhd.f(this.b, q2d.b) && this.c == q2d.c && this.d == q2d.d && hhd.f(this.e, q2d.e) && hhd.f(this.f, q2d.f) && hhd.f(this.g, q2d.g);
    }

    public final int hashCode() {
        int a2 = am7.a(this.d, th2.f(me4.d(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c));
        int i = 0;
        List list = this.e;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        ge1 ge1 = this.f;
        int hashCode2 = (hashCode + (ge1 == null ? 0 : ge1.hashCode())) * 31;
        Long l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantCount=" + this.d + ", participantIds=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
