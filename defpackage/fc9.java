package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: fc9  reason: default package */
public final class fc9 extends hga implements ob9 {
    /* JADX WARNING: type inference failed for: r0v0, types: [hga, fc9] */
    public static fc9 c() {
        return new hga(new TreeMap(hga.b));
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [hga, fc9] */
    public static fc9 e(ia3 ia3) {
        TreeMap treeMap = new TreeMap(hga.b);
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

    public final void g(z80 z80, ha3 ha3, Object obj) {
        ha3 ha32;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(z80);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(z80, arrayMap);
            arrayMap.put(ha3, obj);
            return;
        }
        ha3 ha33 = (ha3) Collections.min(map.keySet());
        if (!Objects.equals(map.get(ha33), obj) && ha33 == (ha32 = ha3.c) && ha3 == ha32) {
            throw new IllegalArgumentException("Option values conflicts: " + z80.a + ", existing value (" + ha33 + ")=" + map.get(ha33) + ", conflicting (" + ha3 + ")=" + obj);
        }
        map.put(ha3, obj);
    }

    public final void j(z80 z80, Object obj) {
        g(z80, ha3.o, obj);
    }
}
