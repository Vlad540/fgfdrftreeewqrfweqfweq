package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: d90  reason: default package */
public final class d90 {
    public final o4e a;
    public final o4e b;
    public final List c;

    public d90(o4e o4e, o4e o4e2, ArrayList arrayList) {
        if (o4e != null) {
            this.a = o4e;
            if (o4e2 != null) {
                this.b = o4e2;
                this.c = arrayList;
                return;
            }
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        throw new NullPointerException("Null primarySurfaceEdge");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d90)) {
            return false;
        }
        d90 d90 = (d90) obj;
        return this.a.equals(d90.a) && this.b.equals(d90.b) && this.c.equals(d90.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.a);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.b);
        sb.append(", outConfigs=");
        return hr1.i(sb, this.c, "}");
    }
}
