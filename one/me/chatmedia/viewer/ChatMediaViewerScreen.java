package one.me.chatmedia.viewer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lone/me/chatmedia/viewer/ChatMediaViewerScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Ltpa;", "Li9f;", "Lhoc;", "Ltq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "", "attachId", "msgId", "", "singleMode", "descOrder", "(JLjava/lang/String;JZZ)V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMediaViewerScreen extends SwipeWidget implements tpa, i9f, hoc, tq3 {
    public static final /* synthetic */ k77[] O0;
    public static final sy6 P0 = new sy6(5, (up0) null, 2);
    public static final sy6 Q0 = new sy6(0, new up0(5, 1, false), 1);
    public final t97 A0;
    public final n0c B0;
    public final n0c C0;
    public final n0c D0;
    public sf8 E0;
    public qsf F0;
    public AnimatorSet G0;
    public final sd2 H0;
    public final t97 I0;
    public final t97 J0;
    public float K0;
    public boolean L0;
    public qod M0;
    public gba N0;
    public final jr X;
    public final jr Y;
    public final jr Z;
    public final jr o;
    public final jr w0;
    public final t97 x0;
    public final jj7 y0;
    public final boolean z0;

    static {
        Class<ChatMediaViewerScreen> cls = ChatMediaViewerScreen.class;
        O0 = new k77[]{new khb(cls, "chatId", "getChatId()J", 0), m4b.g(m7c.a, cls, "attachId", "getAttachId()Ljava/lang/String;", 0), new khb(cls, "msgId", "getMsgId()J", 0), new khb(cls, "descOrder", "getDescOrder()Z", 0), new khb(cls, "singleMode", "getSingleMode()Z", 0), new khb(cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new khb(cls, "infoPanel", "getInfoPanel()Lone/me/chatmedia/viewer/InformationPanelView;", 0)};
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3, one.me.sdk.arch.Widget] */
    public ChatMediaViewerScreen(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.o = new jr(cls, 0L, "chat.media.viewer.chat_id");
        this.X = new jr(String.class, BuildConfig.FLAVOR, "chat.media.viewer.attach_id");
        this.Y = new jr(cls, 0L, "chat.media.viewer.message_id");
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls2 = Boolean.class;
        this.Z = new jr(cls2, bool, "chat.media.viewer.desc_order");
        this.w0 = new jr(cls2, bool, "chat.media.viewer.single_mode");
        fb2 fb2 = fb2.a;
        this.x0 = fb2.getAccessor().d(jb5.class);
        this.y0 = new jj7((s16) new p22(16), (s16) null, 6);
        this.z0 = true;
        this.A0 = createViewModelLazy(ah2.class, new s(27, new if2(this, 0)));
        this.B0 = viewBinding(a2a.e);
        this.C0 = viewBinding(a2a.i);
        this.D0 = viewBinding(a2a.d);
        this.H0 = new sd2(this, ((x4a) fb2.getAccessor().c(x4a.class)).a());
        this.I0 = fb2.getAccessor().d(eid.class);
        this.J0 = ez3.O(3, new if2(this, 1));
        this.K0 = -1.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r1.M0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean t0(one.me.chatmedia.viewer.ChatMediaViewerScreen r1) {
        /*
            t97 r0 = r1.J0
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0014
            qod r1 = r1.M0
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.isActive()
            r0 = 1
            if (r1 != r0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatmedia.viewer.ChatMediaViewerScreen.t0(one.me.chatmedia.viewer.ChatMediaViewerScreen):boolean");
    }

    public final nea A0() {
        return (nea) this.C0.T0(this, O0[6]);
    }

    public final ah2 B0() {
        return (ah2) this.A0.getValue();
    }

    public final void C0(boolean z) {
        gba gba = this.N0;
        if (gba != null) {
            gba.a();
        }
        String string = getContext().getString(z ? htb.oneme_chatmedia_viewer_load_video_fail : htb.oneme_chatmedia_viewer_load_photo_fail);
        hba hba = new hba(this);
        hba.i(string);
        hba.c(new pba(0, u0(), 3));
        hba.f(new vba(phc.J));
        this.N0 = hba.j();
    }

    public final void D0() {
        k7f z02 = z0();
        int i = zp4.o;
        this.M0 = ez3.N(wx3.e(new ck5(ez3.z(new djc(new l7f(z02, mt0.P(50, eq4.MILLISECONDS), (Continuation) null))), new sf2((Continuation) null, this), 5), getViewLifecycleOwner().R(), ob7.o), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void E0(boolean z) {
        AnimatorSet animatorSet = this.G0;
        if ((animatorSet == null || !animatorSet.isRunning()) && getView() != null) {
            float f = (A0().getVisibility() == 0 || y0().getVisibility() == 0) ? 0.0f : 1.0f;
            lg7 c = hwf.c();
            nea A02 = A0();
            Property property = View.ALPHA;
            c.add(ObjectAnimator.ofFloat(A02, property, new float[]{A0().getAlpha(), f}));
            c.add(ObjectAnimator.ofFloat(y0(), property, new float[]{y0().getAlpha(), f}));
            sf8 sf8 = this.E0;
            ObjectAnimator ofFloat = sf8 != null ? ObjectAnimator.ofFloat(sf8.a(), property, new float[]{sf8.a().getAlpha(), f}) : null;
            if (z && ofFloat != null) {
                c.add(ofFloat);
            }
            lg7 a = hwf.a(c);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(a);
            animatorSet2.setDuration(200);
            animatorSet2.addListener(new tf2((ChatMediaViewerScreen) this, z, f));
            animatorSet2.addListener(new tf2(f, (ChatMediaViewerScreen) this, z));
            animatorSet2.start();
            this.G0 = animatorSet2;
        }
    }

    public final boolean O() {
        return this.z0;
    }

    public final boolean R() {
        return ((jb5) this.x0.getValue()).t();
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m46getScopeIdIluPPks() {
        return "chatMediaViewer";
    }

    public final rnc getScreenDelegate() {
        return this.y0;
    }

    public final boolean handleBack() {
        x0();
        gba gba = this.N0;
        if (gba != null) {
            gba.a();
        }
        return ChatMediaViewerScreen.super.handleBack();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void n0() {
        Window window;
        Window window2;
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(-15263716);
        }
        Activity activity = getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            window2.setStatusBarColor(-15263716);
        }
        Activity activity2 = getActivity();
        if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
            window.setNavigationBarColor(-15263716);
        }
        w0(true);
        v0(false);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void o0() {
        Window window;
        Window window2;
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(0);
        }
        Activity activity = getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            window.setNavigationBarColor(0);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void onActivityStarted(Activity activity) {
        ChatMediaViewerScreen.super.onActivityStarted(activity);
        if (getView() != null && y0().getVisibility() == 0) {
            activity.getWindow().setStatusBarColor(-15263716);
            activity.getWindow().setNavigationBarColor(-15263716);
            w0(true);
        }
    }

    public final void onChangeStarted(wr3 wr3, xr3 xr3) {
        ChatMediaViewerScreen.super.onChangeStarted(wr3, xr3);
        if (!xr3.b) {
            x0();
        }
        if (xr3 == xr3.POP_EXIT && this.J0.a()) {
            ah2 B02 = B0();
            long F02 = z0().F0();
            B02.getClass();
            sk9 sk9 = sk9.a;
            sg2 sg2 = new sg2(B02, F02, (Continuation) null);
            xs7.D(B02.a, sk9, ru3.c, sg2);
            z0().Y = null;
            dbc dbc = ((eid) this.I0.getValue()).g;
            if (dbc.a()) {
                k7f k7f = (k7f) dbc.getValue();
                udd.p(k7f.c, "Player. Release", new Object[0]);
                n45 n45 = k7f.o;
                n45.w2();
                n45.H0.Y.e(k7f);
                n45.r0(k7f);
                n45.w2();
                n45.p2((Object) null);
                n45.k2(0, 0);
                n45.release();
                k7f.X.o();
                dbc.b();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [sd2, f6c] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v6e v6e = new v6e(getContext());
        v6e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewPager2 viewPager2 = new ViewPager2(v6e.getContext());
        viewPager2.setId(a2a.e);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(this.H0);
        swb.r(viewPager2);
        v6e.addView(viewPager2);
        nea nea = new nea(v6e.getContext(), 6);
        nea.setId(a2a.i);
        nea.setLayoutParams(new FrameLayout.LayoutParams(-1, a24.X(((float) 64) * dh4.c().getDisplayMetrics().density)));
        nea.setForm(fea.a);
        nea.setCustomTheme(qda.a);
        nea.setLeftActions(new vda(new jf2(this, 0)));
        hea hea = new hea(phc.t0, 0, new f(1, this, ChatMediaViewerScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 13), 14);
        k77 k77 = O0[4];
        if (((Boolean) this.w0.a(this)).booleanValue()) {
            nea.setRightActions(new aea((jea) null, hea));
        } else {
            nea.setRightActions(new aea(new hea(l9a.f, 0, new jf2(this, 1), 14), hea));
        }
        nea.setBackgroundColor(-15263716);
        ek8.g(nea, P0, (u16) null);
        v6e.addView(nea);
        v6e.setClipChildren(false);
        v6e.setClipToPadding(false);
        cw6 cw6 = new cw6(v6e.getContext());
        cw6.setId(a2a.d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        cw6.setLayoutParams(layoutParams);
        cw6.setClipChildren(false);
        cw6.setClipToPadding(false);
        float f = (float) 9;
        cw6.setPadding(cw6.getPaddingLeft(), a24.X(dh4.c().getDisplayMetrics().density * f), cw6.getPaddingRight(), a24.X(f * dh4.c().getDisplayMetrics().density));
        cw6.setBackgroundColor(-15263716);
        ek8.g(cw6, Q0, (u16) null);
        v6e.addView(cw6);
        Activity activity = getActivity();
        if (activity != null) {
            activity.getWindow().setStatusBarColor(-15263716);
            activity.getWindow().setNavigationBarColor(-15263716);
            qsf qsf = new qsf(activity.getWindow(), activity.getWindow().getDecorView());
            qsf.a.J();
            this.F0 = qsf;
        }
        w0(true);
        v6e.setBackgroundColor(-15263716);
        this.E0 = new sf8(v6e, new za6((Object) this));
        return v6e;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void onDestroy() {
        ChatMediaViewerScreen.super.onDestroy();
        t97 t97 = this.J0;
        if (t97.a()) {
            ((eid) this.I0.getValue()).a((k7f) t97.getValue());
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void onDestroyView(View view) {
        ChatMediaViewerScreen.super.onDestroyView(view);
        this.F0 = null;
        this.E0 = null;
    }

    public final void onViewCreated(View view) {
        t0c t0c = B0().U0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new kf2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(B0().Y0, getViewLifecycleOwner().R(), ob7), new lf2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(B0().W0, getViewLifecycleOwner().R(), ob7), new mf2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(B0().R0, getViewLifecycleOwner().R(), ob7), new nf2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(B0().S0, getViewLifecycleOwner().R(), ob7), new of2((Continuation) null, this), 5), getViewLifecycleScope());
        ((ViewPager2) this.B0.T0(this, O0[5])).b(new hg0(3, this));
        ez3.N(new ck5(wx3.e(y0().getEvents(), getViewLifecycleOwner().R(), ob7), new pf2((Continuation) null, this), 5), getViewLifecycleScope());
        ah2 B02 = B0();
        taf.n(B02, B02.x0.b(), (ru3) null, new qg2(B02, (Continuation) null), 2);
        ez3.N(new ck5(wx3.e(B0().c1, getViewLifecycleOwner().R(), ob7), new qf2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void p0() {
        if (getView() == null) {
            return;
        }
        if (A0().getVisibility() == 0) {
            A0().setVisibility(8);
            y0().setVisibility(8);
            sf8 sf8 = this.E0;
            if (sf8 != null) {
                sf8.c(false);
                return;
            }
            return;
        }
        x0();
    }

    public final Long r0() {
        return 1000L;
    }

    public final Integer s0() {
        return -15263716;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = ek8.x(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int u0() {
        /*
            r3 = this;
            android.view.View r0 = r3.getView()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.Integer r0 = ek8.x(r0)
            if (r0 == 0) goto L_0x0012
            int r0 = r0.intValue()
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            cw6 r2 = r3.y0()
            int r2 = r2.getMeasuredHeight()
            if (r0 != 0) goto L_0x0031
            cw6 r3 = r3.y0()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x002c
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x0031
            int r1 = r3.bottomMargin
        L_0x0031:
            int r2 = r2 + r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatmedia.viewer.ChatMediaViewerScreen.u0():int");
    }

    public final void v0(boolean z) {
        if (z) {
            qsf qsf = this.F0;
            if (qsf != null) {
                qsf.a.K(1);
                return;
            }
            return;
        }
        qsf qsf2 = this.F0;
        if (qsf2 != null) {
            qsf2.a.r(1);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void w0(boolean z) {
        Window window;
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            boolean z2 = km4.y0.r(window.getDecorView()).getName().equals("one.me.sdk.design.OneMeThemeLight") && !z;
            qsf qsf = this.F0;
            if (qsf != null) {
                qsf.b(z2);
            }
            qsf qsf2 = this.F0;
            if (qsf2 != null) {
                qsf2.a(z2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void x0() {
        Window window;
        Window window2;
        Activity activity = getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
            window.setNavigationBarColor(0);
        }
        w0(false);
        v0(true);
    }

    public final void y(int i, Bundle bundle) {
        B0().E(i);
    }

    public final cw6 y0() {
        return (cw6) this.D0.T0(this, O0[7]);
    }

    public final k7f z0() {
        return (k7f) this.J0.getValue();
    }

    public ChatMediaViewerScreen(long j, String str, long j2, boolean z, boolean z2) {
        this(jjd.j(new wia("chat.media.viewer.chat_id", Long.valueOf(j)), new wia("chat.media.viewer.attach_id", str), new wia("chat.media.viewer.message_id", Long.valueOf(j2)), new wia("chat.media.viewer.single_mode", Boolean.valueOf(z)), new wia("chat.media.viewer.desc_order", Boolean.valueOf(z2))));
    }
}
