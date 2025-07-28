package defpackage;

import java.util.Iterator;

/* renamed from: wre  reason: default package */
public final class wre extends ure {
    public final Iterator b;

    public wre(lf5 lf5, Object obj) {
        super(obj);
        dyc dyc = (dyc) lf5.X.b.invoke(obj);
        this.b = dyc != null ? dyc.iterator() : null;
    }

    public final Object a() {
        Iterator it = this.b;
        if (it == null || !it.hasNext()) {
            return null;
        }
        return it.next();
    }
}
