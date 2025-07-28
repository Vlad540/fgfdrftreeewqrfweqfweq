package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: y53  reason: default package */
public final class y53 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ b63 b;

    public /* synthetic */ y53(b63 b63, int i) {
        this.a = i;
        this.b = b63;
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                b63 b63 = this.b;
                Map b2 = b63.b();
                if (b2 != null) {
                    return b2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = b63.d(entry.getKey());
                    if (d != -1 && am7.j(b63.j()[d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                b63 b63 = this.b;
                Map b2 = b63.b();
                return b2 != null ? b2.entrySet().iterator() : new x53(b63, 1);
            default:
                b63 b632 = this.b;
                Map b3 = b632.b();
                return b3 != null ? b3.keySet().iterator() : new x53(b632, 0);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                b63 b63 = this.b;
                Map b2 = b63.b();
                if (b2 != null) {
                    return b2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!b63.f()) {
                        int c = b63.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = b63.a;
                        Objects.requireNonNull(obj2);
                        int M = lp.M(key, value, c, obj2, b63.h(), b63.i(), b63.j());
                        if (M != -1) {
                            b63.e(M, c);
                            b63.Y--;
                            b63.X += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                b63 b632 = this.b;
                Map b3 = b632.b();
                return b3 != null ? b3.keySet().remove(obj) : b632.g(obj) != b63.y0;
        }
    }

    public final int size() {
        switch (this.a) {
            case 0:
                return this.b.size();
            default:
                return this.b.size();
        }
    }
}
