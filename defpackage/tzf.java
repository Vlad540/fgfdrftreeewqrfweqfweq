package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: tzf  reason: default package */
public final class tzf extends e0g {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ int c = 2;

    public tzf(Activity activity, Intent intent) {
        this.a = intent;
        this.b = activity;
    }

    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
