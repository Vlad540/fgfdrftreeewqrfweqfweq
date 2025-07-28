package defpackage;

/* renamed from: qt7  reason: default package */
public final class qt7 {
    public final long a;
    public final ev7 b;
    public final boolean c;

    public qt7(long j, ev7 ev7, boolean z) {
        this.a = j;
        this.b = ev7;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qt7.class != obj.getClass()) {
            return false;
        }
        qt7 qt7 = (qt7) obj;
        if (this.a == qt7.a && this.c == qt7.c) {
            return this.b == qt7.b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31) + (this.c ? 1 : 0);
    }

    public final String toString() {
        return "Key{contactId=" + this.a + ", markerWeight=" + this.b + ", active=" + this.c + '}';
    }
}
