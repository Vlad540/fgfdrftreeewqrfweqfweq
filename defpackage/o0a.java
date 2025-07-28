package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: o0a  reason: default package */
public final /* synthetic */ class o0a implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0a b;

    public /* synthetic */ o0a(p0a p0a, int i) {
        this.a = i;
        this.b = p0a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return e07.a(this.b.a);
            default:
                Context context = this.b.a;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
                return Integer.valueOf(f > 800.0f ? me4.p((float) 100, dh4.c().getDisplayMetrics().density, gwf.w(context).getWidth()) : f > 360.0f ? a24.X(((float) 291) * dh4.c().getDisplayMetrics().density) : a24.X(((float) 248) * dh4.c().getDisplayMetrics().density));
        }
    }
}
