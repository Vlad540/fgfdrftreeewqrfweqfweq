package defpackage;

/* renamed from: m91  reason: default package */
public final class m91 extends r91 {
    public final boolean a;

    public m91(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m91) && this.a == ((m91) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("LoadingState(isEnabled="), this.a, ")");
    }
}
