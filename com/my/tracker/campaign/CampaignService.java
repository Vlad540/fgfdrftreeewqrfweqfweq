package com.my.tracker.campaign;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.my.tracker.obfuscated.a0;
import com.my.tracker.obfuscated.h;
import com.my.tracker.obfuscated.y0;

public final class CampaignService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        y0.a("CampaignService: onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
        y0.a("CampaignService: onDestroy");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ds1 ds1 = new ds1(4, this);
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                h.a((Runnable) new g5(this, stringExtra, ds1, 14));
                return super.onStartCommand((Intent) null, i, i2);
            }
        }
        h.a((Runnable) ds1);
        return 2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a0.a(str, (Context) this, runnable);
    }
}
