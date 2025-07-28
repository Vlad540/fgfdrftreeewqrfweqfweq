package defpackage;

/* renamed from: qg3  reason: default package */
public final class qg3 implements ug3 {
    public final mge a;
    public final boolean b;

    public qg3(hge hge, boolean z) {
        this.a = hge;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg3)) {
            return false;
        }
        qg3 qg3 = (qg3) obj;
        return hhd.f(this.a, qg3.a) && this.b == qg3.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyUser(text=");
        sb.append(this.a);
        sb.append(", isError=");
        return hr1.j(sb, this.b, ")");
    }
}
