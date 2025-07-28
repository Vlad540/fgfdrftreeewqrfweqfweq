package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ga9  reason: default package */
public final class ga9 extends pa2 {
    public final /* synthetic */ Comparator s;

    public ga9(Comparator comparator) {
        this.s = comparator;
    }

    public final Map g() {
        return new TreeMap(this.s);
    }
}
