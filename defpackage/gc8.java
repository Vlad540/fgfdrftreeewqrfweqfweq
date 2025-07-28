package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* renamed from: gc8  reason: default package */
public final class gc8 {
    public static final w1d d;
    public static final eya e;
    public final w1d a;
    public final eya b;
    public final ws6 c;

    static {
        HashSet hashSet = new HashSet();
        e8c e8c = v1d.d;
        for (int i = 0; i < e8c.o; i++) {
            hashSet.add(new v1d(((Integer) e8c.get(i)).intValue()));
        }
        d = new w1d(hashSet);
        HashSet hashSet2 = new HashSet();
        e8c e8c2 = v1d.e;
        for (int i2 = 0; i2 < e8c2.o; i2++) {
            hashSet2.add(new v1d(((Integer) e8c2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < e8c.o; i3++) {
            hashSet2.add(new v1d(((Integer) e8c.get(i3)).intValue()));
        }
        new w1d(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int append : ea6.o) {
            oyb.k(!false);
            sparseBooleanArray.append(append, true);
        }
        oyb.k(!false);
        e = new eya(new wi5(sparseBooleanArray));
    }

    public gc8(w1d w1d, eya eya, ws6 ws6) {
        this.a = w1d;
        this.b = eya;
        this.c = ws6;
    }
}
