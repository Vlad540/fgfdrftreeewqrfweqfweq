package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/* renamed from: lq2  reason: default package */
public final class lq2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t97 b;

    public /* synthetic */ lq2(int i, t97 t97) {
        this.a = i;
        this.b = t97;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((rq2) this.b.getValue()).a().b());
            default:
                t97 t97 = this.b;
                uye h = ((rf4) t97.getValue()).h();
                uye h2 = ((rf4) t97.getValue()).h();
                uye h3 = ((rf4) t97.getValue()).h();
                uye h4 = ((rf4) t97.getValue()).h();
                StringBuilder sb = new StringBuilder("OKMessages/");
                sb.append(h.b);
                sb.append(" (");
                sb.append(h2.e);
                sb.append("; ");
                sb.append(h3.h);
                sb.append("; ");
                String l = wn6.l(sb, h4.i, ")");
                try {
                    return URLEncoder.encode(l, Charset.defaultCharset().name());
                } catch (UnsupportedEncodingException unused) {
                    return l;
                }
        }
    }
}
