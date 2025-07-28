package defpackage;

/* renamed from: p91  reason: default package */
public final class p91 extends r91 {
    public final boolean a;

    public p91(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p91) && this.a == ((p91) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("TalkingState(isEnabled="), this.a, ")");
    }
}
