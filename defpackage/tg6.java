package defpackage;

/* renamed from: tg6  reason: default package */
public final class tg6 implements wg6 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;

    public tg6(String str, long j, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg6)) {
            return false;
        }
        tg6 tg6 = (tg6) obj;
        return hhd.f(this.a, tg6.a) && this.b == tg6.b && hhd.f(this.c, tg6.c) && hhd.f(this.d, tg6.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + me4.f(this.c, sxe.m(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link(link=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", chatName=");
        sb.append(this.c);
        sb.append(", conversationId=");
        return wn6.l(sb, this.d, ")");
    }
}
