package defpackage;

import java.util.Arrays;

/* renamed from: qj7  reason: default package */
public final class qj7 {
    public final long a;
    public final float b;
    public final long c;

    public qj7(pj7 pj7) {
        this.a = pj7.a;
        this.b = pj7.b;
        this.c = pj7.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj7)) {
            return false;
        }
        qj7 qj7 = (qj7) obj;
        return this.a == qj7.a && this.b == qj7.b && this.c == qj7.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }
}
