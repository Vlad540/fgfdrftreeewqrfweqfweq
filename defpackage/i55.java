package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: i55  reason: default package */
public final class i55 extends View implements mhe {
    public static final /* synthetic */ k77[] G0;
    public Layout A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public Integer E0;
    public mo0 F0;
    public final p97 a = ((p97) i6b.a.getAccessor().c(p97.class));
    public final CharSequence b;
    public final yj c;
    public final TextPaint o;
    public SpannableString w0;
    public int x0;
    public Layout y0;
    public Layout z0;

    static {
        hc9 hc9 = new hc9(i55.class, "typography", "getTypography()Lone/me/sdk/design/TextStyle;");
        m7c.a.getClass();
        G0 = new k77[]{hc9};
    }

    public i55(Context context) {
        super(context);
        CharSequence c2 = new hge(l8a.l).c(this);
        this.b = c2 == null ? BuildConfig.FLAVOR : c2;
        this.c = new yj(8, this, nte.E);
        TextPaint textPaint = new TextPaint(1);
        nge.c(getTypography(), textPaint, getResources().getDisplayMetrics());
        s59 s59 = km4.y0;
        textPaint.setColor(s59.r(this).getText().e);
        this.o = textPaint;
        this.x0 = Integer.MAX_VALUE;
        onThemeChanged(s59.r(this));
    }

    public final Layout a(int i, CharSequence charSequence) {
        int i2 = bmd.a;
        return p97.b(this.a, oa2.F(charSequence, true), this.o, i, Integer.MAX_VALUE, 48);
    }

    public final void b(int i) {
        Layout layout;
        Object obj;
        SpannableString spannableString = this.w0;
        if (spannableString != null) {
            Layout a2 = a(i, spannableString);
            this.A0 = a2;
            if (a2.getLineCount() <= this.x0) {
                layout = this.A0;
            } else {
                StringBuilder sb = new StringBuilder("… ");
                CharSequence charSequence = this.b;
                sb.append(charSequence);
                String sb2 = sb.toString();
                TextPaint textPaint = this.o;
                float measureText = textPaint.measureText(sb2);
                SpannableStringBuilder append = new SpannableStringBuilder(spannableString).append(sb2);
                Layout a3 = a(i, append);
                int lineCount = a3.getLineCount();
                int i2 = this.x0;
                if (lineCount > i2) {
                    int lineStart = a3.getLineStart(i2 - 1);
                    CharSequence subSequence = append.subSequence(0, a3.getLineEnd(this.x0 - 1));
                    while (true) {
                        if (((float) a3.getWidth()) > textPaint.measureText(subSequence, lineStart, subSequence.length()) + measureText) {
                            break;
                        }
                        int length = subSequence.length() - 1;
                        if (length < 0) {
                            length = 0;
                        }
                        subSequence = h0e.x0(length, subSequence);
                    }
                    int length2 = subSequence.length() - 1;
                    if (length2 >= 0) {
                        while (true) {
                            int i3 = length2 - 1;
                            if (subSequence.charAt(length2) != 10) {
                                obj = subSequence.subSequence(0, length2 + 1);
                                break;
                            } else if (i3 < 0) {
                                break;
                            } else {
                                length2 = i3;
                            }
                        }
                    }
                    obj = BuildConfig.FLAVOR;
                    append = (SpannableStringBuilder) obj;
                }
                layout = a(i, new SpannableStringBuilder(mt0.F(append)).append("… ").append(charSequence, new ay6(2, this), 33));
            }
            this.z0 = layout;
            if (this.D0) {
                layout = this.A0;
            }
            this.y0 = layout;
        }
    }

    public final void c() {
        if (isAttachedToWindow() && getMeasuredWidth() > 0) {
            b(getMeasuredWidth());
            this.B0 = true;
            requestLayout();
        } else if (this.F0 == null) {
            this.F0 = new mo0(1, this);
            getViewTreeObserver().addOnPreDrawListener(this.F0);
        }
    }

    public final SpannableString getText() {
        return this.w0;
    }

    public final Layout getTextLayout() {
        return this.y0;
    }

    public final nge getTypography() {
        k77 k77 = G0[0];
        return (nge) this.c.b;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    public final void onDetachedFromWindow() {
        mo0 mo0 = this.F0;
        if (mo0 != null) {
            if (getViewTreeObserver().isAlive()) {
                getViewTreeObserver().removeOnPreDrawListener(mo0);
            }
            this.F0 = null;
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int save = canvas.save();
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        try {
            Layout layout = this.y0;
            if (layout != null) {
                layout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        Integer num = this.E0;
        if (num == null) {
            Layout layout = this.y0;
            num = layout != null ? Integer.valueOf(layout.getHeight()) : null;
            if (num == null) {
                i3 = 0;
                setMeasuredDimension(size, i3);
            }
        }
        i3 = num.intValue();
        setMeasuredDimension(size, i3);
    }

    public final void onThemeChanged(pda pda) {
        Object[] objArr;
        this.o.setColor(pda.getText().e);
        SpannableString spannableString = this.w0;
        if (spannableString != null) {
            try {
                objArr = spannableString.getSpans(0, spannableString.length(), nf7.class);
            } catch (Throwable unused) {
                objArr = null;
            }
            nf7[] nf7Arr = (nf7[]) objArr;
            if (nf7Arr != null) {
                for (nf7 nf7 : nf7Arr) {
                    km4.y0.r(this);
                    nf7.b = -16745729;
                }
            }
        }
        invalidate();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharSequence text;
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout = this.y0;
        if (layout == null || (text = layout.getText()) == null) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout2 = this.y0;
        if (layout2 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int offsetForHorizontal = layout2.getOffsetForHorizontal(layout2.getLineForVertical((int) (motionEvent.getY() - ((float) getPaddingTop()))), motionEvent.getX() - ((float) getPaddingLeft()));
        float f = (float) 2;
        int p = me4.p(f, dh4.c().getDisplayMetrics().density, offsetForHorizontal);
        if (p < 0) {
            p = 0;
        }
        int c2 = me4.c(f, dh4.c().getDisplayMetrics().density, offsetForHorizontal);
        int length = text.length();
        if (c2 > length) {
            c2 = length;
        }
        Object[] objArr = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                objArr = spanned.getSpans(p, c2, ClickableSpan.class);
            }
        } catch (Throwable unused) {
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) objArr;
        if (clickableSpanArr == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!(!(clickableSpanArr.length == 0))) {
            return super.onTouchEvent(motionEvent);
        }
        clickableSpanArr[0].onClick(this);
        return true;
    }

    public final void setCollapsedLines(int i) {
        this.x0 = i;
    }

    public final void setExpandWithAnimation(boolean z) {
        this.C0 = z;
    }

    public final void setText(SpannableString spannableString) {
        this.w0 = spannableString;
    }

    public final void setTextColor(int i) {
        this.o.setColor(i);
        invalidate();
    }

    public final void setTypography(nge nge) {
        this.c.o1(this, G0[0], nge);
    }

    public final void setText(CharSequence charSequence) {
        bmd bmd;
        km4.y0.r(this);
        Spannable m = lu7.m(charSequence, -16745729, 24);
        if (m != null) {
            int i = bmd.a;
            bmd = oa2.F(m, true);
        } else {
            bmd = null;
        }
        this.w0 = bmd;
        this.D0 = false;
        this.B0 = false;
        c();
    }
}
