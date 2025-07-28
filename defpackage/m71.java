package defpackage;

/* renamed from: m71  reason: default package */
public final class m71 implements n71 {
    public final boolean a;

    public m71(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m71) && this.a == ((m71) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("End(isCallAccepted="), this.a, ")");
    }
}
