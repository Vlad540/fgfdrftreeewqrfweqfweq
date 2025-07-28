package defpackage;

/* renamed from: cg2  reason: default package */
public final class cg2 {
    public final k68 a;
    public final v2f b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg2(i68 i68, int i) {
        this((k68) (i & 1) != 0 ? null : i68, (v2f) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg2)) {
            return false;
        }
        cg2 cg2 = (cg2) obj;
        return hhd.f(this.a, cg2.a) && hhd.f(this.b, cg2.b);
    }

    public final int hashCode() {
        int i = 0;
        k68 k68 = this.a;
        int hashCode = (k68 == null ? 0 : k68.hashCode()) * 31;
        v2f v2f = this.b;
        if (v2f != null) {
            i = v2f.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VideoPageState(mediaItem=" + this.a + ", videoContent=" + this.b + ")";
    }

    public cg2(k68 k68, v2f v2f) {
        this.a = k68;
        this.b = v2f;
    }
}
