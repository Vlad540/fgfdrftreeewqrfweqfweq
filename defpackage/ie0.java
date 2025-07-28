package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: ie0  reason: default package */
public final class ie0 implements Iterable, z67 {
    public final ArrayDeque a = new ArrayDeque();
    public rgc b;

    public final vgc a() {
        return (vgc) this.a.peek();
    }

    public final vgc b() {
        vgc vgc = (vgc) this.a.pop();
        rgc rgc = this.b;
        if (rgc != null) {
            rgc.d();
        }
        vgc.a.destroy();
        return vgc;
    }

    public final Iterator c() {
        return o23.k0(this.a).iterator();
    }

    public final int getSize() {
        return this.a.size();
    }

    public final Iterator iterator() {
        return new u1(2, this.a.toArray(new vgc[0]));
    }
}
