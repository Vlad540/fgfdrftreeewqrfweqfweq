package defpackage;

import java.util.Iterator;

/* renamed from: vre  reason: default package */
public final class vre extends ure {
    public boolean b;
    public Iterator c;
    public boolean d;
    public final /* synthetic */ lf5 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vre(lf5 lf5, Object obj) {
        super(obj);
        this.e = lf5;
        dyc dyc = lf5.X;
    }

    public final Object a() {
        boolean z = this.d;
        lf5 lf5 = this.e;
        Object obj = this.a;
        if (!z && this.c == null) {
            u16 u16 = lf5.X.d;
            if (u16 != null && !((Boolean) u16.invoke(obj)).booleanValue()) {
                return null;
            }
            dyc dyc = (dyc) lf5.X.b.invoke(obj);
            Iterator it = dyc != null ? dyc.iterator() : null;
            this.c = it;
            if (it == null) {
                i26 i26 = lf5.X.f;
                if (i26 != null) {
                    i26.invoke(obj, new IllegalStateException("Cannot list leafs of " + obj));
                }
                this.d = true;
            }
        }
        Iterator it2 = this.c;
        if (it2 != null && it2.hasNext()) {
            return this.c.next();
        }
        if (!this.b) {
            this.b = true;
            return obj;
        }
        u16 u162 = lf5.X.e;
        if (u162 == null) {
            return null;
        }
        u162.invoke(obj);
        return null;
    }
}
