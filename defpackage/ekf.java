package defpackage;

/* renamed from: ekf  reason: default package */
public final class ekf extends gkf {
    public final String a;

    public ekf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ekf) && hhd.f(this.a, ((ekf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("InternalNavigation(deeplink="), this.a, ")");
    }
}
