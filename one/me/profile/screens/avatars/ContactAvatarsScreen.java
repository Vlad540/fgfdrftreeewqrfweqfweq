package one.me.profile.screens.avatars;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.ok.tamtam.ExceptionHandler$HandledException;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/profile/screens/avatars/ContactAvatarsScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Ldg3;", "Ltq3;", "Lhoc;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ContactAvatarsScreen extends SwipeWidget implements dg3, tq3, hoc {
    public static final /* synthetic */ k77[] D0;
    public final eg3 A0;
    public final t97 B0;
    public final t97 C0;
    public final qda X;
    public final sy6 Y;
    public final jj7 Z;
    public final t97 o;
    public final t97 w0;
    public final n0c x0;
    public final n0c y0;
    public final n0c z0;

    static {
        Class<ContactAvatarsScreen> cls = ContactAvatarsScreen.class;
        k77 khb = new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        n7c n7c = m7c.a;
        D0 = new k77[]{khb, wn6.e(n7c, cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), wn6.f(cls, "progressIndication", "getProgressIndication()Landroid/view/View;", 0, n7c)};
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [eg3, lx3] */
    public ContactAvatarsScreen(Bundle bundle) {
        super(bundle);
        this.o = i6b.a.g();
        this.X = qda.a;
        this.Y = sy6.c;
        this.Z = new jj7(mnc.AVATAR_VIEWER);
        this.w0 = createViewModelLazy(bh3.class, new rh2(23, new fe2(bundle, 1)));
        this.x0 = viewBinding(spb.profile_contact_avatars_toolbar);
        this.y0 = viewBinding(spb.profile_contact_avatars_viewpager);
        this.z0 = viewBinding(spb.profile_contact_avatars_progress_indicator);
        ? lx3 = new lx3(this, 0);
        lx3.A0 = hw4.a;
        this.A0 = lx3;
        this.B0 = ez3.O(3, new fg3(this, 0));
        this.C0 = ez3.O(3, new fg3(this, 1));
    }

    public static final void t0(ContactAvatarsScreen contactAvatarsScreen, int i) {
        int size = contactAvatarsScreen.A0.A0.size();
        if (i < 0 || size <= 0) {
            contactAvatarsScreen.y0().setTitle((CharSequence) "");
            return;
        }
        nea y02 = contactAvatarsScreen.y0();
        y02.setTitle((CharSequence) (i + 1) + " " + ((String) contactAvatarsScreen.C0.getValue()) + " " + size);
    }

    public final boolean O() {
        return true;
    }

    public final boolean R() {
        return ((kb5) ((jb5) this.o.getValue())).t();
    }

    public final sy6 getInsetsConfig() {
        return this.Y;
    }

    public final rnc getScreenDelegate() {
        return this.Z;
    }

    public final boolean m0() {
        return false;
    }

    public final void n0() {
        View view = getView();
        if (view != null) {
            this.X.getClass();
            view.setBackgroundColor(-15263716);
        }
        v0(true);
        w0(true);
    }

    public final void o0() {
        View view = getView();
        if (view != null) {
            this.X.getClass();
            view.setBackgroundColor(0);
        }
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [a9a, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qda qda = qda.a;
        qda qda2 = this.X;
        boolean z = !(qda2 == qda);
        t97 t97 = this.B0;
        ((qsf) t97.getValue()).b(z);
        ((qsf) t97.getValue()).a(z);
        ((qsf) t97.getValue()).a.J();
        v6e v6e = new v6e(getContext());
        v6e.setId(-1);
        v6e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        qda2.getClass();
        v6e.setBackgroundColor(-15263716);
        int i = spb.profile_contact_avatars_viewpager;
        ViewPager2 viewPager2 = new ViewPager2(v6e.getContext());
        viewPager2.setId(i);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setLayoutDirection(0);
        viewPager2.setOffscreenPageLimit(1);
        v6e.addView(viewPager2);
        int i2 = spb.profile_contact_avatars_toolbar;
        nea nea = new nea(v6e.getContext(), 6);
        nea.setId(i2);
        nea.setCustomTheme(qda2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        nea.setLayoutParams(layoutParams);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new gw2(1, this)));
        nea.setRightActions(new cea(new f(1, this, ContactAvatarsScreen.class, "showContextActionsMenu", "showContextActionsMenu(Landroid/view/View;)V", 0, 15)));
        ek8.h(nea);
        v6e.addView(nea);
        int i3 = spb.profile_contact_avatars_progress_indicator;
        FrameLayout frameLayout = new FrameLayout(v6e.getContext());
        frameLayout.setId(i3);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        qda2.getClass();
        frameLayout.setBackgroundColor(1376587021);
        ? a9a = new a9a(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        a9a.setLayoutParams(layoutParams2);
        a9a.setAppearance(s8a.a);
        a9a.setSize(u8a.a);
        frameLayout.addView(a9a);
        frameLayout.setOnClickListener(new b20(4));
        frameLayout.setVisibility(8);
        v6e.addView(frameLayout);
        return v6e;
    }

    public final void onDestroy() {
        ContactAvatarsScreen.super.onDestroy();
        v0(true);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        z0().setAdapter(this.A0);
        z0().b(new hg0(6, this));
        t97 t97 = this.w0;
        t0c t0c = ((bh3) t97.getValue()).z0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new hg3((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((bh3) t97.getValue()).A0, getViewLifecycleOwner().R(), ob7), new ig3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p0() {
        if (getView() != null) {
            y0().setVisibility(8);
            y0().setAlpha(0.0f);
            v0(true);
        }
    }

    public final Long r0() {
        return 1000L;
    }

    public final Integer s0() {
        this.X.getClass();
        return -15263716;
    }

    public final void u0(boolean z) {
        float f = z ? 1.0f : 0.0f;
        if (x0().getAlpha() != f) {
            ViewPropertyAnimator animate = x0().animate();
            animate.cancel();
            animate.alpha(f).setDuration(200).setListener(new gg3(this, z, 0)).start();
        }
    }

    public final void v0(boolean z) {
        t97 t97 = this.B0;
        if (z) {
            ((qsf) t97.getValue()).a.K(3);
        } else {
            ((qsf) t97.getValue()).a.r(3);
        }
    }

    public final void w0(boolean z) {
        if ((y0().getVisibility() == 0) != z) {
            float f = z ? 1.0f : 0.0f;
            ViewPropertyAnimator animate = y0().animate();
            animate.cancel();
            animate.alpha(f).setDuration(200).setListener(new gg3(this, z, 1)).start();
        }
    }

    public final View x0() {
        return (View) this.z0.T0(this, D0[2]);
    }

    public final void y(int i, Bundle bundle) {
        bh3 bh3 = (bh3) this.w0.getValue();
        int currentItem = z0().getCurrentItem();
        bg3 bg3 = (bg3) o23.Y(currentItem, (List) bh3.z0.a.getValue());
        if (bg3 != null) {
            try {
                String str = (String) o23.V(bg3.b);
                t97 t97 = bh3.w0;
                if (i == 1) {
                    taf.n(bh3, ((pae) t97.getValue()).b(), (ru3) null, new wg3(bh3, str, (Continuation) null), 2);
                } else if (i == 2) {
                    taf.n(bh3, ((pae) t97.getValue()).b(), (ru3) null, new yg3(bh3, str, (Continuation) null), 2);
                } else if (i == 3) {
                    taf.n(bh3, ((pae) t97.getValue()).b(), (ru3) null, new xg3(bh3, currentItem, str, bg3, (Continuation) null), 2);
                } else if (i == 4) {
                    taf.n(bh3, ((pae) t97.getValue()).b(), (ru3) null, new vg3(bh3, bg3, currentItem, (Continuation) null), 2);
                }
            } catch (NoSuchElementException e) {
                ((r4a) ((g15) bh3.Z.getValue())).c(new ExceptionHandler$HandledException("model.urls.isNotEmpty() == false", e, 4, (String) null), false);
            }
        }
    }

    public final nea y0() {
        return (nea) this.x0.T0(this, D0[0]);
    }

    public final ViewPager2 z0() {
        return (ViewPager2) this.y0.T0(this, D0[1]);
    }

    public ContactAvatarsScreen(long j) {
        this(jjd.j(new wia[]{new wia("EXTRA_CONTACT_ID", Long.valueOf(j))}));
    }
}
