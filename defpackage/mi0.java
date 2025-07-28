package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: mi0  reason: default package */
public final class mi0 extends ne {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ mi0(View view, int i) {
        this.b = i;
        this.c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.b) {
            case 0:
                ni0 ni0 = (ni0) this.c;
                ni0.setIndeterminate(false);
                ni0.b(ni0.b);
                return;
            case 1:
                ni0 ni02 = (ni0) this.c;
                if (!ni02.x0) {
                    ni02.setVisibility(ni02.y0);
                    return;
                }
                return;
            default:
                ColorStateList colorStateList = ((gw7) this.c).G0;
                if (colorStateList != null) {
                    um4.h(drawable, colorStateList);
                    return;
                }
                return;
        }
    }

    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                gw7 gw7 = (gw7) this.c;
                ColorStateList colorStateList = gw7.G0;
                if (colorStateList != null) {
                    um4.g(drawable, colorStateList.getColorForState(gw7.K0, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
