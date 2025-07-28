package defpackage;

import java.util.LinkedHashMap;

/* renamed from: dte  reason: default package */
public enum dte {
    INTEGER(0),
    FLOAT(1),
    LONG(2),
    STRING(3),
    STRINGS_SET(4),
    BOOLEAN(5),
    BIG_STRING(16),
    BIG_STRINGS_SET(17);
    
    public static final jk9 b = null;
    public static final LinkedHashMap c = null;
    public final int a;

    /* JADX WARNING: type inference failed for: r0v2, types: [jk9, java.lang.Object] */
    static {
        int i;
        dte[] dteArr;
        pz4 pz4 = new pz4(dteArr);
        b = new Object();
        int S = ju7.S(q23.H(pz4, 10));
        if (S >= 16) {
            i = S;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            Object next = u1Var.next();
            linkedHashMap.put(Integer.valueOf(((dte) next).a), next);
        }
        c = linkedHashMap;
    }

    /* access modifiers changed from: public */
    dte(int i) {
        this.a = i;
    }

    public final int a() {
        return this == BIG_STRINGS_SET ? BIG_STRING.a() : this.a;
    }
}
