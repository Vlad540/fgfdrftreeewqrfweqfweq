package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: yz2  reason: default package */
public final class yz2 extends LinkMovementMethod {
    public static final String m = m7c.a(yz2.class).b();
    public final xz2 a;
    public final RectF b = new RectF();
    public String c;
    public afc d;
    public Spannable e;
    public ClickableSpan f;
    public boolean g;
    public s16 h;
    public boolean i;
    public Runnable j;
    public final tz k;
    public final GestureDetector l;

    public yz2(Context context, xz2 xz2) {
        this.a = xz2;
        tz tzVar = new tz(5, this);
        this.k = tzVar;
        this.l = new GestureDetector(context, tzVar);
    }

    public static final ClickableSpan a(yz2 yz2, afc afc, Spannable spannable, MotionEvent motionEvent) {
        WeakReference weakReference;
        View view;
        Layout layout;
        ClickableSpan clickableSpan;
        yz2.getClass();
        ClickableSpan clickableSpan2 = null;
        if (afc == null || (weakReference = (WeakReference) afc.a) == null || (view = (View) weakReference.get()) == null || (layout = (Layout) afc.b) == null) {
            return null;
        }
        int x = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int scrollY = view.getScrollY() + (((int) motionEvent.getY()) - view.getPaddingTop());
        int lineForVertical = layout.getLineForVertical(scrollY);
        float scrollX = (float) (view.getScrollX() + x);
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
            RectF rectF = yz2.b;
            rectF.left = layout.getLineLeft(lineForVertical);
            rectF.top = (float) layout.getLineTop(lineForVertical);
            rectF.right = layout.getLineMax(lineForVertical) + rectF.left;
            rectF.bottom = (float) layout.getLineBottom(lineForVertical);
            clickableSpan = rectF.contains(scrollX, (float) scrollY) ? (ClickableSpan) cs.Y(spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) : null;
        } catch (Throwable th) {
            clickableSpan = new kcc(th);
        }
        Throwable a2 = mcc.a(clickableSpan);
        if (a2 != null) {
            udd.s(m, "findClickableSpanUnderTouch failed:", a2);
        }
        if (!(clickableSpan instanceof kcc)) {
            clickableSpan2 = clickableSpan;
        }
        return clickableSpan2;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.d = new afc((Object) new WeakReference(textView), (Object) textView.getLayout());
            this.e = spannable;
        }
        return this.l.onTouchEvent(motionEvent);
    }
}
