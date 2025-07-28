package defpackage;

import java.util.List;

/* renamed from: jt  reason: default package */
public final class jt extends kh0 {
    public final int b;
    public final List c;

    public jt(int i, long j, List list) {
        super(j);
        this.b = i;
        this.c = list;
    }

    public final String toString() {
        return "AssetsGetByIdsEvent{type=" + hr1.u(this.b) + ", ids=" + this.c + '}';
    }
}
