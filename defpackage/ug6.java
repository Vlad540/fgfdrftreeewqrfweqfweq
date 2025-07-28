package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ug6  reason: default package */
public final class ug6 implements wg6 {
    public final long a;
    public final long b;
    public final List c;

    public ug6(long j, long j2, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug6)) {
            return false;
        }
        ug6 ug6 = (ug6) obj;
        return this.a == ug6.a && this.b == ug6.b && hhd.f(this.c, ug6.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + sxe.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneToOne(opponentId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messagesIds=");
        return hr1.i(sb, this.c, ")");
    }
}
