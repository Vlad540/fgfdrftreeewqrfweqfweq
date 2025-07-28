package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: oj0  reason: default package */
public final class oj0 extends n06 {
    public final gse f;

    public oj0(gse gse) {
        this.f = gse;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof oj0) && hhd.f(((oj0) obj).f, this.f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final List k(String str, List list) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        int i = 0;
        boolean z = false;
        while (i < 9) {
            Object e = rf0.e(arrayList, 1);
            if (e != null) {
                X509Certificate x509Certificate = (X509Certificate) e;
                X509Certificate a = this.f.a(x509Certificate);
                if (a != null) {
                    if (arrayList.size() > 1 || (!x509Certificate.equals(a))) {
                        arrayList.add(a);
                    }
                    if (!(!hhd.f(a.getIssuerDN(), a.getSubjectDN()))) {
                        try {
                            a.verify(a.getPublicKey());
                            return arrayList;
                        } catch (GeneralSecurityException unused) {
                        }
                    }
                    z = true;
                } else {
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            X509Certificate x509Certificate2 = (X509Certificate) next;
                            if (!(!hhd.f(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()))) {
                                try {
                                    x509Certificate.verify(x509Certificate2.getPublicKey());
                                    it.remove();
                                    arrayList.add(x509Certificate2);
                                } catch (GeneralSecurityException unused2) {
                                    continue;
                                }
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                        }
                    }
                    if (z) {
                        return arrayList;
                    }
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                i++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
