package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: fpe  reason: default package */
public final class fpe {
    public static final String c = Integer.toString(0, 36);
    public static final String d = Integer.toString(1, 36);
    public final uoe a;
    public final ws6 b;

    static {
        int i = oze.a;
    }

    public fpe(uoe uoe, List list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < uoe.a)) {
            this.a = uoe;
            this.b = ws6.j(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fpe.class != obj.getClass()) {
            return false;
        }
        fpe fpe = (fpe) obj;
        return this.a.equals(fpe.a) && this.b.equals(fpe.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
