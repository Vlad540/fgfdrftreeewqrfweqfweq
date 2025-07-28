package defpackage;

/* renamed from: s92  reason: default package */
public final class s92 extends kh0 {
    public final String b;
    public final long c;
    public final int o;

    public s92(int i, long j, long j2, String str) {
        super(j);
        this.b = str;
        this.c = j2;
        this.o = i;
    }

    public final String toString() {
        return "ChatJoinEvent{link='" + this.b + "', chatId=" + this.c + ", type=" + th2.p(this.o) + '}' + super.toString();
    }
}
