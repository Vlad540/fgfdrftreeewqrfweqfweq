package defpackage;

import java.util.Iterator;
import ru.ok.android.externcalls.sdk.u;

/* renamed from: q27  reason: default package */
public final class q27 implements Iterator {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ r27 b;

    public q27(r27 r27, Iterator it) {
        this.b = r27;
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        Object next = this.a.next();
        ((u) this.b.c).getClass();
        return u.a(next);
    }
}
