package defpackage;

/* renamed from: wrc  reason: default package */
public final class wrc implements yrc {
    public final boolean a;

    public wrc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrc) && this.a == ((wrc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("Show(openWithAnimation="), this.a, ")");
    }
}
