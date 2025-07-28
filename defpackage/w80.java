package defpackage;

/* renamed from: w80  reason: default package */
public final class w80 {
    public final String a;
    public final o90 b;

    public w80(String str, o90 o90) {
        if (str != null) {
            this.a = str;
            if (o90 != null) {
                this.b = o90;
                return;
            }
            throw new NullPointerException("Null cameraConfigId");
        }
        throw new NullPointerException("Null cameraIdString");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80 = (w80) obj;
        return this.a.equals(w80.a) && this.b.equals(w80.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.a + ", cameraConfigId=" + this.b + "}";
    }
}
