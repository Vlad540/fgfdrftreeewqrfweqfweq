package defpackage;

/* renamed from: j9c  reason: default package */
public final class j9c {
    public static final j9c c = new j9c(0, false);
    public final int a;
    public final boolean b;

    public j9c(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j9c.class != obj.getClass()) {
            return false;
        }
        j9c j9c = (j9c) obj;
        return this.a == j9c.a && this.b == j9c.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
