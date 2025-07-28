package defpackage;

import java.util.Objects;

/* renamed from: jd8  reason: default package */
public final class jd8 implements hc8 {
    public final pd8 a;

    public jd8(pd8 pd8) {
        this.a = pd8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != jd8.class) {
            return false;
        }
        return oze.a(this.a, ((jd8) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}
