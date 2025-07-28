package defpackage;

/* renamed from: wve  reason: default package */
public final class wve {
    public final fwe a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final long f;
    public final rxe g;
    public final qxe h;
    public final long i;

    public wve(vve vve) {
        this.a = vve.a;
        this.b = vve.b;
        this.c = vve.c;
        this.d = vve.d;
        this.e = vve.e;
        this.f = vve.f;
        this.g = vve.g;
        this.h = vve.h;
        this.i = vve.i;
    }

    public final boolean a() {
        return this.g == rxe.UPLOADED && this.h != null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [vve, java.lang.Object] */
    public final vve b() {
        ? obj = new Object();
        rxe rxe = rxe.UNKNOWN;
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.h = this.h;
        obj.g = this.g;
        obj.f = this.f;
        obj.e = this.e;
        obj.i = this.i;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wve.class != obj.getClass()) {
            return false;
        }
        wve wve = (wve) obj;
        if (Float.compare(wve.e, this.e) != 0 || this.f != wve.f || this.i != wve.i) {
            return false;
        }
        fwe fwe = wve.a;
        fwe fwe2 = this.a;
        if (fwe2 == null ? fwe != null : !fwe2.equals(fwe)) {
            return false;
        }
        String str = wve.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = wve.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = wve.d;
        String str6 = this.d;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        if (this.g != wve.g) {
            return false;
        }
        qxe qxe = wve.h;
        qxe qxe2 = this.h;
        return qxe2 != null ? qxe2.equals(qxe) : qxe == null;
    }

    public final int hashCode() {
        int i2 = 0;
        fwe fwe = this.a;
        int hashCode = (fwe != null ? fwe.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        float f2 = this.e;
        int floatToIntBits = f2 != 0.0f ? Float.floatToIntBits(f2) : 0;
        long j = this.f;
        int i3 = (((hashCode4 + floatToIntBits) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        rxe rxe = this.g;
        int hashCode5 = (i3 + (rxe != null ? rxe.hashCode() : 0)) * 31;
        qxe qxe = this.h;
        if (qxe != null) {
            i2 = qxe.hashCode();
        }
        long j2 = this.i;
        return ((hashCode5 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Upload{uploadData=");
        sb.append(this.a);
        sb.append(", preparedPath='");
        sb.append(this.b);
        sb.append("', fileName='");
        sb.append(this.c);
        sb.append("', uploadUrl='");
        sb.append(this.d);
        sb.append("', uploadProgress=");
        sb.append(this.e);
        sb.append(", totalBytes=");
        sb.append(this.f);
        sb.append(", uploadStatus=");
        sb.append(this.g);
        sb.append(", uploadResult=");
        sb.append(this.h);
        sb.append(", createdTime=");
        return m4b.i(sb, this.i, '}');
    }
}
