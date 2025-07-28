package defpackage;

/* renamed from: wgb  reason: default package */
public final class wgb {
    public final int a;
    public final boolean b;

    public wgb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wgb.class != obj.getClass()) {
            return false;
        }
        wgb wgb = (wgb) obj;
        return this.a == wgb.a && this.b == wgb.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
