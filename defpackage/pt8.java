package defpackage;

import java.util.Set;

/* renamed from: pt8  reason: default package */
public final class pt8 {
    public final Set a;
    public final Long b;
    public final boolean c;
    public final rt8 d;
    public final tt8 e;

    public pt8(Set set, Long l, boolean z, rt8 rt8, tt8 tt8) {
        this.a = set;
        this.b = l;
        this.c = z;
        this.d = rt8;
        this.e = tt8;
    }

    public final jv5 a() {
        rt8 rt8 = this.d;
        return new jv5(this.a, this.b, this.c, rt8 != null ? rt8.a : null, this.e.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt8)) {
            return false;
        }
        pt8 pt8 = (pt8) obj;
        return hhd.f(this.a, pt8.a) && hhd.f(this.b, pt8.b) && this.c == pt8.c && hhd.f(this.d, pt8.d) && hhd.f(this.e, pt8.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        Long l = this.b;
        int f = th2.f((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        rt8 rt8 = this.d;
        if (rt8 != null) {
            i = rt8.hashCode();
        }
        return this.e.hashCode() + ((f + i) * 31);
    }

    public final String toString() {
        return "ForwardMessagesData(messageIds=" + this.a + ", fwdAttachId=" + this.b + ", isForwardAttach=" + this.c + ", inputData=" + this.d + ", quoteData=" + this.e + ")";
    }
}
