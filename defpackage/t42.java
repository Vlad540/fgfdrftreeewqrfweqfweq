package defpackage;

/* renamed from: t42  reason: default package */
public final class t42 extends kh0 {
    public final /* synthetic */ int b = 1;
    public final long c;

    public t42(long j) {
        this.c = j;
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "ChatComplainEvent{chatId=" + this.c + "} " + super.toString();
            default:
                return m4b.i(new StringBuilder("ReadMarkEvent{chatId="), this.c, '}');
        }
    }

    public t42(long j, long j2) {
        super(j);
        this.c = j2;
    }
}
