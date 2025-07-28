package defpackage;

import java.util.List;

/* renamed from: gj1  reason: default package */
public final class gj1 {
    public final v2d a;
    public final String b;
    public final boolean c;
    public final List d;
    public final int e;
    public final ge1 f;
    public final Long g;

    public gj1(int i, ge1 ge1, v2d v2d, Long l, String str, List list, boolean z) {
        this.a = v2d;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = i;
        this.f = ge1;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj1)) {
            return false;
        }
        gj1 gj1 = (gj1) obj;
        return hhd.f(this.a, gj1.a) && hhd.f(this.b, gj1.b) && this.c == gj1.c && hhd.f(this.d, gj1.d) && this.e == gj1.e && hhd.f(this.f, gj1.f) && hhd.f(this.g, gj1.g);
    }

    public final int hashCode() {
        int f2 = th2.f(me4.d(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        List list = this.d;
        int a2 = am7.a(this.e, (f2 + (list == null ? 0 : list.hashCode())) * 31);
        ge1 ge1 = this.f;
        int hashCode = (a2 + (ge1 == null ? 0 : ge1.hashCode())) * 31;
        Long l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CallSessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantIds=" + this.d + ", participantCount=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
