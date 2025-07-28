package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: w8e  reason: default package */
public final /* synthetic */ class w8e implements SystemServicesManager$PushTokenGeneratedListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ b9e b;

    public /* synthetic */ w8e(String str, b9e b9e) {
        this.a = str;
        this.b = b9e;
    }

    public final void onPushTokenGenerated(String str) {
        if (!hhd.f(this.a, str)) {
            b9e b9e = this.b;
            udd.q(b9e.a, "checkTokenChanged: token changed");
            ((SystemServicesManager$PushTokenGeneratedListener) b9e.X.getValue()).onPushTokenGenerated(str);
        }
    }
}
