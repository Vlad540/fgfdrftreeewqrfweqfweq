package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* renamed from: fb7  reason: default package */
public final class fb7 extends LinearLayout {
    public boolean a = true;
    public final t96 b;
    public final ImageView c;

    public fb7(Context context) {
        super(context, (AttributeSet) null);
        t96 t96 = new t96(context);
        t96.setAnimConfig(new s96(0, 0, 1500, 0.0f, 16));
        this.b = t96;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        setOrientation(0);
        t96.setImageResource(hnb.max_image_logo);
        float f = (float) 32;
        t96.setLayoutParams(new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)));
        imageView.setImageResource(hnb.max_text_logo);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(((float) 58) * dh4.c().getDisplayMetrics().density), a24.X(f * dh4.c().getDisplayMetrics().density));
        layoutParams.setMarginStart(a24.X(((float) 10) * dh4.c().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams);
        addView(t96);
        addView(imageView);
        setGravity(17);
        post(new eq6(3, this));
        urd.B(new z9(3, (Continuation) null, 18), this);
    }
}
