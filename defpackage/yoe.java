package defpackage;

import java.util.Arrays;

/* renamed from: yoe  reason: default package */
public final class yoe {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public yoe(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yoe.class != obj.getClass()) {
            return false;
        }
        yoe yoe = (yoe) obj;
        return this.a == yoe.a && this.c == yoe.c && this.d == yoe.d && Arrays.equals(this.b, yoe.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
