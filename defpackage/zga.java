package defpackage;

/* renamed from: zga  reason: default package */
public final class zga {
    public final int a;
    public final long b;
    public final long c;

    public zga(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutgoingMessageLink{type=");
        sb.append(wn6.q(this.a));
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        return wn6.k(sb, this.c, "}");
    }
}
