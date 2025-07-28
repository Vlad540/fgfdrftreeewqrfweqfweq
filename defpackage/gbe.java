package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.apache.http.client.methods.HttpGet;

/* renamed from: gbe  reason: default package */
public final class gbe extends bm3 {
    public final t97 x0;
    public qw9 y0;
    public ExecutorService z0;

    public gbe(t97 t97) {
        this.x0 = t97;
    }

    public final void L(sw9 sw9, afc afc, lac lac) {
        qw9 qw9 = this.y0;
        t97 t97 = this.x0;
        if (qw9 == null) {
            this.y0 = (qw9) t97.getValue();
        }
        qw9 qw92 = this.y0;
        if (this.z0 == null) {
            this.z0 = ((qw9) t97.getValue()).a.m();
        }
        y0c b = qw92.b(lac);
        sw9.b.a(new um6(this, b, false, 3));
        b.e(new b0d(15, this, sw9, afc, lac, false));
    }

    public final zb5 g(ah0 ah0, z4b z4b) {
        return new zb5(ah0, z4b);
    }

    public final void i(zb5 zb5, afc afc) {
        afc afc2 = afc;
        sw9 sw9 = (sw9) zb5;
        sw9.d = SystemClock.elapsedRealtime();
        Uri uri = sw9.b.a.b;
        try {
            s86 s86 = new s86();
            String dv0 = new dv0(false, true, -1, -1, false, false, false, -1, -1, false, false, false, (String) null).toString();
            if (dv0.length() == 0) {
                ((xe6) s86.c).m("Cache-Control");
            } else {
                ((xe6) s86.c).n("Cache-Control", dv0);
            }
            s86.q(uri.toString());
            ((xe6) s86.c).f("Accept", "image/webp,/;q=0.8");
            s86.m(HttpGet.METHOD_NAME, (d8) null);
            s86.p(UUID.randomUUID().toString());
            L(sw9, afc2, s86.j());
        } catch (Exception e) {
            afc2.B(e);
        }
    }

    public final HashMap k(zb5 zb5, int i) {
        sw9 sw9 = (sw9) zb5;
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(sw9.e - sw9.d));
        hashMap.put("fetch_time", Long.toString(sw9.f - sw9.e));
        hashMap.put("total_time", Long.toString(sw9.f - sw9.d));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    public final void y(zb5 zb5) {
        ((sw9) zb5).f = SystemClock.elapsedRealtime();
    }
}
