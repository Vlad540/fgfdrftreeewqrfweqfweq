package defpackage;

import java.util.List;

/* renamed from: f19  reason: default package */
public final class f19 {
    public final long a;
    public final long b;
    public final long c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public f19(long j, long j2, long j3, List list, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f19)) {
            return false;
        }
        f19 f19 = (f19) obj;
        return this.a == f19.a && this.b == f19.b && this.c == f19.c && hhd.f(this.d, f19.d) && this.e == f19.e && this.f == f19.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + th2.f(c3d.f(this.d, sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesListWidgetArgs(chatId=");
        sb.append(this.a);
        sb.append(", loadMark=");
        sb.append(this.b);
        sb.append(", loadMessageId=");
        sb.append(this.c);
        sb.append(", highlights=");
        sb.append(this.d);
        sb.append(", shouldHighlightMessage=");
        sb.append(this.e);
        sb.append(", shouldSkipUnreadDecoration=");
        return hr1.j(sb, this.f, ")");
    }
}
