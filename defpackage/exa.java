package defpackage;

/* renamed from: exa  reason: default package */
public final class exa implements fxa {
    public final String a;

    public exa(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exa) && hhd.f(this.a, ((exa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("UserPhoto(url="), this.a, ")");
    }
}
