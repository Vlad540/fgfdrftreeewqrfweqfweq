package defpackage;

/* renamed from: jt8  reason: default package */
public final class jt8 extends lt8 {
    public final zp8 a;

    public jt8(zp8 zp8) {
        this.a = zp8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt8) && this.a == ((jt8) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewInputState(expandableState=" + this.a + ")";
    }
}
