package defpackage;

/* renamed from: ana  reason: default package */
public final class ana {
    public final boolean a;

    public ana(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ana) && this.a == ((ana) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("ContactsPermissionChange(isGranted="), this.a, ")");
    }
}
