package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;

public final class f0 {
    static int f = 3;
    static volatile f0 g;
    final t a;
    final i b;
    final Context c;
    InstallReferrerClient d;
    int e;

    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            y0.a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + f0.this.e);
            f0.this.a((InstallReferrerStateListener) this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                f0.this.a((InstallReferrerStateListener) this);
                return;
            }
            y0.a("HuaweiReferrerHandler: install referrer setup is finished");
            f0.this.a(i);
        }
    }

    public f0(t tVar, i iVar, Context context) {
        this.a = tVar;
        this.b = iVar;
        this.c = context.getApplicationContext();
    }

    public static void a(t tVar, i iVar, Context context) {
        if (g == null) {
            synchronized (f0.class) {
                try {
                    if (g == null) {
                        f0 f0Var = new f0(tVar, iVar, context);
                        h.a((Runnable) new pfe(20, f0Var));
                        g = f0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(int i) {
        if (this.d == null) {
            y0.b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        if (i == 0) {
            try {
                y0.a("HuaweiReferrerHandler: retrieving install referrer");
                a(this.d.getInstallReferrer());
            } catch (Throwable th) {
                y0.b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
            }
        } else {
            y0.a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    public void a() {
        if (!p0.a(this.c).o()) {
            try {
                y0.a("HuaweiReferrerHandler: initialize InstallReferrerClient");
                this.d = InstallReferrerClient.newBuilder(this.c).build();
                a((InstallReferrerStateListener) new a());
            } catch (Throwable th) {
                if (th instanceof NoClassDefFoundError) {
                    y0.a("HuaweiReferrerHandler: InstallReferrerClient is not found");
                } else {
                    y0.a("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
                }
            }
        }
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.d == null) {
            y0.a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            y0.a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.d.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            y0.a("HuaweiReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            y0.b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }

    public void a(ReferrerDetails referrerDetails) {
        p0 a2 = p0.a(this.c);
        if (a2.o()) {
            y0.a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        y0.a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        String str = installReferrer;
        this.a.b(str, o.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        a2.s();
    }
}
