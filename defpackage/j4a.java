package defpackage;

/* renamed from: j4a  reason: default package */
public final class j4a {
    public final long a;
    public final h97 b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final boolean f;
    public final jj7 g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4a(long j, h97 h97, Long l, Long l2, Long l3, boolean z, int i) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : h97, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) == 0 ? l3 : null, (i & 32) != 0 ? false : z, (jj7) null);
    }

    public final jj7 a() {
        return this.g;
    }

    public final Long b() {
        return this.e;
    }

    public final String c() {
        h97 h97 = this.b;
        if (h97 != null) {
            return h97.a;
        }
        return null;
    }

    public final boolean d() {
        return swb.B(this.b) && this.d == null && this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4a)) {
            return false;
        }
        j4a j4a = (j4a) obj;
        if (this.a != j4a.a) {
            return false;
        }
        h97 h97 = this.b;
        return ((swb.B(h97) && swb.B(j4a.b)) || hhd.f(h97, j4a.b)) && hhd.f(this.c, j4a.c) && hhd.f(this.d, j4a.d);
    }

    public final int hashCode() {
        int i = 0;
        h97 h97 = this.b;
        int m = sxe.m((h97 != null ? h97.hashCode() : 0) * 31, 31, this.a);
        Long l = this.c;
        int hashCode = (m + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.d;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OneMeDraft(cid=" + this.a + ", lastInputText=" + this.b + ", replyMessageId=" + this.c + ", editMessageId=" + this.d + ", serverTime=" + this.e + ", fromServer=" + this.f + ", attaches=" + this.g + ")";
    }

    public j4a(long j, h97 h97, Long l, Long l2, Long l3, boolean z, jj7 jj7) {
        this.a = j;
        this.b = h97;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = z;
        this.g = jj7;
    }
}
