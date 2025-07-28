package defpackage;

/* renamed from: aa0  reason: default package */
public final class aa0 extends ph9 {
    public final oh9 a;
    public final nh9 b;

    public aa0(oh9 oh9, nh9 nh9) {
        this.a = oh9;
        this.b = nh9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ph9)) {
            return false;
        }
        ph9 ph9 = (ph9) obj;
        oh9 oh9 = this.a;
        if (oh9 != null ? oh9.equals(((aa0) ph9).a) : ((aa0) ph9).a == null) {
            nh9 nh9 = this.b;
            if (nh9 == null) {
                if (((aa0) ph9).b == null) {
                    return true;
                }
            } else if (nh9.equals(((aa0) ph9).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        oh9 oh9 = this.a;
        int hashCode = ((oh9 == null ? 0 : oh9.hashCode()) ^ 1000003) * 1000003;
        nh9 nh9 = this.b;
        if (nh9 != null) {
            i = nh9.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
