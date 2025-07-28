package defpackage;

/* renamed from: vlf  reason: default package */
public final class vlf implements wlf {
    public final String a;

    public vlf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlf) && hhd.f(this.a, ((vlf) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("UploadFile(uriString="), this.a, ")");
    }
}
