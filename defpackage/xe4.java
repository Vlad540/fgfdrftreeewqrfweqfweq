package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: xe4  reason: default package */
public final class xe4 extends LinearLayout implements mhe {
    public static final /* synthetic */ k77[] z0;
    public final we4 a = new we4(this, 0);
    public final we4 b = new we4(this, 1);
    public final we4 c = new we4(Integer.valueOf(j9a.L), this, 2);
    public final we4 o;
    public final we4 w0;
    public final EditText x0;
    public final TextView y0;

    static {
        Class<xe4> cls = xe4.class;
        z0 = new k77[]{new hc9(cls, "maxCount", "getMaxCount()I"), c3d.g(m7c.a, cls, "backgroundColorAttr", "getBackgroundColorAttr()Ljava/lang/Integer;"), new hc9(cls, "textColorAttr", "getTextColorAttr()I"), new hc9(cls, "hintColorAttr", "getHintColorAttr()I"), new hc9(cls, "limitTextColorAttr", "getLimitTextColorAttr()I")};
    }

    public xe4(Context context) {
        super(context, (AttributeSet) null);
        int i = j9a.M;
        this.o = new we4(Integer.valueOf(i), this, 3);
        this.w0 = new we4(Integer.valueOf(i), this, 4);
        EditText editText = new EditText(context);
        editText.setId(qhc.M);
        nte.k.b(editText, yq4.b);
        editText.setBackground((Drawable) null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        editText.setGravity(8388659);
        editText.setMinLines(2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 8388659;
        editText.setLayoutParams(layoutParams);
        editText.setPadding(0, 0, 0, 0);
        this.x0 = editText;
        TextView textView = new TextView(context);
        nte.u.b(textView, yq4.b);
        textView.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        textView.setLayoutParams(layoutParams2);
        this.y0 = textView;
        setOrientation(0);
        setGravity(16);
        setClipToOutline(true);
        setOutlineProvider(new eu3((float) a24.X(((float) 16) * dh4.c().getDisplayMetrics().density)));
        addView(editText);
        addView(textView);
        float f = (float) 12;
        setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f));
        onThemeChanged(km4.y0.r(this));
    }

    public final Integer getBackgroundColorAttr() {
        k77 k77 = z0[1];
        return (Integer) this.b.b;
    }

    public final int getHintColorAttr() {
        k77 k77 = z0[3];
        return ((Number) this.o.b).intValue();
    }

    public final int getLimitTextColorAttr() {
        k77 k77 = z0[4];
        return ((Number) this.w0.b).intValue();
    }

    public final int getMaxCount() {
        k77 k77 = z0[0];
        return ((Number) this.a.b).intValue();
    }

    public final int getTextColorAttr() {
        k77 k77 = z0[2];
        return ((Number) this.c.b).intValue();
    }

    public final void onThemeChanged(pda pda) {
        EditText editText = this.x0;
        Drawable textCursorDrawable = editText.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            pda.getText();
            gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        }
        Integer backgroundColorAttr = getBackgroundColorAttr();
        s59 s59 = km4.y0;
        if (backgroundColorAttr != null) {
            setBackgroundColor(s59.r(this).i(backgroundColorAttr.intValue()));
        }
        editText.setTextColor(s59.r(this).i(getTextColorAttr()));
        editText.setHintTextColor(s59.r(this).i(getHintColorAttr()));
        this.y0.setTextColor(s59.r(this).i(getLimitTextColorAttr()));
    }

    public final void setBackgroundColorAttr(Integer num) {
        this.b.o1(this, z0[1], num);
    }

    public final void setHint(mge mge) {
        this.x0.setHint(mge.c(this));
    }

    public final void setHintColorAttr(int i) {
        this.o.o1(this, z0[3], Integer.valueOf(i));
    }

    public final void setLimitTextColorAttr(int i) {
        this.w0.o1(this, z0[4], Integer.valueOf(i));
    }

    public final void setMaxCount(int i) {
        this.a.o1(this, z0[0], Integer.valueOf(i));
    }

    public final void setText(String str) {
        this.x0.setText(str);
        TextView textView = this.y0;
        int i = 0;
        textView.setVisibility(getMaxCount() != Integer.MAX_VALUE ? 0 : 8);
        int maxCount = getMaxCount();
        if (str != null) {
            i = str.length();
        }
        textView.setText(String.valueOf(maxCount - i));
    }

    public final void setTextColorAttr(int i) {
        this.c.o1(this, z0[2], Integer.valueOf(i));
    }
}
