package defpackage;

/* renamed from: ffa  reason: default package */
public final class ffa extends sg9 {
    public final long b;
    public final boolean c;
    public final String d;

    public ffa(long j, String str, boolean z) {
        super(jue.a);
        this.b = j;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffa)) {
            return false;
        }
        ffa ffa = (ffa) obj;
        return this.b == ffa.b && this.c == ffa.c && hhd.f(this.d, ffa.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + th2.f(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenChatCall(chatId=");
        sb.append(this.b);
        sb.append(", isVideo=");
        sb.append(this.c);
        sb.append(", link=");
        return wn6.l(sb, this.d, ")");
    }
}
