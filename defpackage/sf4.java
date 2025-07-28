package defpackage;

/* renamed from: sf4  reason: default package */
public final class sf4 implements lt0 {
    public final int a;
    public final int b;
    public final int c;

    public sf4(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf4)) {
            return false;
        }
        sf4 sf4 = (sf4) obj;
        return this.a == sf4.a && this.b == sf4.b && this.c == sf4.c;
    }

    public final int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }
}
