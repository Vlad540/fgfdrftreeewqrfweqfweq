package one.me.chatscreen.mediabar;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import ru.ok.messages.media.mediabar.ActLocalMedias;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000e\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0010"}, d2 = {"Lone/me/chatscreen/mediabar/MediaBarWidget;", "Lone/me/sdk/arch/Widget;", "Lrg9;", "Llc3;", "Lkt1;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "", "chatId", "(Ljava/lang/String;JLx54;)V", "m08", "x9", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaBarWidget extends Widget implements rg9, lc3, kt1 {
    public static final /* synthetic */ k77[] h1;
    public static final sy6 i1 = new sy6(0, new up0(4, 3, true), 1);
    public final nl0 A0;
    public final nl0 B0;
    public final nl0 C0;
    public final t97 D0;
    public final n0c E0;
    public final nl0 F0;
    public final ColorDrawable G0;
    public final nl0 H0;
    public float I0;
    public float J0;
    public int K0;
    public final nl0 L0;
    public final nl0 M0;
    public final nl0 N0;
    public final nl0 O0;
    public final tp0 P0;
    public final ColorDrawable Q0;
    public ValueAnimator R0;
    public final nl0 S0;
    public final nl0 T0;
    public final nl0 U0;
    public final t97 V0;
    public final t97 W0;
    public final wk7 X;
    public final t97 X0;
    public final IntEvaluator Y;
    public final t97 Y0;
    public final n0c Z;
    public final n0c Z0;
    public final String a;
    public final nl0 a1;
    public final jr b;
    public final t97 b1;
    public final t97 c;
    public final n0c c1;
    public final n0c d1;
    public final bw5 e1;
    public z68 f1;
    public m08 g1;
    public final xg9 o;
    public final n0c w0;
    public final n0c x0;
    public gba y0;
    public final nl0 z0;

    static {
        Class<MediaBarWidget> cls = MediaBarWidget.class;
        h1 = new k77[]{new khb(cls, "chatId", "getChatId()J", 0), m4b.g(m7c.a, cls, "selectMediaTypeRouter", "getSelectMediaTypeRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new khb(cls, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new khb(cls, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0), new khb(cls, "closeDragView", "getCloseDragView()Landroid/widget/FrameLayout;", 0), new khb(cls, "closeDragElement", "getCloseDragElement()Landroid/widget/FrameLayout;", 0), new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new khb(cls, "primaryContainer", "getPrimaryContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "partialMediaAccessRouter", "getPartialMediaAccessRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new khb(cls, "partialMediaAccessContainer", "getPartialMediaAccessContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "cameraContainerView", "getCameraContainerView()Lone/me/sdk/gallery/view/CameraContainerView;", 0), new khb(cls, "selectedMediaAdapter", "getSelectedMediaAdapter()Lone/me/chatscreen/mediabar/SelectedMediaAdapter;", 0), new khb(cls, "selectedMediaRecycler", "getSelectedMediaRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new khb(cls, "selectedMediaContent", "getSelectedMediaContent()Landroid/widget/LinearLayout;", 0), new khb(cls, "messageContent", "getMessageContent()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new khb(cls, "draggableContainer", "getDraggableContainer()Landroid/widget/LinearLayout;", 0), new khb(cls, "selectMediaTypeContainer", "getSelectMediaTypeContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "bottomContainer", "getBottomContainer()Landroid/widget/LinearLayout;", 0), new khb(cls, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new khb(cls, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new khb(cls, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0)};
    }

    public MediaBarWidget(String str, long j, x54 x54) {
        this(jjd.j(new wia("scope_id", new inc(str)), new wia("chat_id", Long.valueOf(j))));
    }

    public static final void l0(MediaBarWidget mediaBarWidget, int i, int i2) {
        gba gba = mediaBarWidget.y0;
        if (gba != null) {
            gba.a();
        }
        hba hba = new hba(mediaBarWidget.w0());
        hba.c(new pba(0, mediaBarWidget.q0().getHeight(), 3));
        hba.f(new vba(i));
        hba.i(mediaBarWidget.getContext().getString(i2));
        mediaBarWidget.y0 = hba.j();
    }

    public static final void m0(MediaBarWidget mediaBarWidget, int i) {
        gba gba = mediaBarWidget.y0;
        if (gba != null) {
            gba.a();
        }
        String quantityString = mediaBarWidget.getContext().getResources().getQuantityString(u9a.a, i, new Object[]{Integer.valueOf(i)});
        hba hba = new hba(mediaBarWidget.w0());
        hba.c(new pba(0, mediaBarWidget.q0().getHeight(), 3));
        hba.i(quantityString);
        mediaBarWidget.y0 = hba.j();
    }

    public static final void n0(MediaBarWidget mediaBarWidget) {
        mediaBarWidget.getClass();
        k77[] k77Arr = h1;
        k77 k77 = k77Arr[5];
        int measuredHeight = mediaBarWidget.z0().getMeasuredHeight() + ((FrameLayout) mediaBarWidget.A0.getValue()).getMeasuredHeight();
        k77 k772 = k77Arr[9];
        float measuredHeight2 = mediaBarWidget.J0 + mediaBarWidget.I0 + ((float) (((az1) mediaBarWidget.F0.getValue()).getMeasuredHeight() + mediaBarWidget.s0().getPaddingTop() + measuredHeight));
        LinearLayout q0 = mediaBarWidget.q0();
        Rect rect = mcf.a;
        mcf.d(rect, q0);
        int height = (mediaBarWidget.r0().getHeight() + ((int) measuredHeight2)) - rect.top;
        if (height < 0) {
            height = 0;
        }
        lt1 r0 = mediaBarWidget.r0();
        int i = (-((int) mediaBarWidget.I0)) + mediaBarWidget.K0;
        r0.z0 = i;
        r0.A0 = height;
        if (!r0.D0) {
            lme lme = r0.B0;
            lme.a = i;
            lme.b = height;
            r0.invalidateOutline();
        }
        mediaBarWidget.r0().setPreviewTranslationY(measuredHeight2);
    }

    public final i08 A0() {
        return (i08) this.X0.getValue();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, pk7] */
    public final void B0(tk7 tk7, int i, String str) {
        im requireActivity = requireActivity();
        boolean s = A0().s();
        ? obj = new Object();
        obj.a = true;
        obj.b = false;
        obj.c = str;
        obj.e = i;
        obj.d = tk7.a();
        obj.f = 0;
        obj.g = 0;
        obj.a = true;
        obj.b = s;
        int i2 = ActLocalMedias.w1;
        Intent intent = new Intent(requireActivity, ActLocalMedias.class);
        intent.putExtra("ru.ok.tamtam.extra.PROFILE_CREATION", false);
        intent.putExtra("ru.ok.tamtam.extra.OPTIONS", new qk7(obj));
        Pair create = Pair.create(intent, (Object) null);
        startActivityForResult((Intent) create.first, 39393, (Bundle) create.second);
    }

    public final void C0(jxc jxc) {
        int ordinal = jxc.ordinal();
        if (ordinal == 0) {
            v0().setRightOuterIconActionState(dq8.a);
        } else if (ordinal == 1) {
            v0().setRightOuterIconActionState(cq8.a);
        } else if (ordinal == 2) {
            v0().setRightOuterIconActionState(eq8.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void D0(qz qzVar) {
        yda yda;
        int i;
        nea z02 = z0();
        if (A0().s()) {
            yda = yda.a;
        } else {
            int ordinal = qzVar.ordinal();
            if (ordinal == 0) {
                i = i2a.i;
            } else if (ordinal == 1) {
                i = i2a.h;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            yda = new aea((jea) null, new gea(i, new l08(this, 0)));
        }
        z02.setRightActions(yda);
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m50getScopeIdIluPPks() {
        return this.a;
    }

    public final boolean handleBack() {
        if (r0().D0) {
            r0().a(false, true);
            xg9.g(this.o, mnc.R0);
            return true;
        }
        x0b scrollState = w0().getScrollState();
        scrollState.getClass();
        if (scrollState == x0b.a) {
            return false;
        }
        if (u0().n()) {
            A0().z0.K(1);
            return true;
        } else if (!A0().u()) {
            return true;
        } else {
            w0().j(true);
            return true;
        }
    }

    public final void i(int i, Bundle bundle) {
        if (i == 1) {
            i08 A02 = A0();
            A02.getClass();
            A02.x0.n(new vy7(false));
        }
    }

    public final mnc o() {
        return r0().D0 ? mnc.T0 : mnc.R0;
    }

    public final void o0() {
        vkb vkb = r0().a;
        SelectAlbumWidget selectAlbumWidget = null;
        if (vkb != null) {
            if (vkb == null) {
                vkb = null;
            }
            vkb.getCameraApi().h();
        }
        rr3 a2 = x0().a();
        if (a2 instanceof MediaBarPermissionWidget) {
            nl0 nl0 = ((MediaBarPermissionWidget) a2).o;
            if (nl0.a()) {
                ((os1) nl0.getValue()).h();
            }
        }
        SelectAlbumWidget a3 = ((ax2) this.Z0.T0(this, h1[18])).a();
        if (a3 instanceof SelectAlbumWidget) {
            selectAlbumWidget = a3;
        }
        if (selectAlbumWidget != null) {
            selectAlbumWidget.m0().j(false);
        }
        z0().setDropdownRotationProgress(0.0f);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chatscreen.mediabar.MediaBarWidget] */
    public final void onActivityPaused(Activity activity) {
        if (getView() != null) {
            o0();
        }
        MediaBarWidget.super.onActivityPaused(activity);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [rr3, one.me.chatscreen.mediabar.MediaBarWidget] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        MediaBarWidget.super.onActivityResult(i, i2, intent);
        i08 A02 = A0();
        int i3 = A02.r().l;
        int i4 = i3 == 0 ? -1 : xz7.$EnumSwitchMapping$2[hr1.t(i3)];
        int i5 = 3;
        grd grd = A02.w0;
        if (i4 == 1 || i4 == 2) {
            grd.m((Object) null, qz.a);
            pwc r = A02.r();
            int i6 = pz.$EnumSwitchMapping$0[0];
            if (i6 != 1) {
                if (i6 == 2) {
                    i5 = 2;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            r.p(i5);
        } else if (i4 == 3) {
            grd.m((Object) null, qz.b);
            pwc r2 = A02.r();
            int i7 = pz.$EnumSwitchMapping$0[1];
            if (i7 != 1) {
                if (i7 == 2) {
                    i5 = 2;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            r2.p(i5);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (i == 39393) {
            r0().a(false, false);
            if (i2 == -1) {
                A0().t(true);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chatscreen.mediabar.MediaBarWidget] */
    public final void onActivityResumed(Activity activity) {
        if (getView() != null) {
            if (w0().getScrollState() != x0b.a) {
                p0();
            }
            v0().setText(this.X.f.k);
        }
        i08 A02 = A0();
        A02.C0.e();
        A02.D0.e();
        ykb ykb = (ykb) this.D0.getValue();
        ykb.B0.e();
        ykb.C0.e();
        MediaBarWidget.super.onActivityResumed(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z0b z0b = new z0b(getContext());
        z0b.setId(yob.media_bar__popup_layout);
        km4.y0.r(z0b);
        z0b.setBackground(new ColorDrawable(-1728053248));
        z0b.addView(s0());
        z0b.addView(q0());
        z0b.addView(r0());
        FrameLayout frameLayout = new FrameLayout(z0b.getContext());
        frameLayout.setId(j2a.w);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        int i = e87.a;
        frameLayout.setTranslationY((float) e87.a(frameLayout.getContext()));
        ek8.g(frameLayout, new sy6(0, new up0(5, 1, false), 1), (u16) null);
        z0b.addView(frameLayout);
        z0b.setCallback(new x9(this, 2));
        e07.B(new ck5(e87.f, new o08(this, z0b, (Continuation) null), 5), getViewLifecycleScope());
        return z0b;
    }

    public final void onDestroyView(View view) {
        z0b w02 = w0();
        ValueAnimator valueAnimator = w02.w0;
        if (valueAnimator != null) {
            vx3.f(valueAnimator);
        }
        w02.w0 = null;
        vkb vkb = r0().a;
        if (vkb != null) {
            if (vkb == null) {
                vkb = null;
            }
            vkb.getCameraApi().c();
        }
        z68 z68 = this.f1;
        if (z68 != null) {
            z68.a();
        }
        this.f1 = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        t97 t97 = this.c;
        if (i == 159) {
            qna.l((qna) t97.getValue(), new jrf(this, 1), strArr, iArr, qna.l, cic.S1, cic.T1);
        } else if (i == 171) {
            qna.l((qna) t97.getValue(), new jrf(this, 1), strArr, iArr, qna.h, cic.Q1, cic.P1);
        }
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [rr3, one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget] */
    public final void onViewCreated(View view) {
        k77[] k77Arr = h1;
        ax2 ax2 = (ax2) this.Z.T0(this, k77Arr[1]);
        if (!hhd.f(ax2.b(), "media_type_picker_widget")) {
            k77 k77 = k77Arr[0];
            vgc vgc = new vgc(new MediaTypePickerWidget(this.a, ((Number) this.b.a(this)).longValue(), (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
            vgc.d("media_type_picker_widget");
            ax2.a.R(vgc);
        }
        grd grd = A0().w0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(grd, getViewLifecycleOwner().R(), ob7), new v08((Continuation) null, this), 5), getViewLifecycleScope());
        e07.B(new ck5(A0().E0, new z08((Continuation) null, this), 5), getViewLifecycleScope());
        e07.B(new ck5(ez3.V(A0().x0), new a18((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(A0().J0, getViewLifecycleOwner().R(), ob7), new w08((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(A0().H0, getViewLifecycleOwner().R(), ob7), new x08((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(A0().F0, getViewLifecycleOwner().R(), ob7), new y08((Continuation) null, this), 5), getViewLifecycleScope());
        e07.B(new ck5(t0().c, new t08((Continuation) null, this), 5), getViewLifecycleScope());
        e07.B(new ck5(((vg8) this.W0.getValue()).b, new u08((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((ykb) this.D0.getValue()).A0, getViewLifecycleOwner().R(), ob7), new s08((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((qvc) this.Y0.getValue()).o, getViewLifecycleOwner().R(), ob7), new r08((Continuation) null, this), 5), getViewLifecycleScope());
        sgc u0 = u0();
        az1 az1 = (az1) this.c1.T0(this, k77Arr[20]);
        LinearLayout q0 = q0();
        j08 j08 = new j08(this, 15);
        boolean z = js.u(getContext()).b && Build.VERSION.SDK_INT >= 30;
        yb7 viewLifecycleScope = getViewLifecycleScope();
        kt8 kt8 = (kt8) ((t0c) A0().z0.c).a.getValue();
        this.f1 = new z68(u0, az1, q0, j08, z, viewLifecycleScope, (kt8 != null ? kt8.a : 0) == 2, new j08(this, 16));
        new t68((u68) this.b1.getValue(), v0()).a(getViewLifecycleScope());
        ez3.N(new ck5(new ik5((t0c) A0().z0.c, 2), new hp0(2, this, MediaBarWidget.class, "onToggleEmoji", "onToggleEmoji(Lone/me/sdk/messagewrite/MessageWriteEvent$ToggleEmoji;)V", 4, 17), 5), getViewLifecycleScope());
    }

    public final void p0() {
        vkb vkb = r0().a;
        if (vkb != null) {
            if (vkb == null) {
                vkb = null;
            }
            vkb.getCameraApi().e();
        }
        rr3 a2 = x0().a();
        if (a2 instanceof MediaBarPermissionWidget) {
            nl0 nl0 = ((MediaBarPermissionWidget) a2).o;
            if (nl0.a()) {
                ((os1) nl0.getValue()).e();
            }
        }
    }

    public final LinearLayout q0() {
        k77 k77 = h1[17];
        return (LinearLayout) this.U0.getValue();
    }

    public final lt1 r0() {
        k77 k77 = h1[10];
        return (lt1) this.H0.getValue();
    }

    public final LinearLayout s0() {
        k77 k77 = h1[15];
        return (LinearLayout) this.S0.getValue();
    }

    public final f56 t0() {
        return (f56) this.V0.getValue();
    }

    public final sgc u0() {
        return (sgc) this.d1.T0(this, h1[21]);
    }

    public final jq8 v0() {
        k77 k77 = h1[14];
        return (jq8) this.O0.getValue();
    }

    public final z0b w0() {
        return (z0b) this.x0.T0(this, h1[3]);
    }

    public final ax2 x0() {
        return (ax2) this.w0.T0(this, h1[2]);
    }

    public final az1 y0() {
        k77 k77 = h1[19];
        return (az1) this.a1.getValue();
    }

    public final nea z0() {
        k77 k77 = h1[6];
        return (nea) this.B0.getValue();
    }

    public MediaBarWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        t62.b.getClass();
        this.a = k34.a(t62.c.a);
        this.b = new jr(Long.class, "chat_id");
        this.c = rna.a.b();
        sl2 sl2 = sl2.a;
        this.o = (xg9) sl2.getAccessor().c(xg9.class);
        this.X = (wk7) sl2.getAccessor().c(wk7.class);
        this.Y = new IntEvaluator();
        this.Z = childSlotRouter(yob.media_bar__bottom_container);
        this.w0 = childSlotRouter(yob.media_bar__primary_container);
        this.x0 = viewBinding(yob.media_bar__popup_layout);
        this.z0 = binding(new j08(this, 0));
        this.A0 = binding(new j08(this, 1));
        this.B0 = binding(new j08(this, 2));
        this.C0 = binding(new j08(this, 3));
        this.D0 = createViewModelLazy(ykb.class, new js5(15, new ib7(14)));
        this.E0 = childSlotRouter(yob.media_bar__partial_media_access_container);
        this.F0 = binding(new j08(this, 4));
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(0);
        this.G0 = colorDrawable;
        this.H0 = binding(new j08(this, 5));
        this.L0 = binding(new j08(this, 6));
        this.M0 = binding(new j08(this, 7));
        this.N0 = binding(new j08(this, 8));
        this.O0 = binding(new j08(this, 9));
        this.P0 = new tp0(1, dh4.c().getDisplayMetrics().density * 12.0f);
        ColorDrawable colorDrawable2 = new ColorDrawable(-16777216);
        colorDrawable2.setAlpha(0);
        this.Q0 = colorDrawable2;
        this.S0 = binding(new j08(this, 14));
        this.T0 = binding(new j08(this, 17));
        this.U0 = binding(new j08(this, 18));
        ez3.O(3, new j08(this, 19));
        this.V0 = createViewModelLazy(f56.class, new js5(16, new j08(this, 20)));
        this.W0 = createViewModelLazy(vg8.class, new js5(17, new ib7(15)));
        Class<inc> cls = inc.class;
        Object E = ek8.E(bundle, "scope_id", cls);
        if (E != null) {
            this.X0 = getSharedViewModel-cp94BC8(((Parcelable) E).a, i08.class, (s16) null);
            this.Y0 = createViewModelLazy(qvc.class, new js5(18, new ib7(16)));
            this.Z0 = childSlotRouter(j2a.y);
            this.a1 = binding(new j08(this, 21));
            Object E2 = ek8.E(bundle, "scope_id", cls);
            if (E2 != null) {
                this.b1 = getSharedViewModel-cp94BC8(((Parcelable) E2).a, u68.class, (s16) null);
                int i = j2a.w;
                this.c1 = viewBinding(i);
                this.d1 = Widget.childRouter$default(this, i, (u16) null, 2, (Object) null);
                this.e1 = new bw5(this, 1);
                return;
            }
            throw new IllegalArgumentException(wn6.i("No value passed for key scope_id of type ", cls.getSimpleName(), " in bundle").toString());
        }
        throw new IllegalArgumentException(wn6.i("No value passed for key scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
