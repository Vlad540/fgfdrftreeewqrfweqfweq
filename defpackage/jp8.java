package defpackage;

import java.util.List;

/* renamed from: jp8  reason: default package */
public final class jp8 {
    public final int A;
    public final long B;
    public final int C;
    public final int D;
    public final long E;
    public final List F;
    public final yr8 G;
    public final Long H;
    public final Boolean I;
    public final int J;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final bp8 h;
    public final ls8 i;
    public final long j;
    public final String k;
    public final String l;
    public final jj7 m;
    public final int n;
    public final boolean o;
    public final int p;
    public final long q;
    public final boolean r;
    public final long s;
    public final String t;
    public final String u;
    public final long v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    public jp8(long j2, long j3, long j4, long j5, long j6, long j7, String str, bp8 bp8, ls8 ls8, long j8, String str2, String str3, jj7 jj7, int i2, boolean z2, int i3, long j9, boolean z3, long j10, String str4, String str5, long j11, long j12, int i4, long j13, int i5, int i6, int i7, long j14, int i8, int i9, long j15, List list, yr8 yr8, Long l2, Boolean bool) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = str;
        this.h = bp8;
        this.i = ls8;
        this.j = j8;
        this.k = str2;
        this.l = str3;
        this.m = jj7;
        this.n = i2;
        this.o = z2;
        this.p = i3;
        this.q = j9;
        this.r = z3;
        this.s = j10;
        this.t = str4;
        this.u = str5;
        this.v = j11;
        this.w = j12;
        this.J = i4;
        this.x = j13;
        this.y = i5;
        this.z = i6;
        this.A = i7;
        this.B = j14;
        this.C = i8;
        this.D = i9;
        this.E = j15;
        this.F = list;
        this.G = yr8;
        this.H = l2;
        this.I = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp8)) {
            return false;
        }
        jp8 jp8 = (jp8) obj;
        return this.a == jp8.a && this.b == jp8.b && this.c == jp8.c && this.d == jp8.d && this.e == jp8.e && this.f == jp8.f && hhd.f(this.g, jp8.g) && this.h == jp8.h && this.i == jp8.i && this.j == jp8.j && hhd.f(this.k, jp8.k) && hhd.f(this.l, jp8.l) && hhd.f(this.m, jp8.m) && this.n == jp8.n && this.o == jp8.o && this.p == jp8.p && this.q == jp8.q && this.r == jp8.r && this.s == jp8.s && hhd.f(this.t, jp8.t) && hhd.f(this.u, jp8.u) && this.v == jp8.v && this.w == jp8.w && this.J == jp8.J && this.x == jp8.x && this.y == jp8.y && this.z == jp8.z && this.A == jp8.A && this.B == jp8.B && this.C == jp8.C && this.D == jp8.D && this.E == jp8.E && hhd.f(this.F, jp8.F) && hhd.f(this.G, jp8.G) && hhd.f(this.H, jp8.H) && hhd.f(this.I, jp8.I);
    }

    public final int hashCode() {
        int m2 = sxe.m(sxe.m(sxe.m(sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        int i2 = 0;
        String str = this.g;
        int m3 = sxe.m((this.i.hashCode() + ((this.h.hashCode() + ((m2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.j);
        String str2 = this.k;
        int hashCode = (m3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        jj7 jj7 = this.m;
        int m4 = sxe.m(th2.f(sxe.m(c3d.d(this.p, th2.f(c3d.d(this.n, (hashCode2 + (jj7 == null ? 0 : jj7.hashCode())) * 31, 31), 31, this.o), 31), 31, this.q), 31, this.r), 31, this.s);
        String str4 = this.t;
        int hashCode3 = (m4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.u;
        int f2 = c3d.f(this.F, sxe.m(c3d.d(this.D, c3d.d(this.C, sxe.m(c3d.d(this.A, c3d.d(this.z, c3d.d(this.y, sxe.m(us8.h(this.J, sxe.m(sxe.m((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.v), 31, this.w), 31), 31, this.x), 31), 31), 31), 31, this.B), 31), 31), 31, this.E), 31);
        yr8 yr8 = this.G;
        int hashCode4 = (f2 + (yr8 == null ? 0 : yr8.hashCode())) * 31;
        Long l2 = this.H;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.I;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "MessageEntity(id=" + this.a + ", serverId=" + this.b + ", time=" + this.c + ", updateTime=" + this.d + ", sender=" + this.e + ", cid=" + this.f + ", text=" + this.g + ", deliveryStatus=" + this.h + ", status=" + this.i + ", timeLocal=" + this.j + ", error=" + this.k + ", localizedError=" + this.l + ", attaches=" + this.m + ", mediaType=" + this.n + ", detectShare=" + this.o + ", messagesLinkType=" + this.p + ", messagesLinkId=" + this.q + ", insertedFromMessageLink=" + this.r + ", messagesLinkChatId=" + this.s + ", messageLinkChatName=" + this.t + ", messageLinkChatLink=" + this.u + ", messageLinkOutChatId=" + this.v + ", messageLinkOutMessageId=" + this.w + ", type=" + us8.o(this.J) + ", chatId=" + this.x + ", ttl=" + this.y + ", channelViews=" + this.z + ", channelForwards=" + this.A + ", viewTime=" + this.B + ", zoom=" + this.C + ", options=" + this.D + ", liveUntil=" + this.E + ", elements=" + this.F + ", reactions=" + this.G + ", timeToFire=" + this.H + ", notifySender=" + this.I + ")";
    }
}
