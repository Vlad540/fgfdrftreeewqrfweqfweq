package defpackage;

/* renamed from: dh7  reason: default package */
public final class dh7 extends gh7 {
    public final zy3 a;

    public dh7(zy3 zy3) {
        this.a = zy3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dh7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dh7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (dh7.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
