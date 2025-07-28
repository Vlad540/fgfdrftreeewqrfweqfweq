package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Locale;
import java.util.NoSuchElementException;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: ede  reason: default package */
public final class ede implements X509TrustManager {
    public final String a;
    public final String b;
    public final X509TrustManager c;
    public final X509TrustManagerExtensions d;

    public ede(String str) {
        this.a = str;
        String name = ede.class.getName();
        this.b = name;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, "init, useX509Extension=true", (Throwable) null);
        }
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        X509TrustManager x509TrustManager = (X509TrustManager) instance.getTrustManagers()[0];
        this.c = x509TrustManager;
        this.d = new X509TrustManagerExtensions(x509TrustManager);
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        String str2 = this.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str2, rf0.h("checkClientTrusted, authType=", str), (Throwable) null);
        }
        this.c.checkClientTrusted(x509CertificateArr, str);
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        String str2 = this.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str2, rf0.h("checkServerTrusted, authType=", str), (Throwable) null);
        }
        try {
            if (this.d != null) {
                String str3 = this.b;
                fn6 fn62 = udd.e;
                if (fn62 != null) {
                    if (fn62.c()) {
                        fn62.d(tn7.X, str3, "checkServerTrusted, use X509 extension, host=" + this.a, (Throwable) null);
                    }
                }
                this.d.checkServerTrusted(x509CertificateArr, str, this.a);
                return;
            }
            this.c.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            udd.s(this.b, "server certificate chain not trusted", e);
            if (x509CertificateArr != null) {
                String str4 = this.b;
                fn6 fn63 = udd.e;
                if (fn63 != null && fn63.c()) {
                    tn7 tn7 = tn7.X;
                    StringBuilder sb = new StringBuilder("\n");
                    int length = x509CertificateArr.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(i);
                        sb.append('.');
                        sb.append(' ');
                        udd.a(sb, x509CertificateArr[i]);
                    }
                    fn63.d(tn7, str4, "server certificate chain: " + sb, (Throwable) null);
                }
            }
            try {
                Locale locale = Locale.getDefault();
                StringBuilder sb2 = new StringBuilder();
                X509Certificate[] acceptedIssuers = this.c.getAcceptedIssuers();
                int i2 = 0;
                while (i2 < acceptedIssuers.length) {
                    int i3 = i2 + 1;
                    X509Certificate x509Certificate = acceptedIssuers[i2];
                    Principal issuerDN = x509Certificate.getIssuerDN();
                    String name = issuerDN != null ? issuerDN.getName() : null;
                    Principal subjectDN = x509Certificate.getSubjectDN();
                    String name2 = subjectDN != null ? subjectDN.getName() : null;
                    if (name != null) {
                        if (h0e.R(name.toLowerCase(locale), "comodo", false)) {
                            udd.a(sb2, x509Certificate);
                            i2 = i3;
                        }
                    }
                    if (name2 != null) {
                        if (!h0e.R(name2.toLowerCase(locale), "comodo", false)) {
                        }
                        udd.a(sb2, x509Certificate);
                    }
                    i2 = i3;
                }
                String str5 = this.b;
                fn6 fn64 = udd.e;
                if (fn64 != null && fn64.c()) {
                    fn64.d(tn7.X, str5, "trusted store certificates: " + sb2, (Throwable) null);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            } catch (GeneralSecurityException e3) {
                udd.s(this.b, "failed to log trusted store certificates", e3);
            }
            throw e;
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.c.getAcceptedIssuers();
    }
}
