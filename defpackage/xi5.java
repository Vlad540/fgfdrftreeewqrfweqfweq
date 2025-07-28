package defpackage;

import java.util.Iterator;

/* renamed from: xi5  reason: default package */
public final class xi5 implements dyc {
    public final dyc a;
    public final u16 b;
    public final u16 c;

    public xi5(dyc dyc, u16 u16, u16 u162) {
        this.a = dyc;
        this.b = u16;
        this.c = u162;
    }

    public final Iterator iterator() {
        return new rg5(this);
    }
}
