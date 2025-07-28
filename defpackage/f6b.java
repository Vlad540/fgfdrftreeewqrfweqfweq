package defpackage;

/* renamed from: f6b  reason: default package */
public final class f6b extends g6b {
    public final mge b;
    public final mge c;
    public final boolean d;
    public final Integer e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6b(mge mge, Integer num, int i) {
        this(mge, (mge) null, false, (i & 8) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6b)) {
            return false;
        }
        f6b f6b = (f6b) obj;
        return hhd.f(this.b, f6b.b) && hhd.f(this.c, f6b.c) && this.d == f6b.d && hhd.f(this.e, f6b.e);
    }

    public final int hashCode() {
        int i = 0;
        mge mge = this.b;
        int hashCode = (mge == null ? 0 : mge.hashCode()) * 31;
        mge mge2 = this.c;
        int f = th2.f((hashCode + (mge2 == null ? 0 : mge2.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return f + i;
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", description=" + this.c + ", showOnTop=" + this.d + ", icon=" + this.e + ")";
    }

    public f6b(mge mge, mge mge2, boolean z, Integer num) {
        this.b = mge;
        this.c = mge2;
        this.d = z;
        this.e = num;
    }
}
