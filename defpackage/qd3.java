package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: qd3  reason: default package */
public final class qd3 {
    public int a;
    public boolean b;
    public boolean c;
    public final List d;

    public qd3(List list) {
        this.d = list;
    }

    public final pd3 a(SSLSocket sSLSocket) {
        pd3 pd3;
        int i;
        boolean z;
        int i2 = this.a;
        List list = this.d;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                pd3 = null;
                break;
            }
            pd3 = (pd3) list.get(i2);
            if (pd3.b(sSLSocket)) {
                this.a = i2 + 1;
                break;
            }
            i2++;
        }
        if (pd3 != null) {
            int i3 = this.a;
            int size2 = list.size();
            while (true) {
                i = 0;
                if (i3 >= size2) {
                    z = false;
                    break;
                } else if (((pd3) list.get(i3)).b(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            this.b = z;
            boolean z2 = this.c;
            String[] strArr = pd3.c;
            String[] o = strArr != null ? nze.o(sSLSocket.getEnabledCipherSuites(), strArr, ky2.b) : sSLSocket.getEnabledCipherSuites();
            String[] strArr2 = pd3.d;
            String[] o2 = strArr2 != null ? nze.o(sSLSocket.getEnabledProtocols(), strArr2, ng9.b) : sSLSocket.getEnabledProtocols();
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            zo4 zo4 = ky2.b;
            byte[] bArr = nze.a;
            int length = supportedCipherSuites.length;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (zo4.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (z2 && i != -1) {
                String str = supportedCipherSuites[i];
                o = (String[]) Arrays.copyOf(o, o.length + 1);
                o[o.length - 1] = str;
            }
            od3 od3 = new od3(pd3);
            od3.c((String[]) Arrays.copyOf(o, o.length));
            od3.f((String[]) Arrays.copyOf(o2, o2.length));
            pd3 a2 = od3.a();
            if (a2.c() != null) {
                sSLSocket.setEnabledProtocols(a2.d);
            }
            if (a2.a() != null) {
                sSLSocket.setEnabledCipherSuites(a2.c);
            }
            return pd3;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.c + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
