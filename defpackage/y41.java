package defpackage;

import java.util.Objects;

/* renamed from: y41  reason: default package */
public final class y41 {
    public final String a;
    public final int b;
    public final int c;

    public y41(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y41.class != obj.getClass()) {
            return false;
        }
        y41 y41 = (y41) obj;
        return this.a.equals(y41.a) && this.b == y41.b && this.c == y41.c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.c);
        return Objects.hash(new Object[]{this.a, hr1.a(this.b), valueOf});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallExternalId{id='");
        sb.append(this.a);
        sb.append("', type=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "ANONYM" : "VK" : "UNKNOWN");
        sb.append(", deviceIndex=");
        return hr1.h(sb, this.c, '}');
    }
}
