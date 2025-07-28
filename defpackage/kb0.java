package defpackage;

/* renamed from: kb0  reason: default package */
public final class kb0 {
    public final String a;
    public final int b;
    public final g90 c;

    public kb0(String str, int i, g90 g90) {
        this.a = str;
        this.b = i;
        this.c = g90;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kb0)) {
            return false;
        }
        kb0 kb0 = (kb0) obj;
        if (this.a.equals(kb0.a) && this.b == kb0.b) {
            g90 g90 = kb0.c;
            g90 g902 = this.c;
            if (g902 == null) {
                if (g90 == null) {
                    return true;
                }
            } else if (g902.equals(g90)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        g90 g90 = this.c;
        return (g90 == null ? 0 : g90.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.c + "}";
    }
}
