package defpackage;

/* renamed from: ep0  reason: default package */
public final class ep0 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public ep0(String str, long j, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep0)) {
            return false;
        }
        ep0 ep0 = (ep0) obj;
        return this.a == ep0.a && hhd.f(this.b, ep0.b) && hhd.f(this.c, ep0.c) && hhd.f(this.d, ep0.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int d2 = me4.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BotItem(botId=");
        sb.append(this.a);
        sb.append(", botTag=");
        sb.append(this.b);
        sb.append(", commandName=");
        sb.append(this.c);
        sb.append(", commandDescription=");
        return wn6.l(sb, this.d, ")");
    }
}
