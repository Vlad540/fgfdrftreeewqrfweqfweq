package defpackage;

import java.util.Arrays;

/* renamed from: tpe  reason: default package */
public final class tpe implements lt0 {
    public final toe a;
    public final int[] b;
    public final int c;
    public final boolean[] o;

    public tpe(toe toe, int[] iArr, int i, boolean[] zArr) {
        int length = iArr.length;
        int i2 = toe.a;
        swb.e(i2 == length && i2 == zArr.length);
        this.a = toe;
        this.b = (int[]) iArr.clone();
        this.c = i;
        this.o = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tpe.class != obj.getClass()) {
            return false;
        }
        tpe tpe = (tpe) obj;
        return this.c == tpe.c && this.a.equals(tpe.a) && Arrays.equals(this.b, tpe.b) && Arrays.equals(this.o, tpe.o);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.o) + ((((hashCode + (this.a.hashCode() * 31)) * 31) + this.c) * 31);
    }
}
