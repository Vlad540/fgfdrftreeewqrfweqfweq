package defpackage;

/* renamed from: v90  reason: default package */
public final class v90 {
    public final nc7 a;
    public final w80 b;

    public v90(nc7 nc7, w80 w80) {
        if (nc7 != null) {
            this.a = nc7;
            if (w80 != null) {
                this.b = w80;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v90)) {
            return false;
        }
        v90 v90 = (v90) obj;
        return this.a.equals(v90.a) && this.b.equals(v90.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
