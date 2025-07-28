package one.me.profile.screens.invite;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/invite/ProfileInviteScreen;", "Lone/me/sdk/arch/Widget;", "Lgbb;", "Llc3;", "Ljbd;", "Ltq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileInviteScreen extends Widget implements gbb, lc3, jbd, tq3 {
    public static final /* synthetic */ k77[] Y;
    public final n0c X;
    public final jj7 a;
    public final sy6 b;
    public final t97 c;
    public final hbb o;

    static {
        k77 khb = new khb(ProfileInviteScreen.class, "moreActionsButton", "getMoreActionsButton()Landroid/widget/ImageView;", 0);
        m7c.a.getClass();
        Y = new k77[]{khb};
    }

    public ProfileInviteScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jj7(new k6b(10), (s16) null, 6);
        this.b = sy6.d;
        this.c = createViewModelLazy(ubb.class, new wq9(16, new fe2(bundle, 5)));
        hbb hbb = new hbb(((x4a) i6b.a.getAccessor().c(x4a.class)).a(), this);
        this.o = hbb;
        this.X = viewBinding(j8a.J);
        t0c t0c = l0().E0;
        pc7 R = this.lifecycleOwner.R();
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, R, ob7), new hp0(2, hbb, hbb.class, "submitList", "submitList(Ljava/util/List;)V", 4, 29), 5), getLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().G0, this.lifecycleOwner.R(), ob7), new dbb(this, (Continuation) null), 5), getLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().F0, this.lifecycleOwner.R(), ob7), new ebb(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final void i(int i, Bundle bundle) {
        ubb l0 = l0();
        l0.getClass();
        if (i == j8a.N) {
            kdb kdb = kdb.c;
            y76 y76 = r6b.b;
            kdb.getClass();
            taf.o(l0.F0, new a34(wn6.k(new StringBuilder(":profile?id="), l0.b, "&type=local_chat")));
            l0.C0.set(false);
        } else if (i == j8a.G) {
            qod E = xs7.E(l0.a, ((pae) l0.o.getValue()).b(), (ru3) null, new nbb(l0, (Continuation) null), 2);
            l0.z0.o1(l0, ubb.H0[0], E);
        }
    }

    public final ubb l0() {
        return (ubb) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        e98 e98 = new e98(24, this);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        urd.B(new jc1(3, (Continuation) null, 2), linearLayout);
        e98.invoke(linearLayout);
        return linearLayout;
    }

    public final void y(int i, Bundle bundle) {
        ubb l0 = l0();
        l0.getClass();
        if (i == j8a.K) {
            taf.o(l0.G0, new xab(new hge(l8a.Y0), new hge(l8a.X0), p23.B(new kc3[]{new kc3(j8a.G, new hge(l8a.U0), 3, false), new kc3(j8a.y, new hge(l8a.V0), 2, false)})));
        }
    }

    public ProfileInviteScreen(long j) {
        this(jjd.j(new wia[]{new wia(ApiProtocol.KEY_ID, Long.valueOf(j))}));
    }
}
