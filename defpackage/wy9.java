package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import one.me.android.OneMeApplication;

/* renamed from: wy9  reason: default package */
public final class wy9 extends ContextWrapper {
    public final /* synthetic */ OneMeApplication a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wy9(Context context, OneMeApplication oneMeApplication) {
        super(context);
        this.a = oneMeApplication;
    }

    public final Context getApplicationContext() {
        return this.a;
    }
}
