package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: ktf  reason: default package */
public final class ktf extends ContextWrapper implements qa3 {
    public final /* synthetic */ mtf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ktf(mtf mtf, Context context) {
        super(context);
        this.a = mtf;
    }

    public final sa3 a() {
        return this.a.a.getApplicationContext().a();
    }

    public final boolean isDeviceProtectedStorage() {
        return false;
    }
}
