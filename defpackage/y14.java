package defpackage;

/* renamed from: y14  reason: default package */
public final class y14 extends n06 {
    public final boolean f;

    public y14(boolean z) {
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y14) && this.f == ((y14) obj).f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("Switch(isToggled="), this.f, ")");
    }
}
