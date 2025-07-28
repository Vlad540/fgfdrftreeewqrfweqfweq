package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: l89  reason: default package */
public final class l89 extends kh0 {
    public final List X;
    public final md4 Y;
    public final long b;
    public final long c;
    public final long o;

    public l89(long j, List list, md4 md4) {
        this.b = j;
        this.Y = md4;
        this.c = 0;
        this.o = 0;
        this.X = list;
    }

    public final String toString() {
        return "MsgDeleteEvent{chatId=" + this.b + ", startTime=" + this.c + ", endTime=" + this.o + ", messageIds=" + this.X.size() + ", itemType=" + this.Y + '}';
    }

    public l89(long j, long j2, long j3, md4 md4) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = new ArrayList();
        this.Y = md4;
    }
}
