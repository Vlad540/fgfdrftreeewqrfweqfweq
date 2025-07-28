package defpackage;

import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* renamed from: yr3  reason: default package */
public final class yr3 implements s16 {
    public static final yr3 A0 = new yr3(10);
    public static final yr3 B0 = new yr3(11);
    public static final yr3 C0 = new yr3(12);
    public static final yr3 X = new yr3(3);
    public static final yr3 Y = new yr3(4);
    public static final yr3 Z = new yr3(5);
    public static final yr3 b = new yr3(0);
    public static final yr3 c = new yr3(1);
    public static final yr3 o = new yr3(2);
    public static final yr3 w0 = new yr3(6);
    public static final yr3 x0 = new yr3(7);
    public static final yr3 y0 = new yr3(8);
    public static final yr3 z0 = new yr3(9);
    public final /* synthetic */ int a;

    public /* synthetic */ yr3(int i) {
        this.a = i;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return rr3.class;
            case 1:
                return rr3.class;
            case 2:
                return rr3.class;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return nqc.a;
            case 7:
                return o2a.a;
            case 8:
                return o2a.a.o();
            case 9:
                return qda.a;
            case 10:
                return new l16(new ConcurrentHashMap(64));
            case 11:
                return new l16(new ConcurrentHashMap(64));
            default:
                SSLContext instance = SSLContext.getInstance("TLSv1.2");
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                return instance;
        }
    }
}
