package defpackage;

/* renamed from: gh1  reason: default package */
public final class gh1 extends wh1 {
    public final String C;

    public gh1(String str) {
        this.C = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh1) && hhd.f(this.C, ((gh1) obj).C);
    }

    public final int hashCode() {
        return this.C.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("CopyCallLink(link="), this.C, ")");
    }
}
