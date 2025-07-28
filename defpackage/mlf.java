package defpackage;

/* renamed from: mlf  reason: default package */
public final class mlf implements wlf {
    public final String a;

    public mlf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mlf) && hhd.f(this.a, ((mlf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("LoadUrl(url="), this.a, ")");
    }
}
