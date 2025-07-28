package defpackage;

import java.util.List;

/* renamed from: ik3  reason: default package */
public final class ik3 extends kh0 {
    public final List X;
    public final ln3 b;
    public final int c;
    public final int o = 40;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ik3(int i, long j, List list) {
        super(j);
        ln3 ln3 = ln3.BLOCKED;
        this.b = ln3;
        this.c = i;
        this.X = list;
    }

    public final String toString() {
        return "ContactListEvent{status=" + this.b + ", from=" + this.c + ", count=" + this.o + ", contactIds=" + this.X + '}';
    }
}
