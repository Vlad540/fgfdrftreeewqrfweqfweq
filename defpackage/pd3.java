package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: pd3  reason: default package */
public final class pd3 {
    public static final pd3 e;
    public static final pd3 f = new pd3(false, false, (String[]) null, (String[]) null);
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        ky2 ky2 = ky2.q;
        ky2 ky22 = ky2.r;
        ky2 ky23 = ky2.s;
        ky2 ky24 = ky2.k;
        ky2 ky25 = ky2.m;
        ky2 ky26 = ky2.l;
        ky2 ky27 = ky2.n;
        ky2 ky28 = ky2.p;
        ky2 ky29 = ky2.o;
        ky2 ky210 = ky2;
        ky2 ky211 = ky22;
        ky2 ky212 = ky23;
        ky2 ky213 = ky24;
        ky2 ky214 = ky25;
        ky2 ky215 = ky26;
        ky2 ky216 = ky27;
        ky2 ky217 = ky28;
        ky2[] ky2Arr = {ky210, ky211, ky212, ky213, ky214, ky215, ky216, ky217, ky29, ky2.i, ky2.j, ky2.g, ky2.h, ky2.e, ky2.f, ky2.d};
        od3 od3 = new od3(0);
        od3.b((ky2[]) Arrays.copyOf(new ky2[]{ky210, ky211, ky212, ky213, ky214, ky215, ky216, ky217, ky29}, 9));
        jle jle = jle.TLS_1_3;
        jle jle2 = jle.TLS_1_2;
        od3.e(jle, jle2);
        od3.d();
        od3.a();
        od3 od32 = new od3(0);
        od32.b((ky2[]) Arrays.copyOf(ky2Arr, 16));
        od32.e(jle, jle2);
        od32.d();
        e = od32.a();
        od3 od33 = new od3(0);
        od33.b((ky2[]) Arrays.copyOf(ky2Arr, 16));
        od33.e(jle, jle2, jle.TLS_1_1, jle.TLS_1_0);
        od33.d();
        od33.a();
    }

    public pd3(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String f2 : strArr) {
            arrayList.add(ky2.t.f(f2));
        }
        return o23.s0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !nze.i(strArr, sSLSocket.getEnabledProtocols(), ng9.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || nze.i(strArr2, sSLSocket.getEnabledCipherSuites(), ky2.b);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String A : strArr) {
            arrayList.add(a24.A(A));
        }
        return o23.s0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pd3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        pd3 pd3 = (pd3) obj;
        boolean z = pd3.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.c, pd3.c) && Arrays.equals(this.d, pd3.d) && this.b == pd3.b);
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        int i = 0;
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
