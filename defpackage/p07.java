package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: p07  reason: default package */
public final class p07 extends n07 {
    public final q07 b;
    public final WeakReference c;

    public p07(q07 q07, n07 n07) {
        super(n07.a);
        this.b = q07;
        this.c = new WeakReference(n07);
    }

    public final void a(Set set) {
        n07 n07 = (n07) this.c.get();
        if (n07 == null) {
            this.b.c(this);
        } else {
            n07.a(set);
        }
    }
}
