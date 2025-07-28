package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: hga  reason: default package */
public class hga implements ia3 {
    public static final xb4 b;
    public static final hga c;
    public final TreeMap a;

    static {
        xb4 xb4 = new xb4(13);
        b = xb4;
        c = new hga(new TreeMap(xb4));
    }

    public hga(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static hga a(ia3 ia3) {
        if (hga.class.equals(ia3.getClass())) {
            return (hga) ia3;
        }
        TreeMap treeMap = new TreeMap(b);
        for (z80 z80 : ia3.f()) {
            Set<ha3> i = ia3.i(z80);
            ArrayMap arrayMap = new ArrayMap();
            for (ha3 ha3 : i) {
                arrayMap.put(ha3, ia3.k(z80, ha3));
            }
            treeMap.put(z80, arrayMap);
        }
        return new hga(treeMap);
    }

    public final void b(j9 j9Var) {
        for (Map.Entry entry : this.a.tailMap(new z80(Void.class, (Object) null, "camera2.captureRequest.option.")).entrySet()) {
            if (((z80) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                z80 z80 = (z80) entry.getKey();
                ia3 ia3 = (ia3) j9Var.c;
                ((fc9) ((lv1) j9Var.b).b).g(z80, ia3.m(z80), ia3.h(z80));
            } else {
                return;
            }
        }
    }

    public final Object d(z80 z80, Object obj) {
        try {
            return h(z80);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    public final Set f() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public final Object h(z80 z80) {
        Map map = (Map) this.a.get(z80);
        if (map != null) {
            return map.get((ha3) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + z80);
    }

    public final Set i(z80 z80) {
        Map map = (Map) this.a.get(z80);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    public final Object k(z80 z80, ha3 ha3) {
        Map map = (Map) this.a.get(z80);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + z80);
        } else if (map.containsKey(ha3)) {
            return map.get(ha3);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + z80 + " with priority=" + ha3);
        }
    }

    public final boolean l(z80 z80) {
        return this.a.containsKey(z80);
    }

    public final ha3 m(z80 z80) {
        Map map = (Map) this.a.get(z80);
        if (map != null) {
            return (ha3) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + z80);
    }
}
