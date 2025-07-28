package defpackage;

/* renamed from: lte  reason: default package */
public final class lte extends kh0 {
    public final long b;
    public final String c;

    public lte(long j, String str) {
        this.b = j;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypingEvent{chatId=");
        sb.append(this.b);
        sb.append(", text='");
        return wn6.l(sb, this.c, "'}");
    }
}
