package ru.ok.messages.views.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.tamtam.animoji.views.AnimojiTextView;

public class EllipsizingEndTextView extends AnimojiTextView {
    public static final Pattern I0 = Pattern.compile("[\\.,…;\\:\\s]*$", 32);
    public boolean A0;
    public boolean B0;
    public CharSequence C0;
    public int D0;
    public float E0 = 1.0f;
    public float F0 = 0.0f;
    public Pattern G0;
    public boolean H0;

    /* JADX WARNING: type inference failed for: r2v0, types: [ru.ok.messages.views.widgets.EllipsizingEndTextView, android.widget.TextView] */
    public EllipsizingEndTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        EllipsizingEndTextView.super.setEllipsize((TextUtils.TruncateAt) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091});
        setMaxLines(obtainStyledAttributes.getInt(0, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
        setEndPunctuationPattern(I0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [ru.ok.messages.views.widgets.EllipsizingEndTextView, android.view.View] */
    private int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / l("").getLineBottom(0);
    }

    private int getLinesCount() {
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    @SuppressLint({"Override"})
    public int getMaxLines() {
        return this.D0;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [ru.ok.messages.views.widgets.EllipsizingEndTextView, android.widget.TextView, android.view.View] */
    public final StaticLayout l(CharSequence charSequence) {
        int i;
        int i2;
        Drawable[] compoundDrawables = getCompoundDrawables();
        int i3 = 0;
        Drawable drawable = compoundDrawables[0];
        if (drawable != null) {
            i2 = drawable.getIntrinsicWidth();
            i = getCompoundDrawablePadding();
        } else {
            i2 = 0;
            i = 0;
        }
        Drawable drawable2 = compoundDrawables[2];
        if (drawable2 != null) {
            i3 = drawable2.getIntrinsicWidth();
            i += getCompoundDrawablePadding();
        }
        return new StaticLayout(charSequence, getPaint(), ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - i2) - i3) - i, Layout.Alignment.ALIGN_NORMAL, this.E0, this.F0, false);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [androidx.appcompat.widget.AppCompatTextView, ru.ok.messages.views.widgets.EllipsizingEndTextView, android.widget.TextView, ru.ok.tamtam.animoji.views.AnimojiTextView] */
    public final void onDraw(Canvas canvas) {
        if (this.A0) {
            CharSequence charSequence = "…";
            if (this.H0) {
                CharSequence charSequence2 = this.C0;
                charSequence = TextUtils.concat(new CharSequence[]{charSequence, charSequence2.subSequence(charSequence2.length() - 1, this.C0.length())});
            }
            CharSequence charSequence3 = this.C0;
            StaticLayout l = l(charSequence3);
            int linesCount = getLinesCount();
            SpannableStringBuilder spannableStringBuilder = charSequence3;
            if (linesCount > 0) {
                spannableStringBuilder = charSequence3;
                if (l.getLineCount() > linesCount) {
                    int lineEnd = l.getLineEnd(linesCount - 1) + 1;
                    if (lineEnd >= this.C0.length()) {
                        lineEnd = this.C0.length() - 1;
                    }
                    CharSequence subSequence = this.C0.subSequence(0, lineEnd);
                    while (true) {
                        if (l(TextUtils.concat(new CharSequence[]{subSequence, charSequence})).getLineCount() > linesCount && lineEnd - 1 > 0) {
                            subSequence = subSequence.subSequence(0, lineEnd);
                        }
                    }
                    if (subSequence instanceof SpannedString) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(subSequence);
                        Matcher matcher = this.G0.matcher(subSequence);
                        spannableStringBuilder = spannableStringBuilder2;
                        if (matcher.find()) {
                            spannableStringBuilder2.replace(matcher.start(), ((SpannedString) subSequence).length(), charSequence);
                            spannableStringBuilder = spannableStringBuilder2;
                        }
                    } else {
                        spannableStringBuilder = TextUtils.concat(new CharSequence[]{this.G0.matcher(subSequence).replaceFirst(""), charSequence});
                    }
                }
            }
            if (!TextUtils.equals(spannableStringBuilder, getText())) {
                this.B0 = true;
                try {
                    setText(spannableStringBuilder);
                } finally {
                    this.B0 = false;
                }
            }
            this.A0 = false;
        }
        super.onDraw(canvas);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.views.widgets.EllipsizingEndTextView, android.view.View] */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        EllipsizingEndTextView.super.onSizeChanged(i, i2, i3, i4);
        this.A0 = true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EllipsizingEndTextView.super.onTextChanged(charSequence, i, i2, i3);
        if ((!this.B0 && this.C0 == null) || !charSequence.equals(this.C0)) {
            this.C0 = charSequence;
            this.A0 = true;
        }
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.G0 = pattern;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.views.widgets.EllipsizingEndTextView, android.widget.TextView] */
    public final void setLineSpacing(float f, float f2) {
        this.F0 = f;
        this.E0 = f2;
        EllipsizingEndTextView.super.setLineSpacing(f, f2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.views.widgets.EllipsizingEndTextView, android.widget.TextView] */
    public void setMaxLines(int i) {
        EllipsizingEndTextView.super.setMaxLines(i);
        this.D0 = i;
        this.A0 = true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.views.widgets.EllipsizingEndTextView, android.view.View] */
    public final void setPadding(int i, int i2, int i3, int i4) {
        EllipsizingEndTextView.super.setPadding(i, i2, i3, i4);
        this.A0 = true;
    }

    public void setSaveLastCharPosition(boolean z) {
        this.H0 = z;
    }
}
