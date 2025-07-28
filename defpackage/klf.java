package defpackage;

/* renamed from: klf  reason: default package */
public final class klf implements wlf {
    public final boolean a;

    public klf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klf) && this.a == ((klf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("CloseScreen(isFromBridge="), this.a, ")");
    }
}
