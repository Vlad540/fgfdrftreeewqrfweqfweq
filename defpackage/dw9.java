package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: dw9  reason: default package */
public class dw9 extends TextView {
    public ebf a;

    public dw9(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public final ebf getObserverSpanListener() {
        return this.a;
    }

    public final void onWindowVisibilityChanged(int i) {
        ebf ebf;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            ebf ebf2 = this.a;
            if (ebf2 != null) {
                ebf2.onViewAttachedToWindow(this);
            }
        } else if (i == 8 && (ebf = this.a) != null) {
            ebf.onViewDetachedFromWindow(this);
        }
    }

    public final void setObserverSpanListener(ebf ebf) {
        this.a = ebf;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
