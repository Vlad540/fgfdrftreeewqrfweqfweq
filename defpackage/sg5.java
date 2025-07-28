package defpackage;

import java.util.Iterator;

/* renamed from: sg5  reason: default package */
public final class sg5 implements dyc {
    public final dyc a;
    public final boolean b;
    public final u16 c;

    public sg5(dyc dyc, boolean z, u16 u16) {
        this.a = dyc;
        this.b = z;
        this.c = u16;
    }

    public final Iterator iterator() {
        return new rg5(this);
    }
}
