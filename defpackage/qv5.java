package defpackage;

import java.util.Set;

/* renamed from: qv5  reason: default package */
public final class qv5 implements uv5 {
    public final Long a;
    public final Set b;
    public final Long c;
    public final boolean d;
    public final gv5 e;

    public qv5(Long l, Set set, Long l2, boolean z, gv5 gv5, int i) {
        set = (i & 2) != 0 ? null : set;
        l2 = (i & 4) != 0 ? null : l2;
        z = (i & 8) != 0 ? false : z;
        gv5 = (i & 16) != 0 ? null : gv5;
        this.a = l;
        this.b = set;
        this.c = l2;
        this.d = z;
        this.e = gv5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv5)) {
            return false;
        }
        qv5 qv5 = (qv5) obj;
        return hhd.f(this.a, qv5.a) && hhd.f(this.b, qv5.b) && hhd.f(this.c, qv5.c) && this.d == qv5.d && hhd.f(this.e, qv5.e);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Set set = this.b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Long l2 = this.c;
        int f = th2.f((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d);
        gv5 gv5 = this.e;
        if (gv5 != null) {
            i = gv5.hashCode();
        }
        return f + i;
    }

    public final String toString() {
        return "ClosePicker(destinationId=" + this.a + ", fwdMsgIds=" + this.b + ", fwdAttachId=" + this.c + ", isForwardAttach=" + this.d + ", inAppReviewData=" + this.e + ")";
    }
}
