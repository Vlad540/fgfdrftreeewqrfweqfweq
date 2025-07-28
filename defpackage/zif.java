package defpackage;

/* renamed from: zif  reason: default package */
public final class zif extends e57 {
    public final String c;
    public final String d;

    public zif(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zif)) {
            return false;
        }
        zif zif = (zif) obj;
        return hhd.f(this.c, zif.c) && hhd.f(this.d, zif.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadFile(url=");
        sb.append(this.c);
        sb.append(", fileName=");
        return wn6.l(sb, this.d, ")");
    }
}
