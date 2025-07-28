package defpackage;

import java.util.Iterator;

/* renamed from: t27  reason: default package */
public final class t27 extends ro5 {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ u1b b;

    public t27(Iterable iterable, u1b u1b) {
        this.a = iterable;
        this.b = u1b;
    }

    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        u1b u1b = this.b;
        u1b.getClass();
        return new u27(it, u1b);
    }
}
