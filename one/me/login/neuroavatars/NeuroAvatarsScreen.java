package one.me.login.neuroavatars;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0011B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Lone/me/login/neuroavatars/NeuroAvatarsScreen;", "Lone/me/sdk/arch/Widget;", "", "Llc3;", "Lac0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lz7c;", "registrationData", "Ly2b;", "presetAvatars", "(Lz7c;Ly2b;)V", "", "contactId", "(J)V", "yi9", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class NeuroAvatarsScreen extends Widget implements lc3, ac0 {
    public static final /* synthetic */ k77[] Q0;
    public final n0c A0;
    public final n0c B0;
    public final p85 C0;
    public final t97 D0;
    public final t97 E0;
    public final jt5 F0;
    public final wi9 G0;
    public final jr H0;
    public final jr I0;
    public final jr J0;
    public final t97 K0;
    public final ExecutorService L0;
    public final mr5 M0;
    public final ij9 N0;
    public final g02 O0;
    public final r7e P0;
    public final n0c X;
    public final n0c Y;
    public final n0c Z;
    public final /* synthetic */ lu7 a;
    public final sy6 b;
    public final jj7 c;
    public final t97 o;
    public final n0c w0;
    public final n0c x0;
    public final n0c y0;
    public final n0c z0;

    static {
        Class<NeuroAvatarsScreen> cls = NeuroAvatarsScreen.class;
        k77 khb = new khb(cls, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0);
        n7c n7c = m7c.a;
        Q0 = new k77[]{khb, wn6.e(n7c, cls, "selectedAvatarView", "getSelectedAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), wn6.f(cls, "collapsibleContainer", "getCollapsibleContainer()Landroid/view/ViewGroup;", 0, n7c), wn6.f(cls, "appbarLayout", "getAppbarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0, n7c), wn6.f(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n7c), wn6.f(cls, "buttonBackground", "getButtonBackground()Landroid/view/View;", 0, n7c), wn6.f(cls, "continueBtn", "getContinueBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "tabsShimmer", "getTabsShimmer()Lone/me/login/neuroavatars/NeuroAvatarsTabShimmerView;", 0, n7c), wn6.f(cls, "registrationData", "getRegistrationData()Lone/me/login/common/RegistrationData;", 0, n7c), wn6.f(cls, "presetAvatars", "getPresetAvatars()Lone/me/login/common/avatars/PresetAvatarsModel;", 0, n7c), wn6.f(cls, "contactId", "getContactId()Ljava/lang/Long;", 0, n7c)};
    }

    public NeuroAvatarsScreen(z7c z7c, y2b y2b) {
        this(jjd.j(new wia[]{new wia("registration_data_args", z7c), new wia("avatars_args", y2b)}));
    }

    public final void a(String str, RectF rectF, Rect rect) {
        ii9 ii9 = q0().b;
        ii9.getClass();
        xs7.E(ii9.f, (hu3) null, (ru3) null, new fi9(str, rect, ii9, rectF, 2, (Continuation) null), 3);
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.c;
    }

    public final void i(int i, Bundle bundle) {
        if (i == jpb.oneme_login_neuro_avatars_load_from_gallery_action) {
            cp7.c.P1().b(":media-picker/select/photo", (Bundle) null);
        } else if (i == jpb.oneme_login_neuro_avatars_take_photo_action) {
            q0().q();
        } else if (i == jpb.oneme_login_neuro_avatars_remove_photo_action) {
            rj9 q0 = q0();
            q0.c.a((hwc) null);
            q0.b.i.setValue((Object) null);
        }
    }

    public final fm l0() {
        return (fm) this.w0.T0(this, Q0[3]);
    }

    public final RecyclerView m0() {
        return (RecyclerView) this.y0.T0(this, Q0[5]);
    }

    public final z7c n0() {
        k77 k77 = Q0[9];
        return (z7c) this.H0.a(this);
    }

    public final mz9 o0() {
        return (mz9) this.Y.T0(this, Q0[1]);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        NeuroAvatarsScreen.super.onActivityResult(i, i2, intent);
        if (i != 555) {
            if (i == 666 && i2 == -1) {
                ii9 ii9 = q0().b;
                if (intent == null) {
                    ii9.getClass();
                    udd.s(ii9.class.getName(), "data from ActAvatarCrop is null", (Throwable) null);
                    ii9.b();
                    return;
                }
                xs7.E(ii9.f, (hu3) null, (ru3) null, new gi9(intent, ii9, (Continuation) null), 3);
            }
        } else if (i2 == -1) {
            rj9 q0 = q0();
            Uri data = intent != null ? intent.getData() : null;
            ii9 ii92 = q0.b;
            ii92.getClass();
            xs7.E(ii92.f, (hu3) null, (ru3) null, new ei9(ii92, data, (Continuation) null), 3);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(jpb.oneme_login_neuro_avatars_root_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        urd.B(new ql2(3, (Continuation) null, 4), frameLayout);
        ui9 ui9 = new ui9(this, 6);
        View coordinatorLayout = Build.VERSION.SDK_INT >= 30 ? new CoordinatorLayout(frameLayout.getContext(), (AttributeSet) null) : new CoordinatorLayout(frameLayout.getContext(), (AttributeSet) null);
        ui9.invoke(coordinatorLayout);
        frameLayout.addView(coordinatorLayout);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        wi9 wi9;
        m0().setAdapter((f6c) null);
        m0().s0(this.N0);
        p0().l(this.F0);
        ArrayList arrayList = l0().z0;
        if (arrayList != null && (wi9 = this.G0) != null) {
            arrayList.remove(wi9);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((qna) this.D0.getValue()).b(strArr)) {
            q0().q();
        }
    }

    public final void onViewCreated(View view) {
        t0c t0c = q0().y0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new ej9((Continuation) null, this), 5), getViewLifecycleScope());
        dcd dcd = q0().w0;
        if (dcd != null) {
            ez3.N(new ck5(wx3.e(dcd, getViewLifecycleOwner().R(), ob7), new fj9((Continuation) null, this), 5), getViewLifecycleScope());
        }
        ez3.N(new ck5(wx3.e(q0().Z, getViewLifecycleOwner().R(), ob7), new gj9((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(q0().A0, getViewLifecycleOwner().R(), ob7), new hj9((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(q0().b.h, getViewLifecycleOwner().R(), ob7), new dj9((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(q0().D0, getViewLifecycleOwner().R(), ob7), new cj9((Continuation) null, this), 5), getViewLifecycleScope());
        a24.a0((OneMeButton) this.A0.T0(this, Q0[7]), new ti9(this, 0));
        p0().a(this.F0);
        l0().a(am7.F(this.G0, l0(), getViewLifecycleOwner()));
        a24.a0(o0(), new ti9(this, 1));
        mr5 mr5 = this.M0;
        mr5.z(new nyd(this, 1, mr5));
    }

    public final hda p0() {
        return (hda) this.X.T0(this, Q0[0]);
    }

    public final rj9 q0() {
        return (rj9) this.K0.getValue();
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Object, lu7] */
    public NeuroAvatarsScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new Object();
        this.b = new sy6(3, (up0) null);
        this.c = new jj7(new vi9(this, 2), (s16) null, 6);
        ko7 ko7 = ko7.a;
        this.o = ko7.getAccessor().d(c70.class);
        this.X = viewBinding(jpb.oneme_login_neuro_avatars_tabs);
        this.Y = viewBinding(jpb.oneme_login_neuro_avatars_avatar);
        this.Z = viewBinding(jpb.oneme_login_neuro_avatars_collapsible);
        this.w0 = viewBinding(jpb.oneme_login_neuro_avatars_appbar);
        this.x0 = viewBinding(jpb.oneme_login_neuro_avatars_toolbar);
        this.y0 = viewBinding(jpb.oneme_login_neuro_avatars_recycler_view);
        this.z0 = viewBinding(jpb.oneme_login_neuro_avatars_button_background);
        this.A0 = viewBinding(jpb.oneme_login_neuro_avatars_continue_btn);
        this.B0 = viewBinding(jpb.oneme_login_neuro_avatars_tabs_shimmer);
        this.C0 = new p85();
        this.D0 = ko7.getAccessor().d(qna.class);
        this.E0 = ko7.getAccessor().d(xg9.class);
        this.F0 = new jt5(1, this);
        this.G0 = new wi9(this);
        this.H0 = new jr(z7c.class, "registration_data_args");
        this.I0 = new jr(y2b.class, "avatars_args");
        this.J0 = new jr(Long.class, "contact_id_args");
        this.K0 = createViewModelLazy(rj9.class, new js5(29, new vi9(this, 3)));
        ExecutorService a2 = ((x4a) ko7.getAccessor().c(x4a.class)).a();
        this.L0 = a2;
        mr5 mr5 = new mr5(a2, new bj9(q0()), 10);
        this.M0 = mr5;
        this.N0 = new ij9(mr5, new h87(1, q0(), rj9.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0, 9));
        this.O0 = new g02(14);
        this.P0 = new r7e(new vi9(this, 4));
        ez3.N(new ck5(q0().B0, new xi9((Continuation) null, this), 5), getLifecycleScope());
    }

    public NeuroAvatarsScreen(long j) {
        this(jjd.j(new wia[]{new wia("contact_id_args", Long.valueOf(j))}));
    }
}
