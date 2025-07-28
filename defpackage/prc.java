package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: prc  reason: default package */
public final class prc implements Serializable, Comparable {
    public final tf3 X;
    public final ym8 Y;
    public final long Z;
    public final int a;
    public final String b;
    public final List c;
    public final i22 o;
    public final yib w0;

    public prc(int i, String str, List list, i22 i22, tf3 tf3, ym8 ym8, long j, yib yib) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.o = i22;
        this.X = tf3;
        this.Y = ym8;
        this.Z = j;
        this.w0 = yib;
    }

    public final int compareTo(Object obj) {
        prc prc = (prc) obj;
        if (prc == null) {
            return 0;
        }
        i22 i22 = this.o;
        i22 i222 = prc.o;
        return (i22 == null || i222 == null) ? (i22 == null || i222 != null) ? 0 : -1 : Long.compare(i222.l(), i22.l());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResult{type=");
        sb.append(m4b.l(this.a));
        sb.append(", feedback='");
        sb.append(this.b);
        sb.append("', highlights=");
        sb.append(this.c.size());
        sb.append(", chat=");
        sb.append(this.o);
        sb.append(", contact=");
        sb.append(this.X);
        sb.append(", message=");
        sb.append(this.Y);
        sb.append(", chatId=");
        return m4b.i(sb, this.Z, '}');
    }
}
