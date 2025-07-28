package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* renamed from: s2  reason: default package */
public abstract class s2 extends AbstractMap implements Map, d77 {
    public final Set entrySet() {
        return new da3((ea3) this, new vg0(9));
    }

    public final Set keySet() {
        return new da3((ea3) this, new vg0(8));
    }

    public final int size() {
        return ea3.b.get((ea3) this);
    }
}
