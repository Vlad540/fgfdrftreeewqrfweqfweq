package defpackage;

import java.util.List;

/* renamed from: nj  reason: default package */
public final class nj {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;

    public nj(long j, String str, String str2, String str3, long j2, List list) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj)) {
            return false;
        }
        nj njVar = (nj) obj;
        return this.a == njVar.a && hhd.f(this.b, njVar.b) && hhd.f(this.c, njVar.c) && hhd.f(this.d, njVar.d) && this.e == njVar.e && hhd.f(this.f, njVar.f);
    }

    public final int hashCode() {
        int d2 = me4.d(me4.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + sxe.m((d2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimojiSetEntity(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", iconLottieUrl=");
        sb.append(this.d);
        sb.append(", updateTime=");
        sb.append(this.e);
        sb.append(", animojiIds=");
        return hr1.i(sb, this.f, ")");
    }
}
