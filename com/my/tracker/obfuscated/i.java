package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class i {
    final AtomicBoolean a = new AtomicBoolean(false);
    final z0 b;
    final Context c;

    public i(z0 z0Var, Context context) {
        this.b = z0Var;
        this.c = context.getApplicationContext();
    }

    public static i a(z0 z0Var, Context context) {
        return new i(z0Var, context);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            y0.a("AttributionHandler: referrer is empty");
        } else if (a()) {
            y0.a("AttributionHandler: attribution has already been received");
        } else {
            try {
                String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
                if (TextUtils.isEmpty(queryParameter)) {
                    y0.a("AttributionHandler: deeplink is empty");
                } else {
                    a(new JSONObject().put("deeplink", queryParameter));
                }
            } catch (Throwable th) {
                y0.b("AttributionHandler error: handling referrer failed with error: ", th);
            }
        }
    }

    public void b(String str) {
        if (a()) {
            y0.a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("attribution");
            if (optJSONObject == null) {
                y0.a("AttributionHandler: empty attribution object has been returned");
            } else if (optJSONObject.has("error")) {
                int optInt = optJSONObject.optInt("error");
                y0.a("AttributionHandler: attribution response returned error " + optInt);
            } else {
                a(optJSONObject);
            }
        } catch (Throwable th) {
            y0.b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }

    public boolean a() {
        if (this.a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(p0.a(this.c).g());
    }

    public void a(JSONObject jSONObject) {
        String optString = jSONObject.optString("deeplink");
        if (TextUtils.isEmpty(optString)) {
            y0.a("AttributionHandler: deeplink is empty");
        } else if (!this.a.compareAndSet(false, true)) {
            y0.a("AttributionHandler: attribution has already been received");
        } else {
            p0 a2 = p0.a(this.c);
            if (!TextUtils.isEmpty(a2.g())) {
                y0.a("AttributionHandler: attribution has already been received");
                return;
            }
            a2.i(jSONObject.toString());
            MyTracker.AttributionListener c2 = this.b.c();
            if (c2 != null) {
                Handler b2 = this.b.b();
                if (b2 == null) {
                    b2 = h.b;
                }
                try {
                    b2.post(new jwf(c2, 4, MyTrackerAttribution.newAttribution(optString)));
                } catch (Throwable th) {
                    y0.b("AttributionHandler error: exception occurred while post runnable", th);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            y0.b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }
}
