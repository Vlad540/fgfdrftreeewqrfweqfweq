package defpackage;

/* renamed from: v3f  reason: default package */
public final class v3f {
    public static final v3f i = new v3f(-1, 1, -1, -1, 1.0f, -1, -1, false);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    public final boolean h;

    public v3f(int i2, int i3, int i4, int i5, float f2, int i6, int i7, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = f2;
        this.f = i6;
        this.g = i7;
        this.h = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [u3f, java.lang.Object] */
    public final u3f a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3f)) {
            return false;
        }
        v3f v3f = (v3f) obj;
        return this.a == v3f.a && this.b == v3f.b && this.c == v3f.c && this.d == v3f.d && this.e == v3f.e && this.f == v3f.f && this.g == v3f.g && this.h == v3f.h;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.e) + ((((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31) + this.f) * 31) + this.g) * 31) + (this.h ? 1 : 0);
    }
}
