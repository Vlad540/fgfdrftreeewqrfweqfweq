package defpackage;

/* renamed from: a3f  reason: default package */
public final class a3f {
    public final String a;
    public final f3f b;

    public a3f(f2b f2b) {
        this.a = (String) f2b.b;
        this.b = (f3f) f2b.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a3f.class != obj.getClass()) {
            return false;
        }
        a3f a3f = (a3f) obj;
        String str = a3f.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        f3f f3f = a3f.b;
        f3f f3f2 = this.b;
        return f3f2 != null ? f3f2.equals(f3f) : f3f == null;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        f3f f3f = this.b;
        if (f3f != null) {
            i = f3f.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VideoConversionData{sourceUri='" + this.a + "', convertOptions=" + this.b + '}';
    }
}
