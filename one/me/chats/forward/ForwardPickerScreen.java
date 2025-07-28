package one.me.chats.forward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.chats.picker.chats.PickerChatsTabWidget2;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB1\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/chats/forward/ForwardPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lpv5;", "Llc3;", "Ltq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messagesIds", "", "attachId", "", "isForwardAttach", "showExternalSharing", "([JLjava/lang/Long;ZZ)V", "forward-message_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ForwardPickerScreen extends AbstractPickerScreen<pv5> implements lc3, tq3 {
    public static final /* synthetic */ k77[] M0;
    public static final sy6 N0 = new sy6(4, new up0(4, 3, false));
    public final jr A0;
    public final jr B0;
    public s16 C0;
    public final AutoTransition D0;
    public final nl0 E0;
    public final n0c F0;
    public final t97 G0;
    public az1 H0;
    public sgc I0;
    public final bw5 J0;
    public z68 K0;
    public jme L0;
    public final jj7 x0;
    public final sy6 y0;
    public final j54 z0;

    static {
        Class<ForwardPickerScreen> cls = ForwardPickerScreen.class;
        M0 = new k77[]{new hc9(cls, "messagesIds", "getMessagesIds()[J"), c3d.g(m7c.a, cls, "attachId", "getAttachId()J"), new hc9(cls, "isForwardAttach", "isForwardAttach()Z"), new khb(cls, "showExternalSharing", "getShowExternalSharing()Z", 0), new hc9(cls, "isInMultiSelect", "isInMultiSelect()Z"), new khb(cls, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new khb(cls, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0)};
    }

    public ForwardPickerScreen(long[] jArr, Long l, boolean z, boolean z2) {
        this(jjd.j(new wia("messages_to_forward", jArr), new wia("attach_to_forward", l), new wia("is_forward_attach", Boolean.valueOf(z)), new wia("show_external_sharing", Boolean.valueOf(z2))));
    }

    public static final void w0(ForwardPickerScreen forwardPickerScreen, View view, hge hge, boolean z) {
        forwardPickerScreen.getClass();
        float f = (float) 6;
        Point point = new Point(a24.X(dh4.c().getDisplayMetrics().density * f), me4.p(f, dh4.c().getDisplayMetrics().density, forwardPickerScreen.requireView().getBottom() - forwardPickerScreen.y0().getTop()));
        jme jme = forwardPickerScreen.L0;
        if (jme != null) {
            jme.dismiss();
        }
        jme jme2 = new jme(forwardPickerScreen.getContext(), view, new fs5(2), (s16) null, 0, 1, 56);
        jme2.d(hge);
        jme2.e(point, 8388691, z ? 2500 : 800);
        jme2.setOnDismissListener(new b01(4, forwardPickerScreen));
        forwardPickerScreen.L0 = jme2;
    }

    public final boolean A0() {
        k77 k77 = M0[4];
        return ((Boolean) this.B0.a(this)).booleanValue();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chats.forward.ForwardPickerScreen, java.lang.Object, one.me.chats.picker.AbstractPickerScreen] */
    public final void B0(boolean z) {
        vgc vgc;
        k77 k77 = M0[4];
        this.B0.b(this, Boolean.valueOf(z));
        vgc vgc2 = (vgc) o23.X(getChildRouter((ViewGroup) this.Z.T0(this, AbstractPickerScreen.w0[3])).e());
        rr3 rr3 = vgc2 != null ? vgc2.a : null;
        Widget widget = rr3 instanceof Widget ? (Widget) rr3 : null;
        PickerChatsTabWidget2 pickerChatsTabWidget2 = widget instanceof PickerChatsTabWidget2 ? (PickerChatsTabWidget2) widget : null;
        if (pickerChatsTabWidget2 != null) {
            k77 k772 = PickerChatsTabWidget2.C0[1];
            pickerChatsTabWidget2.b.b(pickerChatsTabWidget2, Boolean.valueOf(z));
            f6c adapter = pickerChatsTabWidget2.m0().getAdapter();
            if (adapter != null) {
                int j = adapter.j();
                for (int i = 0; i < j; i++) {
                    sgc sgc = (sgc) pickerChatsTabWidget2.A0.w0.get(i);
                    rr3 rr32 = (sgc == null || (vgc = (vgc) o23.X(sgc.e())) == null) ? null : vgc.a;
                    PickerChatsListWidget2 pickerChatsListWidget2 = rr32 instanceof PickerChatsListWidget2 ? (PickerChatsListWidget2) rr32 : null;
                    if (pickerChatsListWidget2 != null) {
                        k77[] k77Arr = PickerChatsListWidget2.G0;
                        k77 k773 = k77Arr[2];
                        Boolean valueOf = Boolean.valueOf(z);
                        jr jrVar = pickerChatsListWidget2.X;
                        jrVar.b(pickerChatsListWidget2, valueOf);
                        k77 k774 = k77Arr[2];
                        boolean booleanValue = ((Boolean) jrVar.a(pickerChatsListWidget2)).booleanValue();
                        t97 t97 = pickerChatsListWidget2.F0;
                        if (booleanValue) {
                            pickerChatsListWidget2.o0().j((tw2) t97.getValue());
                        } else {
                            pickerChatsListWidget2.o0().p0((tw2) t97.getValue());
                        }
                    }
                }
            }
        }
    }

    public final sy6 getInsetsConfig() {
        return this.y0;
    }

    public final rnc getScreenDelegate() {
        return this.x0;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chats.forward.ForwardPickerScreen, one.me.chats.picker.AbstractPickerScreen] */
    public final boolean handleBack() {
        sgc sgc = this.I0;
        if (sgc != null && sgc.n()) {
            ((pv5) u0().c).r.K(1);
            return true;
        } else if (!(!((Collection) u0().Z.a.getValue()).isEmpty())) {
            return ForwardPickerScreen.super.handleBack();
        } else {
            k77[] k77Arr = BottomSheetWidget.B0;
            sgc sgc2 = null;
            jc3 c = rf0.c(rhc.l0, 6, (Bundle) null);
            c.b(qhc.q0, new hge(rhc.k0));
            c.c(qhc.p0, new hge(rhc.j0));
            ConfirmationBottomSheet e = c.e();
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

    public final void i(int i, Bundle bundle) {
        if (i == qhc.q0) {
            kv5.c.P1().d();
        }
    }

    public final Iterable l0() {
        View flb = new flb(getContext());
        flb.setId(c2a.c);
        urd.B(new z9(3, (Continuation) null, 15), flb);
        flb.setLayoutParams(new LinearLayout.LayoutParams(-1, a24.X(((float) 52) * dh4.c().getDisplayMetrics().density)));
        ez3.N(new ck5(((pv5) u0().c).n, new yv5(flb, this, (Continuation) null), 5), getViewLifecycleScope());
        return p23.B(flb, x0());
    }

    public final lta m0() {
        dv5 dv5 = dv5.a;
        return new b0d(this.z0, new sp2(dv5.getAccessor().d(bv2.class)), dv5.getAccessor().d(ap3.class), dv5.getAccessor().d(f03.class), 11);
    }

    public final Widget n0(String str) {
        return new PickerChatsTabWidget2(str, A0(), new vv5(this, 0), q72.b, (x54) null);
    }

    public final nea o0(Context context) {
        nea nea = new nea(context, 6);
        nea.setId(c2a.d);
        nea.setTransitionName(context.getString(h2a.q));
        nea.setTitle(h2a.X);
        float f = (float) 4;
        nea.setActionsHorizontalPadding(new wia(Integer.valueOf(a24.X(dh4.c().getDisplayMetrics().density * f)), Integer.valueOf(a24.X(f * dh4.c().getDisplayMetrics().density))));
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new vv5(this, 1)));
        nea.setRightActions(new aea(new iea(new zv5(this, 0)), new gea(phc.t0, new vv5(this, 2))));
        return nea;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.chats.forward.ForwardPickerScreen] */
    public final void onDestroyView(View view) {
        ForwardPickerScreen.super.onDestroyView(view);
        this.H0 = null;
        this.I0 = null;
        z68 z68 = this.K0;
        if (z68 != null) {
            z68.a();
        }
        this.K0 = null;
        jme jme = this.L0;
        if (jme != null) {
            jme.dismiss();
        }
        this.L0 = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.chats.forward.ForwardPickerScreen, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v1, types: [android.widget.FrameLayout, android.view.View, az1, android.view.ViewGroup] */
    public final void onViewCreated(View view) {
        View view2 = view;
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view2;
        ek8.g(s0(), N0, (u16) null);
        ? frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(c2a.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        int i = e87.a;
        frameLayout.setTranslationY((float) e87.a(frameLayout.getContext()));
        ek8.g(frameLayout, new sy6(0, new up0(5, 1, false), 1), (u16) null);
        this.H0 = frameLayout;
        this.I0 = getChildRouter(frameLayout);
        viewGroup.addView(frameLayout);
        ez3.N(new ck5(u0().Z, new gw5(this, view2, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new bc(((pv5) u0().c).t, 23, this), getViewLifecycleOwner().R(), ob7.o), new ew5((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(((pv5) u0().c).q, new hw5((Continuation) null, this), 5), getViewLifecycleScope());
        ViewGroup s0 = s0();
        sgc sgc = this.I0;
        az1 az1 = this.H0;
        if (sgc != null && az1 != null) {
            wv5 wv5 = new wv5(this, 0);
            boolean z = ((sma) dv5.a.getAccessor().c(sma.class)).b && Build.VERSION.SDK_INT >= 30;
            yb7 viewLifecycleScope = getViewLifecycleScope();
            kt8 kt8 = (kt8) ((t0c) ((pv5) u0().c).r.c).a.getValue();
            this.K0 = new z68(sgc, az1, s0, wv5, z, viewLifecycleScope, (kt8 != null ? kt8.a : 0) == 2, new zu4(this, 10, s0));
            new t68((u68) this.G0.getValue(), x0()).a(getViewLifecycleScope());
            ez3.N(new ck5(new ik5((t0c) ((pv5) u0().c).r.c, 2), new aw5(this, s0, (Continuation) null), 5), getViewLifecycleScope());
        }
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [rr3, one.me.chats.forward.ForwardPickerScreen] */
    public final mua p0() {
        Set set = null;
        Long valueOf = getArgs().getLong("attach_to_forward") == 0 ? null : Long.valueOf(getArgs().getLong("attach_to_forward"));
        long[] longArray = getArgs().getLongArray("messages_to_forward");
        if (longArray != null) {
            set = cs.h0(longArray);
        }
        qw4 qw4 = set == null ? qw4.a : set;
        dv5 dv5 = dv5.a;
        return new pv5(qw4, (lw5) dv5.getAccessor().c(lw5.class), this.z0, valueOf, z0(), (Context) dv5.getAccessor().c(Context.class), dv5.getAccessor().d(pae.class), dv5.getAccessor().d(et0.class), dv5.getAccessor().d(zu5.class), dv5.getAccessor().d(iv5.class), dv5.getAccessor().d(hba.class), dv5.getAccessor().d(f03.class));
    }

    public final x2a q0() {
        return null;
    }

    public final zqd r0() {
        return null;
    }

    public final Set v0(Bundle bundle) {
        return qw4.a;
    }

    public final jq8 x0() {
        k77 k77 = M0[5];
        return (jq8) this.E0.getValue();
    }

    public final void y(int i, Bundle bundle) {
        pv5 pv5 = (pv5) u0().c;
        pv5.getClass();
        int i2 = c2a.f;
        hcd hcd = pv5.p;
        if (i == i2) {
            hcd.g(new sv5());
        } else if (i == c2a.e) {
            hcd.g(rv5.a);
        }
    }

    public final flb y0() {
        return (flb) this.F0.T0(this, M0[6]);
    }

    public final boolean z0() {
        k77 k77 = M0[2];
        return ((Boolean) this.A0.a(this)).booleanValue();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chats.forward.ForwardPickerScreen, java.lang.Object] */
    public ForwardPickerScreen(Bundle bundle) {
        super(bundle);
        this.x0 = new jj7((s16) new fs5(3), (s16) null, 6);
        this.y0 = sy6.c;
        dv5 dv5 = dv5.a;
        this.z0 = new j54((t97) dv5.getAccessor().d(f03.class), (t97) dv5.getAccessor().d(pae.class), (t97) dv5.getAccessor().d(bv2.class), 8);
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls = Boolean.class;
        this.A0 = new jr(cls, bool, "is_forward_attach");
        this.B0 = new jr(cls, bool, "is_in_multiselect");
        this.C0 = new fs5(4);
        AutoTransition autoTransition = new AutoTransition();
        int i = c2a.c;
        autoTransition.addTarget(i);
        autoTransition.addTarget(f2a.f0);
        autoTransition.addTarget(c2a.a);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100);
        autoTransition.addListener(new f6(1, this));
        this.D0 = autoTransition;
        this.E0 = binding(new wv5(this, 1));
        this.F0 = viewBinding(i);
        this.G0 = createViewModelLazy(u68.class, new js5(2, new fs5(5)));
        this.J0 = new bw5(this, 0);
        dv5.getAccessor().d(xzc.class);
        hq0 hq0 = new hq0(this, new wv5(this, 2));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 6));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ForwardPickerScreen(long[] jArr, Long l, boolean z, boolean z2, int i, x54 x54) {
        this(jArr, (i & 2) != 0 ? null : l, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
