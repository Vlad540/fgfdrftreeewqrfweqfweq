package defpackage;

/* renamed from: i40  reason: default package */
public final class i40 extends j40 {
    public final mge a;

    public i40(hge hge) {
        this.a = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i40) && hhd.f(this.a, ((i40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return me4.k(new StringBuilder("ShowTooltipEvent(textSource="), this.a, ")");
    }
}
