package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: jx3  reason: default package */
public final class jx3 extends LinearLayout {
    public int a = Integer.MAX_VALUE;
    public final EditText b;
    public final TextView c;

    public jx3(Context context) {
        super(context, (AttributeSet) null);
        EditText editText = new EditText(context);
        nge.d(nte.k, editText);
        editText.setGravity(8388659);
        editText.setMinLines(2);
        editText.setHintTextColor(km4.y0.r(editText).getText().h);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 8388659;
        editText.setLayoutParams(layoutParams);
        editText.setPadding(0, 0, 0, 0);
        this.b = editText;
        TextView textView = new TextView(context);
        nge.d(nte.u, textView);
        textView.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        textView.setLayoutParams(layoutParams2);
        this.c = textView;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        setClipToOutline(true);
        setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 16.0f));
        addView(editText);
        addView(textView);
        float f = (float) 12;
        setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f));
        urd.B(new z9(3, (Continuation) null, 9), this);
    }

    public final String getText() {
        return this.b.getText().toString();
    }

    public final void setHint(CharSequence charSequence) {
        this.b.setHint(charSequence);
    }

    public final void setMaxCount(int i) {
        this.a = i;
        TextView textView = this.c;
        EditText editText = this.b;
        Editable text = editText.getText();
        textView.setText(String.valueOf(i - (text != null ? text.length() : 0)));
        editText.setFilters(this.a != Integer.MAX_VALUE ? (InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.a)} : new InputFilter[0]);
    }

    public final void setTextChangeListener(u16 u16) {
        this.b.addTextChangedListener(new ae1(u16, 1, this));
    }
}
