package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: gpe  reason: default package */
public final class gpe implements lt0 {
    public static final kce c = new kce(21);
    public final toe a;
    public final ws6 b;

    public gpe(toe toe) {
        this.a = toe;
        ete.l(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < toe.a) {
            Integer valueOf = Integer.valueOf(i);
            int i3 = i2 + 1;
            if (objArr.length < i3) {
                objArr = Arrays.copyOf(objArr, ms6.h(objArr.length, i3));
            }
            objArr[i2] = valueOf;
            i++;
            i2 = i3;
        }
        this.b = ws6.h(i2, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gpe.class != obj.getClass()) {
            return false;
        }
        gpe gpe = (gpe) obj;
        return this.a.equals(gpe.a) && this.b.equals(gpe.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public gpe(toe toe, List list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < toe.a)) {
            this.a = toe;
            this.b = ws6.j(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
