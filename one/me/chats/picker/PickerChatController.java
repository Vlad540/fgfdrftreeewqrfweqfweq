package one.me.chats.picker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/chats/picker/PickerChatController;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Llua;", "purpose", "(Llua;Landroid/os/Bundle;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PickerChatController extends Widget implements lc3 {
    public static final /* synthetic */ k77[] F0;
    public static final sy6 G0 = new sy6(4, new up0(4, 3, false));
    public final t97 A0;
    public az1 B0;
    public sgc C0;
    public final bw5 D0;
    public z68 E0;
    public final jr X;
    public final t97 Y;
    public final nl0 Z;
    public final String a;
    public final jr b;
    public final jr c;
    public final sy6 o;
    public final nl0 w0;
    public final n0c x0;
    public final nl0 y0;
    public final i80 z0;

    static {
        Class<PickerChatController> cls = PickerChatController.class;
        F0 = new k77[]{new khb(cls, "purpose", "getPurpose()Lone/me/chats/picker/PickerPurpose;", 0), m4b.g(m7c.a, cls, "preselectedChats", "getPreselectedChats()[J", 0), new hc9(cls, "message", "getMessage()Ljava/lang/String;"), new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new khb(cls, "chips", "getChips()Lone/me/sdk/uikit/common/views/OneMeContactsChipGroup;", 0), new khb(cls, "mainContainer", "getMainContainer()Landroid/view/View;", 0)};
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chats.picker.PickerChatController, java.lang.Object] */
    public PickerChatController(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = "PickerChatsController";
        this.b = new jr(lua.class, "picker_chat_controller_purpose");
        this.c = new jr(long[].class, new long[0], "picker_chat_controller_preselected_chats");
        this.o = m0() ? sy6.c : sy6.d;
        this.X = new jr(String.class, (Object) null, "picker_chat_controller_message");
        this.Y = createViewModelLazy(xra.class, new wq9(3, new zu4(this, 29, bundle)));
        this.Z = binding(new tqa(this, 1));
        this.w0 = binding(new tqa(this, 2));
        this.x0 = viewBinding(f2a.f0);
        this.y0 = binding(new tqa(this, 3));
        i80 i80 = new i80();
        i80.b(f2a.i0);
        i80.b(f2a.d0);
        i80.b(f2a.e0);
        i80.W(0);
        i80.J(100);
        this.z0 = i80;
        this.A0 = createViewModelLazy(u68.class, new wq9(4, new qga(3)));
        this.D0 = new bw5(this, 2);
        ez3.N(new ck5(new u09(wx3.e(o0().G0, this.lifecycleOwner.R(), ob7.o), 15), new vqa(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final sy6 getInsetsConfig() {
        return this.o;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m48getScopeIdIluPPks() {
        return this.a;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chats.picker.PickerChatController] */
    public final boolean handleBack() {
        sgc sgc = this.C0;
        if (sgc == null || !sgc.n()) {
            if (!((Collection) o0().A0.a.getValue()).isEmpty()) {
                Object value = o0().A0.a.getValue();
                k77 k77 = F0[1];
                if (!hhd.f(value, cs.h0((long[]) this.c.a(this)))) {
                    k77[] k77Arr = BottomSheetWidget.B0;
                    sgc sgc2 = null;
                    jc3 c2 = rf0.c(h2a.T, 6, (Bundle) null);
                    c2.b(f2a.c0, new hge(h2a.S));
                    c2.c(f2a.b0, new hge(h2a.R));
                    ConfirmationBottomSheet e = c2.e();
                    e.setTargetController(this);
                    rr3 rr3 = this;
                    while (rr3.getParentController() != null) {
                        rr3 = rr3.getParentController();
                    }
                    ygc ygc = rr3 instanceof ygc ? (ygc) rr3 : null;
                    if (ygc != null) {
                        sgc2 = ygc.S();
                    }
                    e.y0(this);
                    if (sgc2 == null) {
                        return true;
                    }
                    vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    sgc2.G(vgc);
                    return true;
                }
            }
            return PickerChatController.super.handleBack();
        }
        o0().F0.K(1);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.chats.picker.PickerChatController] */
    public final void i(int i, Bundle bundle) {
        if (i == f2a.c0) {
            getRouter().B(this);
        }
    }

    public final x2a l0() {
        k77 k77 = F0[4];
        return (x2a) this.w0.getValue();
    }

    public final boolean m0() {
        k77[] k77Arr = F0;
        k77 k77 = k77Arr[0];
        jr jrVar = this.b;
        if (((lua) jrVar.a(this)) != lua.EXTERNAL_SHARE) {
            k77 k772 = k77Arr[0];
            return ((lua) jrVar.a(this)) == lua.FORWARD;
        }
    }

    public final View n0() {
        return (View) this.x0.T0(this, F0[5]);
    }

    public final xra o0() {
        return (xra) this.Y.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: one.me.sdk.arch.Widget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: one.me.chats.picker.PickerChatsListWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: rr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: one.me.chats.picker.members.PickerMembersListWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: rr3} */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.widget.FrameLayout, android.view.View, az1, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r14v1, types: [one.me.chats.picker.PickerChatsTabWidget, rr3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r24, android.view.ViewGroup r25, android.os.Bundle r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 0
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r4 = r24.getContext()
            r3.<init>(r4)
            r4 = 1
            r3.setOrientation(r4)
            int r5 = defpackage.f2a.f0
            r3.setId(r5)
            k77[] r5 = F0
            r6 = 3
            r7 = r5[r6]
            nl0 r7 = r0.Z
            java.lang.Object r7 = r7.getValue()
            nea r7 = (nea) r7
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = -1
            r10 = -2
            r8.<init>(r9, r10)
            r3.addView(r7, r8)
            zw7 r7 = new zw7
            android.content.Context r8 = r3.getContext()
            r7.<init>(r8)
            r8 = 100
            float r8 = (float) r8
            android.content.res.Resources r11 = dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r8 = r8 * r11
            int r8 = defpackage.a24.X(r8)
            r7.setMaxHeight(r8)
            x2a r8 = r23.l0()
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r9, r10)
            r7.addView(r8, r11)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r9, r10)
            r3.addView(r7, r8)
            android.view.View r7 = new android.view.View
            android.content.Context r8 = r3.getContext()
            r7.<init>(r8)
            s59 r8 = defpackage.km4.y0
            pda r11 = r8.r(r7)
            r0e r11 = r11.h()
            int r11 = r11.j
            r7.setBackgroundColor(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            android.content.res.Resources r12 = dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            double r12 = (double) r12
            r14 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r12 = r12 * r14
            int r12 = defpackage.a24.W(r12)
            r11.<init>(r9, r12)
            r3.addView(r7, r11)
            az1 r7 = new az1
            android.content.Context r11 = r3.getContext()
            r7.<init>(r11)
            int r11 = defpackage.f2a.d0
            r7.setId(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r9, r1)
            r12 = 1065353216(0x3f800000, float:1.0)
            r11.weight = r12
            r12 = 112(0x70, float:1.57E-43)
            r11.gravity = r12
            r3.addView(r7, r11)
            sgc r7 = r0.getChildRouter(r7)
            r5 = r5[r1]
            jr r5 = r0.b
            java.lang.Object r5 = r5.a(r0)
            lua r5 = (defpackage.lua) r5
            int r5 = r5.ordinal()
            r11 = 0
            java.lang.String r12 = r0.a
            if (r5 == 0) goto L_0x01d5
            u0a r13 = u0a.a
            s0a r14 = s0a.o
            v0a r15 = v0a.c
            r1 = 12
            if (r5 == r4) goto L_0x015d
            r2 = 2
            if (r5 == r2) goto L_0x01d5
            if (r5 != r6) goto L_0x0157
            boolean r2 = r7.n()
            if (r2 != 0) goto L_0x0103
            one.me.chats.picker.members.PickerMembersListWidget r2 = new one.me.chats.picker.members.PickerMembersListWidget
            r18 = 0
            r20 = 0
            java.lang.String r5 = r0.a
            r21 = 6
            r22 = 0
            r16 = r2
            r17 = r5
            r16.<init>(r17, r18, r20, r21, r22)
            vgc r5 = new vgc
            r19 = 0
            r22 = -1
            r18 = 0
            r20 = 0
            r21 = 0
            r16 = r5
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r7.R(r5)
        L_0x0103:
            one.me.sdk.uikit.common.button.OneMeButton r2 = new one.me.sdk.uikit.common.button.OneMeButton
            android.content.Context r5 = r3.getContext()
            r2.<init>(r5, r11)
            r2.setSize(r15)
            r2.setAppearance(r14)
            r2.setMode(r13)
            int r5 = defpackage.h2a.Q
            r2.setText(r5)
            uqa r5 = new uqa
            r5.<init>(r0, r4)
            defpackage.a24.Z(r2, 300, r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r9, r10)
            float r1 = (float) r1
            android.content.res.Resources r6 = dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r1 = r1 * r6
            int r1 = defpackage.a24.X(r1)
            r5.setMargins(r1, r1, r1, r1)
            r3.addView(r2, r5)
            xra r1 = r23.o0()
            t0c r1 = r1.A0
            zqa r5 = new zqa
            r5.<init>(r2, r11)
            ck5 r2 = new ck5
            r6 = 5
            r2.<init>(r1, r5, r6)
            yb7 r1 = r23.getViewLifecycleScope()
            defpackage.ez3.N(r2, r1)
            goto L_0x026d
        L_0x0157:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x015d:
            boolean r2 = r7.n()
            if (r2 != 0) goto L_0x0180
            one.me.chats.picker.PickerChatsListWidget r2 = new one.me.chats.picker.PickerChatsListWidget
            java.lang.String r5 = "all.chat.folder"
            r2.<init>(r5, r12, r11)
            vgc r5 = new vgc
            r19 = 0
            r22 = -1
            r18 = 0
            r20 = 0
            r21 = 0
            r16 = r5
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r7.R(r5)
        L_0x0180:
            one.me.sdk.uikit.common.button.OneMeButton r2 = new one.me.sdk.uikit.common.button.OneMeButton
            android.content.Context r5 = r3.getContext()
            r2.<init>(r5, r11)
            r2.setSize(r15)
            r2.setAppearance(r14)
            r2.setMode(r13)
            int r5 = defpackage.h2a.Q
            r2.setText(r5)
            uqa r5 = new uqa
            r6 = 0
            r5.<init>(r0, r6)
            defpackage.a24.Z(r2, 300, r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r9, r10)
            float r1 = (float) r1
            android.content.res.Resources r6 = dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r1 = r1 * r6
            int r1 = defpackage.a24.X(r1)
            r5.setMargins(r1, r1, r1, r1)
            r3.addView(r2, r5)
            xra r1 = r23.o0()
            t0c r1 = r1.A0
            wqa r5 = new wqa
            r5.<init>(r2, r11)
            ck5 r2 = new ck5
            r6 = 5
            r2.<init>(r1, r5, r6)
            yb7 r1 = r23.getViewLifecycleScope()
            defpackage.ez3.N(r2, r1)
            goto L_0x026d
        L_0x01d5:
            boolean r1 = r7.n()
            if (r1 != 0) goto L_0x01f2
            one.me.chats.picker.PickerChatsTabWidget r14 = new one.me.chats.picker.PickerChatsTabWidget
            r14.<init>(r12, r11)
            vgc r1 = new vgc
            r16 = 0
            r19 = -1
            r15 = 0
            r17 = 0
            r18 = 0
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7.R(r1)
        L_0x01f2:
            flb r1 = new flb
            android.content.Context r2 = r3.getContext()
            r1.<init>(r2)
            int r2 = defpackage.f2a.i0
            r1.setId(r2)
            pda r2 = r8.r(r1)
            jo2 r2 = r2.a()
            avf r2 = r2.d()
            zuf r2 = r2.a
            int r2 = r2.a
            r1.setBackgroundColor(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r5 = 52
            float r5 = (float) r5
            android.content.res.Resources r6 = dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = defpackage.a24.X(r5)
            r2.<init>(r9, r5)
            r3.addView(r1, r2)
            nl0 r2 = r0.y0
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r9, r10)
            r3.addView(r2, r5)
            xra r2 = r23.o0()
            t0c r2 = r2.C0
            xqa r5 = new xqa
            r5.<init>(r1, r11)
            ck5 r1 = new ck5
            r6 = 5
            r1.<init>(r2, r5, r6)
            yb7 r2 = r23.getViewLifecycleScope()
            defpackage.ez3.N(r1, r2)
            xra r1 = r23.o0()
            t0c r1 = r1.A0
            yqa r2 = new yqa
            r2.<init>(r0, r3, r11)
            ck5 r5 = new ck5
            r6 = 5
            r5.<init>(r1, r2, r6)
            yb7 r1 = r23.getViewLifecycleScope()
            defpackage.ez3.N(r5, r1)
        L_0x026d:
            boolean r1 = r23.m0()
            if (r1 == 0) goto L_0x02c7
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.content.Context r2 = r23.getContext()
            r1.<init>(r2)
            r1.addView(r3)
            sy6 r2 = G0
            ek8.g(r3, r2, r11)
            az1 r2 = new az1
            android.content.Context r3 = r1.getContext()
            r2.<init>(r3)
            int r3 = defpackage.f2a.g0
            r2.setId(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r9, r10)
            r5 = 80
            r3.gravity = r5
            r2.setLayoutParams(r3)
            int r3 = e87.a
            android.content.Context r3 = r2.getContext()
            int r3 = e87.a(r3)
            float r3 = (float) r3
            r2.setTranslationY(r3)
            sy6 r3 = new sy6
            up0 r5 = new up0
            r6 = 5
            r7 = 0
            r5.<init>(r6, r4, r7)
            r3.<init>(r7, r5, r4)
            ek8.g(r2, r3, r11)
            r0.B0 = r2
            sgc r3 = r0.getChildRouter(r2)
            r0.C0 = r3
            r1.addView(r2)
            r3 = r1
        L_0x02c7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.picker.PickerChatController.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView(View view) {
        this.B0 = null;
        this.C0 = null;
        z68 z68 = this.E0;
        if (z68 != null) {
            z68.a();
        }
        this.E0 = null;
    }

    public final void onViewCreated(View view) {
        PickerChatController.super.onViewCreated(view);
        ez3.N(new v11(iw4.a, o0().y0, new od1((Object) view, (Object) this, (Continuation) null, 5)), getViewLifecycleScope());
        if (m0()) {
            sgc sgc = this.C0;
            az1 az1 = this.B0;
            if (sgc != null && az1 != null) {
                View n0 = n0();
                tqa tqa = new tqa(this, 4);
                boolean z = js.u(getContext()).b && Build.VERSION.SDK_INT >= 30;
                yb7 viewLifecycleScope = getViewLifecycleScope();
                kt8 kt8 = (kt8) ((t0c) o0().F0.c).a.getValue();
                this.E0 = new z68(sgc, az1, n0, tqa, z, viewLifecycleScope, (kt8 != null ? kt8.a : 0) == 2, new tqa(this, 5));
                new t68((u68) this.A0.getValue(), (jq8) this.y0.getValue()).a(getViewLifecycleScope());
                ez3.N(new ck5(new ik5((t0c) o0().F0.c, 2), new hp0(2, this, PickerChatController.class, "onToggleEmoji", "onToggleEmoji(Lone/me/sdk/messagewrite/MessageWriteEvent$ToggleEmoji;)V", 4, 24), 5), getViewLifecycleScope());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PickerChatController(lua lua, Bundle bundle) {
        this(bundle);
        bundle.putSerializable("picker_chat_controller_purpose", lua);
    }
}
