package defpackage;

import java.io.Serializable;

/* renamed from: am6  reason: default package */
public final class am6 implements Serializable {
    public final int a;
    public final String b;
    public final String c;

    public am6(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || am6.class != obj.getClass()) {
            return false;
        }
        return this.a == ((am6) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpError{code=");
        sb.append(this.a);
        sb.append(", error='");
        sb.append(this.b);
        sb.append("', reason='");
        return wn6.l(sb, this.c, "'}");
    }

    public am6(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
