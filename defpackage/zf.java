package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: zf  reason: default package */
public final /* synthetic */ class zf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ zf(View view, int i) {
        this.a = i;
        this.b = view;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r5) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0057;
                case 2: goto L_0x0035;
                case 3: goto L_0x0025;
                case 4: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            android.view.View r4 = r4.b
            r4.setAlpha(r5)
            return
        L_0x0015:
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            android.view.View r4 = r4.b
            r4.setAlpha(r5)
            return
        L_0x0025:
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            android.view.View r4 = r4.b
            defpackage.kjd.J(r4, r5)
            return
        L_0x0035:
            android.view.View r4 = r4.b
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            if (r0 == 0) goto L_0x004f
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.rightMargin = r5
            r4.setLayoutParams(r0)
            return
        L_0x004f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r4.<init>(r5)
            throw r4
        L_0x0057:
            android.view.View r4 = r4.b
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            if (r0 == 0) goto L_0x0071
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.rightMargin = r5
            r4.setLayoutParams(r0)
            return
        L_0x0071:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r4.<init>(r5)
            throw r4
        L_0x0079:
            java.lang.String r0 = "top"
            java.lang.Object r0 = r5.getAnimatedValue(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            r2 = 0
            if (r1 == 0) goto L_0x0087
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0088
        L_0x0087:
            r0 = r2
        L_0x0088:
            android.view.View r4 = r4.b
            r1 = 0
            if (r0 == 0) goto L_0x0092
            int r0 = r0.intValue()
            goto L_0x00a4
        L_0x0092:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            boolean r3 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x009d
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x009e
        L_0x009d:
            r0 = r2
        L_0x009e:
            if (r0 == 0) goto L_0x00a3
            int r0 = r0.topMargin
            goto L_0x00a4
        L_0x00a3:
            r0 = r1
        L_0x00a4:
            java.lang.String r3 = "bottom"
            java.lang.Object r5 = r5.getAnimatedValue(r3)
            boolean r3 = r5 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x00b1
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x00b2
        L_0x00b1:
            r5 = r2
        L_0x00b2:
            if (r5 == 0) goto L_0x00b9
            int r1 = r5.intValue()
            goto L_0x00c8
        L_0x00b9:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r3 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x00c4
            r2 = r5
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L_0x00c4:
            if (r2 == 0) goto L_0x00c8
            int r1 = r2.bottomMargin
        L_0x00c8:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            r5.topMargin = r0
            r5.bottomMargin = r1
            r4.setLayoutParams(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
