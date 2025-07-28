package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: zee  reason: default package */
public final class zee extends hwf {
    public final /* synthetic */ Context d;
    public final /* synthetic */ TextPaint e;
    public final /* synthetic */ hwf f;
    public final /* synthetic */ afe g;

    public zee(afe afe, Context context, TextPaint textPaint, hwf hwf) {
        this.g = afe;
        this.d = context;
        this.e = textPaint;
        this.f = hwf;
    }

    public final void p(int i) {
        this.f.p(i);
    }

    public final void q(Typeface typeface, boolean z) {
        this.g.g(this.d, this.e, typeface);
        this.f.q(typeface, z);
    }
}
