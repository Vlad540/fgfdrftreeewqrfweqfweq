package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: h11  reason: default package */
public final class h11 extends FrameLayout {
    public final Drawable a;
    public final Drawable b;

    public h11(Context context) {
        super(context, (AttributeSet) null);
        t97 O = ez3.O(3, new a01(2));
        Drawable b2 = gq3.b(context, cnb.ic_call_speaker_24);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        b2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.a = b2;
        Drawable b3 = gq3.b(context, phc.a0);
        b3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.b = b3;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) O.getValue(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(-15263716);
        setBackground(shapeDrawable);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int height = ((getHeight() - getPaddingTop()) - paddingTop) / 2;
        Drawable drawable = this.a;
        drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), (getHeight() - paddingTop) - height);
        drawable.draw(canvas);
        Drawable drawable2 = this.b;
        drawable2.setBounds(getPaddingLeft(), getPaddingTop() + height + paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        drawable2.draw(canvas);
    }
}
