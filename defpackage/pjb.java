package defpackage;

/* renamed from: pjb  reason: default package */
public final class pjb {
    public final Class a;
    public final Class b;

    public pjb(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static pjb a(Class cls) {
        return new pjb(ojb.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pjb.class != obj.getClass()) {
            return false;
        }
        pjb pjb = (pjb) obj;
        if (!this.b.equals(pjb.b)) {
            return false;
        }
        return this.a.equals(pjb.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class<ojb> cls = ojb.class;
        Class cls2 = this.b;
        Class<ojb> cls3 = this.a;
        if (cls3 == cls) {
            return cls2.getName();
        }
        return "@" + cls3.getName() + " " + cls2.getName();
    }
}
