package defpackage;

/* renamed from: zb6  reason: default package */
public final class zb6 {
    public final int a;
    public final int b;

    public zb6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zb6.class != obj.getClass()) {
            return false;
        }
        zb6 zb6 = (zb6) obj;
        return this.b == zb6.b && this.a == zb6.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append(", ");
        return wn6.j(sb, this.b, "]");
    }
}
