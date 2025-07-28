package defpackage;

import java.util.Objects;

/* renamed from: o3f  reason: default package */
public final class o3f {
    public final int a;
    public final int b;
    public final int c;

    public o3f(x3 x3Var) {
        this.a = x3Var.a;
        this.b = x3Var.b;
        this.c = x3Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o3f.class != obj.getClass()) {
            return false;
        }
        o3f o3f = (o3f) obj;
        return this.a == o3f.a && this.b == o3f.b && this.c == o3f.c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), hr1.a(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDisplayLayout{width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", fit=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "CONTAIN" : "COVER");
        sb.append('}');
        return sb.toString();
    }
}
