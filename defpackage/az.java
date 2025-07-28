package defpackage;

/* renamed from: az  reason: default package */
public final class az extends ez {
    public final long a;
    public final float b;
    public final mge c;

    public az(long j, float f, mge mge) {
        this.a = j;
        this.b = f;
        this.c = mge;
    }

    public final long a() {
        return this.a;
    }

    public final mge b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return this.a == azVar.a && Float.compare(this.b, azVar.b) == 0 && hhd.f(this.c, azVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + th2.e(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "Downloading(messageId=" + this.a + ", progress=" + this.b + ", textSize=" + this.c + ")";
    }
}
