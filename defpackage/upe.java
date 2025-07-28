package defpackage;

import java.util.List;

/* renamed from: upe  reason: default package */
public final class upe implements lt0 {
    public static final upe b = new upe(e8c.X);
    public final ws6 a;

    static {
        po5 po5 = ws6.b;
    }

    public upe(List list) {
        this.a = ws6.j(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || upe.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((upe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
