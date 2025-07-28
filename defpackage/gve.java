package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: gve  reason: default package */
public final class gve implements ahc {
    public final List a;
    public final boolean b;

    public gve(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gve.class != obj.getClass()) {
            return false;
        }
        gve gve = (gve) obj;
        return this.b == gve.b && this.a.equals(gve.a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        return "UpdateDisplayLayoutV2Command{layouts=" + this.a + ", isSnapshot=" + this.b + '}';
    }
}
