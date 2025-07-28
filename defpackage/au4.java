package defpackage;

import java.util.List;

/* renamed from: au4  reason: default package */
public final class au4 {
    public final List a;
    public final int b;

    public au4(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || au4.class != obj.getClass()) {
            return false;
        }
        au4 au4 = (au4) obj;
        if (this.b != au4.b) {
            return false;
        }
        return this.a.equals(au4.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
