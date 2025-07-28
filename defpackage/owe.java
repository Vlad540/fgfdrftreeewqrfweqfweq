package defpackage;

/* renamed from: owe  reason: default package */
public final class owe {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;

    public owe(long j, String str, String str2, long j2, long j3, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = j3;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owe)) {
            return false;
        }
        owe owe = (owe) obj;
        return this.a == owe.a && hhd.f(this.b, owe.b) && hhd.f(this.c, owe.c) && this.d == owe.d && this.e == owe.e && hhd.f(this.f, owe.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + sxe.m(sxe.m(me4.d(me4.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Input(requestId=");
        sb.append(this.a);
        sb.append(", externalUrl=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", messageId=");
        sb.append(this.d);
        sb.append(", chatId=");
        sb.append(this.e);
        sb.append(", stickerId=");
        return wn6.l(sb, this.f, ")");
    }
}
