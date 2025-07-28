package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: f41  reason: default package */
public final class f41 extends FrameLayout {
    public final TextView a;
    public final t97 b = ez3.O(3, new a01(7));

    public f41(Context context) {
        super(context, (AttributeSet) null);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, a24.X(((float) 28) * dh4.c().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setId(uob.call_event_icon);
        textView.setBackground(getBackgroundView());
        textView.setMaxLines(1);
        nge.d(nte.o, textView);
        textView.setTextColor(-855638017);
        textView.setGravity(17);
        float f = (float) 8;
        textView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), textView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), textView.getPaddingBottom());
        fja.d(textView);
        this.a = textView;
        addView(textView);
    }

    private final Drawable getBackgroundView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final float[] getBgRadius() {
        return (float[]) this.b.getValue();
    }

    public final void setLabel(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
