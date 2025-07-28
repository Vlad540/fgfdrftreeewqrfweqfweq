package one.me.sdk.messagewrite;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/messagewrite/MessageWriteWidget;", "Lone/me/sdk/arch/Widget;", "Ld87;", "Ltq3;", "Lvp8;", "Lj03;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
public final class MessageWriteWidget extends Widget implements d87, tq3, vp8, j03 {
    public static final /* synthetic */ k77[] J0;
    public final n0c A0;
    public final nl0 B0;
    public final n0c C0;
    public final n0c D0;
    public tu7 E0;
    public nq3 F0;
    public final grd G0;
    public jme H0;
    public int I0;
    public final wk7 X;
    public final t97 Y;
    public final t97 Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public final t97 x0;
    public final n0c y0;
    public final n0c z0;

    static {
        Class<MessageWriteWidget> cls = MessageWriteWidget.class;
        k77 khb = new khb(cls, "rootView", "getRootView()Landroid/widget/LinearLayout;", 0);
        n7c n7c = m7c.a;
        J0 = new k77[]{khb, wn6.e(n7c, cls, "container", "getContainer()Landroid/widget/FrameLayout;", 0), wn6.f(cls, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0, n7c), wn6.f(cls, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0, n7c), wn6.f(cls, "recordControlsContainer", "getRecordControlsContainer()Landroid/view/ViewGroup;", 0, n7c), wn6.f(cls, "recordControlsRouter", "getRecordControlsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, n7c)};
    }

    public MessageWriteWidget(String str, x54 x54) {
        this(jjd.j(new wia[]{new wia("arg_scope_id", new inc(str))}));
    }

    public static void A0(flb flb, boolean z) {
        b1f b1f;
        int C = xy6.C(tge.e(flb.getTitleView()));
        int i = 0;
        if (z) {
            b1f a2 = tge.a(flb.getTitleView());
            if ((a2 != null ? a2.a : 0) == C) {
                return;
            }
        }
        if (z) {
            b1f a3 = tge.a(flb.getTitleView());
            if (a3 != null) {
                i = a3.a;
            }
            if (i != C) {
                b1f = new b1f(flb.getContext(), C, new xz6(20));
                tge.d(flb.getTitleView(), b1f);
            }
        }
        b1f = null;
        tge.d(flb.getTitleView(), b1f);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, fq8] */
    public static final void l0(MessageWriteWidget messageWriteWidget, nt8 nt8) {
        tt8 tt8;
        messageWriteWidget.getClass();
        String str = null;
        CharSequence charSequence = nt8 != null ? nt8.b : null;
        if (nt8 == null) {
            charSequence = null;
        }
        boolean z = false;
        if (nt8 == null) {
            messageWriteWidget.p0().setRightOuterIconActionState(new Object());
            messageWriteWidget.p0().setText((CharSequence) null);
            messageWriteWidget.p0().setRightInnerIconVisible(true);
        } else {
            messageWriteWidget.p0().setRightOuterIconActionState(nt8.d ? dq8.a : eq8.a);
            if (nt8.e) {
                messageWriteWidget.p0().setText((CharSequence) null);
                messageWriteWidget.p0().f(charSequence);
            }
            messageWriteWidget.p0().setRightInnerIconVisible(false);
        }
        messageWriteWidget.v0().r(charSequence);
        messageWriteWidget.y0(nt8 != null ? nt8.c : null);
        nl0 nl0 = messageWriteWidget.B0;
        if (ek8.L(nl0)) {
            messageWriteWidget.r0().setCounter((Integer) null);
            if (!(nt8 == null || (tt8 = nt8.c) == null)) {
                str = tt8.e;
            }
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                messageWriteWidget.r0().setDrawOverlay(true);
            }
            messageWriteWidget.r0().setImageClickListener(new pu8(messageWriteWidget, 1));
        } else if (nl0.a()) {
            flb flb = (flb) nl0.getValue();
            messageWriteWidget.r0().setImageClickListener((View.OnClickListener) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: cq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: cq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: cq8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m0(one.me.sdk.messagewrite.MessageWriteWidget r5, defpackage.pt8 r6) {
        /*
            r5.getClass()
            r0 = 0
            if (r6 == 0) goto L_0x0009
            tt8 r1 = r6.e
            goto L_0x000a
        L_0x0009:
            r1 = r0
        L_0x000a:
            if (r6 == 0) goto L_0x0013
            rt8 r2 = r6.d
            if (r2 == 0) goto L_0x0013
            java.lang.CharSequence r2 = r2.a
            goto L_0x0014
        L_0x0013:
            r2 = r0
        L_0x0014:
            r3 = 0
            if (r6 == 0) goto L_0x0024
            rt8 r4 = r6.d
            if (r4 == 0) goto L_0x0024
            java.lang.Integer r4 = r4.b
            if (r4 == 0) goto L_0x0024
            int r4 = r4.intValue()
            goto L_0x0025
        L_0x0024:
            r4 = r3
        L_0x0025:
            if (r6 == 0) goto L_0x0029
            rt8 r0 = r6.d
        L_0x0029:
            if (r0 == 0) goto L_0x0047
            jq8 r6 = r5.p0()
            java.lang.CharSequence r6 = r6.getText()
            boolean r6 = hhd.f(r6, r2)
            if (r6 != 0) goto L_0x0047
            jq8 r6 = r5.p0()
            r6.setText(r2)
            jq8 r6 = r5.p0()
            r6.h(r4)
        L_0x0047:
            jq8 r6 = r5.p0()
            if (r1 != 0) goto L_0x004e
            r3 = 1
        L_0x004e:
            r6.setRightInnerIconVisible(r3)
            jq8 r6 = r5.p0()
            if (r1 != 0) goto L_0x005d
            bq8 r0 = new bq8
            r0.<init>()
            goto L_0x005f
        L_0x005d:
            cq8 r0 = defpackage.cq8.a
        L_0x005f:
            r6.setRightOuterIconActionState(r0)
            r5.y0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.MessageWriteWidget.m0(one.me.sdk.messagewrite.MessageWriteWidget, pt8):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, fq8] */
    public static final void n0(MessageWriteWidget messageWriteWidget, tt8 tt8) {
        if (tt8 != null) {
            messageWriteWidget.p0().setRightOuterIconActionState(new Object());
            messageWriteWidget.p0().setRightInnerIconVisible(true);
            if (ek8.L(messageWriteWidget.B0) && messageWriteWidget.u0().P0.a.getValue() != null) {
                messageWriteWidget.p0().setText((CharSequence) null);
            }
            messageWriteWidget.y0(tt8);
            return;
        }
        messageWriteWidget.y0(tt8);
    }

    public final void B0(hge hge, boolean z) {
        flb r0 = r0();
        r0.getLocationOnScreen(new int[2]);
        WindowInsets rootWindowInsets = requireView().getRootWindowInsets();
        int i = 0;
        int i2 = rootWindowInsets != null ? nsf.f((View) null, rootWindowInsets).a.f(7).d : 0;
        int i3 = e87.a;
        if (e87.b(e87.c)) {
            i = e87.a(getContext());
        }
        Point point = new Point(a24.X(((float) 6) * dh4.c().getDisplayMetrics().density), me4.p((float) 4, dh4.c().getDisplayMetrics().density, r0().getHeight() + p0().getHeight() + i2 + i));
        jme jme = this.H0;
        if (jme != null) {
            jme.dismiss();
        }
        jme jme2 = new jme(getContext(), (View) r0, (s16) new ib7(28), (s16) null, 0, 1, 56);
        jme2.d(hge);
        jme2.e(point, 8388691, z ? 2500 : 800);
        jme2.setOnDismissListener(new su8(this, 1));
        this.H0 = jme2;
    }

    public final void C0(flb flb, tt8 tt8) {
        Drawable drawable;
        A0(flb, tt8.c);
        CharSequence charSequence = null;
        Integer num = tt8.i;
        if (num != null) {
            drawable = gq3.b(flb.getContext(), num.intValue());
            if (drawable == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            drawable = null;
        }
        flb.setStartIconDrawable(drawable);
        if (num != null && tt8.a == 3) {
            nu8 u0 = u0();
            if (!((i03) ((f03) u0.c.getValue())).g.getBoolean("app.onboarding.author_visibility", false)) {
                u0.Q0.m((Object) null, jue.a);
                ((i03) ((f03) u0.c.getValue())).i("app.onboarding.author_visibility", true);
            }
            flb.setStartIconClickListener(new xv5(this, 16, tt8));
        }
        CharSequence a2 = tt8.b.a(flb.getContext());
        if (a2 != null) {
            flb.setTitle(a2);
            mge mge = tt8.d;
            if (mge != null) {
                charSequence = mge.a(flb.getContext());
            }
            flb.setBody(charSequence);
            flb.a(tt8.e, tt8.f);
            flb.setCounter(tt8.g);
            flb.setDrawOverlay(false);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void N() {
        hq8 hq8 = p0().c;
        hq8.setShowSoftInputOnFocus(true);
        hq8.setOnFocusChangeListener((View.OnFocusChangeListener) null);
    }

    public final void m() {
        p0().e(false);
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o0(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.isAttached()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            k77[] r0 = J0
            r1 = 4
            r2 = r0[r1]
            n0c r3 = r4.C0
            java.lang.Object r2 = r3.T0(r4, r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.setClipChildren(r5)
            r1 = r0[r1]
            java.lang.Object r1 = r3.T0(r4, r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.setClipToPadding(r5)
            r1 = 1
            r2 = r0[r1]
            n0c r3 = r4.z0
            java.lang.Object r2 = r3.T0(r4, r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setClipChildren(r5)
            r0 = r0[r1]
            java.lang.Object r0 = r3.T0(r4, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setClipToPadding(r5)
            android.widget.LinearLayout r0 = r4.t0()
            r0.setClipChildren(r5)
            android.widget.LinearLayout r0 = r4.t0()
            r0.setClipToPadding(r5)
            android.widget.LinearLayout r0 = r4.t0()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L_0x0059
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            if (r0 == 0) goto L_0x005f
            r0.setClipChildren(r5)
        L_0x005f:
            android.widget.LinearLayout r0 = r4.t0()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x006e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x006f
        L_0x006e:
            r0 = r2
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            r0.setClipToPadding(r5)
        L_0x0074:
            android.widget.LinearLayout r0 = r4.t0()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0087
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0088
        L_0x0087:
            r0 = r2
        L_0x0088:
            if (r0 == 0) goto L_0x008d
            r0.setClipChildren(r5)
        L_0x008d:
            android.widget.LinearLayout r4 = r4.t0()
            android.view.ViewParent r4 = r4.getParent()
            android.view.ViewParent r4 = r4.getParent()
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00a0
            r2 = r4
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x00a0:
            if (r2 == 0) goto L_0x00a5
            r2.setClipToPadding(r5)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.MessageWriteWidget.o0(boolean):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qu8 qu8 = new qu8(this, 2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(y9a.y);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        qu8.invoke(linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        jme jme = this.H0;
        if (jme != null) {
            jme.dismiss();
        }
        this.H0 = null;
        m();
        this.E0 = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        MessageWriteWidget.super.onRequestPermissionsResult(i, strArr, iArr);
        int i2 = 0;
        if (i == 160) {
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] == -1) {
                    boolean unused = q0().getClass();
                    return;
                }
                i2++;
            }
        } else if (i == 181) {
            int length2 = iArr.length;
            while (i2 < length2) {
                if (iArr[i2] == -1) {
                    boolean unused2 = q0().getClass();
                    return;
                }
                i2++;
            }
        }
    }

    public final void onViewCreated(View view) {
        boolean z;
        ik5 ik5 = u0().W0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(ik5, getViewLifecycleOwner().R(), ob7), new xu8((Continuation) null, this, view), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new v11(e87.f, this.G0, new j01(3, (Continuation) null, 2), 4), getViewLifecycleOwner().R(), ob7), new pv8((Continuation) null, this), 5), getViewLifecycleScope());
        jq8 p0 = p0();
        qu8 qu8 = new qu8(this, 4);
        p0.getClass();
        String[] strArr = {"image/jpeg", "image/gif"};
        yp8 yp8 = new yp8(qu8);
        WeakHashMap weakHashMap = eaf.a;
        int i = Build.VERSION.SDK_INT;
        hq8 hq8 = p0.c;
        if (i >= 31) {
            baf.c(hq8, strArr, yp8);
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    z = false;
                    break;
                } else if (strArr[i2].startsWith("*")) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            e07.j("A MIME type set here must not start with *: " + Arrays.toString(strArr), !z);
            hq8.setTag(wpb.tag_on_receive_content_mime_types, strArr);
            hq8.setTag(wpb.tag_on_receive_content_listener, yp8);
        }
        e3e v0 = v0();
        v0.V0 = new ck3(v0, 2, this);
        ez3.N(new ck5(wx3.e(p0().getMessageState(), getViewLifecycleOwner().R(), ob7), new yu8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(p0().getMessagePosition(), new mv8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new ik5(v0().J0, 2), getViewLifecycleOwner().R(), ob7), new zu8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(v0().P0, new nv8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new ik5(v0().N0, 2), getViewLifecycleOwner().R(), ob7), new av8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(new ik5(((vu7) this.c.getValue()).b, 2), new ov8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(u0().J0, getViewLifecycleOwner().R(), ob7), new bv8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(u0().F0, getViewLifecycleOwner().R(), ob7), new cv8((Continuation) null, this), 5), getViewLifecycleScope());
        e07.B(new ck5(u0().Y0, new lv8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new iv8(u0().N0, this, 0), getViewLifecycleOwner().R(), ob7), new dv8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new iv8(u0().P0, this, 1), getViewLifecycleOwner().R(), ob7), new ev8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new iv8(u0().V0, this, 2), getViewLifecycleOwner().R(), ob7), new fv8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new ik5(u0().R0, 2), getViewLifecycleOwner().R(), ob7), new uu8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(u0().X0, getViewLifecycleOwner().R(), ob7), new vu8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((h3c) this.o.getValue()).X, getViewLifecycleOwner().R(), ob7), new wu8((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final jq8 p0() {
        return (jq8) this.A0.T0(this, J0[2]);
    }

    public final qna q0() {
        return (qna) this.w0.getValue();
    }

    public final flb r0() {
        k77 k77 = J0[3];
        return (flb) this.B0.getValue();
    }

    public final ax2 s0() {
        return (ax2) this.D0.T0(this, J0[5]);
    }

    public final LinearLayout t0() {
        return (LinearLayout) this.y0.T0(this, J0[0]);
    }

    public final nu8 u0() {
        return (nu8) this.a.getValue();
    }

    public final e3e v0() {
        return (e3e) this.b.getValue();
    }

    public final int w0() {
        boolean b2 = q0().b(qna.l);
        boolean b3 = q0().b(qna.h);
        return (b2 || !b3) ? (b3 || !b2) ? baa.j : baa.d : baa.i;
    }

    public final void x0() {
        nu8 u0 = u0();
        CharSequence text = p0().getText();
        u0.getClass();
        taf.o(u0.D0, new vt8(text));
        p0().setText((CharSequence) null);
    }

    public final void y(int i, Bundle bundle) {
        x2e x2e;
        grd grd;
        Object value;
        r2e r2e = (r2e) o23.X(v0().P0.l());
        if (r2e != null && (x2e = r2e.b) != null) {
            String str = (String) o23.Y(i, x2e.Y);
            if (str != null) {
                e3e v0 = v0();
                x2e x2e2 = new x2e(x2e.a, x2e.b, x2e.c, str, x2e.X, x2e.Y, x2e.Z);
                do {
                    grd = v0.M0;
                    value = grd.getValue();
                    x2e x2e3 = (x2e) value;
                } while (!grd.b(value, x2e2));
            }
            v0().O0.setValue((Object) null);
        }
    }

    public final void y0(tt8 tt8) {
        int i = this.I0;
        this.I0 = tt8 != null ? tt8.a : 0;
        nl0 nl0 = this.B0;
        if (tt8 == null && ek8.L(nl0)) {
            r0().setVisibility(8);
        } else if (tt8 != null && !ek8.L(nl0)) {
            View requireView = requireView();
            LinearLayout linearLayout = requireView instanceof LinearLayout ? (LinearLayout) requireView : null;
            if (linearLayout != null) {
                ek8.d(linearLayout, r0(), 0);
            }
            C0(r0(), tt8);
            r0().setVisibility(0);
            p0().requestFocus();
            p0().e(true);
        } else if (tt8 != null) {
            C0(r0(), tt8);
            p0().requestFocus();
            if (i != this.I0) {
                p0().e(true);
            }
        }
    }

    public final void z0() {
        CharSequence text = p0().getText();
        if ((text != null && !h0e.c0(text)) || u0().t()) {
            nu8 u0 = u0();
            k77[] k77Arr = nu8.Z0;
            u0.B(text, false);
            p0().setText((CharSequence) null);
        }
    }

    public MessageWriteWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        Class<inc> cls = inc.class;
        Object E = ek8.E(bundle, "arg_scope_id", cls);
        if (E != null) {
            this.a = m25getSharedViewModelcp94BC8(((inc) ((Parcelable) E)).a, nu8.class, (s16) null);
            Object E2 = ek8.E(bundle, "arg_scope_id", cls);
            if (E2 != null) {
                this.b = m25getSharedViewModelcp94BC8(((inc) ((Parcelable) E2)).a, e3e.class, (s16) null);
                Object E3 = ek8.E(bundle, "arg_scope_id", cls);
                if (E3 != null) {
                    this.c = m25getSharedViewModelcp94BC8(((inc) ((Parcelable) E3)).a, vu7.class, (s16) null);
                    Object E4 = ek8.E(bundle, "arg_scope_id", cls);
                    if (E4 != null) {
                        this.o = m25getSharedViewModelcp94BC8(((inc) ((Parcelable) E4)).a, h3c.class, (s16) null);
                        xuf xuf = xuf.a;
                        this.X = (wk7) xuf.getAccessor().c(wk7.class);
                        this.Y = xuf.getAccessor().d(ip.class);
                        this.Z = xuf.getAccessor().d(jb5.class);
                        this.w0 = xuf.getAccessor().d(qna.class);
                        this.x0 = ez3.O(3, new ou8(this, 0));
                        this.y0 = viewBinding(y9a.y);
                        this.z0 = viewBinding(y9a.w);
                        this.A0 = viewBinding(qhc.W);
                        this.B0 = binding(new ou8(this, 1));
                        int i = y9a.x;
                        this.C0 = viewBinding(i);
                        this.D0 = childSlotRouter(i);
                        this.G0 = hrd.a(Boolean.FALSE);
                        return;
                    }
                    throw new IllegalArgumentException(wn6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
                }
                throw new IllegalArgumentException(wn6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
            }
            throw new IllegalArgumentException(wn6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
        }
        throw new IllegalArgumentException(wn6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
