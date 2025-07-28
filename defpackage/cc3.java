package defpackage;

import android.content.Context;

/* renamed from: cc3  reason: default package */
public final /* synthetic */ class cc3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ cc3(cv4 cv4, Context context) {
        this.a = 2;
        this.b = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View, one.me.rlottie.RLottieImageView, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r12 = this;
            r0 = 0
            r1 = 80
            r2 = -1
            r3 = 0
            r4 = 3
            r5 = 12
            r6 = 1
            r7 = 4
            r8 = -2
            r9 = 0
            int r10 = r12.a
            switch(r10) {
                case 0: goto L_0x067e;
                case 1: goto L_0x0677;
                case 2: goto L_0x0408;
                case 3: goto L_0x03f1;
                case 4: goto L_0x03b5;
                case 5: goto L_0x0394;
                case 6: goto L_0x038c;
                case 7: goto L_0x0384;
                case 8: goto L_0x032a;
                case 9: goto L_0x031d;
                case 10: goto L_0x0316;
                case 11: goto L_0x02ce;
                case 12: goto L_0x02c0;
                case 13: goto L_0x0266;
                case 14: goto L_0x0259;
                case 15: goto L_0x0247;
                case 16: goto L_0x01db;
                case 17: goto L_0x01d3;
                case 18: goto L_0x01a6;
                case 19: goto L_0x0172;
                case 20: goto L_0x0141;
                case 21: goto L_0x011e;
                case 22: goto L_0x0114;
                case 23: goto L_0x010a;
                case 24: goto L_0x0100;
                case 25: goto L_0x00ca;
                case 26: goto L_0x0065;
                case 27: goto L_0x0043;
                case 28: goto L_0x001b;
                default: goto L_0x0011;
            }
        L_0x0011:
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r1 = defpackage.l9a.m
            android.content.Context r12 = r12.b
            r0.<init>((android.content.Context) r12, (int) r1)
            return r0
        L_0x001b:
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            int r12 = defpackage.qhc.m
            r0.setId(r12)
            re3 r12 = new re3
            r12.<init>(r8, r8)
            int r1 = defpackage.qhc.n
            r12.i = r1
            r12.v = r1
            r12.l = r1
            r12.t = r1
            r0.setLayoutParams(r12)
            ac2 r12 = new ac2
            r1 = 2
            r12.<init>(r4, r9, r1)
            urd.B(r12, r0)
            return r0
        L_0x0043:
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            int r12 = defpackage.qhc.k
            r0.setId(r12)
            re3 r12 = new re3
            r12.<init>(r3, r3)
            r12.t = r3
            r12.i = r3
            r12.v = r3
            r12.l = r3
            r0.setLayoutParams(r12)
            android.widget.ImageView$ScaleType r12 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r12)
            return r0
        L_0x0065:
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r2, r2)
            float r1 = (float) r7
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = a24.X(r1)
            r12.topMargin = r1
            r1 = 6
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = a24.X(r2)
            r12.leftMargin = r2
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = a24.X(r1)
            r12.rightMargin = r1
            r0.setLayoutParams(r12)
            r0.setGravity(r6)
            r0.setMaxLines(r6)
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r12)
            s59 r12 = km4.y0
            pda r12 = r12.r(r0)
            cfe r12 = r12.getText()
            int r12 = r12.e
            r0.setTextColor(r12)
            nge r12 = defpackage.nte.r
            r12.b(r0, defpackage.yq4.b)
            return r0
        L_0x00ca:
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r1 = 24
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = a24.X(r2)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = a24.X(r1)
            r12.<init>(r2, r1)
            r0.setLayoutParams(r12)
            android.widget.ImageView$ScaleType r12 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0.setScaleType(r12)
            return r0
        L_0x0100:
            k77[] r0 = one.me.sdk.uikit.common.button.OneMeButton.F0
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            return r0
        L_0x010a:
            k77[] r0 = one.me.sdk.uikit.common.button.OneMeButton.F0
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            return r0
        L_0x0114:
            k77[] r0 = one.me.sdk.uikit.common.button.OneMeButton.F0
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            return r0
        L_0x011e:
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r1 = defpackage.mnb.ic_delete_filled_apart_24
            android.content.Context r12 = r12.b
            r0.<init>((android.content.Context) r12, (int) r1)
            s59 r1 = km4.y0
            km4 r3 = r1.n(r12)
            r3.g()
            java.lang.String r3 = "cross"
            xs7.P(r0, r3, r2)
            yn6 r12 = defpackage.rf0.d(r1, r12)
            int r12 = r12.i
            java.lang.String r1 = "circle_background"
            xs7.P(r0, r1, r12)
            return r0
        L_0x0141:
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r1 = defpackage.mnb.ic_online_24
            android.content.Context r12 = r12.b
            r0.<init>((android.content.Context) r12, (int) r1)
            s59 r1 = km4.y0
            yn6 r2 = defpackage.rf0.d(r1, r12)
            java.lang.String r3 = "online"
            int r2 = r2.e
            xs7.P(r0, r3, r2)
            km4 r12 = r1.n(r12)
            pda r12 = r12.g()
            nd0 r12 = r12.b()
            one.me.sdk.richvector.VectorPath r1 = r0.findPath(r3)
            if (r1 == 0) goto L_0x0171
            int r12 = r12.i
            r1.setStrokeColor(r12)
            r0.invalidatePath()
        L_0x0171:
            return r0
        L_0x0172:
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r1 = defpackage.snb.ic_add_button_28
            android.content.Context r12 = r12.b
            r0.<init>((android.content.Context) r12, (int) r1)
            s59 r1 = km4.y0
            km4 r2 = r1.n(r12)
            pda r2 = r2.g()
            nd0 r2 = r2.b()
            md0 r2 = r2.a
            int r2 = r2.f
            java.lang.String r3 = "background"
            xs7.P(r0, r3, r2)
            km4 r12 = r1.n(r12)
            pda r12 = r12.g()
            yn6 r12 = r12.getIcon()
            int r12 = r12.b
            java.lang.String r1 = "plus"
            xs7.P(r0, r1, r12)
            return r0
        L_0x01a6:
            one.me.sdk.uikit.common.views.OneMeDraweeView r0 = new one.me.sdk.uikit.common.views.OneMeDraweeView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            eu3 r12 = new eu3
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r2
            r12.<init>(r1)
            r0.setOutlineProvider(r12)
            ln4 r12 = r0.getHierarchy()
            y66 r12 = (y66) r12
            r75 r12 = r12.e
            r12.A0 = r3
            int r1 = r12.z0
            if (r1 != r6) goto L_0x01d2
            r12.z0 = r3
        L_0x01d2:
            return r0
        L_0x01d3:
            mz9 r0 = new mz9
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            return r0
        L_0x01db:
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            int r12 = defpackage.qhc.V
            r0.setId(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r2 = 36
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = a24.X(r3)
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r2 = r2 * r8
            int r2 = a24.X(r2)
            r12.<init>(r3, r2)
            r12.gravity = r1
            float r1 = (float) r5
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = a24.X(r1)
            int r2 = r12.topMargin
            int r3 = r12.rightMargin
            int r5 = r12.bottomMargin
            r12.setMargins(r1, r2, r3, r5)
            r0.setLayoutParams(r12)
            float r12 = (float) r7
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            defpackage.me4.o(r12, r1, r0)
            int r12 = defpackage.phc.a1
            r0.setImageResource(r12)
            ac2 r12 = new ac2
            r12.<init>(r4, r9, r6)
            urd.B(r12, r0)
            return r0
        L_0x0247:
            jqd r0 = new jqd
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r8, r8)
            r12.gravity = r1
            r0.setLayoutParams(r12)
            return r0
        L_0x0259:
            sxa r0 = new sxa
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            int r12 = defpackage.phc.u0
            r0.a(r12)
            return r0
        L_0x0266:
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            s59 r12 = km4.y0
            pda r12 = r12.r(r0)
            cfe r12 = r12.getText()
            int r12 = r12.b
            r0.setTextColor(r12)
            nge r12 = defpackage.nte.o
            r12.b(r0, defpackage.yq4.b)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r8, r8)
            r0.setLayoutParams(r12)
            float r12 = (float) r5
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r12
            int r1 = a24.X(r1)
            float r2 = (float) r7
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = a24.X(r2)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r12 = r12 * r3
            int r12 = a24.X(r12)
            int r3 = r0.getPaddingBottom()
            r0.setPaddingRelative(r1, r2, r12, r3)
            return r0
        L_0x02c0:
            android.view.View r0 = new android.view.View
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            r12 = 268435455(0xfffffff, float:2.5243547E-29)
            r0.setBackgroundColor(r12)
            return r0
        L_0x02ce:
            dw9 r0 = new dw9
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            nge r12 = defpackage.nte.D
            r12.b(r0, defpackage.yq4.b)
            r0.setMaxLines(r6)
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r12)
            float r12 = (float) r5
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r12
            int r1 = a24.X(r1)
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r12 = r12 * r2
            int r12 = a24.X(r12)
            int r2 = r0.getPaddingTop()
            int r3 = r0.getPaddingBottom()
            r0.setPaddingRelative(r1, r2, r12, r3)
            r12 = -855638017(0xffffffffccffffff, float:-1.3421772E8)
            r0.setTextColor(r12)
            fja.d(r0)
            return r0
        L_0x0316:
            android.content.Context r12 = r12.b
            android.renderscript.RenderScript r12 = android.renderscript.RenderScript.create(r12)
            return r12
        L_0x031d:
            sxa r0 = new sxa
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            int r12 = defpackage.phc.u0
            r0.a(r12)
            return r0
        L_0x032a:
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            nge r12 = defpackage.nte.o
            r12.b(r0, defpackage.yq4.b)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r8, r8)
            r0.setLayoutParams(r12)
            float r12 = (float) r5
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r12
            int r1 = a24.X(r1)
            float r2 = (float) r7
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = a24.X(r2)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r12 = r12 * r3
            int r12 = a24.X(r12)
            int r3 = r0.getPaddingBottom()
            r0.setPaddingRelative(r1, r2, r12, r3)
            s59 r12 = km4.y0
            pda r12 = r12.r(r0)
            cfe r12 = r12.getText()
            int r12 = r12.b
            r0.setTextColor(r12)
            return r0
        L_0x0384:
            qo0 r0 = new qo0
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            return r0
        L_0x038c:
            f64 r0 = new f64
            android.content.Context r12 = r12.b
            r0.<init>(r12)
            return r0
        L_0x0394:
            ex r0 = new ex
            android.content.Context r12 = r12.b
            r0.<init>(r12, r4)
            f54 r12 = new f54
            java.lang.Object r1 = r0.X
            r7 = r1
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r1 = r0.Y
            r9 = r1
            y7e r9 = (y7e) r9
            boolean r10 = r0.b
            java.lang.Object r1 = r0.o
            r6 = r1
            android.content.Context r6 = (android.content.Context) r6
            int r8 = r0.c
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        L_0x03b5:
            int r1 = one.me.sdk.lists.widgets.EndlessRecyclerView2.m2
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            android.content.Context r12 = r12.b
            if (r1 < r2) goto L_0x03c4
            android.view.Display r9 = d4.l(r12)
            goto L_0x03d2
        L_0x03c4:
            java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
            java.lang.Object r12 = hq3.b(r12, r1)
            android.view.WindowManager r12 = (android.view.WindowManager) r12
            if (r12 == 0) goto L_0x03d2
            android.view.Display r9 = r12.getDefaultDisplay()
        L_0x03d2:
            if (r9 == 0) goto L_0x03d9
            float r12 = r9.getRefreshRate()
            goto L_0x03da
        L_0x03d9:
            r12 = r0
        L_0x03da:
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e9
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r12
            double r0 = (double) r0
            long r0 = a24.Y(r0)
            goto L_0x03ec
        L_0x03e9:
            r0 = 160000000(0x9896800, double:7.90505033E-316)
        L_0x03ec:
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            return r12
        L_0x03f1:
            br7 r0 = new br7
            android.content.Context r12 = r12.b
            r0.<init>(r12, r9)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r1 = 17
            r12.<init>(r2, r2, r1)
            r0.setLayoutParams(r12)
            r12 = 8
            r0.setVisibility(r12)
            return r0
        L_0x0408:
            android.content.Context r1 = r12.b
            android.graphics.Bitmap r12 = xy6.A(r1, r3)
            if (r12 == 0) goto L_0x0414
            int r3 = r12.getWidth()
        L_0x0414:
            android.content.res.Resources r12 = r1.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r2 = r12.densityDpi
            r12 = 240(0xf0, float:3.36E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r4 = 48
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            wia r6 = new wia
            r6.<init>(r12, r5)
            r12 = 320(0x140, float:4.48E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r5 = 64
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            wia r7 = new wia
            r7.<init>(r12, r5)
            r12 = 480(0x1e0, float:6.73E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r5 = 96
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            wia r10 = new wia
            r10.<init>(r12, r8)
            r12 = 640(0x280, float:8.97E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            wia r8 = new wia
            r8.<init>(r12, r5)
            wia[] r12 = new wia[]{r6, r7, r10, r8}
            java.util.Map r5 = ju7.T(r12)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0475:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0499
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 > r2) goto L_0x0475
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            r12.put(r8, r7)
            goto L_0x0475
        L_0x0499:
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r6 = r12.iterator()
            boolean r12 = r6.hasNext()
            if (r12 != 0) goto L_0x04a9
            r12 = r9
            goto L_0x04dc
        L_0x04a9:
            java.lang.Object r12 = r6.next()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L_0x04b4
            goto L_0x04dc
        L_0x04b4:
            r7 = r12
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
        L_0x04c1:
            java.lang.Object r8 = r6.next()
            r10 = r8
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r10.getKey()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r7 >= r10) goto L_0x04d6
            r12 = r8
            r7 = r10
        L_0x04d6:
            boolean r8 = r6.hasNext()
            if (r8 != 0) goto L_0x04c1
        L_0x04dc:
            r8 = r12
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x04ec:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0510
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 <= r2) goto L_0x04ec
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r12.put(r7, r6)
            goto L_0x04ec
        L_0x0510:
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r10 = r12.iterator()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto L_0x0520
            r12 = r9
            goto L_0x0553
        L_0x0520:
            java.lang.Object r12 = r10.next()
            boolean r5 = r10.hasNext()
            if (r5 != 0) goto L_0x052b
            goto L_0x0553
        L_0x052b:
            r5 = r12
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L_0x0538:
            java.lang.Object r6 = r10.next()
            r7 = r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r5 <= r7) goto L_0x054d
            r12 = r6
            r5 = r7
        L_0x054d:
            boolean r6 = r10.hasNext()
            if (r6 != 0) goto L_0x0538
        L_0x0553:
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Class r5 = r1.getClass()
            java.lang.String r5 = r5.getName()
            fn6 r6 = udd.e
            if (r6 != 0) goto L_0x0562
            goto L_0x058b
        L_0x0562:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x058b
            tn7 r7 = defpackage.tn7.X
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "phoneDensity: "
            r10.<init>(r11)
            r10.append(r2)
            java.lang.String r11 = "; lowerDensity: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = "; higherDensity: "
            r10.append(r11)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r6.d(r7, r5, r10, r9)
        L_0x058b:
            if (r12 == 0) goto L_0x05a4
            java.lang.Object r5 = r12.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r2) goto L_0x05a4
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r4 = r12.intValue()
            goto L_0x05d3
        L_0x05a4:
            if (r8 == 0) goto L_0x05ad
            java.lang.Object r5 = r8.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x05ae
        L_0x05ad:
            r5 = r9
        L_0x05ae:
            if (r5 == 0) goto L_0x05c7
            java.lang.Object r5 = r8.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 < r2) goto L_0x05c7
            java.lang.Object r12 = r8.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r4 = r12.intValue()
            goto L_0x05d3
        L_0x05c7:
            if (r12 == 0) goto L_0x05d3
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r4 = r12.intValue()
        L_0x05d3:
            java.lang.Class<cv4> r12 = defpackage.cv4.class
            java.lang.String r2 = r12.getName()
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x05de
            goto L_0x05fb
        L_0x05de:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x05fb
            tn7 r6 = defpackage.tn7.X
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            java.lang.String r7 = "Emoji size by density: "
            java.lang.String r8 = ", density:"
            java.lang.String r1 = defpackage.me4.g(r7, r4, r1, r8)
            r5.d(r6, r2, r1, r9)
        L_0x05fb:
            float r1 = (float) r3
            r2 = 13
            float r2 = (float) r2
            float r1 = r1 / r2
            java.lang.String r2 = r12.getName()
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x0609
            goto L_0x0622
        L_0x0609:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0622
            tn7 r6 = defpackage.tn7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Calculated emoji size in sprite before coarce: "
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r5.d(r6, r2, r7, r9)
        L_0x0622:
            float r2 = (float) r4
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0628
            r1 = r2
        L_0x0628:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0648
            java.lang.String r0 = r12.getName()
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0635
            goto L_0x0646
        L_0x0635:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0646
            tn7 r2 = defpackage.tn7.X
            java.lang.String r4 = "Fallback for emoji size. Sprite width: "
            java.lang.String r4 = defpackage.wn6.h(r3, r4)
            r1.d(r2, r0, r4, r9)
        L_0x0646:
            r1 = 1111490560(0x42400000, float:48.0)
        L_0x0648:
            java.lang.String r12 = r12.getName()
            fn6 r0 = udd.e
            if (r0 != 0) goto L_0x0651
            goto L_0x0672
        L_0x0651:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x0672
            tn7 r2 = defpackage.tn7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Sprite width: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = "; Calculated emoji size in sprite: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            r0.d(r2, r12, r3, r9)
        L_0x0672:
            java.lang.Float r12 = java.lang.Float.valueOf(r1)
            return r12
        L_0x0677:
            android.content.Context r12 = r12.b
            android.graphics.drawable.StateListDrawable r12 = xy6.n(r12)
            return r12
        L_0x067e:
            java.lang.String r0 = "input_method"
            android.content.Context r12 = r12.b
            java.lang.Object r12 = r12.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r12 = (android.view.inputmethod.InputMethodManager) r12
            boolean r12 = r12.isActive()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc3.invoke():java.lang.Object");
    }

    public /* synthetic */ cc3(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
