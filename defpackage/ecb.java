package defpackage;

/* renamed from: ecb  reason: default package */
public final class ecb extends gcb {
    public final int a;

    public ecb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecb) && kjd.p(this.a, ((ecb) obj).a);
    }

    public final long getItemId() {
        return (long) 1024;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int l() {
        return this.a;
    }

    public final String toString() {
        return wn6.i("Loading(itemViewType=", kjd.P(this.a), ")");
    }
}
