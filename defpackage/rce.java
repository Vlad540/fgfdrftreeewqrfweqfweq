package defpackage;

/* renamed from: rce  reason: default package */
public final class rce {
    public final ol a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;

    public rce(ol olVar, boolean z, boolean z2, long j, int i) {
        this.a = olVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rce)) {
            return false;
        }
        rce rce = (rce) obj;
        return hhd.f(this.a, rce.a) && this.b == rce.b && this.c == rce.c && this.d == rce.d && this.e == rce.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + sxe.m(th2.f(th2.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task(apiTask=");
        sb.append(this.a);
        sb.append(", executeAndSave=");
        sb.append(this.b);
        sb.append(", retry=");
        sb.append(this.c);
        sb.append(", dependsRequestId=");
        sb.append(this.d);
        sb.append(", dependencyType=");
        return wn6.j(sb, this.e, ")");
    }
}
