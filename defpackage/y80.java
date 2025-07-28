package defpackage;

/* renamed from: y80  reason: default package */
public final class y80 extends d03 {
    public final c03 a = c03.a;
    public final ld b;

    public y80(j80 j80) {
        this.b = j80;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d03)) {
            return false;
        }
        d03 d03 = (d03) obj;
        c03 c03 = this.a;
        if (c03 != null ? c03.equals(((y80) d03).a) : ((y80) d03).a == null) {
            ld ldVar = this.b;
            if (ldVar == null) {
                if (((y80) d03).b == null) {
                    return true;
                }
            } else if (ldVar.equals(((y80) d03).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        c03 c03 = this.a;
        int hashCode = ((c03 == null ? 0 : c03.hashCode()) ^ 1000003) * 1000003;
        ld ldVar = this.b;
        if (ldVar != null) {
            i = ldVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
