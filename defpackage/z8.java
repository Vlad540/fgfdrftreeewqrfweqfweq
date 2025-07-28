package defpackage;

import java.io.Serializable;

/* renamed from: z8  reason: default package */
public class z8 implements v26, Serializable {
    public final boolean X;
    public final int Y;
    public final int Z;
    public final Object a;
    public final Class b;
    public final String c;
    public final String o;

    public z8(int i, Class cls, String str) {
        this(i, 4, cls, mn1.NO_RECEIVER, "<init>", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        return this.X == z8Var.X && this.Y == z8Var.Y && this.Z == z8Var.Z && hhd.f(this.a, z8Var.a) && hhd.f(this.b, z8Var.b) && this.c.equals(z8Var.c) && this.o.equals(z8Var.o);
    }

    public final int getArity() {
        return this.Y;
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        if (cls != null) {
            i = cls.hashCode();
        }
        return ((((me4.d(me4.d((hashCode + i) * 31, 31, this.c), 31, this.o) + (this.X ? 1231 : 1237)) * 31) + this.Y) * 31) + this.Z;
    }

    public final String toString() {
        m7c.a.getClass();
        return n7c.a(this);
    }

    public z8(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.o = str2;
        this.X = false;
        this.Y = i;
        this.Z = i2 >> 1;
    }
}
