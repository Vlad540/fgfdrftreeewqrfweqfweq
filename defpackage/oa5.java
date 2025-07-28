package defpackage;

/* renamed from: oa5  reason: default package */
public final class oa5 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final Long e;
    public final long f;
    public final Long g;
    public final String h;
    public final long i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;

    public oa5(long j2, long j3, long j4, int i2, Long l2, long j5, Long l3, String str, long j6, long j7, String str2, long j8, long j9) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = i2;
        this.e = l2;
        this.f = j5;
        this.g = l3;
        this.h = str;
        this.i = j6;
        this.j = j7;
        this.k = str2;
        this.l = j8;
        this.m = j9;
    }

    public static oa5 a(oa5 oa5) {
        oa5 oa52 = oa5;
        return new oa5(oa52.a, oa52.b, oa52.c, 3, oa52.e, oa52.f, oa52.g, oa52.h, oa52.i, oa52.j, oa52.k, oa52.l, oa52.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa5)) {
            return false;
        }
        oa5 oa5 = (oa5) obj;
        return this.a == oa5.a && this.b == oa5.b && this.c == oa5.c && this.d == oa5.d && hhd.f(this.e, oa5.e) && this.f == oa5.f && hhd.f(this.g, oa5.g) && hhd.f(this.h, oa5.h) && this.i == oa5.i && this.j == oa5.j && hhd.f(this.k, oa5.k) && this.l == oa5.l && this.m == oa5.m;
    }

    public final int hashCode() {
        int h2 = us8.h(this.d, sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        int i2 = 0;
        Long l2 = this.e;
        int m2 = sxe.m((h2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f);
        Long l3 = this.g;
        int hashCode = (m2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.h;
        if (str != null) {
            i2 = str.hashCode();
        }
        return Long.hashCode(this.m) + sxe.m(me4.d(sxe.m(sxe.m((hashCode + i2) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FcmAnalyticsEntryDb(pushId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", analyticsStatus=");
        int i2 = this.d;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "SENT" : "NOT_SENT" : "UNDEFINED");
        sb.append(", senderUserId=");
        sb.append(this.e);
        sb.append(", contentLength=");
        sb.append(this.f);
        sb.append(", sentTime=");
        sb.append(this.g);
        sb.append(", eventKey=");
        sb.append(this.h);
        sb.append(", fcmSentTime=");
        sb.append(this.i);
        sb.append(", receivedTime=");
        sb.append(this.j);
        sb.append(", pushType=");
        sb.append(this.k);
        sb.append(", time=");
        sb.append(this.l);
        sb.append(", createdTime=");
        return wn6.k(sb, this.m, ")");
    }
}
