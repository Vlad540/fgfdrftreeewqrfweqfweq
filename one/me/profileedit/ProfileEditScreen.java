package one.me.profileedit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profileedit/ProfileEditScreen;", "Lone/me/sdk/arch/Widget;", "Lu9b;", "Llc3;", "Lac0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Ld8b;", "type", "(JLd8b;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileEditScreen extends Widget implements u9b, lc3, ac0 {
    public static final /* synthetic */ k77[] C0;
    public final t97 A0;
    public final nl0 B0;
    public final cpf X;
    public final n0c Y;
    public final n0c Z;
    public final long a;
    public final jj7 b;
    public final sy6 c;
    public final t97 o;
    public final n0c w0;
    public final n0c x0;
    public final n0c y0;
    public final t97 z0;

    static {
        Class<ProfileEditScreen> cls = ProfileEditScreen.class;
        k77 khb = new khb(cls, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0);
        n7c n7c = m7c.a;
        C0 = new k77[]{khb, wn6.e(n7c, cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), wn6.f(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0, n7c), wn6.f(cls, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, n7c)};
    }

    public ProfileEditScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = bundle.getLong("profile:id");
        this.b = new jj7(new k9b(this, 0), (s16) null, 6);
        this.c = sy6.d;
        this.o = createViewModelLazy(hab.class, new wq9(15, new nya(this, 4, bundle)));
        z7b z7b = z7b.a;
        this.X = new cpf(((x4a) z7b.getAccessor().c(x4a.class)).a(), (Object) this, 11);
        this.Y = viewBinding(f8a.U);
        this.Z = viewBinding(f8a.r0);
        this.w0 = viewBinding(f8a.q0);
        this.x0 = viewBinding(f8a.b0);
        this.y0 = viewBinding(f8a.V);
        this.z0 = z7b.getAccessor().d(qna.class);
        this.A0 = z7b.getAccessor().d(xg9.class);
        ez3.N(new ck5(new ik5(m0().x0, 2), new n9b(this, (Continuation) null), 5), getLifecycleScope());
        ez3.N(wx3.e(new ck5(new ik5(m0().A0, 2), new o9b(this, (Continuation) null), 5), this.lifecycleOwner.R(), ob7.X), getLifecycleScope());
        ez3.N(new ck5(m0().B0, new p9b(this, (Continuation) null), 5), getLifecycleScope());
        this.B0 = binding(new k9b(this, 1));
    }

    public final void a(String str, RectF rectF, Rect rect) {
        hab m0 = m0();
        xs7.E(m0.a, m0.q().b(), (ru3) null, new cab(m0, str, rectF, (Continuation) null), 2);
    }

    public final sy6 getInsetsConfig() {
        return this.c;
    }

    public final rnc getScreenDelegate() {
        return this.b;
    }

    public final boolean handleBack() {
        bm3.p(this);
        hab m0 = m0();
        bs4 bs4 = m0.b;
        es4 es4 = (es4) bs4.i.getValue();
        Boolean bool = null;
        if (es4 != null && es4.a((es4) bs4.j.getValue())) {
            taf.o(m0.A0, new d9b(new hge(i8a.U), (mge) null, p23.B(new kc3[]{new kc3(f8a.d0, new hge(i8a.V), 3, false), new kc3(f8a.c0, new hge(i8a.T), 2, false)})));
            bool = Boolean.TRUE;
        }
        return bool != null ? bool.booleanValue() : ProfileEditScreen.super.handleBack();
    }

    public final void i(int i, Bundle bundle) {
        hab m0 = m0();
        m0.getClass();
        int i2 = f8a.d0;
        l05 l05 = m0.A0;
        if (i == i2) {
            taf.o(l05, a9b.b);
        } else if (i == f8a.c0) {
            taf.o(l05, v03.b);
        } else if (i == f8a.a0) {
            taf.o(l05, c9b.b);
        } else {
            int i3 = f8a.Y;
            bs4 bs4 = m0.b;
            if (i == i3) {
                s8b s8b = s8b.c;
                long e = bs4.e();
                s8b.getClass();
                rf0.j(":neuro-avatars?id=" + e, l05);
            } else if (i == f8a.Z) {
                m0.r();
            } else if (i == f8a.X) {
                bs4.j();
            } else if (i != f8a.e && i != f8a.g0 && i != f8a.W) {
                bs4.g(i);
            }
        }
    }

    public final nea l0() {
        return (nea) this.w0.T0(this, C0[2]);
    }

    public final hab m0() {
        return (hab) this.o.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ProfileEditScreen.super.onActivityResult(i, i2, intent);
        if (i != 333) {
            if (i != 666 || i2 != -1) {
                return;
            }
            if (intent == null) {
                udd.s(ProfileEditScreen.class.getName(), "data from ActAvatarCrop is null", (Throwable) null);
                m0().t();
                return;
            }
            hab m0 = m0();
            xs7.E(m0.a, m0.q().b(), (ru3) null, new dab(intent, m0, (Continuation) null), 2);
        } else if (i2 == -1) {
            hab m02 = m0();
            xs7.E(m02.a, m02.q().b(), (ru3) null, new aab(m02, intent != null ? intent.getData() : null, (Continuation) null), 2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l9b l9b = new l9b(this, 1);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(f8a.a);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        urd.B(new q9b(3, (Continuation) null, 0), coordinatorLayout);
        l9b.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((qna) this.z0.getValue()).b(strArr)) {
            m0().r();
        }
    }

    public final void onViewCreated(View view) {
        p85 p85 = new p85();
        k77[] k77Arr = C0;
        k77 k77 = k77Arr[0];
        n0c n0c = this.Y;
        ((fm) n0c.T0(this, k77)).a(am7.F(new db1(p85, this, 2), (fm) n0c.T0(this, k77Arr[0]), getViewLifecycleOwner()));
        ez3.N(new ck5(new ik5(m0().z0, 2), new r9b(this, view, (Continuation) null), 5), getViewLifecycleScope());
    }

    public ProfileEditScreen(long j, d8b d8b) {
        this(jjd.j(new wia[]{new wia("profile:id", Long.valueOf(j)), new wia("profile:type", d8b)}));
    }
}
