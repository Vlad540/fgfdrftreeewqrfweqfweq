package defpackage;

import java.util.Arrays;

/* renamed from: gd  reason: default package */
public final class gd {
    public final long a;
    public final vje b;
    public final int c;
    public final se8 d;
    public final long e;
    public final vje f;
    public final int g;
    public final se8 h;
    public final long i;
    public final long j;

    public gd(long j2, vje vje, int i2, se8 se8, long j3, vje vje2, int i3, se8 se82, long j4, long j5) {
        this.a = j2;
        this.b = vje;
        this.c = i2;
        this.d = se8;
        this.e = j3;
        this.f = vje2;
        this.g = i3;
        this.h = se82;
        this.i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gd.class != obj.getClass()) {
            return false;
        }
        gd gdVar = (gd) obj;
        return this.a == gdVar.a && this.c == gdVar.c && this.e == gdVar.e && this.g == gdVar.g && this.i == gdVar.i && this.j == gdVar.j && am7.j(this.b, gdVar.b) && am7.j(this.d, gdVar.d) && am7.j(this.f, gdVar.f) && am7.j(this.h, gdVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
