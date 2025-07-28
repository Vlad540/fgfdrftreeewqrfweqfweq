package ru.ok.tamtam.animoji.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/animoji/views/AnimojiTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "value", "getAnimojiEnabled", "()Z", "setAnimojiEnabled", "(Z)V", "animojiEnabled", "animoji_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"WrongCall"})
public class AnimojiTextView extends AppCompatTextView {
    public final dk y0;
    public wia z0;

    public AnimojiTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, ru.ok.tamtam.animoji.views.AnimojiTextView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(ru.ok.tamtam.animoji.views.AnimojiTextView r0, java.lang.CharSequence r1, android.widget.TextView.BufferType r2) {
        /*
            ru.ok.tamtam.animoji.views.AnimojiTextView.super.setText(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.animoji.views.AnimojiTextView.j(ru.ok.tamtam.animoji.views.AnimojiTextView, java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.tamtam.animoji.views.AnimojiTextView, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void k(ru.ok.tamtam.animoji.views.AnimojiTextView r0, android.graphics.Canvas r1) {
        /*
            ru.ok.tamtam.animoji.views.AnimojiTextView.super.onDraw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.animoji.views.AnimojiTextView.k(ru.ok.tamtam.animoji.views.AnimojiTextView, android.graphics.Canvas):void");
    }

    public final boolean getAnimojiEnabled() {
        dk dkVar = this.y0;
        if (dkVar != null) {
            return dkVar.b;
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        dk dkVar = this.y0;
        if (dkVar != null) {
            boolean z = qh.b;
            if (z) {
                qh.a.getClass();
            }
            ((u16) dkVar.Y).invoke(canvas);
            if (z) {
                qh.a.getClass();
            }
        }
    }

    public final void setAnimojiEnabled(boolean z) {
        dk dkVar = this.y0;
        if (dkVar != null) {
            dkVar.b = z;
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.widget.TextView, ru.ok.tamtam.animoji.views.AnimojiTextView] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        if ((r2 instanceof kcc) == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setText(java.lang.CharSequence r8, android.widget.TextView.BufferType r9) {
        /*
            r7 = this;
            dk r0 = r7.y0
            if (r0 != 0) goto L_0x0010
            ru.ok.tamtam.animoji.views.AnimojiTextView.super.setText(r8, r9)
            wia r0 = new wia
            r0.<init>(r8, r9)
            r7.z0 = r0
            goto L_0x00ca
        L_0x0010:
            java.lang.Object r7 = r0.X
            i26 r7 = (i26) r7
            if (r8 == 0) goto L_0x00c7
            boolean r1 = h0e.c0(r8)
            if (r1 == 0) goto L_0x001e
            goto L_0x00c7
        L_0x001e:
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x0024
            goto L_0x00c7
        L_0x0024:
            fj r1 = defpackage.qh.c
            int r2 = r8.length()
            r3 = 0
            r4 = 0
            boolean r5 = r8 instanceof android.text.Spanned     // Catch:{ all -> 0x003e }
            if (r5 == 0) goto L_0x0034
            r5 = r8
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch:{ all -> 0x003e }
            goto L_0x0035
        L_0x0034:
            r5 = r4
        L_0x0035:
            if (r5 == 0) goto L_0x003e
            java.lang.Class<ite> r6 = ite.class
            java.lang.Object[] r2 = r5.getSpans(r3, r2, r6)     // Catch:{ all -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r2 = r4
        L_0x003f:
            if (r2 == 0) goto L_0x0047
            int r2 = r2.length
            if (r2 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r2 = r8
            goto L_0x005c
        L_0x0047:
            pt4 r2 = pt4.a()     // Catch:{ all -> 0x0050 }
            java.lang.CharSequence r2 = r2.h(r8)     // Catch:{ all -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            r2 = move-exception
            kcc r5 = new kcc
            r5.<init>(r2)
            r2 = r5
        L_0x0057:
            boolean r5 = r2 instanceof kcc
            if (r5 == 0) goto L_0x005c
            goto L_0x0045
        L_0x005c:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 != 0) goto L_0x0064
            r7.invoke(r8, r9)
            goto L_0x00ca
        L_0x0064:
            java.util.List r8 = r1.a(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
            boolean r5 = r8.hasNext()
            if (r5 != 0) goto L_0x00bf
            boolean r8 = r2 instanceof android.text.Spannable
            if (r8 != 0) goto L_0x007c
            goto L_0x00bb
        L_0x007c:
            java.lang.Object r8 = r0.o
            android.view.View r8 = (android.view.View) r8
            boolean r4 = r8 instanceof qt4
            if (r4 == 0) goto L_0x0090
            r4 = r8
            qt4 r4 = (qt4) r4
            boolean r5 = r4.a()
            if (r5 == 0) goto L_0x0090
            r4.setEmojiCompatEnabled(r3)
        L_0x0090:
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ 1
            r0.c = r3
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x00b0
            java.lang.Object r3 = r0.Z
            hj r3 = (defpackage.hj) r3
            if (r3 != 0) goto L_0x00b0
            hj r3 = new hj
            r3.<init>(r8)
            r0.Z = r3
            r3.a()
        L_0x00b0:
            r8 = r2
            android.text.Spannable r8 = (android.text.Spannable) r8
            fj r0 = defpackage.qh.c
            a06.f(r8, r1, r0)
            a06.D(r2)
        L_0x00bb:
            r7.invoke(r2, r9)
            goto L_0x00ca
        L_0x00bf:
            java.lang.Object r7 = r8.next()
            hr1.r(r7)
            throw r4
        L_0x00c7:
            r7.invoke(r8, r9)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.animoji.views.AnimojiTextView.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.tamtam.animoji.views.AnimojiTextView, android.view.View, java.lang.Object] */
    public AnimojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y0 = new dk(this, new bk(0, this), new l(8, this));
        wia wia = this.z0;
        if (wia != null) {
            setText((CharSequence) wia.a, (TextView.BufferType) wia.b);
        }
        this.z0 = null;
    }
}
