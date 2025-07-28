package defpackage;

/* renamed from: q8f  reason: default package */
public final class q8f implements lt0 {
    public final int a;
    public final int b;
    public final int c;
    public final float o;

    public q8f(float f, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8f)) {
            return false;
        }
        q8f q8f = (q8f) obj;
        return this.a == q8f.a && this.b == q8f.b && this.c == q8f.c && this.o == q8f.o;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.o) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }
}
