package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: ltf  reason: default package */
public final class ltf extends ContextWrapper implements qa3 {
    public final ktf a;
    public final /* synthetic */ mtf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ltf(mtf mtf, Context context) {
        super(context);
        this.b = mtf;
        this.a = new ktf(mtf, mtf.a.getApplicationContext());
    }

    public final sa3 a() {
        return this.b.a.getApplicationContext().a();
    }

    public final Context getApplicationContext() {
        return this.a;
    }
}
