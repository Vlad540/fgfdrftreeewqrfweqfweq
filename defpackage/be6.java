package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: be6  reason: default package */
public final class be6 {
    public final r7e a;
    public final jle b;
    public final ky2 c;
    public final List d;

    public be6(jle jle, ky2 ky2, List list, s16 s16) {
        this.b = jle;
        this.c = ky2;
        this.d = list;
        this.a = new r7e(new ae6(0, s16));
    }

    public final List a() {
        return (List) this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof be6) {
            be6 be6 = (be6) obj;
            return be6.b == this.b && hhd.f(be6.c, this.c) && hhd.f(be6.a(), a()) && hhd.f(be6.d, this.d);
        }
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = a().hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(q23.H(a2, 10));
        for (Certificate certificate : a2) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.b);
        sb.append(" cipherSuite=");
        sb.append(this.c);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.d;
        ArrayList arrayList2 = new ArrayList(q23.H(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
