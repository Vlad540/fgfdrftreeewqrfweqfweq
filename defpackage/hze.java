package defpackage;

/* renamed from: hze  reason: default package */
public final class hze {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final t8f d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final t8f h;

    public hze(long j, boolean z, boolean z2, t8f t8f, boolean z3, boolean z4, boolean z5, t8f t8f2) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = t8f;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = t8f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hze)) {
            return false;
        }
        hze hze = (hze) obj;
        return this.a == hze.a && this.b == hze.b && this.c == hze.c && hhd.f(this.d, hze.d) && this.e == hze.e && this.f == hze.f && this.g == hze.g && hhd.f(this.h, hze.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + th2.f(th2.f(th2.f((this.d.hashCode() + th2.f(th2.f(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "UserVideoState(id=" + this.a + ", isMe=" + this.b + ", isVideoEnabled=" + this.c + ", videoState=" + this.d + ", isConnected=" + this.e + ", isAccepted=" + this.f + ", isScreenCaptureEnabled=" + this.g + ", screenCaptureState=" + this.h + ")";
    }
}
