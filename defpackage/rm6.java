package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rm6  reason: default package */
public final class rm6 extends ms9 {
    public static final /* synthetic */ int Z = 0;
    public final String X;
    public final qmc Y;
    public final t97 a;
    public final int b;
    public final String c;
    public final String o;

    public rm6(t97 t97, int i, String str, String str2, String str3, qmc qmc) {
        this.a = t97;
        this.b = i;
        this.c = str;
        this.o = str2;
        this.X = str3;
        this.Y = qmc;
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.Object, m2d] */
    /* JADX WARNING: type inference failed for: r14v3, types: [dg5, java.lang.Object] */
    public final void q(bw9 bw9) {
        qm6 qm6;
        String str;
        sm6 sm6;
        long j;
        String str2;
        dg5 dg5 = null;
        qm6 qm62 = new qm6(bw9, this.a, this.b, this.c, this.o, this.X, this.Y.a());
        bw9.d(qm62);
        if (!qm62.w0.get()) {
            int i = qm62.b;
            String str3 = qm62.c;
            String str4 = qm62.o;
            String str5 = qm62.X;
            gg5 gg5 = (gg5) ((gm6) qm62.a.getValue());
            gg5.getClass();
            udd.q("gg5", "upload");
            File file = new File(str3);
            if (!file.exists()) {
                qm62.b("file not found", pa2.m);
            } else if (file.length() == 0) {
                qm62.b("file is zero length", pa2.n);
            } else {
                int t = hr1.t(i);
                if (t == 0) {
                    str = "HTTP_UPLOAD_IMAGE";
                } else if (t == 1) {
                    str = "HTTP_UPLOAD_AUDIO";
                } else if (t == 2) {
                    str = "HTTP_UPLOAD_VIDEO";
                } else if (t != 3) {
                    if (i == 1) {
                        str2 = "PHOTO";
                    } else if (i == 2) {
                        str2 = "AUDIO";
                    } else if (i == 3) {
                        str2 = "VIDEO";
                    } else if (i == 4) {
                        str2 = "FILE";
                    } else if (i == 5) {
                        str2 = "STICKER";
                    } else {
                        throw null;
                    }
                    str = "HTTP_UPLOAD_".concat(str2);
                } else {
                    str = "HTTP_UPLOAD_FILE";
                }
                ? obj = new Object();
                obj.f = gg5.c.b();
                obj.a = str;
                int t2 = hr1.t(i);
                lg8 lg8 = t2 != 0 ? (t2 == 1 || t2 == 2 || t2 == 3 || t2 == 4) ? gg5.d : null : gg5.e;
                try {
                    u93 u93 = new u93();
                    u93.j((sm6) null, str5);
                    sm6 = u93.b();
                } catch (IllegalArgumentException unused) {
                    sm6 = null;
                }
                if (sm6 == null) {
                    udd.s("gg5", "url is not valid - try to get new url from server", (Throwable) null);
                    gg5.f(qm62);
                } else {
                    if (i == 5) {
                        j = 0;
                    } else if (i == 1) {
                        try {
                            j = gg5.g(sm6);
                        } catch (eg5 e) {
                            qm6 = qm62;
                            qm6.b("upload failed", e.a);
                        } catch (IOException e2) {
                            qm6 = qm62;
                            String obj2 = e2.toString();
                            am6 am6 = pa2.l;
                            if (obj2 != null) {
                                am6 = new am6(-1, "UNKNOWN_ERROR", obj2);
                            }
                            qm6.b("upload failed", am6);
                        }
                    } else {
                        j = gg5.d(sm6);
                    }
                    if (j < 0) {
                        udd.s("gg5", "url expired - try to get new url from server", (Throwable) null);
                        gg5.f(qm62);
                    } else {
                        m2d m2d = obj;
                        String str6 = str4;
                        long j2 = j;
                        int i2 = i;
                        qm6 = qm62;
                        lac b2 = gg5.b(file, str4, sm6, lg8, j2, m2d, qm62, i2);
                        y0c b3 = ((qw9) gg5.b.getValue()).b(b2);
                        ? obj3 = new Object();
                        obj3.b = false;
                        obj3.a = b3;
                        bg5 bg5 = r7;
                        dg5 dg52 = obj3;
                        bg5 bg52 = new bg5(gg5, b2, qm6, m2d, file, new AtomicBoolean(), str6, sm6, lg8, i2, dg52);
                        b3.e(bg5);
                        dg5 = dg52;
                        qm6.set(dg5);
                    }
                }
            }
            qm6 = qm62;
            qm6.set(dg5);
        }
    }
}
