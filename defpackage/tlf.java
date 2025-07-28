package defpackage;

/* renamed from: tlf  reason: default package */
public final class tlf implements wlf {
    public final String a;

    public tlf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlf) && hhd.f(this.a, ((tlf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("ShowPhoneConfirmationDialog(appName="), this.a, ")");
    }
}
