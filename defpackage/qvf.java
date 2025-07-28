package defpackage;

/* renamed from: qvf  reason: default package */
public final class qvf {
    public final wu5 a;
    public final String b;

    public qvf(wu5 wu5, String str) {
        this.a = wu5;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qvf.class != obj.getClass()) {
            return false;
        }
        qvf qvf = (qvf) obj;
        wu5 wu5 = qvf.a;
        wu5 wu52 = this.a;
        if (wu52 == null ? wu5 != null : !wu52.equals(wu5)) {
            return false;
        }
        String str = qvf.b;
        String str2 = this.b;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        int i = 0;
        wu5 wu5 = this.a;
        int hashCode = (wu5 != null ? wu5.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YtFile{format=");
        sb.append(this.a);
        sb.append(", url='");
        return wn6.l(sb, this.b, "'}");
    }
}
