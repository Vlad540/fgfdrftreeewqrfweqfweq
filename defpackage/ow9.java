package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: ow9  reason: default package */
public final class ow9 implements HostnameVerifier {
    public static final ow9 a = new Object();

    public static List a(X509Certificate x509Certificate, int i) {
        hw4 hw4 = hw4.a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List next : subjectAlternativeNames) {
                    if (next != null) {
                        if (next.size() >= 2) {
                            if (!(!hhd.f(next.get(0), Integer.valueOf(i)))) {
                                Object obj = next.get(1);
                                if (obj != null) {
                                    arrayList.add((String) obj);
                                }
                            }
                        }
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return hw4;
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(rf0.f(length2, "endIndex < beginIndex: ", " < 0").toString());
        } else if (length2 <= str.length()) {
            long j = 0;
            int i2 = 0;
            while (i2 < length2) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    j++;
                } else {
                    if (charAt < 2048) {
                        i = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i = 3;
                    } else {
                        int i3 = i2 + 1;
                        char charAt2 = i3 < length2 ? str.charAt(i3) : 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j++;
                            i2 = i3;
                        } else {
                            j += (long) 4;
                            i2 += 2;
                        }
                    }
                    j += (long) i;
                }
                i2++;
            }
            return length == ((int) j);
        } else {
            StringBuilder m = me4.m(length2, "endIndex > string.length: ", " > ");
            m.append(str.length());
            throw new IllegalArgumentException(m.toString().toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0108 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r9, java.security.cert.X509Certificate r10) {
        /*
            p7c r0 = defpackage.nze.f
            boolean r0 = r0.a(r9)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.String r9 = bm3.J(r9)
            r0 = 7
            java.util.List r10 = a(r10, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x001c
        L_0x0019:
            r1 = r2
            goto L_0x0108
        L_0x001c:
            java.util.Iterator r10 = r10.iterator()
        L_0x0020:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = bm3.J(r0)
            boolean r0 = defpackage.hhd.f(r9, r0)
            if (r0 == 0) goto L_0x0020
            goto L_0x0108
        L_0x0038:
            boolean r0 = b(r9)
            if (r0 == 0) goto L_0x0044
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r0)
        L_0x0044:
            r0 = 2
            java.util.List r10 = a(r10, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0050
            goto L_0x0019
        L_0x0050:
            java.util.Iterator r10 = r10.iterator()
        L_0x0054:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r9.length()
            if (r3 != 0) goto L_0x0068
            goto L_0x00db
        L_0x0068:
            java.lang.String r3 = "."
            boolean r4 = defpackage.p0e.Q(r9, r3, r2)
            if (r4 != 0) goto L_0x00db
            java.lang.String r4 = ".."
            boolean r5 = r9.endsWith(r4)
            if (r5 == 0) goto L_0x0079
            goto L_0x00db
        L_0x0079:
            if (r0 == 0) goto L_0x00db
            int r5 = r0.length()
            if (r5 != 0) goto L_0x0082
            goto L_0x00db
        L_0x0082:
            boolean r5 = defpackage.p0e.Q(r0, r3, r2)
            if (r5 != 0) goto L_0x00db
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L_0x008f
            goto L_0x00db
        L_0x008f:
            boolean r4 = r9.endsWith(r3)
            if (r4 != 0) goto L_0x009a
            java.lang.String r4 = r9.concat(r3)
            goto L_0x009b
        L_0x009a:
            r4 = r9
        L_0x009b:
            boolean r5 = r0.endsWith(r3)
            if (r5 != 0) goto L_0x00a5
            java.lang.String r0 = r0.concat(r3)
        L_0x00a5:
            boolean r3 = b(r0)
            if (r3 == 0) goto L_0x00b1
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
        L_0x00b1:
            java.lang.String r3 = "*"
            boolean r3 = defpackage.h0e.R(r0, r3, r2)
            if (r3 != 0) goto L_0x00be
            boolean r0 = defpackage.hhd.f(r4, r0)
            goto L_0x0106
        L_0x00be:
            java.lang.String r3 = "*."
            boolean r5 = defpackage.p0e.Q(r0, r3, r2)
            if (r5 == 0) goto L_0x00db
            r5 = 42
            r6 = 4
            int r5 = defpackage.h0e.Z(r0, r5, r1, r2, r6)
            r7 = -1
            if (r5 == r7) goto L_0x00d1
            goto L_0x00db
        L_0x00d1:
            int r5 = r4.length()
            int r8 = r0.length()
            if (r5 >= r8) goto L_0x00dd
        L_0x00db:
            r0 = r2
            goto L_0x0106
        L_0x00dd:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00e4
            goto L_0x00db
        L_0x00e4:
            java.lang.String r0 = r0.substring(r1)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto L_0x00ef
            goto L_0x00db
        L_0x00ef:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x0105
            int r3 = r3 + -1
            r0 = 46
            int r0 = defpackage.h0e.e0(r4, r0, r3, r6)
            if (r0 == r7) goto L_0x0105
            goto L_0x00db
        L_0x0105:
            r0 = r1
        L_0x0106:
            if (r0 == 0) goto L_0x0054
        L_0x0108:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow9.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return c(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
