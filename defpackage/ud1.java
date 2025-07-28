package defpackage;

import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* renamed from: ud1  reason: default package */
public final /* synthetic */ class ud1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ ud1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: m54} */
    /* JADX WARNING: type inference failed for: r1v13, types: [f6c, gd1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r22 = this;
            r0 = r22
            r2 = 16
            r3 = -855638017(0xffffffffccffffff, float:-1.3421772E8)
            r4 = 8
            r5 = 4
            r6 = 6
            r7 = 17
            r8 = -2
            r9 = 1895825407(0x70ffffff, float:6.3382526E29)
            qda r10 = qda.a
            r11 = 12
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = -1
            one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget r1 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x04d5;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04ba;
                case 3: goto L_0x042d;
                case 4: goto L_0x0413;
                case 5: goto L_0x03fc;
                case 6: goto L_0x03ae;
                case 7: goto L_0x0360;
                case 8: goto L_0x0320;
                case 9: goto L_0x0319;
                case 10: goto L_0x0286;
                case 11: goto L_0x021b;
                case 12: goto L_0x01a9;
                case 13: goto L_0x009c;
                case 14: goto L_0x008b;
                case 15: goto L_0x002d;
                default: goto L_0x0020;
            }
        L_0x0020:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            gd1 r0 = new gd1
            nfc r2 = new nfc
            r2.<init>((int) r6, (java.lang.Object) r1)
            r0.<init>(r2)
            return r0
        L_0x002d:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            p4a r0 = new p4a
            android.content.Context r2 = r1.getContext()
            r0.<init>(r2, r12)
            int r2 = defpackage.uob.call_screen_opponent_empty_list
            r0.setId(r2)
            nt3 r2 = new nt3
            r2.<init>((int) r15, (int) r15)
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r3 = new com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            r3.<init>()
            r2.b(r3)
            r0.setLayoutParams(r2)
            t97 r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            ync r1 = (ync) r1
            int r1 = r1.d
            r2 = 40
            float r2 = (float) r2
            android.content.res.Resources r3 = dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r1 = me4.c(r2, r3, r1)
            r0.setPadding(r13, r13, r13, r1)
            int r1 = defpackage.n1a.l0
            r0.setIcon(r1)
            int r1 = defpackage.r1a.d1
            hge r2 = new hge
            r2.<init>(r1)
            r0.setTitle(r2)
            int r1 = defpackage.r1a.c1
            hge r2 = new hge
            r2.<init>(r1)
            r0.setSubtitle(r2)
            r0.setVisibility(r4)
            r0.setCustomTheme(r10)
            return r0
        L_0x008b:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            android.view.ViewStub r0 = new android.view.ViewStub
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            int r1 = defpackage.uob.call_screen_opponent_empty_list
            r0.setId(r1)
            return r0
        L_0x009c:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            android.widget.EditText r0 = new android.widget.EditText
            android.content.Context r4 = r1.getContext()
            r0.<init>(r4)
            int r4 = defpackage.uob.call_user_list_in_call_bottom_search
            r0.setId(r4)
            nge r4 = nte.a
            nge.d(r4, r0)
            r0.setHintTextColor(r9)
            r0.setTextColor(r3)
            float r3 = (float) r11
            android.content.res.Resources r4 = dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r4 = defpackage.a24.X(r4)
            r0.setPadding(r4, r4, r4, r4)
            r0.setMaxLines(r14)
            android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
            r9 = 250(0xfa, float:3.5E-43)
            r4.<init>(r9)
            android.text.InputFilter$LengthFilter[] r4 = new android.text.InputFilter.LengthFilter[]{r4}
            android.text.InputFilter[] r4 = (android.text.InputFilter[]) r4
            r0.setFilters(r4)
            k23 r4 = new k23
            r4.<init>(r15, r8)
            r4.a = r14
            float r5 = (float) r5
            android.content.res.Resources r8 = dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r5 = r5 * r8
            int r5 = defpackage.a24.X(r5)
            r4.bottomMargin = r5
            android.content.res.Resources r5 = dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r3
            int r5 = defpackage.a24.X(r5)
            r4.setMarginStart(r5)
            android.content.res.Resources r5 = dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = defpackage.a24.X(r3)
            r4.setMarginEnd(r3)
            r0.setLayoutParams(r4)
            t97 r3 = r1.b
            java.lang.Object r3 = r3.getValue()
            xk1 r3 = (defpackage.xk1) r3
            int r4 = defpackage.r1a.R1
            r3.getClass()
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            android.content.Context r3 = r3.a
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r8 = "  "
            java.lang.String r4 = rf0.h(r8, r4)
            r5.<init>(r4)
            bi5 r4 = new bi5
            int r8 = defpackage.cnb.ic_search_outline_16
            r9 = 1207959551(0x47ffffff, float:131071.99)
            android.graphics.drawable.Drawable r3 = defpackage.kjd.C(r8, r9, r3)
            float r2 = (float) r2
            android.content.res.Resources r8 = dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r2
            int r8 = defpackage.a24.X(r8)
            android.content.res.Resources r9 = dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r2 = r2 * r9
            int r2 = defpackage.a24.X(r2)
            r3.setBounds(r13, r13, r8, r2)
            r4.<init>(r3, r12, r6)
            r5.setSpan(r4, r13, r14, r7)
            r0.setHint(r5)
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.RoundRectShape r3 = new android.graphics.drawable.shapes.RoundRectShape
            t97 r4 = r1.a
            java.lang.Object r4 = r4.getValue()
            float[] r4 = (float[]) r4
            r3.<init>(r4, r12, r12)
            r2.<init>(r3)
            android.graphics.Paint r3 = r2.getPaint()
            nd0 r4 = qda.c
            md0 r4 = r4.a
            int r4 = r4.g
            r3.setColor(r4)
            r0.setBackground(r2)
            ae1 r2 = new ae1
            r2.<init>(r0, r13, r1)
            r0.addTextChangedListener(r2)
            hd1 r1 = new hd1
            r1.<init>(r14)
            wd1 r2 = new wd1
            r2.<init>(r1, r13, r0)
            r0.setOnTouchListener(r2)
            return r0
        L_0x01a9:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            nge r1 = nte.t
            nge.d(r1, r0)
            r0.setTextColor(r9)
            r0.setMaxLines(r14)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r1)
            int r1 = defpackage.r1a.f1
            r0.setText(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r15)
            float r3 = (float) r11
            android.content.res.Resources r5 = dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r3
            int r5 = defpackage.a24.X(r5)
            r1.setMarginStart(r5)
            android.content.res.Resources r5 = dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = defpackage.a24.X(r3)
            r1.setMarginEnd(r3)
            float r2 = (float) r2
            android.content.res.Resources r3 = dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.a24.X(r2)
            r1.topMargin = r2
            float r2 = (float) r4
            android.content.res.Resources r3 = dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.a24.X(r2)
            r1.bottomMargin = r2
            r0.setLayoutParams(r1)
            return r0
        L_0x021b:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            nge r1 = nte.o
            nge.d(r1, r0)
            r0.setTextColor(r9)
            r0.setMaxLines(r14)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r1)
            r0.setGravity(r7)
            float r1 = (float) r11
            android.content.res.Resources r2 = dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.a24.X(r2)
            float r3 = (float) r5
            android.content.res.Resources r4 = dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = defpackage.a24.X(r3)
            android.content.res.Resources r4 = dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r1 = r1 * r4
            int r1 = defpackage.a24.X(r1)
            r4 = 18
            float r4 = (float) r4
            android.content.res.Resources r5 = dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = defpackage.a24.X(r4)
            r0.setPadding(r2, r3, r1, r4)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r15, r15)
            r0.setLayoutParams(r1)
            return r0
        L_0x0286:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            nge r1 = nte.z
            nge.d(r1, r0)
            r0.setTextColor(r3)
            r1 = 3
            r0.setMaxLines(r1)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r1)
            r0.setGravity(r7)
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r2 = dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.a24.X(r2)
            float r3 = (float) r11
            android.content.res.Resources r4 = dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = defpackage.a24.X(r3)
            android.content.res.Resources r4 = dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r1 = r1 * r4
            int r1 = defpackage.a24.X(r1)
            float r4 = (float) r5
            android.content.res.Resources r5 = dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = defpackage.a24.X(r4)
            r0.setPadding(r2, r3, r1, r4)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r15)
            r2 = 28
            float r2 = (float) r2
            android.content.res.Resources r3 = dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = defpackage.a24.X(r3)
            r1.setMarginStart(r3)
            android.content.res.Resources r3 = dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.a24.X(r2)
            r1.setMarginEnd(r2)
            r0.setLayoutParams(r1)
            return r0
        L_0x0319:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            yb7 r0 = r1.getViewLifecycleScope()
            return r0
        L_0x0320:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            androidx.recyclerview.widget.RecyclerView r0 = new androidx.recyclerview.widget.RecyclerView
            android.content.Context r2 = r1.getContext()
            r0.<init>(r2, r12)
            int r2 = defpackage.uob.call_user_list_in_call_list
            r0.setId(r2)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.getContext()
            r2.<init>()
            r0.setLayoutManager(r2)
            r7e r1 = r1.H0
            java.lang.Object r1 = r1.getValue()
            gd1 r1 = (defpackage.gd1) r1
            r0.setAdapter(r1)
            r0.setClipToPadding(r14)
            r1 = -15263716(0xffffffffff17181c, float:-2.0083861E38)
            r0.setBackgroundColor(r1)
            nt3 r1 = new nt3
            r1.<init>((int) r15, (int) r15)
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r2 = new com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            r2.<init>()
            r1.b(r2)
            r0.setLayoutParams(r1)
            return r0
        L_0x0360:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            f1a r0 = new f1a
            android.content.Context r2 = r1.getContext()
            r0.<init>(r2)
            int r2 = defpackage.o1a.n0
            r0.setId(r2)
            nt3 r2 = new nt3
            r2.<init>((int) r15, (int) r8)
            float r3 = (float) r11
            android.content.res.Resources r4 = dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r4 = defpackage.a24.X(r4)
            r2.setMarginStart(r4)
            android.content.res.Resources r4 = dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = defpackage.a24.X(r3)
            r2.setMarginEnd(r3)
            r0.setLayoutParams(r2)
            r0.setCustomTheme(r10)
            x0a r2 = x0a.b
            r0.setAppearance(r2)
            rgc r2 = new rgc
            r2.<init>(r7, r1)
            r0.setListener(r2)
            return r0
        L_0x03ae:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            nea r0 = new nea
            android.content.Context r2 = r1.getContext()
            r0.<init>(r2, r6)
            fea r2 = fea.a
            r0.setForm(r2)
            r0.setTextShimmerEnabled(r13)
            vda r2 = new vda
            vd1 r3 = new vd1
            r3.<init>(r1, r14)
            r2.<init>(r3)
            r0.setLeftActions(r2)
            float r1 = (float) r6
            android.content.res.Resources r2 = dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = defpackage.a24.X(r2)
            android.content.res.Resources r3 = dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = defpackage.a24.X(r1)
            int r3 = r0.getPaddingTop()
            int r4 = r0.getPaddingBottom()
            r0.setPaddingRelative(r2, r3, r1, r4)
            r0.setCustomTheme(r10)
            return r0
        L_0x03fc:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            aea r0 = new aea
            hea r2 = new hea
            int r3 = defpackage.n1a.B
            vd1 r4 = new vd1
            r5 = 2
            r4.<init>(r1, r5)
            r1 = 14
            r2.<init>(r3, r13, r4, r1)
            r0.<init>(r12, r2)
            return r0
        L_0x0413:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            k23 r1 = new k23
            r1.<init>(r15, r8)
            r2 = 2
            r1.a = r2
            r0.setLayoutParams(r1)
            r0.setOrientation(r14)
            return r0
        L_0x042d:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            bh1 r0 = defpackage.bh1.a
            w4 r2 = r0.getAccessor()
            java.lang.Class<iq1> r3 = iq1.class
            r7e r5 = r2.d(r3)
            t97 r2 = mqc.a
            z11 r2 = defpackage.z11.a
            w4 r2 = r2.getAccessor()
            java.lang.Class<aka> r4 = defpackage.aka.class
            java.lang.Object r2 = r2.c(r4)
            r11 = r2
            aka r11 = (defpackage.aka) r11
            nqc r2 = nqc.a
            pae r12 = r2.s()
            po1 r13 = r0.b()
            w4 r4 = r0.getAccessor()
            java.lang.Class<xk1> r6 = defpackage.xk1.class
            r7e r7 = r4.d(r6)
            w4 r4 = r0.getAccessor()
            java.lang.Class<vx0> r6 = defpackage.vx0.class
            r7e r8 = r4.d(r6)
            w4 r4 = r0.getAccessor()
            java.lang.Class<jb5> r9 = jb5.class
            r7e r10 = r4.d(r9)
            w4 r4 = r0.getAccessor()
            java.lang.Class<so1> r14 = defpackage.so1.class
            r7e r14 = r4.d(r14)
            m54 r15 = new m54
            r15.<init>()
            po1 r18 = r0.b()
            w4 r4 = r0.getAccessor()
            r7e r20 = r4.d(r6)
            w4 r0 = r0.getAccessor()
            r7e r19 = r0.d(r3)
            w4 r0 = r2.getAccessor()
            r7e r21 = r0.d(r9)
            yl1 r0 = new yl1
            ud1 r2 = new ud1
            r3 = 9
            r2.<init>(r1, r3)
            r16 = r0
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            td1 r1 = new td1
            r4 = r1
            r6 = r14
            r9 = r10
            r10 = r0
            r14 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x04ba:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            android.content.Context r0 = r1.getContext()
            int r1 = defpackage.cnb.ic_clear_16
            android.graphics.drawable.Drawable r0 = defpackage.gq3.b(r0, r1)
            r0.setTint(r9)
            return r0
        L_0x04ca:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            android.content.Context r0 = r1.getContext()
            ync r0 = defpackage.udd.C(r0)
            return r0
        L_0x04d5:
            k77[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            fm r0 = new fm
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r0.setFocusable(r14)
            r0.setFocusableInTouchMode(r14)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r15, r8)
            r0.setLayoutParams(r1)
            r0.setBackground(r12)
            r0.setStateListAnimator(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud1.invoke():java.lang.Object");
    }
}
