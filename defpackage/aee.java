package defpackage;

import java.util.Arrays;

/* renamed from: aee  reason: default package */
public final class aee {
    public final long a;
    public final una b;
    public final lee c;
    public final int d;
    public final long e;
    public final int f;
    public final byte[] g;
    public final long h;

    public aee(long j, una una, lee lee, int i, long j2, int i2, byte[] bArr, long j3) {
        this.a = j;
        this.b = una;
        this.c = lee;
        this.d = i;
        this.e = j2;
        this.f = i2;
        this.g = bArr;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aee)) {
            return false;
        }
        aee aee = (aee) obj;
        return this.a == aee.a && this.b == aee.b && this.c == aee.c && this.d == aee.d && this.e == aee.e && this.f == aee.f && hhd.f(this.g, aee.g) && this.h == aee.h;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int d2 = c3d.d(this.f, sxe.m(c3d.d(this.d, (hashCode2 + ((hashCode + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31), 31, this.e), 31);
        return Long.hashCode(this.h) + ((Arrays.hashCode(this.g) + d2) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.g);
        StringBuilder sb = new StringBuilder("TaskEntity(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", failsCount=");
        sb.append(this.d);
        sb.append(", dependsRequestId=");
        sb.append(this.e);
        sb.append(", dependencyType=");
        sb.append(this.f);
        sb.append(", data=");
        sb.append(arrays);
        sb.append(", createdTime=");
        return wn6.k(sb, this.h, ")");
    }
}
