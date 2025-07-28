package defpackage;

import java.util.List;

/* renamed from: jed  reason: default package */
public final class jed implements zw8 {
    public final long a;
    public final String b;
    public final eu0 c;
    public final yt0 d;
    public final mge e;
    public final mge f;
    public final List g;

    public jed(long j, String str, eu0 eu0, yt0 yt0, hge hge, hge hge2, List list) {
        this.a = j;
        this.b = str;
        this.c = eu0;
        this.d = yt0;
        this.e = hge;
        this.f = hge2;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jed)) {
            return false;
        }
        jed jed = (jed) obj;
        return this.a == jed.a && hhd.f(this.b, jed.b) && hhd.f(this.c, jed.c) && hhd.f(this.d, jed.d) && hhd.f(this.e, jed.e) && hhd.f(this.f, jed.f) && hhd.f(this.g, jed.g);
    }

    public final int hashCode() {
        int e2 = c3d.e((this.d.hashCode() + ((this.c.hashCode() + me4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        mge mge = this.f;
        return this.g.hashCode() + ((e2 + (mge == null ? 0 : mge.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowShareContactForBotConfirmation(messageId=");
        sb.append(this.a);
        sb.append(", keyboardId=");
        sb.append(this.b);
        sb.append(", buttonPosition=");
        sb.append(this.c);
        sb.append(", button=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", buttons=");
        return hr1.i(sb, this.g, ")");
    }
}
