package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ts8  reason: default package */
public final class ts8 extends View implements ps8, View.OnLongClickListener, of7, GestureDetector.OnDoubleTapListener, bu4 {
    public static final /* synthetic */ k77[] L0;
    public int A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E0;
    public qs8 F0;
    public Drawable G0;
    public int H0;
    public int I0;
    public final Rect J0;
    public final gi K0;
    public final yz2 a;
    public final t97 b = ez3.O(3, new ib7(27));
    public View.OnLongClickListener c;
    public xz2 o;
    public final rf7 w0 = new rf7((of7) null, new qk8(3, this), 7);
    public of7 x0;
    public final yj y0 = new yj(15, this);
    public yz2 z0;

    static {
        k77 hc9 = new hc9(ts8.class, "onDoubleClickListener", "getOnDoubleClickListener()Lkotlin/jvm/functions/Function1;");
        m7c.a.getClass();
        L0 = new k77[]{hc9};
    }

    public ts8(Context context) {
        super(context, (AttributeSet) null, 0);
        yz2 yz2 = new yz2(context, new ss8(0, (Object) this));
        this.a = yz2;
        this.z0 = yz2;
        this.A0 = 1;
        this.E0 = true;
        Display defaultDisplay = ek8.F(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.I0 = new Size(point.x, point.y).getHeight();
        this.J0 = new Rect();
        this.K0 = new gi(3, this);
        super.setOnLongClickListener(this);
    }

    public static void f(ts8 ts8) {
        ArrayList arrayList = ts8.getHighlightTextHelper().a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        CharSequence text = ts8.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            for (Object obj : spannable.getSpans(0, spannable.length(), trc.class)) {
                trc trc = (trc) obj;
                ForegroundColorSpan foregroundColorSpan = trc.a;
                if (foregroundColorSpan != null) {
                    spannable.removeSpan(foregroundColorSpan);
                }
                BackgroundColorSpan backgroundColorSpan = trc.b;
                if (backgroundColorSpan != null) {
                    spannable.removeSpan(backgroundColorSpan);
                }
                spannable.removeSpan(trc);
            }
        }
        ts8.invalidate();
    }

    private final eg6 getHighlightTextHelper() {
        return (eg6) this.b.getValue();
    }

    /* access modifiers changed from: private */
    public static final void setStartDrawable$lambda$6(Drawable drawable) {
        ((AnimationDrawable) drawable).start();
    }

    public final void a(fp8 fp8) {
        of7 of7 = this.x0;
        if (of7 != null) {
            of7.a(fp8);
        }
    }

    public final void b() {
        invalidate();
    }

    public final void c(String str, sf7 sf7, ClickableSpan clickableSpan) {
        of7 of7 = this.x0;
        if (of7 != null) {
            of7.c(str, sf7, clickableSpan);
        }
    }

    public final int e(int i) {
        Layout layout = getLayout();
        return layout == null ? i : layout.getLineCount() == 1 ? getMeasuredWidth() : layout.getLineCount() > 1 ? (int) layout.getLineRight(layout.getLineCount() - 1) : i;
    }

    public final void g(List list) {
        eg6 eg6;
        CharSequence charSequence;
        eg6 highlightTextHelper = getHighlightTextHelper();
        CharSequence text = getText();
        Layout layout = getLayout();
        ArrayList arrayList = highlightTextHelper.a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        if (!(list == null || list.isEmpty() || text == null || h0e.c0(text) || layout == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fsc fsc = (fsc) it.next();
                float height = (float) (layout.getHeight() / layout.getLineCount());
                int i = fsc.a;
                while (true) {
                    int lineForOffset = layout.getLineForOffset(i);
                    int lineEnd = layout.getLineEnd(lineForOffset);
                    int i2 = fsc.b;
                    boolean z = i2 <= lineEnd;
                    if (!z) {
                        i2 = lineEnd;
                    }
                    String obj = text.subSequence(i, i2).toString();
                    ArrayList arrayList2 = highlightTextHelper.a;
                    eg6 = highlightTextHelper;
                    dg6 dg6 = r6;
                    charSequence = text;
                    dg6 dg62 = new dg6(lineForOffset, obj, layout.getPrimaryHorizontal(i), (float) layout.getLineTop(lineForOffset), (float) layout.getLineBaseline(lineForOffset), layout.getPaint().measureText(obj), height);
                    arrayList2.add(dg6);
                    if (z) {
                        break;
                    }
                    i = lineEnd;
                    text = charSequence;
                    highlightTextHelper = eg6;
                }
                text = charSequence;
                highlightTextHelper = eg6;
            }
        }
        invalidate();
    }

