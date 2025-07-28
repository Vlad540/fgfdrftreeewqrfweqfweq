package defpackage;

/* renamed from: pof  reason: default package */
public final class pof extends gkf {
    public final boolean a;

    public pof(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pof) && this.a == ((pof) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("NeedCloseConfirmation(needConfirmation="), this.a, ")");
    }
}
