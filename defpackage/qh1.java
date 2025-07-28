package defpackage;

/* renamed from: qh1  reason: default package */
public final class qh1 extends wh1 {
    public final String C;

    public qh1(String str) {
        this.C = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qh1) && hhd.f(this.C, ((qh1) obj).C);
    }

    public final int hashCode() {
        return this.C.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("ShareLinkToChat(link="), this.C, ")");
    }
}
