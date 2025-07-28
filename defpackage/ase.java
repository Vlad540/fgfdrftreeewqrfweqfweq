package defpackage;

import java.util.Iterator;

/* renamed from: ase  reason: default package */
public final class ase implements dyc {
    public final Object a;
    public final u16 b;
    public final int c = 1;
    public final u16 d;
    public final u16 e;
    public final i26 f;
    public final int g;

    public ase(Object obj, u16 u16, u16 u162) {
        this.a = obj;
        this.b = u16;
        this.d = u162;
        this.e = null;
        this.f = null;
        this.g = Integer.MAX_VALUE;
    }

    public final Iterator iterator() {
        return new lf5(this);
    }
}
