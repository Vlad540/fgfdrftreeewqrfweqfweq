package defpackage;

/* renamed from: mkb  reason: default package */
public final class mkb implements pkb {
    public final tk7 a;
    public final int b;

    public mkb(tk7 tk7, int i) {
        this.a = tk7;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkb)) {
            return false;
        }
        mkb mkb = (mkb) obj;
        return hhd.f(this.a, mkb.a) && this.b == mkb.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFullScreenMedia(localMedia=" + this.a + ", position=" + this.b + ")";
    }
}
