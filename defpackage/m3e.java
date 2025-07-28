package defpackage;

import java.util.List;

/* renamed from: m3e  reason: default package */
public final class m3e {
    public static final m3e g = new m3e((String) null, 0, 0, hw4.a);
    public final String a;
    public final int b;
    public final int c;
    public final List d;
    public final int e;
    public final boolean f;

    public m3e(String str, int i, int i2, List list) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = list.size();
        this.f = list.size() < i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3e)) {
            return false;
        }
        m3e m3e = (m3e) obj;
        return hhd.f(this.a, m3e.a) && this.b == m3e.b && this.c == m3e.c && hhd.f(this.d, m3e.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + c3d.d(this.c, c3d.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestsResult(query=");
        sb.append(this.a);
        sb.append(", cursorPosition=");
        sb.append(this.b);
        sb.append(", totalCount=");
        sb.append(this.c);
        sb.append(", result=");
        return hr1.i(sb, this.d, ")");
    }
}
