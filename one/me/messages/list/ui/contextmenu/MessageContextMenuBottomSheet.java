package one.me.messages.list.ui.contextmenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.onechat.reactions.ReactionsViewModel;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lone/me/messages/list/ui/contextmenu/MessageContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lnq3;", "Lqzb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "lo8", "message-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MessageContextMenuBottomSheet extends BottomSheetWidget implements nq3, qzb {
    public static final /* synthetic */ k77[] d1;
    public final sy6 C0;
    public final sy6 D0;
    public final sy6 E0;
    public final jr F0;
    public final jr G0;
    public final jr H0;
    public final jr I0;
    public final jr J0;
    public final jr K0;
    public final jr L0;
    public final jr M0;
    public final jr N0;
    public final jr O0;
    public final ColorDrawable P0;
    public final n0c Q0;
    public ViewGroup R0;
    public RecyclerView S0;
    public rzb T0;
    public final t97 U0;
    public final t97 V0;
    public final t97 W0;
    public final t97 X0;
    public final smc Y0;
    public s16 Z0;
    public final ur5 a1;
    public final tp0 b1;
    public final int c1;

    static {
        Class<MessageContextMenuBottomSheet> cls = MessageContextMenuBottomSheet.class;
        d1 = new k77[]{new khb(cls, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), m4b.g(m7c.a, cls, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new khb(cls, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new khb(cls, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new khb(cls, "parentId", "getParentId()Ljava/lang/Integer;", 0), new khb(cls, "showReactionsSelector", "getShowReactionsSelector()Z", 0), new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new khb(cls, "messageId", "getMessageId()J", 0), new khb(cls, "messageServerId", "getMessageServerId()J", 0), new hc9(cls, "isCallbackSent", "isCallbackSent()Z"), new khb(cls, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0)};
    }

    public MessageContextMenuBottomSheet() {
        this((Bundle) null, 1, (x54) null);
    }

    public final ViewGroup A0() {
        return (ViewGroup) this.Q0.T0(this, d1[10]);
    }

    public final MessageModel B0() {
        k77 k77 = d1[7];
        return ((tw8) ((zz8) this.V0.getValue()).t1.a.getValue()).e(((Number) this.M0.a(this)).longValue());
    }

    public final boolean C0() {
        return ((Boolean) this.X0.getValue()).booleanValue();
    }

    public final cl8 D0() {
        return (cl8) this.W0.getValue();
    }

    public final void dismiss() {
        r0(true);
    }

    public final FrameLayout l0(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(h9a.b);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClipToPadding(false);
        a24.a0(frameLayout, new eu5(15, this));
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(a7a.I);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = (float) 10;
        layoutParams.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        frameLayout2.setLayoutParams(layoutParams);
        ReactionsViewModel q = ((k0c) this.U0.getValue()).q();
        MessageModel B0 = B0();
        lg7 j = q.j(B0 != null ? B0.E0 : null, true);
        k77 k77 = d1[5];
        if (((Boolean) this.K0.a(this)).booleanValue() && (!j.isEmpty())) {
            rzb rzb = new rzb(frameLayout2.getContext(), ((x4a) xv8.a.getAccessor().c(x4a.class)).a());
            rzb.a(j, 0);
            rzb.b = this;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            float f2 = (float) 6;
            layoutParams2.leftMargin = a24.X(dh4.c().getDisplayMetrics().density * f2);
            layoutParams2.rightMargin = a24.X(f2 * dh4.c().getDisplayMetrics().density);
            MessageModel B02 = B0();
            layoutParams2.gravity = (B02 == null || !B02.G0) ? 21 : 19;
            frameLayout2.addView(rzb.d, layoutParams2);
            frameLayout2.setVisibility(0);
            this.T0 = rzb;
        }
        frameLayout.addView(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(a7a.E);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = this.c1;
        frameLayout3.setLayoutParams(layoutParams3);
        frameLayout3.setClipToPadding(false);
        frameLayout3.setOutlineProvider(this.b1);
        v0(frameLayout3, layoutInflater, bundle);
        if (C0()) {
            frameLayout3.setPadding(0, a24.X(f * dh4.c().getDisplayMetrics().density), 0, 0);
        } else {
            ek8.g(frameLayout3, this.D0, (u16) null);
        }
        urd.B(new c3(this, (Continuation) null, 18), frameLayout3);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    public final t0b m0() {
        return new x9(this, 3);
    }

    public final sy6 n0() {
        return this.E0;
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        hq0 hq0 = new hq0((rr3) this, (s16) new jo8(this, 0));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 8));
        }
    }

    public final void onDestroyView(View view) {
        this.S0 = null;
        this.R0 = null;
        this.T0 = null;
        this.Z0 = null;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        k77[] k77Arr = d1;
        k77 k77 = k77Arr[0];
        Integer num = (Integer) this.F0.a(this);
        if (num != null) {
            int intValue = num.intValue();
            k77 k772 = k77Arr[1];
            Class cls = (Class) this.G0.a(this);
            if (cls != null) {
                k96 k96 = new k96(cls, intValue);
                this.Z0 = k96.f(this);
                ((ArrayList) k96.c).add(new hpc(new j1c(k96, o0()), new Rect(), new Rect(), new Rect(), a24.X(((float) 12) * dh4.c().getDisplayMetrics().density)));
                k96 k962 = new k96(cls, intValue);
                k962.f(this);
                bg6 bg6 = new bg6(k962);
                k77 k773 = k77Arr[2];
                k77 k774 = k77Arr[3];
                k77 k775 = k77Arr[4];
                bg6.a(view, (Rect) this.H0.a(this), (Float) this.I0.a(this), (Integer) this.J0.a(this));
                if (C0()) {
                    cl8 D02 = D0();
                    t97 t97 = this.U0;
                    qod E = xs7.E(D02.a, D02.Z.a(), (ru3) null, new vk8(D02, ((k0c) t97.getValue()).q().h(), (Continuation) null), 2);
                    D02.F0.o1(D02, cl8.O0[0], E);
                    cl8 D03 = D0();
                    ez3.N(new ck5(new s0c(D03.E0.d), new bl8(D03, ((k0c) t97.getValue()).q().h(), (Continuation) null), 5), D03.a);
                    t0c t0c = D0().K0;
                    ob7 ob7 = ob7.o;
                    ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new mo8((Continuation) null, this), 5), getViewLifecycleScope());
                    ez3.N(new ck5(wx3.e(D0().L0, getViewLifecycleOwner().R(), ob7), new no8((Continuation) null, this), 5), getViewLifecycleScope());
                }
            }
        }
    }

    public final void q(Widget widget) {
        setTargetController(widget);
        Widget widget2 = widget;
        while (widget2.getParentController() != null) {
            widget2 = widget2.getParentController();
        }
        sgc sgc = null;
        ygc ygc = widget2 instanceof ygc ? (ygc) widget2 : null;
        if (ygc != null) {
            sgc = ygc.S();
        }
        y0(widget);
        if (sgc != null) {
            vgc vgc = new vgc(this, (String) null, (wr3) null, (wr3) null, false, -1);
            rf0.k(false, vgc, true, "BottomSheetWidget");
            sgc.G(vgc);
        }
    }

    public final void t0() {
        s16 s16 = this.Z0;
        if (s16 != null) {
            s16.invoke();
        }
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ViewGroup viewGroup;
        List list = null;
        if (C0()) {
            viewGroup = new FrameLayout(getContext());
            nea nea = new nea(viewGroup.getContext(), 6);
            nea.setId(h9a.c);
            nea.setForm(fea.a);
            nea.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            nea.setAlpha(0.0f);
            nea.setTitle(c7a.K);
            nea.setLeftActions(new wda(new io8(this, 0)));
            ek8.g(nea, this.C0, (u16) null);
            viewGroup.addView(nea);
            RecyclerView recyclerView = new RecyclerView(layoutInflater.getContext(), (AttributeSet) null);
            recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            recyclerView.setClipToPadding(false);
            ur5 ur5 = this.a1;
            recyclerView.setAdapter(ur5);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setItemAnimator((k6c) null);
            int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
            recyclerView.setPadding(X, recyclerView.getPaddingTop(), X, recyclerView.getPaddingBottom());
            ryd ryd = new ryd(recyclerView, ur5, new hj2(5, new ka(this, 21, recyclerView)));
            recyclerView.j(ryd);
            recyclerView.j(new oi8(0, km4.y0.r(recyclerView)));
            ek8.g(recyclerView, this.D0, (u16) null);
            urd.B(new rb(ryd, (Continuation) null, 1), recyclerView);
            viewGroup.addView(recyclerView);
            this.S0 = recyclerView;
        } else {
            Context context = layoutInflater.getContext();
            Bundle bundle = getArgs().getBundle("actions");
            if (bundle != null) {
                list = kjd.f(bundle);
            }
            if (list == null) {
                list = hw4.a;
            }
            io8 io8 = new io8(this, 1);
            this.Y0.getClass();
            viewGroup = smc.h(context, list, io8);
        }
        this.R0 = viewGroup;
        return viewGroup;
    }

    public final boolean x0() {
        return false;
    }

    public final void z0(int i) {
        k77[] k77Arr = d1;
        k77 k77 = k77Arr[9];
        jr jrVar = this.O0;
        if (!((Boolean) jrVar.a(this)).booleanValue()) {
            k77 k772 = k77Arr[9];
            jrVar.b(this, Boolean.TRUE);
            tq3 targetController = getTargetController();
            tq3 tq3 = targetController instanceof tq3 ? targetController : null;
            if (tq3 != null) {
                tq3.y(i, (Bundle) null);
            }
        }
        r0(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageContextMenuBottomSheet(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }

    public MessageContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = new sy6(4, (up0) null, 2);
        this.D0 = new sy6(0, new up0(3, 3, false), 1);
        this.E0 = sy6.c;
        Class<Integer> cls = Integer.class;
        this.F0 = new jr(cls, "anchor_id");
        this.G0 = new jr(Class.class, "anchor_class");
        this.H0 = new jr(Rect.class, "highlight_padding");
        this.I0 = new jr(Float.class, "highlight_radius");
        this.J0 = new jr(cls, "parent_id");
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls2 = Boolean.class;
        jr jrVar = new jr(cls2, bool, "show_reactions_selector");
        this.K0 = jrVar;
        Class<Long> cls3 = Long.class;
        this.L0 = new jr(cls3, 0L, "chat_id");
        this.M0 = new jr(cls3, 0L, "message_id");
        this.N0 = new jr(cls3, 0L, "message_server_id");
        this.O0 = new jr(cls2, bool, "callback_sent");
        this.P0 = new ColorDrawable();
        this.Q0 = viewBinding(a7a.E);
        Class<inc> cls4 = inc.class;
        inc inc = (inc) ((Parcelable) ek8.E(getArgs(), Widget.ARG_SCOPE_ID, cls4));
        String str = inc != null ? inc.a : null;
        this.U0 = m25getSharedViewModelcp94BC8(str == null ? m24getScopeIdIluPPks() : str, k0c.class, (s16) null);
        inc inc2 = (inc) ((Parcelable) ek8.E(getArgs(), Widget.ARG_SCOPE_ID, cls4));
        String str2 = inc2 != null ? inc2.a : null;
        this.V0 = m25getSharedViewModelcp94BC8(str2 == null ? m24getScopeIdIluPPks() : str2, zz8.class, (s16) null);
        this.W0 = createViewModelLazy(cl8.class, new js5(25, new jo8(this, 1)));
        this.X0 = ez3.O(3, new jo8(this, 2));
        smc smc = new smc(8);
        this.Y0 = smc;
        this.a1 = new ur5(((x4a) xv8.a.getAccessor().c(x4a.class)).a(), smc, new h87(1, D0(), cl8.class, "onMemberClicked", "onMemberClicked$message_list_release(J)V", 0, 4), new io8(this, 2));
        this.b1 = new tp0(1, dh4.c().getDisplayMetrics().density * 20.0f);
        k77 k77 = d1[5];
        this.c1 = ((Boolean) jrVar.a(this)).booleanValue() ? me4.c((float) 10, dh4.c().getDisplayMetrics().density, me4.c((float) 32, dh4.c().getDisplayMetrics().density, a24.X(((float) 12) * dh4.c().getDisplayMetrics().density) * 2)) : 0;
        u0(false);
    }
}
