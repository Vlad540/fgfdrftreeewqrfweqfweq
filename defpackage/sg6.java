package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sg6  reason: default package */
public final class sg6 implements wg6 {
    public final long a;
    public final long b;
    public final boolean c;
    public final List d;
    public final String e;

    public sg6(long j, long j2, boolean z, ArrayList arrayList, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = arrayList;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg6)) {
            return false;
        }
        sg6 sg6 = (sg6) obj;
        return this.a == sg6.a && this.b == sg6.b && this.c == sg6.c && hhd.f(this.d, sg6.d) && hhd.f(this.e, sg6.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + c3d.f(this.d, th2.f(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Group(chatServerId=");
        sb.append(this.a);
        sb.append(", chatLocalId=");
        sb.append(this.b);
        sb.append(", isGroupCallAvailable=");
        sb.append(this.c);
        sb.append(", messagesIds=");
        sb.append(this.d);
        sb.append(", link=");
        return wn6.l(sb, this.e, ")");
    }
}
