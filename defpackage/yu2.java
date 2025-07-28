package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: yu2  reason: default package */
public final class yu2 extends View implements mhe {
    public final uy2 a;
    public xu2 b;
    public final pv6 c;

    public yu2(Context context) {
        super(context);
        uy2 uy2 = new uy2(context, (AttributeSet) null);
        float f = (float) 28;
        uy2.h = a24.X(dh4.c().getDisplayMetrics().density * f);
        uy2.j = 0;
        uy2.c = new int[]{km4.y0.n(context).g().d().f.g};
        uy2.b = a24.X(((float) 20) * dh4.c().getDisplayMetrics().density);
        uy2.a = a24.X(((float) 3) * dh4.c().getDisplayMetrics().density);
        uy2.g = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
        this.a = uy2;
        pv6 pv6 = new pv6(context, uy2, new qn4(uy2), new qy2(uy2));
        Resources resources = context.getResources();
        int i = bob.indeterminate_static;
        o0f o0f = new o0f();
        ThreadLocal threadLocal = ubc.a;
        o0f.a = obc.a(resources, i, (Resources.Theme) null);
        new n0f(o0f.a.getConstantState());
        pv6.C0 = o0f;
        pv6.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f));
        pv6.d(true, true, true);
        pv6.setCallback(this);
        this.c = pv6;
        setLayerType(2, (Paint) null);
        float f2 = (float) 10;
        setPadding(0, a24.X(dh4.c().getDisplayMetrics().density * f2), 0, a24.X(f2 * dh4.c().getDisplayMetrics().density));
        setLayoutParams(new ViewGroup.LayoutParams(-1, me4.c(f, dh4.c().getDisplayMetrics().density, getPaddingBottom() + getPaddingTop())));
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        pv6 pv6 = this.c;
        int save = canvas.save();
        canvas.translate((((float) getWidth()) / 2.0f) - (((float) pv6.getBounds().width()) / 2.0f), (((float) getHeight()) / 2.0f) - (((float) pv6.getBounds().height()) / 2.0f));
        try {
            pv6.draw(canvas);
            canvas.restoreToCount(save);
            pv6.invalidateSelf();
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final void onThemeChanged(pda pda) {
        this.a.c = new int[]{pda.d().f.g};
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }
}
