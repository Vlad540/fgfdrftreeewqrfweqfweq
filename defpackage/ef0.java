package defpackage;

/* renamed from: ef0  reason: default package */
public final class ef0 implements gf0 {
    public final boolean a;

    public ef0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef0) && this.a == ((ef0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("ContactsPermissionChange(isGranted="), this.a, ")");
    }
}
