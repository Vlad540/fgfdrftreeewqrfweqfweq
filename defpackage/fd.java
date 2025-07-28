package defpackage;

import java.util.Arrays;

/* renamed from: fd  reason: default package */
public final class fd {
    public final long a;
    public final uje b;
    public final int c;
    public final re8 d;
    public final long e;
    public final uje f;
    public final int g;
    public final re8 h;
    public final long i;
    public final long j;

    public fd(long j2, uje uje, int i2, re8 re8, long j3, uje uje2, int i3, re8 re82, long j4, long j5) {
        this.a = j2;
        this.b = uje;
        this.c = i2;
        this.d = re8;
        this.e = j3;
        this.f = uje2;
        this.g = i3;
        this.h = re82;
        this.i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fd.class != obj.getClass()) {
            return false;
        }
        fd fdVar = (fd) obj;
        return this.a == fdVar.a && this.c == fdVar.c && this.e == fdVar.e && this.g == fdVar.g && this.i == fdVar.i && this.j == fdVar.j && am7.j(this.b, fdVar.b) && am7.j(this.d, fdVar.d) && am7.j(this.f, fdVar.f) && am7.j(this.h, fdVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
