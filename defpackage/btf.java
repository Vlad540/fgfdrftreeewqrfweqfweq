package defpackage;

/* renamed from: btf  reason: default package */
public final class btf {
    public final String a;
    public final int b;

    public btf(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btf)) {
            return false;
        }
        btf btf = (btf) obj;
        return hhd.f(this.a, btf.a) && this.b == btf.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return hr1.h(sb, this.b, ')');
    }
}
