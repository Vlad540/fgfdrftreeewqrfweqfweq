package defpackage;

/* renamed from: qlf  reason: default package */
public final class qlf implements wlf {
    public final String a;

    public qlf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qlf) && hhd.f(this.a, ((qlf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("ShowCloseDialog(appName="), this.a, ")");
    }
}
