package defpackage;

/* renamed from: m90  reason: default package */
public final class m90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public m90(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m90)) {
            return false;
        }
        m90 m90 = (m90) obj;
        return this.a.equals(m90.a) && this.b.equals(m90.b) && this.c.equals(m90.c) && this.d.equals(m90.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return wn6.l(sb, this.d, "}");
    }
}
