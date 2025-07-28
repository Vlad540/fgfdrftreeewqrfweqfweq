package defpackage;

/* renamed from: o91  reason: default package */
public final class o91 extends r91 {
    public final boolean a;

    public o91(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o91) && this.a == ((o91) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("RaiseHand(isRaised="), this.a, ")");
    }
}
