package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: yr  reason: default package */
public final class yr extends kgd implements Map {
    public vr X;
    public xr Y;
    public tr o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yr(kgd kgd) {
        super(0);
        int i = kgd.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kgd.f(i2), kgd.i(i2));
            }
        } else if (i > 0) {
            cs.P(0, 0, i, kgd.a, this.a);
            cs.Q(0, 0, i << 1, kgd.b, this.b);
            this.c = i;
        }
    }

    public final Set entrySet() {
        tr trVar = this.o;
        if (trVar != null) {
            return trVar;
        }
        tr trVar2 = new tr(this);
        this.o = trVar2;
        return trVar2;
    }

    public final boolean j(Collection collection) {
        for (Object containsKey : collection) {
            if (!super.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.c;
        for (Object remove : collection) {
            super.remove(remove);
        }
        return i != this.c;
    }

    public final Set keySet() {
        vr vrVar = this.X;
        if (vrVar != null) {
            return vrVar;
        }
        vr vrVar2 = new vr(this);
        this.X = vrVar2;
        return vrVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                g(i2);
            }
        }
        return i != this.c;
    }

    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        xr xrVar = this.Y;
        if (xrVar != null) {
            return xrVar;
        }
        xr xrVar2 = new xr(this);
        this.Y = xrVar2;
        return xrVar2;
    }
}
