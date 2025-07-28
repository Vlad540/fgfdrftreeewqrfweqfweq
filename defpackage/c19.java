package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: c19  reason: default package */
public final class c19 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c19(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        c19 c19 = new c19(continuation, this.Y);
        c19.X = obj;
        return c19;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: rkc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: rkc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: gg4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: bp0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: rkc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: rkc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: rkc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: rkc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: rkc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: rkc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: rkc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            wx3.H(r8)
            java.lang.Object r8 = r7.X
            uw4 r8 = (defpackage.uw4) r8
            k77[] r0 = one.me.messages.list.ui.MessagesListWidget.b1
            one.me.messages.list.ui.MessagesListWidget r7 = r7.Y
            android.widget.FrameLayout r0 = r7.m0()
            r0.removeAllViews()
            boolean r0 = r8 instanceof defpackage.rw4
            r1 = 32
            r2 = 17
            r3 = -2
            if (r0 == 0) goto L_0x0047
            bp0 r0 = new bp0
            android.content.Context r4 = r7.getContext()
            r0.<init>(r4)
            rw4 r8 = (defpackage.rw4) r8
            r0.setState(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r8.<init>(r4, r3, r2)
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = a24.X(r1)
            r8.setMargins(r1, r1, r1, r1)
            r0.setLayoutParams(r8)
            goto L_0x0120
        L_0x0047:
            boolean r0 = r8 instanceof defpackage.sw4
            r4 = 30
            if (r0 == 0) goto L_0x00d4
            gg4 r0 = new gg4
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1)
            sw4 r8 = (defpackage.sw4) r8
            oh2 r1 = new oh2
            r5 = 4
            r1.<init>(r5, r7)
            androidx.appcompat.widget.AppCompatTextView r5 = r0.b
            int r6 = defpackage.c7a.M
            r5.setText(r6)
            androidx.appcompat.widget.AppCompatTextView r5 = r0.c
            int r6 = defpackage.c7a.L
            r5.setText(r6)
            ktd r8 = r8.a
            if (r8 == 0) goto L_0x0087
            r5 = 144(0x90, float:2.02E-43)
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = a24.X(r5)
            gr7 r6 = r0.o
            r6.a(r8, r5)
        L_0x0087:
            r0.a = r1
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r1 = 262(0x106, float:3.67E-43)
            float r1 = (float) r1
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r1 = r1 * r5
            int r1 = a24.X(r1)
            r8.<init>(r1, r3, r2)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = a24.X(r1)
            r8.setMargins(r1, r1, r1, r1)
            r0.setLayoutParams(r8)
            android.content.Context r8 = r0.getContext()
            sma r8 = js.u(r8)
            boolean r8 = r8.b
            if (r8 == 0) goto L_0x0120
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r4) goto L_0x0120
            ww4 r8 = new ww4
            android.view.View r1 = r7.requireView()
            r8.<init>(r0, r1)
            r7.Z0 = r8
            goto L_0x0120
        L_0x00d4:
            boolean r0 = r8 instanceof defpackage.tw4
            if (r0 == 0) goto L_0x011d
            rkc r0 = new rkc
            android.content.Context r5 = r7.getContext()
            r0.<init>(r5)
            tw4 r8 = (defpackage.tw4) r8
            r0.setState(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r3, r3, r2)
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = a24.X(r1)
            r8.setMargins(r1, r1, r1, r1)
            r0.setLayoutParams(r8)
            android.content.Context r8 = r7.getContext()
            sma r8 = js.u(r8)
            boolean r8 = r8.b
            if (r8 == 0) goto L_0x0120
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r4) goto L_0x0120
            ww4 r8 = new ww4
            android.view.View r1 = r7.requireView()
            r8.<init>(r0, r1)
            r7.Z0 = r8
            goto L_0x0120
        L_0x011d:
            if (r8 != 0) goto L_0x0135
            r0 = 0
        L_0x0120:
            if (r0 == 0) goto L_0x0132
            qzf r8 = new qzf
            r1 = 7
            r8.<init>(r1)
            afa.a(r0, r8)
            android.widget.FrameLayout r7 = r7.m0()
            r7.addView(r0)
        L_0x0132:
            jue r7 = jue.a
            return r7
        L_0x0135:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c19.o(java.lang.Object):java.lang.Object");
    }
}
