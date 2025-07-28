package defpackage;

/* renamed from: jj0  reason: default package */
public abstract class jj0 implements u2f {
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final long e;
    public final xx f;
    public final boolean g;
    public final int h;
    public final int i;

    public jj0(int i2, int i3, long j, long j2, long j3, xx xxVar, String str, boolean z, boolean z2) {
        this.d = str;
        this.a = j;
        this.b = j2;
        this.c = z;
        this.e = j3;
        this.f = xxVar;
        this.g = z2;
        this.h = i2;
        this.i = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jj0 jj0 = (jj0) obj;
        if (this.a != jj0.a || this.b != jj0.b || this.c != jj0.c || this.e != jj0.e || this.g != jj0.g || this.h != jj0.h || this.i != jj0.i) {
            return false;
        }
        String str = jj0.d;
        String str2 = this.d;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        xx xxVar = jj0.f;
        xx xxVar2 = this.f;
        return xxVar2 != null ? xxVar2.equals(xxVar) : xxVar == null;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31;
        int i3 = 0;
        String str = this.d;
        int hashCode = str != null ? str.hashCode() : 0;
        long j3 = this.e;
        int i4 = (((i2 + hashCode) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        xx xxVar = this.f;
        if (xxVar != null) {
            i3 = xxVar.hashCode();
        }
        return ((((((i4 + i3) * 31) + (this.g ? 1 : 0)) * 31) + this.h) * 31) + this.i;
    }

    public long k() {
        return this.a;
    }

    public long m() {
        return 0;
    }
}
