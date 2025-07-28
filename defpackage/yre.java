package defpackage;

import java.util.Iterator;

/* renamed from: yre  reason: default package */
public final class yre extends ure {
    public boolean b;
    public Iterator c;
    public final /* synthetic */ lf5 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yre(lf5 lf5, Object obj) {
        super(obj);
        this.d = lf5;
        dyc dyc = lf5.X;
    }

    public final Object a() {
        i26 i26;
        boolean z = this.b;
        lf5 lf5 = this.d;
        Object obj = this.a;
        if (!z) {
            u16 u16 = lf5.X.d;
            if (u16 != null && !((Boolean) u16.invoke(obj)).booleanValue()) {
                return null;
            }
            this.b = true;
            return obj;
        }
        Iterator it = this.c;
        if (it == null || it.hasNext()) {
            if (this.c == null) {
                dyc dyc = (dyc) lf5.X.b.invoke(obj);
                Iterator it2 = dyc != null ? dyc.iterator() : null;
                this.c = it2;
                if (it2 == null && (i26 = lf5.X.f) != null) {
                    i26.invoke(obj, new IllegalStateException("Cannot list leafs of " + obj));
                }
                Iterator it3 = this.c;
                if (it3 == null || !it3.hasNext()) {
                    u16 u162 = lf5.X.e;
                    if (u162 != null) {
                        u162.invoke(obj);
                    }
                    return null;
                }
            }
            return this.c.next();
        }
        u16 u163 = lf5.X.e;
        if (u163 == null) {
            return null;
        }
        u163.invoke(obj);
        return null;
    }
}
