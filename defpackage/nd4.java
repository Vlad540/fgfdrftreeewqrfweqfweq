package defpackage;

import java.io.Serializable;
import java.util.Map;

/* renamed from: nd4  reason: default package */
public final class nd4 implements Serializable {
    public final long a;
    public final boolean b;

    public nd4(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final Map a() {
        return ju7.T(new wia[]{new wia("timeToFire", Long.valueOf(this.a)), new wia("notifySender", Boolean.valueOf(this.b))});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd4)) {
            return false;
        }
        nd4 nd4 = (nd4) obj;
        return this.a == nd4.a && this.b == nd4.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String T = ez3.T(Long.valueOf(this.a));
        return "DelayedAttributes(timeToFire=" + T + ", notifySender=" + this.b + ")";
    }
}
