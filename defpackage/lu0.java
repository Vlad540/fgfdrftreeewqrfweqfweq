package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: lu0  reason: default package */
public final class lu0 extends kga implements Serializable {
    public final e26 a;
    public final kga b;

    public lu0(e26 e26, kga kga) {
        this.a = e26;
        kga.getClass();
        this.b = kga;
    }

    public final int compare(Object obj, Object obj2) {
        e26 e26 = this.a;
        return this.b.compare(e26.apply(obj), e26.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lu0)) {
            return false;
        }
        lu0 lu0 = (lu0) obj;
        return this.a.equals(lu0.a) && this.b.equals(lu0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
