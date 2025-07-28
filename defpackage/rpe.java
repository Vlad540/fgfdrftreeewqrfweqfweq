package defpackage;

import java.util.Arrays;

/* renamed from: rpe  reason: default package */
public final class rpe {
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(3, 36);
    public static final String i = Integer.toString(4, 36);
    public final int a;
    public final uoe b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        int i2 = oze.a;
    }

    public rpe(uoe uoe, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = uoe.a;
        this.a = i2;
        boolean z2 = false;
        oyb.d(i2 == iArr.length && i2 == zArr.length);
        this.b = uoe;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final rpe a(String str) {
        return new rpe(this.b.a(str), this.c, this.d, this.e);
    }

    public final uoe b() {
        return this.b;
    }

    public final xu5 c(int i2) {
        return this.b.d[i2];
    }

    public final int d(int i2) {
        return this.d[i2];
    }

    public final int e() {
        return this.b.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rpe.class != obj.getClass()) {
            return false;
        }
        rpe rpe = (rpe) obj;
        return this.c == rpe.c && this.b.equals(rpe.b) && Arrays.equals(this.d, rpe.d) && Arrays.equals(this.e, rpe.e);
    }

    public final boolean f() {
        for (boolean z : this.e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(int i2) {
        return this.e[i2];
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
