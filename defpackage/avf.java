package defpackage;

/* renamed from: avf  reason: default package */
public final class avf {
    public final zuf a;
    public final dvf b;
    public final bvf c;
    public final cvf d;

    public avf(zuf zuf, dvf dvf, bvf bvf, cvf cvf) {
        this.a = zuf;
        this.b = dvf;
        this.c = bvf;
        this.d = cvf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avf)) {
            return false;
        }
        avf avf = (avf) obj;
        return hhd.f(this.a, avf.a) && hhd.f(this.b, avf.b) && hhd.f(this.c, avf.c) && hhd.f(this.d, avf.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WritebarColors(background=" + this.a + ", text=" + this.b + ", icon=" + this.c + ", stroke=" + this.d + ")";
    }
}
