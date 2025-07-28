package defpackage;

import android.view.View;

/* renamed from: qud  reason: default package */
public final class qud {
    public final View a;
    public final boolean b = false;
    public int c;
    public int d;
    public final ms e;
    public ktd f;

    public qud(View view) {
        this.a = view;
        ms msVar = new ms(9);
        msVar.b = 0;
        msVar.c = 0;
        this.e = msVar;
    }

    public final ms a(int i, int i2) {
        int i3;
        ms msVar = this.e;
        msVar.b = i;
        msVar.c = i2;
        ktd ktd = this.f;
        if (ktd == null) {
            return msVar;
        }
        boolean z = this.b;
        int i4 = ktd.x0;
        if (z) {
            i3 = this.d;
        } else {
            i3 = this.c;
            if (i4 >= i3 && i4 <= (i3 = this.d)) {
                i3 = i4;
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.a;
        if (mode == 1073741824) {
            i3 = (int) Math.min((double) i3, (double) ((View.MeasureSpec.getSize(i2) - view.getPaddingBottom()) - view.getPaddingTop()));
        }
        float f2 = ((float) ktd.w0) / ((float) i4);
        msVar.b = View.MeasureSpec.makeMeasureSpec(view.getPaddingRight() + view.getPaddingLeft() + ((int) (f2 * ((float) i3))), 1073741824);
        msVar.c = View.MeasureSpec.makeMeasureSpec(view.getPaddingBottom() + view.getPaddingTop() + i3, 1073741824);
        return msVar;
    }

    public final void b(ktd ktd) {
        this.f = ktd;
        c();
    }

    public final void c() {
        ktd ktd = this.f;
        if (ktd == null || !ktd.y0) {
            float f2 = (float) 170;
            this.c = a24.X(dh4.c().getDisplayMetrics().density * f2);
            this.d = a24.X(f2 * dh4.c().getDisplayMetrics().density);
            return;
        }
        this.c = a24.X(((float) 158) * dh4.c().getDisplayMetrics().density);
        this.d = a24.X(((float) 194) * dh4.c().getDisplayMetrics().density);
    }
}
