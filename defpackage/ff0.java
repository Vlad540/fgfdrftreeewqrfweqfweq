package defpackage;

/* renamed from: ff0  reason: default package */
public final class ff0 implements gf0 {
    public final boolean a;

    public ff0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff0) && this.a == ((ff0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("NotificationsPermissionChange(isGranted="), this.a, ")");
    }
}
