package defpackage;

import java.util.List;

/* renamed from: s3b  reason: default package */
public final class s3b implements syc {
    public final String a;
    public final r3b b;

    public s3b(String str, r3b r3b) {
        this.a = str;
        this.b = r3b;
    }

    public final String a() {
        return this.a;
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final d8 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3b)) {
            return false;
        }
        s3b s3b = (s3b) obj;
        if (hhd.f(this.a, s3b.a)) {
            if (hhd.f(this.b, s3b.b)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return 0;
    }

    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final List getAnnotations() {
        return hw4.a;
    }

    public final List h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final syc i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean isInline() {
        return false;
    }

    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return me4.l(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
