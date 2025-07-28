package one.me.android.deeplink;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/android/deeplink/NewWidgetActivity;", "Lr5;", "Lefc;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class NewWidgetActivity extends r5 implements efc {
    public static final /* synthetic */ int Z0 = 0;
    public sgc Y0;

    public final String Z() {
        return null;
    }

    public final void d0() {
    }

    public final sgc g() {
        sgc sgc = this.Y0;
        if (sgc != null) {
            return sgc;
        }
        return null;
    }

    public final boolean h() {
        return false;
    }

    public final boolean h0() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, e83, r5, one.me.android.deeplink.NewWidgetActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        az1 b = x87.b(this);
        b.setId(nob.root);
        setContentView(b);
        lr4.a(this);
        NewWidgetActivity.super.onCreate(bundle);
        sgc c = bm3.c(this, b, bundle);
        c.e = 1;
        c.Q(false);
        this.Y0 = c;
        o2a.a.o().g(new nya(this, 11, a06.t(this)));
        a06.G(this, (Intent) null);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [r5, one.me.android.deeplink.NewWidgetActivity, java.lang.Object, android.app.Activity] */
    public final void onNewIntent(Intent intent) {
        NewWidgetActivity.super.onNewIntent(intent);
        a06.h(a06.t(this));
        o2a.a.o().g(new nya(this, 10, intent));
        a06.G(this, intent);
    }
}
