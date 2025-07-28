package defpackage;

import android.media.AudioAttributes;

/* renamed from: j20  reason: default package */
public final class j20 implements lt0 {
    public static final j20 Z = new j20(0, 0, 1, 1, 0);
    public final int X;
    public AudioAttributes Y;
    public final int a;
    public final int b;
    public final int c;
    public final int o;

    public j20(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = i4;
        this.X = i5;
    }

    public final AudioAttributes a() {
        if (this.Y == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i = mze.a;
            if (i >= 29) {
                f20.a(usage, this.o);
            }
            if (i >= 32) {
                h20.a(usage, this.X);
            }
            this.Y = usage.build();
        }
        return this.Y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j20.class != obj.getClass()) {
            return false;
        }
        j20 j20 = (j20) obj;
        return this.a == j20.a && this.b == j20.b && this.c == j20.c && this.o == j20.o && this.X == j20.X;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.o) * 31) + this.X;
    }
}
