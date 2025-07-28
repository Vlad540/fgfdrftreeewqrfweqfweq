package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ua0  reason: default package */
public final class ua0 {
    public static final ua0 d = new ua0(0, 2, (cb0) null);
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{0, -1})));
    public static final ie3 f = new ie3(new ua0(0, 1, (cb0) null));
    public final int a;
    public final int b;
    public final cb0 c;

    public ua0(int i, int i2, cb0 cb0) {
        this.a = i;
        if (i2 != 0) {
            this.b = i2;
            this.c = cb0;
            return;
        }
        throw new NullPointerException("Null streamState");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0 = (ua0) obj;
        if (this.a == ua0.a && hr1.c(this.b, ua0.b)) {
            cb0 cb0 = ua0.c;
            cb0 cb02 = this.c;
            if (cb02 == null) {
                if (cb0 == null) {
                    return true;
                }
            } else if (cb02.equals(cb0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int t = (((this.a ^ 1000003) * 1000003) ^ hr1.t(this.b)) * 1000003;
        cb0 cb0 = this.c;
        return (cb0 == null ? 0 : cb0.hashCode()) ^ t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.a);
        sb.append(", streamState=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
