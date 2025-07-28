package defpackage;

import java.io.Serializable;
import java.util.HashSet;

/* renamed from: g68  reason: default package */
public final class g68 {
    public Object a;
    public String b = null;
    public Serializable c;
    public int d;
    public int e;
    public Object f;
    public Serializable g;

    public g68(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(pjb.a(cls));
        for (Class cls2 : clsArr) {
            n06.j(cls2, "Null interface");
            ((HashSet) this.a).add(pjb.a(cls2));
        }
    }

    public void a(oe4 oe4) {
        if (!((HashSet) this.a).contains(oe4.a)) {
            ((HashSet) this.c).add(oe4);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public t73 b() {
        if (((i83) this.f) != null) {
            return new t73(this.b, new HashSet((HashSet) this.a), new HashSet((HashSet) this.c), this.d, this.e, (i83) this.f, (HashSet) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }
}
