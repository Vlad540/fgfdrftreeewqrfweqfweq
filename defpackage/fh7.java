package defpackage;

/* renamed from: fh7  reason: default package */
public final class fh7 extends gh7 {
    public final zy3 a;

    public fh7(zy3 zy3) {
        this.a = zy3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fh7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((fh7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (fh7.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
