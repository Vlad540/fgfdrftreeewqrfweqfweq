package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: qn  reason: default package */
public class qn extends SeekBar {
    public final rn a;

    public qn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ylb.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        rn rnVar = this.a;
        Drawable drawable = rnVar.Y;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = rnVar.X;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.Y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.Y(canvas);
    }

    public qn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vhe.a(getContext(), this);
        rn rnVar = new rn(this);
        this.a = rnVar;
        rnVar.Q(attributeSet, i);
    }
}
