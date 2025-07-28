package defpackage;

/* renamed from: am3  reason: default package */
public final class am3 {
    public static final /* synthetic */ int e = 0;
    public final long a;
    public final long b;
    public final dm7 c;
    public final String d;

    static {
        dm7 dm7 = dm7.Z;
        tx txVar = new tx(dm7);
        if (((dm7) txVar.X) == null) {
            txVar.X = dm7;
        }
        new am3(txVar);
    }

    public am3(tx txVar) {
        this.a = txVar.b;
        this.b = txVar.c;
        this.c = (dm7) txVar.X;
        this.d = (String) txVar.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || am3.class != obj.getClass()) {
            return false;
        }
        am3 am3 = (am3) obj;
        if (this.a != am3.a || this.b != am3.b) {
            return false;
        }
        dm7 dm7 = am3.c;
        dm7 dm72 = this.c;
        if (dm72 == null ? dm7 != null : !dm72.equals(dm7)) {
            return false;
        }
        String str = am3.d;
        String str2 = this.d;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        int i2 = 0;
        dm7 dm7 = this.c;
        int hashCode = (i + (dm7 != null ? dm7.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactLocation{contactServerId=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(ez3.T(Long.valueOf(this.b)));
        sb.append(", location=");
        sb.append(this.c);
        sb.append(", deviceId='");
        return wn6.l(sb, this.d, "'}");
    }
}
