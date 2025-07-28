package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: u89  reason: default package */
public final class u89 extends kh0 {
    public final List X;
    public final long b;
    public final List c;
    public final List o;

    public u89(long j, long j2, ArrayList arrayList, List list, List list2) {
        super(j);
        this.b = j2;
        this.c = arrayList;
        this.o = list;
        this.X = list2;
    }

    public final String toString() {
        return "MsgGetEvent{serverChatId=" + this.b + ", serverMessageIds=" + this.c + ", messages=" + this.o + ", requestedMessageIds=" + this.X + '}';
    }
}
