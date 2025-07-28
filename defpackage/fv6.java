package defpackage;

/* renamed from: fv6  reason: default package */
public final class fv6 {
    public final ge1 a;
    public final String b;
    public final boolean c;

    public fv6(ge1 ge1, String str, boolean z) {
        this.a = ge1;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv6)) {
            return false;
        }
        fv6 fv6 = (fv6) obj;
        return hhd.f(this.a, fv6.a) && hhd.f(this.b, fv6.b) && this.c == fv6.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + me4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InboundMessage(senderId=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", isDirect=");
        return hr1.j(sb, this.c, ")");
    }
}
