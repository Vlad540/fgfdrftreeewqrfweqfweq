package defpackage;

import java.util.Arrays;

/* renamed from: pb4  reason: default package */
public final class pb4 implements lt0 {
    public final int a;
    public final int[] b;
    public final int c;

    public pb4(int i, int i2, int[] iArr) {
        this.a = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.b = copyOf;
        this.c = i2;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pb4.class != obj.getClass()) {
            return false;
        }
        pb4 pb4 = (pb4) obj;
        return this.a == pb4.a && Arrays.equals(this.b, pb4.b) && this.c == pb4.c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c;
    }
}
