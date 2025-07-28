package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: avd  reason: default package */
public final class avd extends LinearLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public avd(Context context) {
        super(context, (AttributeSet) null);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(17);
        int X = a24.X(((float) 21) * dh4.c().getDisplayMetrics().density);
        ImageView imageView = new ImageView(context);
        int X2 = a24.X(((float) 188) * dh4.c().getDisplayMetrics().density);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(X2, X2));
        addView(imageView);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        layoutParams.leftMargin = X;
        layoutParams.rightMargin = X;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        nte.d.b(textView, yq4.b);
        urd.B(new ir5(3, (Continuation) null, 1), textView);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
        layoutParams2.leftMargin = X;
        layoutParams2.rightMargin = X;
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(17);
        nte.m.b(textView2, yq4.b);
        urd.B(new ir5(3, (Continuation) null, 2), textView2);
        addView(textView2);
        this.c = textView2;
    }

    public final void setIcon(int i) {
        this.a.setImageResource(i);
    }

    public final void setSubtitle(Integer num) {
        TextView textView = this.c;
        if (num == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(num.intValue());
    }

    public final void setTitle(int i) {
        this.b.setText(i);
    }
}
