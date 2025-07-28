package defpackage;

/* renamed from: mx  reason: default package */
public final class mx implements shb {
    public final int a;

    public mx(int i) {
        this.a = i;
    }

    public final Class annotationType() {
        return shb.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shb)) {
            return false;
        }
        mx mxVar = (mx) ((shb) obj);
        if (this.a == mxVar.a) {
            rhb rhb = rhb.a;
            mxVar.getClass();
            if (rhb.equals(rhb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ^ 14552422) + (rhb.a.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + rhb.a + ')';
    }
}
