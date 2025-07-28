package defpackage;

import java.util.List;

/* renamed from: ab0  reason: default package */
public final class ab0 {
    public final o4e a;
    public final List b;

    public ab0(o4e o4e, List list) {
        if (o4e != null) {
            this.a = o4e;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null outConfigs");
        }
        throw new NullPointerException("Null surfaceEdge");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab0)) {
            return false;
        }
        ab0 ab0 = (ab0) obj;
        return this.a.equals(ab0.a) && this.b.equals(ab0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.a);
        sb.append(", outConfigs=");
        return hr1.i(sb, this.b, "}");
    }
}
