package defpackage;

/* renamed from: vgb  reason: default package */
public final class vgb {
    public final int a;
    public final boolean b;

    public vgb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vgb.class != obj.getClass()) {
            return false;
        }
        vgb vgb = (vgb) obj;
        return this.a == vgb.a && this.b == vgb.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
