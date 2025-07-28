package defpackage;

import java.util.List;

/* renamed from: li2  reason: default package */
public final class li2 extends kh0 {
    public final int X;
    public final String b;
    public final List c;
    public final long o;

    public li2(long j, String str, List list, long j2, int i) {
        super(j);
        this.b = str;
        this.c = list;
        this.o = j2;
        this.X = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMessageSearchResultEvent{query='");
        sb.append(this.b);
        sb.append("', results=");
        sb.append(this.c);
        sb.append(", marker=");
        sb.append(this.o);
        sb.append(", total=");
        return hr1.h(sb, this.X, '}');
    }
}
