package defpackage;

/* renamed from: t80  reason: default package */
public final class t80 {
    public final int a;
    public final u80 b;

    public t80(int i, u80 u80) {
        if (i != 0) {
            this.a = i;
            this.b = u80;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t80)) {
            return false;
        }
        t80 t80 = (t80) obj;
        if (hr1.c(this.a, t80.a)) {
            u80 u80 = t80.b;
            u80 u802 = this.b;
            if (u802 == null) {
                if (u80 == null) {
                    return true;
                }
            } else if (u802.equals(u80)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int t = (hr1.t(this.a) ^ 1000003) * 1000003;
        u80 u80 = this.b;
        return (u80 == null ? 0 : u80.hashCode()) ^ t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN");
        sb.append(", error=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
