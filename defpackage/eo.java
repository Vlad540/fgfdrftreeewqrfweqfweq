package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: eo  reason: default package */
public final class eo extends vx3 {
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ WeakReference i;
    public final /* synthetic */ jo j;

    public eo(jo joVar, int i2, int i3, WeakReference weakReference) {
        this.j = joVar;
        this.g = i2;
        this.h = i3;
        this.i = weakReference;
    }

    public final void D(int i2) {
    }

    public final void E(Typeface typeface) {
        int i2 = this.g;
        if (i2 != -1) {
            typeface = io.a(typeface, i2, (this.h & 2) != 0);
        }
        jo joVar = this.j;
        if (joVar.m) {
            joVar.l = typeface;
            TextView textView = (TextView) this.i.get();
            if (textView == null) {
                return;
            }
            if (textView.isAttachedToWindow()) {
                textView.post(new fo((Object) textView, (Object) typeface, joVar.j, 0));
            } else {
                textView.setTypeface(typeface, joVar.j);
            }
        }
    }
}
