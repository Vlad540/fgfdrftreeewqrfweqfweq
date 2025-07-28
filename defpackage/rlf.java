package defpackage;

/* renamed from: rlf  reason: default package */
public final class rlf implements wlf {
    public final String a;

    public rlf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlf) && hhd.f(this.a, ((rlf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("ShowDownloadFileBottomSheet(fileName="), this.a, ")");
    }
}
