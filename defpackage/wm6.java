package defpackage;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: wm6  reason: default package */
public final class wm6 extends bm3 {
    public final int x0;
    public final ExecutorService y0 = Executors.newFixedThreadPool(3);
    public final b69 z0;

    public wm6() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.z0 = realtimeSinceBootClock;
        this.x0 = 30000;
    }

    public final HttpURLConnection L(Uri uri, int i) {
        URL url;
        String str;
        Uri uri2 = fye.a;
        Uri uri3 = null;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.x0);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (!(responseCode == 307 || responseCode == 308)) {
            switch (responseCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[]{uri.toString(), Integer.valueOf(responseCode)}));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        if (headerField != null) {
            uri3 = Uri.parse(headerField);
        }
        String scheme = uri.getScheme();
        if (i > 0 && uri3 != null && !at7.o(uri3.getScheme(), scheme)) {
            return L(uri3, i - 1);
        }
        if (i == 0) {
            String uri4 = uri.toString();
            Locale.getDefault();
            str = "URL " + uri4 + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", new Object[]{uri.toString(), Integer.valueOf(responseCode)});
        }
        throw new IOException(str);
    }

    public final zb5 g(ah0 ah0, z4b z4b) {
        return new zb5(ah0, z4b);
    }

    public final void i(zb5 zb5, afc afc) {
        vm6 vm6 = (vm6) zb5;
        vm6.d = this.z0.now();
        ((ji0) vm6.b).a(new um6(this.y0.submit(new ue3(3, this, vm6, afc, false)), 0, afc));
    }

    public final HashMap k(zb5 zb5, int i) {
        vm6 vm6 = (vm6) zb5;
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(vm6.e - vm6.d));
        hashMap.put("fetch_time", Long.toString(vm6.f - vm6.e));
        hashMap.put("total_time", Long.toString(vm6.f - vm6.d));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    public final void y(zb5 zb5) {
        ((vm6) zb5).f = this.z0.now();
    }
}
