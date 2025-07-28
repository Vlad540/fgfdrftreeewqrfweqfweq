package defpackage;

import java.util.Iterator;

/* renamed from: vqe  reason: default package */
public final class vqe implements dyc {
    public final dyc a;
    public final u16 b;

    public vqe(dyc dyc, u16 u16) {
        this.a = dyc;
        this.b = u16;
    }

    public final Iterator iterator() {
        return new uqe(this);
    }
}
