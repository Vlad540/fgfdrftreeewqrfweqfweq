package defpackage;

/* renamed from: ofd  reason: default package */
public abstract class ofd {
    public final boolean direct;
    public final String message;

    public ofd(String str, boolean z) {
        this.message = str;
        this.direct = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ofd ofd = (ofd) obj;
        if (this.direct != ofd.direct) {
            return false;
        }
        return this.message.equals(ofd.message);
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + (this.direct ? 1 : 0);
    }
}
