package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.List;

/* renamed from: qjc  reason: default package */
public abstract class qjc {
    public final ad9 a;
    public final int b;
    public final a39 c;
    public boolean d;

    public qjc(xu5 xu5, ad9 ad9) {
        this.a = ad9;
        this.c = xu5.k;
        this.b = pfa.r(xu5.n);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ms6, ft6] */
    public static String i(xu5 xu5, List list) {
        String str;
        String str2 = xu5.n;
        oyb.g(str2);
        boolean k = c49.k(str2);
        ? ms6 = new ms6(4);
        ms6.j(str2);
        if (k) {
            ms6.j("video/hevc");
            ms6.j("video/avc");
        }
        ms6.k(list);
        ws6 a2 = ms6.l().a();
        int i = 0;
        while (true) {
            int size = a2.size();
            z23 z23 = xu5.A;
            if (i < size) {
                String str3 = (String) a2.get(i);
                if (list.contains(str3)) {
                    if (!k || !z23.g(z23)) {
                        if (!by4.f(str3).isEmpty()) {
                            return str3;
                        }
                    } else if (!by4.g(str3, z23).isEmpty()) {
                        return str3;
                    }
                }
                i++;
            } else {
                boolean k2 = c49.k(str2);
                if (!k2 || !z23.g(z23)) {
                    str = "No MIME type is supported by both encoder and muxer.";
                } else {
                    str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + z23;
                }
                throw ExportException.c(new IllegalArgumentException(str), 4003, new od3(xu5.toString(), (String) null, k2, false));
            }
        }
    }

    public abstract ob6 j(gs4 gs4, xu5 xu5, int i);

    public abstract n24 k();

    public abstract xu5 l();

    public abstract boolean m();

    public boolean n() {
        return false;
    }

    public abstract void o();

    public abstract void p();
}
