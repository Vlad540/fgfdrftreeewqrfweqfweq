package one.me.calls.ui.ui.call;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lone/me/calls/ui/ui/call/CallScreen;", "Lone/me/sdk/arch/Widget;", "Ltq3;", "Ldk9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "smc", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallScreen extends Widget implements tq3, dk9 {
    public static final smc T0 = new smc(7);
    public static final /* synthetic */ k77[] U0;
    public final n0c A0 = childSlotRouter(uob.call_events_view);
    public final dwa B0 = new dwa();
    public final t97 C0 = ez3.O(3, new hg1(this, 4));
    public final nl0 D0 = binding(new hg1(this, 5));
    public final nl0 E0 = binding(new hg1(this, 7));
    public final t97 F0 = ez3.O(3, new hg1(this, 8));
    public final t97 G0 = ez3.O(3, new hg1(this, 6));
    public final t97 H0 = ez3.O(3, new hg1(this, 11));
    public final t97 I0 = ez3.O(3, new hg1(this, 12));
    public final t97 J0 = ez3.O(3, new hg1(this, 13));
    public final nl0 K0 = binding(new hg1(this, 14));
    public final nl0 L0 = binding(new hg1(this, 15));
    public final nl0 M0 = binding(new hg1(this, 16));
    public final nl0 N0 = binding(new hg1(this, 17));
    public final nl0 O0 = binding(new hg1(this, 18));
    public final t97 P0 = ez3.O(3, new hg1(this, 0));
    public tb1 Q0;
    public final t97 R0 = ez3.O(3, new a01(25));
    public final jj7 S0 = new jj7((s16) new a01(26), (s16) null, 6);
    public final r7e X = new r7e(new a01(27));
    public final r7e Y = new r7e(new a01(28));
    public final t97 Z = createViewModelLazy(aj1.class, new s(18, new hg1(this, 3)));
    public final t97 a = bh1.a.getAccessor().d(iq1.class);
    public final r7e b = new r7e(new a01(24));
    public final r7e c = new r7e(new hg1(this, 1));
    public final r7e o = new r7e(new hg1(this, 2));
    public final String w0 = "CALL_SCREEN_SCOPE_ID";
    public boolean x0;
    public final n0c y0 = childSlotRouter(o1a.s1);
    public final n0c z0 = childSlotRouter(o1a.o);

    static {
        Class<CallScreen> cls = CallScreen.class;
        khb khb = new khb(cls, "callTopPanelRouter", "getCallTopPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0);
        n7c n7c = m7c.a;
        U0 = new k77[]{khb, wn6.e(n7c, cls, "callBottomPanelRouter", "getCallBottomPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), wn6.f(cls, "callEventsRouter", "getCallEventsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, n7c), wn6.f(cls, "stubCallBottomUnavailablePanel", "getStubCallBottomUnavailablePanel()Landroid/view/ViewStub;", 0, n7c), wn6.f(cls, "callBottomUnavailablePanel", "getCallBottomUnavailablePanel()Lone/me/calls/ui/view/controls/CallBottomUnavailableView;", 0, n7c), wn6.f(cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, n7c), wn6.f(cls, "stubCallSpeakerLabel", "getStubCallSpeakerLabel()Landroid/view/ViewStub;", 0, n7c), wn6.f(cls, "callSpeakerLabel", "getCallSpeakerLabel()Lone/me/calls/ui/view/CallSpeakerLabel;", 0, n7c), wn6.f(cls, "stubCallChangeModeHint", "getStubCallChangeModeHint()Landroid/view/ViewStub;", 0, n7c), wn6.f(cls, "callChangeModeHint", "getCallChangeModeHint()Lone/me/calls/ui/view/CallChangeModeHintView;", 0, n7c)};
    }

    public CallScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
    }

    public static final boolean l0(CallScreen callScreen, int i, String str) {
        tb1 tb1 = callScreen.Q0;
        if (tb1 == null || !tb1.g || callScreen.A0().getCurrentItem() == i || callScreen.A0().getChildCount() == 0) {
            int currentItem = callScreen.A0().getCurrentItem();
            boolean z = callScreen.A0().J0;
            udd.p("CallModeScrollTag", "skip changeViewPagerPosition from=" + str + " currentPos=" + currentItem + " newPos=" + i + " isUserInputEnabled=" + z, new Object[0]);
            return false;
        }
        callScreen.A0().setUserInputEnabled(false);
        callScreen.A0().e(i, false);
        udd.p("CallModeScrollTag", "changeViewPagerPosition from=" + str + " newPos=" + i, new Object[0]);
        return true;
    }

    public static final ik1 m0(CallScreen callScreen) {
        View childAt = callScreen.A0().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return null;
        }
        b7c M = recyclerView.M(callScreen.A0().getCurrentItem());
        KeyEvent.Callback callback = M != null ? M.a : null;
        if (callback instanceof ik1) {
            return (ik1) callback;
        }
        return null;
    }

    public static void o0(CallScreen callScreen) {
        callScreen.n0(!callScreen.u0().g);
    }

    public final ViewPager2 A0() {
        k77 k77 = U0[5];
        return (ViewPager2) this.K0.getValue();
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m45getScopeIdIluPPks() {
        return this.w0;
    }

    public final rnc getScreenDelegate() {
        return this.S0;
    }

    public final void n0(boolean z) {
        u0().a(z);
    }

    public final void onActivityPaused(Activity activity) {
        CallScreen.super.onActivityPaused(activity);
        z0().c.j.b();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.sdk.arch.Widget, one.me.calls.ui.ui.call.CallScreen] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        CallScreen.super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            z0().w(true, intent);
            im requireActivity = requireActivity();
            ((dj1) this.b.getValue()).getClass();
            Intent intent2 = new Intent(requireActivity, CallServiceImpl.class);
            cj1 cj1 = cj1.a;
            dj1.b(requireActivity, intent2.putExtra("ACTION", 5));
        }
    }

    public final void onActivityResumed(Activity activity) {
        CallScreen.super.onActivityResumed(activity);
        z0().c.j.a();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rr3, one.me.calls.ui.ui.call.CallScreen] */
    public final void onChangeEnded(wr3 wr3, xr3 xr3) {
        CallScreen.super.onChangeEnded(wr3, xr3);
        boolean z = false;
        this.x0 = false;
        if (xr3.b) {
            aj1 z02 = z0();
            rs3 u0 = u0();
            if (u0.g && u0.b == null) {
                z = true;
            }
            z02.t(z);
        }
        if (xr3 == xr3.POP_EXIT) {
            v0().getClass();
            oed.a();
        }
    }

    public final void onChangeStarted(wr3 wr3, xr3 xr3) {
        CallScreen.super.onChangeStarted(wr3, xr3);
        this.x0 = true;
        z0().t(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: n21} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: p21} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: p21} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: p21} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: p21} */
    /* JADX WARNING: type inference failed for: r6v11, types: [o21] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13, types: [q21] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
            r19 = this;
            aj1 r0 = r19.z0()
            u81 r0 = r0.s()
            b65 r0 = r0.e
            boolean r0 = r0 instanceof defpackage.w55
            n21 r1 = defpackage.n21.a
            if (r0 != 0) goto L_0x0012
            goto L_0x026d
        L_0x0012:
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r2 = "type"
            java.lang.String r0 = r0.getString(r2)
            pz4 r3 = defpackage.lg1.b
            java.util.Iterator r3 = r3.iterator()
        L_0x0022:
            r4 = r3
            u1 r4 = (defpackage.u1) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003d
            java.lang.Object r4 = r4.next()
            r5 = r4
            lg1 r5 = (defpackage.lg1) r5
            java.lang.String r5 = r5.name()
            boolean r5 = defpackage.hhd.f(r5, r0)
            if (r5 == 0) goto L_0x0022
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            lg1 r4 = (defpackage.lg1) r4
            if (r4 == 0) goto L_0x028b
            int r0 = r4.ordinal()
            r3 = 1
            java.lang.String r4 = "microphone_enabled"
            java.lang.String r5 = "video_enabled"
            if (r0 == 0) goto L_0x00a0
            r6 = -1
            if (r0 == r3) goto L_0x0080
            r8 = 2
            if (r0 == r8) goto L_0x005f
            r4 = 3
            if (r0 != r4) goto L_0x0059
            goto L_0x00d6
        L_0x0059:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x005f:
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r1 = "opponent_id"
            long r0 = r0.getLong(r1, r6)
            q21 r6 = new q21
            android.os.Bundle r7 = r19.getArgs()
            boolean r5 = r7.getBoolean(r5)
            android.os.Bundle r7 = r19.getArgs()
            boolean r4 = r7.getBoolean(r4)
            r6.<init>(r0, r5, r4)
        L_0x007e:
            r1 = r6
            goto L_0x00d6
        L_0x0080:
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r1 = "chat_id"
            long r0 = r0.getLong(r1, r6)
            o21 r6 = new o21
            android.os.Bundle r7 = r19.getArgs()
            boolean r5 = r7.getBoolean(r5)
            android.os.Bundle r7 = r19.getArgs()
            boolean r4 = r7.getBoolean(r4)
            r6.<init>(r0, r5, r4)
            goto L_0x007e
        L_0x00a0:
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r1 = "link"
            java.lang.String r7 = r0.getString(r1)
            if (r7 == 0) goto L_0x027f
            p21 r1 = new p21
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r6 = "is_new"
            boolean r8 = r0.getBoolean(r6)
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r6 = "front_camera_enabled"
            boolean r9 = r0.getBoolean(r6)
            android.os.Bundle r0 = r19.getArgs()
            boolean r10 = r0.getBoolean(r5)
            android.os.Bundle r0 = r19.getArgs()
            boolean r11 = r0.getBoolean(r4)
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x00d6:
            android.os.Bundle r0 = r19.getArgs()
            java.lang.String r4 = "ACTIVE"
            r0.putString(r2, r4)
            aj1 r0 = r19.z0()
            r0.getClass()
            boolean r2 = r1.b()
            fna r4 = r0.b
            qna r5 = r4.a()
            java.lang.String[] r6 = qna.h
            boolean r5 = r5.b(r6)
            hy7 r6 = defpackage.hy7.a
            hy7 r7 = defpackage.hy7.X
            hy7 r8 = defpackage.hy7.b
            if (r5 != 0) goto L_0x0100
            r2 = r7
            goto L_0x0105
        L_0x0100:
            if (r2 == 0) goto L_0x0104
            r2 = r8
            goto L_0x0105
        L_0x0104:
            r2 = r6
        L_0x0105:
            boolean r5 = r1.a()
            qna r4 = r4.a()
            java.lang.String[] r9 = qna.l
            boolean r4 = r4.b(r9)
            if (r4 != 0) goto L_0x0117
            r6 = r7
            goto L_0x011a
        L_0x0117:
            if (r5 == 0) goto L_0x011a
            r6 = r8
        L_0x011a:
            boolean r4 = r1 instanceof defpackage.q21
            grd r5 = r0.B0
            po1 r7 = r0.c
            r18 = 0
            if (r4 == 0) goto L_0x017d
            vk1 r4 = new vk1
            q21 r1 = (defpackage.q21) r1
            if (r6 != r8) goto L_0x012c
            r9 = r3
            goto L_0x012e
        L_0x012c:
            r9 = r18
        L_0x012e:
            long r10 = r1.a
            r4.<init>(r10, r9)
            raf r1 = defpackage.raf.a
            r7.a(r1)
        L_0x0138:
            java.lang.Object r1 = r5.getValue()
            r9 = r1
            u81 r9 = (defpackage.u81) r9
            if (r6 != r8) goto L_0x0144
            r16 = r3
            goto L_0x0146
        L_0x0144:
            r16 = r18
        L_0x0146:
            r13 = 0
            r17 = 327615(0x4ffbf, float:4.59086E-40)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = r6
            r15 = r2
            u81 r9 = defpackage.u81.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r5.b(r1, r9)
            if (r1 == 0) goto L_0x0138
            if (r6 != r8) goto L_0x015d
            r1 = r3
            goto L_0x015f
        L_0x015d:
            r1 = r18
        L_0x015f:
            if (r2 != r8) goto L_0x0162
            goto L_0x0164
        L_0x0162:
            r3 = r18
        L_0x0164:
            ei1 r5 = new ei1
            r8 = 0
            r5.<init>(r0, r2, r6, r8)
            gpd r0 = new gpd
            dpd r2 = new dpd
            r2.<init>(r4)
            r0.<init>(r2, r1, r3, r5)
            so1 r1 = r7.a
            ep1 r1 = (defpackage.ep1) r1
            r1.A(r0)
            goto L_0x026d
        L_0x017d:
            boolean r4 = r1 instanceof defpackage.o21
            raf r9 = defpackage.raf.c
            if (r4 == 0) goto L_0x01d5
            tk1 r4 = new tk1
            o21 r1 = (defpackage.o21) r1
            if (r6 != r8) goto L_0x018b
            r10 = r3
            goto L_0x018d
        L_0x018b:
            r10 = r18
        L_0x018d:
            long r11 = r1.a
            r4.<init>(r11, r10)
            r7.a(r9)
        L_0x0195:
            java.lang.Object r1 = r5.getValue()
            r9 = r1
            u81 r9 = (defpackage.u81) r9
            r13 = 1
            r17 = 851903(0xcffbf, float:1.19377E-39)
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r14 = r6
            r15 = r2
            u81 r9 = defpackage.u81.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r5.b(r1, r9)
            if (r1 == 0) goto L_0x0195
            if (r6 != r8) goto L_0x01b5
            r1 = r3
            goto L_0x01b7
        L_0x01b5:
            r1 = r18
        L_0x01b7:
            if (r2 != r8) goto L_0x01ba
            goto L_0x01bc
        L_0x01ba:
            r3 = r18
        L_0x01bc:
            ei1 r5 = new ei1
            r8 = 1
            r5.<init>(r0, r2, r6, r8)
            gpd r0 = new gpd
            bpd r2 = new bpd
            r2.<init>(r4)
            r0.<init>(r2, r1, r3, r5)
            so1 r1 = r7.a
            ep1 r1 = (defpackage.ep1) r1
            r1.A(r0)
            goto L_0x026d
        L_0x01d5:
            boolean r4 = r1 instanceof defpackage.p21
            if (r4 == 0) goto L_0x0233
            r4 = r1
            p21 r4 = (defpackage.p21) r4
            r7.a(r9)
        L_0x01df:
            java.lang.Object r1 = r5.getValue()
            r9 = r1
            u81 r9 = (defpackage.u81) r9
            r13 = 1
            r17 = 851903(0xcffbf, float:1.19377E-39)
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r14 = r6
            r15 = r2
            u81 r9 = defpackage.u81.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r5.b(r1, r9)
            if (r1 == 0) goto L_0x01df
            if (r6 != r8) goto L_0x01ff
            r1 = r3
            goto L_0x0201
        L_0x01ff:
            r1 = r18
        L_0x0201:
            if (r2 != r8) goto L_0x0205
            r5 = r3
            goto L_0x0207
        L_0x0205:
            r5 = r18
        L_0x0207:
            fi1 r8 = new fi1
            boolean r9 = r4.c
            r8.<init>(r0, r2, r6, r9)
            boolean r0 = r4.b
            r0 = r0 ^ r3
            gpd r2 = new gpd
            java.lang.String r3 = r4.a
            int r4 = r3.length()
            if (r4 == 0) goto L_0x022b
            cpd r4 = new cpd
            r4.<init>(r3, r0)
            r2.<init>(r4, r1, r5, r8)
            so1 r0 = r7.a
            ep1 r0 = (defpackage.ep1) r0
            r0.A(r2)
            goto L_0x026d
        L_0x022b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown target to call"
            r0.<init>(r1)
            throw r0
        L_0x0233:
            boolean r1 = r1 instanceof defpackage.n21
            if (r1 == 0) goto L_0x0279
            zw3 r1 = r7.c()
            ete r1 = r1.a
            if (r1 != 0) goto L_0x026d
            zw3 r1 = r7.c()
            o3b r1 = r1.i
            if (r1 != 0) goto L_0x0249
            o3b r1 = defpackage.o3b.e
        L_0x0249:
            java.lang.Object r2 = r5.getValue()
            r6 = r2
            u81 r6 = (defpackage.u81) r6
            b65 r8 = r1.c
            l11 r3 = r0.w0
            k11 r4 = r1.d
            y11 r9 = r3.a(r4)
            r12 = 0
            r14 = 1048523(0xfffcb, float:1.469294E-39)
            ete r7 = r1.b
            r10 = 0
            r11 = 0
            r13 = 0
            u81 r3 = defpackage.u81.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r2 = r5.b(r2, r3)
            if (r2 == 0) goto L_0x0249
        L_0x026d:
            android.content.Context r0 = r19.getContext()
            qg1 r1 = new qg1
            r2 = r19
            r1.<init>(r2, r0)
            return r1
        L_0x0279:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x027f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x028b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown open type="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.ui.call.CallScreen.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [rr3, one.me.sdk.arch.Widget, one.me.calls.ui.ui.call.CallScreen] */
    public final void onDestroyView(View view) {
        kjd.B(requireActivity(), false);
        CallScreen.super.onDestroyView(view);
        sgc sgc = null;
        if (!requireActivity().isChangingConfigurations()) {
            rs3 u0 = u0();
            u0.a.clear();
            View view2 = u0.c;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener((View.OnLayoutChangeListener) u0.e.getValue());
            }
            View view3 = u0.d;
            if (view3 != null) {
                view3.removeOnLayoutChangeListener((View.OnLayoutChangeListener) u0.f.getValue());
            }
            u0.c = null;
            u0.d = null;
            ((ck1) ((bk1) this.Y.getValue())).a.clear();
            aj1 z02 = z0();
            po1 po1 = z02.c;
            ((lc9) po1.r.getValue()).g(Boolean.FALSE);
            mib mib = po1.j;
            mib.b();
            rz0 rz0 = (rz0) po1.b;
            CallsAudioManager callsAudioManager = (CallsAudioManager) rz0.c.get();
            if (callsAudioManager != null) {
                callsAudioManager.setOnAudioDeviceChangeListener((CallsAudioManager.OnAudioDeviceInfoChangeListener) null);
            }
            AudioLevelListener audioLevelListener = (AudioLevelListener) po1.u.getValue();
            try {
                MicrophoneManager c2 = rz0.c();
                if (c2 != null) {
                    c2.removeAudioSampleCallback(audioLevelListener);
                }
            } catch (Exception e) {
                String message = e.getMessage();
                udd.S("CallAudioController", "CallAudioController can't unregister mic audio listener due to: " + message + ".", e);
            }
            mib.h.remove((ko1) po1.x.getValue());
            mib.g = null;
            g37 g37 = (g37) po1.v.T0(po1, po1.y[0]);
            if (g37 != null) {
                g37.cancel((CancellationException) null);
            }
            ((f5f) z02.P0.getValue()).b();
            ((al1) z02.T0.getValue()).a.clear();
            yl1 yl1 = z02.Z;
            yl1.getClass();
            g37 g372 = (g37) yl1.h.T0(yl1, yl1.k[0]);
            if (g372 != null) {
                g372.cancel((CancellationException) null);
            }
        }
        dwa dwa = this.B0;
        dwa.b.clear();
        dwa.a.clear();
        u0().a(true);
        tb1 tb1 = this.Q0;
        if (tb1 != null) {
            A0().g(tb1);
        }
        rr3 rr3 = this;
        while (rr3.getParentController() != null) {
            rr3 = rr3.getParentController();
        }
        ygc ygc = rr3 instanceof ygc ? (ygc) rr3 : null;
        if (ygc != null) {
            sgc = ygc.S();
        }
        if (sgc != null) {
            sgc.K((og1) this.P0.getValue());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: rr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: rr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: rr3} */
    /* JADX WARNING: type inference failed for: r7v1, types: [one.me.calls.ui.ui.call.panels.CallTopPanelWidget, rr3] */
    /* JADX WARNING: type inference failed for: r7v2, types: [rr3, one.me.calls.ui.ui.call.panels.CallBottomPanelWidget] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14) {
        /*
            r13 = this;
            one.me.calls.ui.ui.call.CallScreen.super.onViewCreated(r14)
            r14 = r13
        L_0x0004:
            rr3 r0 = r14.getParentController()
            if (r0 == 0) goto L_0x000f
            rr3 r14 = r14.getParentController()
            goto L_0x0004
        L_0x000f:
            boolean r0 = r14 instanceof ygc
            r1 = 0
            if (r0 == 0) goto L_0x0017
            ygc r14 = (ygc) r14
            goto L_0x0018
        L_0x0017:
            r14 = r1
        L_0x0018:
            if (r14 == 0) goto L_0x001f
            sgc r14 = r14.S()
            goto L_0x0020
        L_0x001f:
            r14 = r1
        L_0x0020:
            if (r14 == 0) goto L_0x002d
            t97 r0 = r13.P0
            java.lang.Object r0 = r0.getValue()
            og1 r0 = (defpackage.og1) r0
            r14.a(r0)
        L_0x002d:
            im r14 = r13.requireActivity()
            r0 = 1
            defpackage.kjd.B(r14, r0)
            aj1 r14 = r13.z0()
            po1 r14 = r14.c
            r14.l()
            r14.k()
            mib r2 = r14.j
            r2.a()
            r7e r3 = r14.x
            java.lang.Object r3 = r3.getValue()
            ko1 r3 = (defpackage.ko1) r3
            java.util.LinkedHashSet r4 = r2.h
            r4.add(r3)
            c9 r3 = new c9
            r4 = 4
            r3.<init>(r4, r14)
            r2.g = r3
            ck5 r2 = r14.w
            ro1 r3 = r14.k
            qod r2 = defpackage.ez3.N(r2, r3)
            k77[] r3 = defpackage.po1.y
            r4 = 0
            r3 = r3[r4]
            e3 r5 = r14.v
            r5.o1(r14, r3, r2)
            k77[] r14 = U0
            r0 = r14[r0]
            n0c r2 = r13.z0
            java.lang.Object r0 = r2.T0(r13, r0)
            ax2 r0 = (ax2) r0
            java.lang.String r2 = r0.b()
            java.lang.String r3 = "call_bottom_panel_widget_tag"
            boolean r2 = defpackage.hhd.f(r2, r3)
            java.lang.String r5 = r13.w0
            if (r2 != 0) goto L_0x009f
            one.me.calls.ui.ui.call.panels.CallBottomPanelWidget r7 = new one.me.calls.ui.ui.call.panels.CallBottomPanelWidget
            r7.<init>(r5, r1)
            vgc r2 = new vgc
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r12 = -1
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2.d(r3)
            sgc r0 = r0.a
            r0.R(r2)
        L_0x009f:
            r0 = r14[r4]
            n0c r2 = r13.y0
            java.lang.Object r0 = r2.T0(r13, r0)
            ax2 r0 = (ax2) r0
            java.lang.String r2 = r0.b()
            java.lang.String r3 = "call_top_panel_widget_tag"
            boolean r2 = defpackage.hhd.f(r2, r3)
            if (r2 != 0) goto L_0x00cd
            one.me.calls.ui.ui.call.panels.CallTopPanelWidget r7 = new one.me.calls.ui.ui.call.panels.CallTopPanelWidget
            r7.<init>(r5, r1)
            vgc r2 = new vgc
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r12 = -1
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2.d(r3)
            sgc r0 = r0.a
            r0.R(r2)
        L_0x00cd:
            kl1 r0 = r13.s0()
            if (r0 == 0) goto L_0x00eb
            aj1 r2 = r13.z0()
            t97 r2 = r2.T0
            java.lang.Object r2 = r2.getValue()
            al1 r2 = (defpackage.al1) r2
            java.util.LinkedHashSet r3 = r2.a
            r3.add(r0)
            yk1 r2 = r2.b
            one.me.calls.ui.ui.call.panels.CallTopPanelWidget r0 = (one.me.calls.ui.ui.call.panels.CallTopPanelWidget) r0
            r0.x(r2)
        L_0x00eb:
            sgc r0 = r13.getRouter()
            ex9 r0 = r0.h()
            if (r0 == 0) goto L_0x0102
            nc7 r2 = r13.getViewLifecycleOwner()
            or3 r3 = new or3
            r4 = 3
            r3.<init>((int) r4, (java.lang.Object) r13)
            r0.a(r2, r3)
        L_0x0102:
            tb1 r0 = new tb1
            androidx.viewpager2.widget.ViewPager2 r6 = r13.A0()
            android.view.ViewStub r7 = r13.x0()
            r2 = 9
            r14 = r14[r2]
            nl0 r14 = r13.O0
            java.lang.Object r14 = r14.getValue()
            r8 = r14
            g11 r8 = (defpackage.g11) r8
            t97 r14 = r13.J0
            java.lang.Object r14 = r14.getValue()
            r9 = r14
            bc1 r9 = (defpackage.bc1) r9
            ig1 r10 = new ig1
            r14 = 0
            r10.<init>(r13, r14)
            hg1 r11 = new hg1
            r14 = 9
            r11.<init>(r13, r14)
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            androidx.viewpager2.widget.ViewPager2 r14 = r13.A0()
            r14.b(r0)
            r13.Q0 = r0
            zj1 r14 = r13.r0()
            e3 r0 = new e3
            r0.<init>(r13)
            r14.setListener(r0)
            c11 r14 = r13.q0()
            x3a r0 = new x3a
            r2 = 6
            r0.<init>((int) r2, (java.lang.Object) r13)
            r14.setClickListener(r0)
            aj1 r14 = r13.z0()
            t0c r14 = r14.R0
            aj1 r0 = r13.z0()
            grd r0 = r0.J0
            uv r2 = new uv
            r3 = 22
            r2.<init>(r0, r3)
            uv r0 = new uv
            r3 = 23
            r0.<init>(r2, r3)
            c3 r2 = new c3
            r3 = 4
            r2.<init>(r13, r1, r3)
            v11 r3 = new v11
            r4 = 4
            r3.<init>(r14, r0, r2, r4)
            yb7 r14 = r13.getViewLifecycleScope()
            defpackage.ez3.N(r3, r14)
            aj1 r14 = r13.z0()
            grd r14 = r14.J0
            ob7 r0 = defpackage.ob7.o
            nc7 r2 = r13.getViewLifecycleOwner()
            pc7 r2 = r2.R()
            rn1 r14 = defpackage.wx3.e(r14, r2, r0)
            rg1 r2 = new rg1
            r2.<init>(r1, r13)
            ck5 r3 = new ck5
            r4 = 5
            r3.<init>(r14, r2, r4)
            yb7 r14 = r13.getViewLifecycleScope()
            defpackage.ez3.N(r3, r14)
            aj1 r14 = r13.z0()
            boolean r14 = r14.u()
            if (r14 != 0) goto L_0x01d6
            aj1 r14 = r13.z0()
            t0c r14 = r14.O0
            nc7 r2 = r13.getViewLifecycleOwner()
            pc7 r2 = r2.R()
            rn1 r14 = defpackage.wx3.e(r14, r2, r0)
            sg1 r2 = new sg1
            r2.<init>(r1, r13)
            ck5 r3 = new ck5
            r4 = 5
            r3.<init>(r14, r2, r4)
            yb7 r14 = r13.getViewLifecycleScope()
            defpackage.ez3.N(r3, r14)
        L_0x01d6:
            aj1 r14 = r13.z0()
            l05 r14 = r14.Q0
            nc7 r2 = r13.getViewLifecycleOwner()
            pc7 r2 = r2.R()
            rn1 r14 = defpackage.wx3.e(r14, r2, r0)
            tg1 r2 = new tg1
            r2.<init>(r1, r13)
            ck5 r3 = new ck5
            r4 = 5
            r3.<init>(r14, r2, r4)
            yb7 r14 = r13.getViewLifecycleScope()
            defpackage.ez3.N(r3, r14)
            aj1 r14 = r13.z0()
            t0c r14 = r14.K0
            aj1 r2 = r13.z0()
            grd r2 = r2.L0
            ah1 r3 = new ah1
            r4 = 3
            r5 = 0
            r3.<init>(r4, r1, r5)
            v11 r4 = new v11
            r5 = 4
            r4.<init>(r14, r2, r3, r5)
            pj5 r14 = defpackage.ez3.z(r4)
            nc7 r2 = r13.getViewLifecycleOwner()
            pc7 r2 = r2.R()
            rn1 r14 = defpackage.wx3.e(r14, r2, r0)
            zg1 r0 = new zg1
            r0.<init>(r1, r13)
            ck5 r1 = new ck5
            r2 = 5
            r1.<init>(r14, r0, r2)
            yb7 r13 = r13.getViewLifecycleScope()
            defpackage.ez3.N(r1, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.ui.call.CallScreen.onViewCreated(android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.sdk.arch.Widget, one.me.calls.ui.ui.call.CallScreen, java.lang.Object] */
    public final void p0(boolean z) {
        if (z) {
            ((ep1) z0().c.a).v();
        }
        View requireView = requireView();
        if (requireView.getMeasuredWidth() == 0 || requireView.getMeasuredHeight() == 0) {
            requireView().post(new b(21, this));
        } else {
            getRouter().B(this);
        }
    }

    public final c11 q0() {
        k77 k77 = U0[4];
        return (c11) this.E0.getValue();
    }

    public final zj1 r0() {
        k77 k77 = U0[7];
        return (zj1) this.M0.getValue();
    }

    public final kl1 s0() {
        rr3 a2 = ((ax2) this.y0.T0(this, U0[0])).a();
        if (a2 instanceof kl1) {
            return (kl1) a2;
        }
        return null;
    }

    public final iq1 t0() {
        return (iq1) this.a.getValue();
    }

    public final rs3 u0() {
        return (rs3) this.C0.getValue();
    }

    public final oed v0() {
        return (oed) this.R0.getValue();
    }

    public final ViewStub w0() {
        k77 k77 = U0[3];
        return (ViewStub) this.D0.getValue();
    }

    public final ViewStub x0() {
        k77 k77 = U0[8];
        return (ViewStub) this.N0.getValue();
    }

    public final void y(int i, Bundle bundle) {
        z0().Z.b(i, bundle);
    }

    public final ViewStub y0() {
        k77 k77 = U0[6];
        return (ViewStub) this.L0.getValue();
    }

    public final aj1 z0() {
        return (aj1) this.Z.getValue();
    }
}
