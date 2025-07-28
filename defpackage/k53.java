package defpackage;

/* renamed from: k53  reason: default package */
public final class k53 {
    public final int a;

    public k53(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k53)) {
            return false;
        }
        k53 k53 = (k53) obj;
        k53.getClass();
        return this.a == k53.a;
    }

    public final int hashCode() {
        return Integer.hashCode(-855638017) + c3d.d(this.a, Integer.hashCode(-1) * 31, 31);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("CommonIconColors(contrastStatic=-1, accent="), this.a, ", verificationCapsule=-855638017)");
    }
}
