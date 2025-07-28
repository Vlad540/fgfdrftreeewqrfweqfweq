package defpackage;

/* renamed from: on1  reason: default package */
public final class on1 extends kh0 {
    public final long b;
    public final String c;

    public on1(long j, String str) {
        this.b = j;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallbackAnswerEvent{chatId=");
        sb.append(this.b);
        sb.append("text=");
        return me4.l(sb, this.c, '}');
    }
}
