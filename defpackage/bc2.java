package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: bc2  reason: default package */
public final class bc2 extends LinearLayout {
    public final ImageView a;
    public final TextView b;

    public bc2(Context context) {
        super(context, (AttributeSet) null);
        ImageView imageView = new ImageView(context);
        float f = (float) 188;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        setGravity(1);
        urd.B(new ac2(3, (Continuation) null, 0), imageView);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(1);
        nte.d.b(textView, yq4.b);
        urd.B(new y9(3, (Continuation) null, 4), textView);
        this.b = textView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setGravity(17);
        setOrientation(1);
        addView(imageView);
        addView(textView);
    }

    public final void setIcon(int i) {
        this.a.setImageDrawable(gq3.b(getContext(), i));
    }

    public final void setTitle(int i) {
        this.b.setText(d8.u(getContext(), i));
    }
}