    public final yz2 getDefaultMovementMethod() {
        return this.a;
    }

    public final Layout getLayout() {
        qs8 qs8 = this.F0;
        if (qs8 != null) {
            return qs8.a();
        }
        return null;
    }

    public final int getLineCount() {
        Layout a2;
        qs8 qs8 = this.F0;
        if (qs8 == null || (a2 = qs8.a()) == null) {
            return 0;
        }
        return a2.getLineCount();
    }

    public final boolean getLinksClickable() {
        return this.E0;
    }

    public final int getMaxHeightForClip() {
        return this.I0;
    }

    public final yz2 getMovementMethod() {
        return this.z0;
    }

    public final u16 getOnDoubleClickListener() {
        k77 k77 = L0[0];
        return (u16) this.y0.b;
    }

    public final CharSequence getText() {
        Layout a2;
        qs8 qs8 = this.F0;
        if (qs8 == null || (a2 = qs8.a()) == null) {
            return null;
        }
        return a2.getText();
    }

    public final void h() {
        int i;
        qs8 qs8 = this.F0;
        Layout a2 = qs8 != null ? qs8.a() : null;
        Drawable drawable = this.G0;
        int i2 = 0;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.H0 : 0;
        this.C0 = (float) intrinsicWidth;
        int paddingLeft = getPaddingLeft();
        if (a2 == null) {
            i = 0;
        } else {
            int lineCount = a2.getLineCount();
            i = 0;
            for (int i3 = 0; i3 < lineCount; i3++) {
                i = Math.max(i, a24.X(a2.getLineMax(i3)));
            }
        }
        int paddingRight = getPaddingRight() + paddingLeft + i + intrinsicWidth;
        if (a2 != null) {
            i2 = a2.getHeight();
        }
        setMeasuredDimension(paddingRight, i2);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs8 qs8 = this.F0;
        if (qs8 != null) {
            qs8.d.add(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.w0.c(spannable);
        }
        qs8 qs82 = this.F0;
        if (qs82 != null) {
            a24.c0(this, qs82.a(), this.K0);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs8 qs8 = this.F0;
        if (qs8 != null) {
            qs8.d.remove(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.w0.getClass();
            rf7.a(spannable);
        }
        qs8 qs82 = this.F0;
        if (qs82 != null) {
            a24.d0(qs82.a(), this.K0);
        }
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        u16 onDoubleClickListener = getOnDoubleClickListener();
        return onDoubleClickListener != null && ((Boolean) onDoubleClickListener.invoke(this)).booleanValue();
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return onDoubleTap(motionEvent);
    }

    public final void onDraw(Canvas canvas) {
        Layout layout = getLayout();
        if (layout != null) {
            y76 y76 = qh.a;
            Rect rect = this.J0;
            if (!rect.isEmpty()) {
                canvas.clipRect(rect);
            }
            Drawable drawable = this.G0;
            int save = canvas.save();
            if (drawable != null) {
                canvas.translate(this.B0, this.D0);
                drawable.draw(canvas);
            }
            canvas.translate(this.B0 + this.C0, 0.0f);
            layout.draw(canvas);
            eg6 highlightTextHelper = getHighlightTextHelper();
            pda r = km4.y0.r(this);
            TextPaint textPaint = (TextPaint) highlightTextHelper.c.getValue();
            textPaint.set(layout.getPaint());
            textPaint.setColor(r.getText().a);
            t97 t97 = highlightTextHelper.b;
            ((Paint) t97.getValue()).setColor(-16745729);
            Iterator it = highlightTextHelper.a.iterator();
            while (it.hasNext()) {
                dg6 dg6 = (dg6) it.next();
                float f = dg6.c;
                float f2 = dg6.d;
                canvas.drawRect(f, f2, f + dg6.f, f2 + dg6.g, (Paint) t97.getValue());
                canvas.drawText(dg6.b, dg6.c, dg6.e, textPaint);
            }
            canvas.restoreToCount(save);
            y76 y762 = qh.a;
        }
    }

    public final boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.c;
        if (onLongClickListener == null) {
            return true;
        }
        onLongClickListener.onLongClick(view);
        return true;
    }

    public final void onMeasure(int i, int i2) {
        h();
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return performClick();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.B0 = (float) (this.A0 == -1 ? getPaddingRight() : getPaddingLeft());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yz2 yz2 = this.z0;
        if ((getText() instanceof Spannable) && this.E0 && yz2 != null) {
            Layout layout = getLayout();
            SpannableString spannableString = new SpannableString(getText());
            if (motionEvent.getAction() == 0) {
                yz2.d = new afc((Object) new WeakReference(this), (Object) layout);
                yz2.e = spannableString;
            }
            if (yz2.l.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void scrollTo(int i, int i2) {
    }

    public final void setLayout(qs8 qs8) {
        qs8 qs82 = this.F0;
        if (qs82 != null) {
            qs82.d.remove(this);
        }
        this.F0 = qs8;
        qs8.d.add(this);
        this.A0 = qs8.a().getParagraphDirection(0);
        qs8.a().getLineRight(0);
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.w0.c(spannable);
        }
        a24.c0(this, qs8.a(), this.K0);
        this.D0 = (float) qs8.a().getTopPadding();
        requestLayout();
        invalidate();
        setContentDescription(getText());
    }

    public final void setLinkListener(of7 of7) {
        Layout a2;
        this.x0 = of7;
        rf7 rf7 = this.w0;
        rf7.a = of7;
        qs8 qs8 = this.F0;
        if (qs8 != null && (a2 = qs8.a()) != null) {
            rf7.c(a2.getText());
        }
    }

    public final void setLinkLongClickListener(xz2 xz2) {
        this.o = xz2;
    }

    public final void setLinksClickable(boolean z) {
        this.E0 = z;
    }

    public final void setMaxHeightForClip(int i) {
        this.I0 = i;
    }

    public final void setMovementMethod(yz2 yz2) {
        this.z0 = yz2;
    }

    public final void setOnDoubleClickListener(u16 u16) {
        this.y0.o1(this, L0[0], u16);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c = onLongClickListener;
    }

    public final void setSingleClickAction(Runnable runnable) {
        if (runnable == null) {
            yz2 yz2 = this.z0;
            if (yz2 != null) {
                yz2.h = null;
                return;
            }
            return;
        }
        yz2 yz22 = this.z0;
        if (yz22 != null) {
            yz22.h = new b25(runnable, 1);
        }
    }

    public final void setStartDrawable(Drawable drawable) {
        this.G0 = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable instanceof AnimationDrawable) {
            post(new rs8(drawable, 0));
        }
        requestLayout();
    }

    public final void setStartDrawablePadding(int i) {
        if (this.H0 != i) {
            this.H0 = i;
            requestLayout();
        }
    }

    public final void setTextColors(dr0 dr0) {
        TextPaint paint;
        Layout layout = getLayout();
        gr0 gr0 = dr0.b;
        if (!(layout == null || (paint = layout.getPaint()) == null)) {
            paint.setColor(gr0.d);
        }
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned != null) {
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (obj instanceof ip8) {
                        ((ip8) obj).b = gr0.b;
                    } else if (obj instanceof lf7) {
                        ((lf7) obj).a = gr0.b;
                    } else if (obj instanceof nf7) {
                        ((nf7) obj).b = gr0.b;
                    }
                }
            }
        }
        invalidate();
    }

    public final void setTryToSingleClickAction(Runnable runnable) {
        yz2 yz2 = this.z0;
        if (yz2 != null) {
            yz2.j = runnable;
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
