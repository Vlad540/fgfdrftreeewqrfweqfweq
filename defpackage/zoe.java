package defpackage;

import java.util.Arrays;

/* renamed from: zoe  reason: default package */
public final class zoe {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public zoe(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zoe.class != obj.getClass()) {
            return false;
        }
        zoe zoe = (zoe) obj;
        return this.a == zoe.a && this.c == zoe.c && this.d == zoe.d && Arrays.equals(this.b, zoe.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
