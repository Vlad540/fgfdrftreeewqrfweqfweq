package defpackage;

/* renamed from: c50  reason: default package */
public final class c50 extends kh0 {
    public final long b;
    public final int c;
    public final long o;

    public c50(int i, long j, long j2) {
        this.c = i;
        this.b = j;
        this.o = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaybackEvent{type=");
        sb.append(this.c);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", chatId=");
        return m4b.i(sb, this.o, '}');
    }
}
