package defpackage;

import android.text.DynamicLayout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: tge  reason: default package */
public abstract class tge {
    public static final ArrayList a;

    static {
        List g0 = cs.g0(DynamicLayout.class.getDeclaredClasses());
        ArrayList arrayList = new ArrayList();
        for (Object next : g0) {
            if (SpanWatcher.class.isAssignableFrom((Class) next)) {
                arrayList.add(next);
            }
        }
        a = arrayList;
    }

    public static final b1f a(TextView textView) {
        b1f b1f = textView.getCompoundDrawablesRelative()[2];
        if (b1f instanceof b1f) {
            return b1f;
        }
        return null;
    }

    public static final void b(TextView textView, Object obj) {
        int spanEnd;
        CharSequence text = textView.getText();
        Object[] objArr = null;
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            textView.invalidate();
            return;
        }
        int spanStart = spannable.getSpanStart(obj);
        if (spanStart != -1 && (spanEnd = spannable.getSpanEnd(obj)) >= spanStart) {
            CharSequence text2 = textView.getText();
            Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
            if (spanned != null) {
                objArr = spanned.getSpans(0, textView.getText().length(), SpanWatcher.class);
            }
            if (objArr == null) {
                objArr = new SpanWatcher[0];
            }
            SpanWatcher[] spanWatcherArr = (SpanWatcher[]) objArr;
            if (spanWatcherArr.length != 0) {
                for (SpanWatcher spanWatcher : spanWatcherArr) {
                    ArrayList arrayList = a;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Class) it.next()) == spanWatcher.getClass()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    spanWatcher.onSpanChanged(spannable, obj, spanStart, spanEnd, spanStart, spanEnd);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean c(android.widget.TextView r2) {
        /*
            b1f r0 = a(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0017
            int r0 = r0.a
            if (r0 != 0) goto L_0x000c
            goto L_0x0017
        L_0x000c:
            float r2 = e(r2)
            int r2 = xy6.C(r2)
            if (r2 == r0) goto L_0x0017
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tge.c(android.widget.TextView):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r2.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(android.widget.TextView r1, b1f r2) {
        /*
            r0 = 0
            r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r0, r2, r0)
            if (r2 == 0) goto L_0x001f
            int r2 = r2.a
            if (r2 == 0) goto L_0x001f
            int r2 = defpackage.sxe.f(r2)
            float r2 = (float) r2
            android.content.res.Resources r0 = defpackage.dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 * r0
            int r2 = a24.X(r2)
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            r1.setCompoundDrawablePadding(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tge.d(android.widget.TextView, b1f):void");
    }

    public static final float e(TextView textView) {
        return textView.getPaint().getTextSize() / textView.getResources().getDisplayMetrics().density;
    }
}
