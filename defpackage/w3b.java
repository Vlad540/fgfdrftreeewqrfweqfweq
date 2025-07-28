package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: w3b  reason: default package */
public abstract class w3b {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(t3b.a, 0);
        hashMap.put(t3b.b, 1);
        hashMap.put(t3b.c, 2);
        for (t3b t3b : hashMap.keySet()) {
            a.append(((Integer) b.get(t3b)).intValue(), t3b);
        }
    }

    public static int a(t3b t3b) {
        Integer num = (Integer) b.get(t3b);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + t3b);
    }

    public static t3b b(int i) {
        t3b t3b = (t3b) a.get(i);
        if (t3b != null) {
            return t3b;
        }
        throw new IllegalArgumentException(wn6.h(i, "Unknown Priority for value "));
    }
}
