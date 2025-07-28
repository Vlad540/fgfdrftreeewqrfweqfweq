package defpackage;

import java.util.List;

/* renamed from: or8  reason: default package */
public final class or8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;
    public final yr8 j;
    public final int k;
    public final long l;
    public final boolean m;
    public final long n;
    public final String o;
    public final String p;
    public final ls8 q;
    public final int r;
    public final int s;
    public final long t;
    public final int u;
    public final int v;
    public final long w;
    public final Long x;
    public final Boolean y;

    public or8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, String str, List list, yr8 yr8, int i2, long j9, boolean z, long j10, String str2, String str3, ls8 ls8, int i3, int i4, long j11, int i5, int i6, long j12, Long l2, Boolean bool) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = j8;
        this.h = str;
        this.i = list;
        this.j = yr8;
        this.k = i2;
        this.l = j9;
        this.m = z;
        this.n = j10;
        this.o = str2;
        this.p = str3;
        this.q = ls8;
        this.r = i3;
        this.s = i4;
        this.t = j11;
        this.u = i5;
        this.v = i6;
        this.w = j12;
        this.x = l2;
        this.y = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or8)) {
            return false;
        }
        or8 or8 = (or8) obj;
        return this.a == or8.a && this.b == or8.b && this.c == or8.c && this.d == or8.d && this.e == or8.e && this.f == or8.f && this.g == or8.g && hhd.f(this.h, or8.h) && hhd.f(this.i, or8.i) && hhd.f(this.j, or8.j) && this.k == or8.k && this.l == or8.l && this.m == or8.m && this.n == or8.n && hhd.f(this.o, or8.o) && hhd.f(this.p, or8.p) && this.q == or8.q && this.r == or8.r && this.s == or8.s && this.t == or8.t && this.u == or8.u && this.v == or8.v && this.w == or8.w && hhd.f(this.x, or8.x) && hhd.f(this.y, or8.y);
    }

    public final int hashCode() {
        int m2 = sxe.m(sxe.m(sxe.m(sxe.m(sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        int i2 = 0;
        String str = this.h;
        int f2 = c3d.f(this.i, (m2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        yr8 yr8 = this.j;
        int m3 = sxe.m(th2.f(sxe.m(c3d.d(this.k, (f2 + (yr8 == null ? 0 : yr8.hashCode())) * 31, 31), 31, this.l), 31, this.m), 31, this.n);
        String str2 = this.o;
        int hashCode = (m3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        int m4 = sxe.m(c3d.d(this.v, c3d.d(this.u, sxe.m(c3d.d(this.s, us8.h(this.r, (this.q.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31), 31), 31, this.t), 31), 31), 31, this.w);
        Long l2 = this.x;
        int hashCode2 = (m4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.y;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MessagePartEntity(id=" + this.a + ", serverId=" + this.b + ", time=" + this.c + ", chatId=" + this.d + ", updateTime=" + this.e + ", sender=" + this.f + ", cid=" + this.g + ", text=" + this.h + ", elements=" + this.i + ", reactions=" + this.j + ", messagesLinkType=" + this.k + ", messagesLinkId=" + this.l + ", insertedFromMessageLink=" + this.m + ", messagesLinkChatId=" + this.n + ", messageLinkChatName=" + this.o + ", messageLinkChatLink=" + this.p + ", status=" + this.q + ", type=" + us8.o(this.r) + ", ttl=" + this.s + ", viewTime=" + this.t + ", zoom=" + this.u + ", options=" + this.v + ", liveUntil=" + this.w + ", timeToFire=" + this.x + ", notifySender=" + this.y + ")";
    }
}
