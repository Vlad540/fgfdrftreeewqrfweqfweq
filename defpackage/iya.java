package defpackage;

import java.util.Arrays;

/* renamed from: iya  reason: default package */
public final class iya implements lt0 {
    public final int X;
    public final long Y;
    public final long Z;
    public final Object a;
    public final int b;
    public final j68 c;
    public final Object o;
    public final int w0;
    public final int x0;

    public iya(Object obj, int i, j68 j68, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = j68;
        this.o = obj2;
        this.X = i2;
        this.Y = j;
        this.Z = j2;
        this.w0 = i3;
        this.x0 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iya.class != obj.getClass()) {
            return false;
        }
        iya iya = (iya) obj;
        return this.b == iya.b && this.X == iya.X && this.Y == iya.Y && this.Z == iya.Z && this.w0 == iya.w0 && this.x0 == iya.x0 && am7.j(this.a, iya.a) && am7.j(this.o, iya.o) && am7.j(this.c, iya.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.o, Integer.valueOf(this.X), Long.valueOf(this.Y), Long.valueOf(this.Z), Integer.valueOf(this.w0), Integer.valueOf(this.x0)});
    }
}
