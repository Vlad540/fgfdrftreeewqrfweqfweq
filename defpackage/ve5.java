package defpackage;

/* renamed from: ve5  reason: default package */
public final class ve5 {
    public final String a;

    public ve5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve5)) {
            return false;
        }
        return hhd.f(this.a, ((ve5) obj).a);
    }

    public final int hashCode() {
        return hr1.t(2) + th2.f(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "FilePreferencesOptions(name=" + this.a + ", isDebugMode=false, commitStrategy=" + "BIG_CHANGES" + ")";
    }
}
