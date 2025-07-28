package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: la7  reason: default package */
public final class la7 implements ed3 {
    public final ed3 a;
    public final /* synthetic */ w4 b;

    public la7(w4 w4Var, Context context, ExecutorService executorService, nfc nfc, r7e r7e) {
        this.b = w4Var;
        this.a = new jd3(context, executorService, nfc, r7e);
    }

    public final boolean a() {
        return this.a.a();
    }

    public final wd3 b() {
        return this.a.b();
    }

    public final void c(dd3 dd3) {
        this.a.c(dd3);
    }

    public final boolean d() {
        return this.a.d();
    }

    public final void e(dd3 dd3) {
        this.a.e(dd3);
    }

    public final boolean f() {
        return this.a.f();
    }

    public final boolean g() {
        if (this.a.g()) {
            return true;
        }
        ((rf4) this.b.c(rf4.class)).e();
        return false;
    }

    public final void invalidate() {
        this.a.invalidate();
    }
}
