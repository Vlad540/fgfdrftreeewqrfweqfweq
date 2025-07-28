package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: ae1  reason: default package */
public final class ae1 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ae1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    public final void afterTextChanged(Editable editable) {
        String str;
        int i = 0;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) obj;
                EditText editText = (EditText) this.b;
                if (editable == null || h0e.c0(editable)) {
                    ArrayList arrayList = tge.a;
                    editText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else if (!hhd.f(editText.getCompoundDrawablesRelative()[2], (Drawable) callOpponentsListWidget.X.getValue())) {
                    ArrayList arrayList2 = tge.a;
                    editText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) callOpponentsListWidget.X.getValue(), (Drawable) null);
                }
                k77[] k77Arr = CallOpponentsListWidget.L0;
                td1 p0 = callOpponentsListWidget.p0();
                if (editable == null || (str = editable.toString()) == null) {
                    str = BuildConfig.FLAVOR;
                }
                xs7.E(p0.a, p0.o.e(), (ru3) null, new rd1(p0, str, (Continuation) null), 2);
                return;
            case 1:
                ((u16) this.b).invoke(String.valueOf(editable));
                jx3 jx3 = (jx3) obj;
                TextView textView = jx3.c;
                int i2 = jx3.a;
                if (editable != null) {
                    i = editable.length();
                }
                textView.setText(String.valueOf(i2 - i));
                return;
            case 2:
                ((u16) this.b).invoke(String.valueOf(editable));
                xe4 xe4 = (xe4) obj;
                TextView textView2 = xe4.y0;
                int maxCount = xe4.getMaxCount();
                if (editable != null) {
                    i = editable.length();
                }
                textView2.setText(String.valueOf(maxCount - i));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                ((u16) this.b).invoke(((jq8) obj).getText());
                return;
            case 8:
                return;
            default:
                if (((rdd) this.b).L0.isFocused()) {
                    ((u16) obj).invoke(String.valueOf(editable));
                    return;
                }
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r1.i == true) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            ru3 r6 = defpackage.ru3.b
            r7 = 1
            r8 = 0
            java.lang.Object r0 = r4.c
            r1 = 0
            int r2 = r4.a
            switch(r2) {
                case 0: goto L_0x012a;
                case 1: goto L_0x012a;
                case 2: goto L_0x012a;
                case 3: goto L_0x011a;
                case 4: goto L_0x00ce;
                case 5: goto L_0x0080;
                case 6: goto L_0x006f;
                case 7: goto L_0x006e;
                case 8: goto L_0x0045;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.Object r4 = r4.b
            rdd r4 = (rdd) r4
            n06 r6 = r4.J0
            boolean r6 = r6 instanceof mdd
            if (r6 == 0) goto L_0x0044
            android.widget.ImageView r6 = r4.P0
            if (r5 == 0) goto L_0x0023
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r5 = r8
            goto L_0x0024
        L_0x0023:
            r5 = r7
        L_0x0024:
            r5 = r5 ^ r7
            if (r5 == 0) goto L_0x003f
            androidx.appcompat.widget.AppCompatEditText r5 = r4.L0
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L_0x003f
            n06 r4 = r4.J0
            boolean r5 = r4 instanceof mdd
            if (r5 == 0) goto L_0x0038
            r1 = r4
            mdd r1 = (mdd) r1
        L_0x0038:
            if (r1 == 0) goto L_0x003f
            boolean r4 = r1.i
            if (r4 != r7) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r8 = 8
        L_0x0041:
            r6.setVisibility(r8)
        L_0x0044:
            return
        L_0x0045:
            java.lang.Object r4 = r4.b
            android.widget.EditText r4 = (android.widget.EditText) r4
            if (r5 == 0) goto L_0x006b
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0052:
            mda r0 = (mda) r0
            t97 r5 = r0.A0
            java.lang.Object r5 = r5.getValue()
            r6 = r5
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            boolean r6 = r4.isEnabled()
            if (r6 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = r1
        L_0x0065:
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r4.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r5, r1)
            goto L_0x006e
        L_0x006b:
            r4.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r1, r1)
        L_0x006e:
            return
        L_0x006f:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r4 = r4.b
            u16 r4 = (defpackage.u16) r4
            r4.invoke(r5)
            k97 r0 = (k97) r0
            r0.F(r1)
            return
        L_0x0080:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = defpackage.hhd.f(r2, r5)
            if (r2 != 0) goto L_0x00cd
            k77[] r2 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.F0
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r0 = (one.me.inviteactions.invitebyphone.InviteByPhoneScreen) r0
            r17 r2 = r0.o0()
            r2.getClass()
            p17 r3 = new p17
            r3.<init>(r2, r1)
            qod r6 = taf.n(r2, r1, r6, r3, r7)
            k77[] r1 = defpackage.r17.F0
            r1 = r1[r7]
            e3 r3 = r2.B0
            r3.o1(r2, r1, r6)
            r4.b = r5
            k77[] r4 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.F0
            r6 = r4[r8]
            jr r6 = r0.X
            r6.b(r0, r5)
            one.me.sdk.uikit.common.button.OneMeButton r5 = r0.m0()
            r4 = r4[r8]
            java.lang.Object r4 = r6.a(r0)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r7 = r8
        L_0x00ca:
            r5.setEnabled(r7)
        L_0x00cd:
            return
        L_0x00ce:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = defpackage.hhd.f(r2, r5)
            if (r2 != 0) goto L_0x0119
            k77[] r2 = one.me.login.inputphone.InputPhoneScreen.I0
            one.me.login.inputphone.InputPhoneScreen r0 = (one.me.login.inputphone.InputPhoneScreen) r0
            ly6 r2 = r0.p0()
            r2.getClass()
            hy6 r3 = new hy6
            r3.<init>(r2, r1)
            qod r6 = taf.n(r2, r1, r6, r3, r7)
            k77[] r1 = ly6.F0
            r7 = r1[r7]
            e3 r1 = r2.z0
            r1.o1(r2, r7, r6)
            r4.b = r5
            k77[] r4 = one.me.login.inputphone.InputPhoneScreen.I0
            r4 = r4[r8]
            jr r4 = r0.X
            r4.b(r0, r5)
            ly6 r4 = r0.p0()
            y7a r6 = r0.o0()
            java.lang.String r6 = r6.getCode()
            grd r4 = r4.C0
            java.lang.String r5 = r6.concat(r5)
            r4.setValue(r5)
        L_0x0119:
            return
        L_0x011a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r4 = r4.b
            u16 r4 = (defpackage.u16) r4
            r4.invoke(r5)
            uh5 r0 = (uh5) r0
            r0.F(r1)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae1.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public /* synthetic */ ae1(Widget widget, int i) {
        this.a = i;
        this.c = widget;
    }
}
