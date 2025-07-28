package defpackage;

import java.util.Date;
import java.util.HashMap;

/* renamed from: x57  reason: default package */
public final class x57 implements jx4 {
    public static final u57 e = new u57(0);
    public static final v57 f = new v57(0);
    public static final v57 g = new v57(1);
    public static final w57 h = new Object();
    public final HashMap a;
    public final HashMap b;
    public final u57 c = e;
    public boolean d = false;

    public x57() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, h);
        hashMap.remove(cls3);
    }

    public final jx4 a(Class cls, is9 is9) {
        this.a.put(cls, is9);
        this.b.remove(cls);
        return this;
    }
}
