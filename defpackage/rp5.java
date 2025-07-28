package defpackage;

/* renamed from: rp5  reason: default package */
public final class rp5 implements up5 {
    public final boolean a;

    public rp5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rp5) && this.a == ((rp5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("Close(afterCreate="), this.a, ")");
    }
}
