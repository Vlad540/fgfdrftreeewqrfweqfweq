package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: t73  reason: default package */
public final class t73 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final i83 f;
    public final Set g;

    public t73(String str, Set set, Set set2, int i, int i2, i83 i83, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = i83;
        this.g = Collections.unmodifiableSet(set3);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [g68, java.lang.Object] */
    public static g68 a(pjb pjb) {
        pjb[] pjbArr = new pjb[0];
        ? obj = new Object();
        obj.b = null;
        HashSet hashSet = new HashSet();
        obj.a = hashSet;
        obj.c = new HashSet();
        obj.d = 0;
        obj.e = 0;
        obj.g = new HashSet();
        hashSet.add(pjb);
        for (pjb j : pjbArr) {
            n06.j(j, "Null interface");
        }
        Collections.addAll((HashSet) obj.a, pjbArr);
        return obj;
    }

    public static t73 b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pjb.a(cls));
        for (Class cls2 : clsArr) {
            n06.j(cls2, "Null interface");
            hashSet.add(pjb.a(cls2));
        }
        return new t73((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new zx1(15, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
