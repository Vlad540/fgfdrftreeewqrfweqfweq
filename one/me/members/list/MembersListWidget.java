package one.me.members.list;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/members/list/MembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lzi8;", "Lai8;", "Ltq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "Laj8;", "(Ljava/lang/String;Laj8;Lx54;)V", "members-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MembersListWidget extends Widget implements zi8, ai8, tq3 {
    public static final /* synthetic */ k77[] H0;
    public final i41 A0;
    public final i41 B0;
    public final t97 C0;
    public final t93 D0;
    public final n0c E0;
    public tw2 F0;
    public u24 G0;
    public final e3 X;
    public final t97 Y;
    public final jr Z;
    public final jr a;
    public final long b;
    public final ch2 c;
    public final Integer o;
    public final sy6 w0;
    public final cpf x0;
    public final mr5 y0;
    public final mr5 z0;

    static {
        Class<MembersListWidget> cls = MembersListWidget.class;
        H0 = new k77[]{new khb(cls, "membersListArgs", "getMembersListArgs()Lone/me/members/list/MembersListArgs;", 0), c3d.g(m7c.a, cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "selectedMemberIdForAction", "getSelectedMemberIdForAction()Ljava/lang/Long;"), new khb(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public MembersListWidget(String str, aj8 aj8, x54 x54) {
        this(jjd.j(new wia[]{new wia("arg_scope_id", new inc(str)), new wia("memberslist:args", aj8)}));
    }

    public final sy6 getInsetsConfig() {
        return this.w0;
    }

    public final aj8 l0() {
        k77 k77 = H0[0];
        return (aj8) this.a.a(this);
    }

    public final EndlessRecyclerView2 m0() {
        return (EndlessRecyclerView2) this.E0.T0(this, H0[3]);
    }

    public final lj8 n0() {
        return (lj8) this.Y.getValue();
    }

    public final uj8 o0() {
        return (uj8) this.C0.getValue();
    }

    public final void onAttach(View view) {
        ((ck8) o0().w0.getValue()).e();
        ez3.N(new ck5(n0().w0, new l5e(2, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(n0().Y, new zj8((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(n0().y0, new hp0(2, o0(), uj8.class, "searchMembers", "searchMembers(Ljava/lang/String;)V", 4, 19), 5), getViewLifecycleScope());
        bc bcVar = o0().C0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(bcVar, getViewLifecycleOwner().R(), ob7), new wj8((Continuation) null, this, view), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(n0().w0, getViewLifecycleOwner().R(), ob7), new xj8((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setId(s6a.c);
        endlessRecyclerView2.setItemAnimator((k6c) null);
        t93 t93 = this.D0;
        endlessRecyclerView2.setAdapter(t93);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setClipToPadding(false);
        gp0.l(endlessRecyclerView2);
        endlessRecyclerView2.setPager(new t61(this, 5));
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2.setThreshold(10);
        endlessRecyclerView2.setDelegate(new xp0(this.A0));
        if (t93.j() > 0) {
            endlessRecyclerView2.measure(View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        return endlessRecyclerView2;
    }

    public final void onDismiss() {
        k77[] k77Arr = H0;
        k77 k77 = k77Arr[2];
        this.Z.b(this, (Object) null);
        g37 g37 = (g37) this.X.T0(this, k77Arr[1]);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
    }

    public final void y(int i, Bundle bundle) {
        k77[] k77Arr = H0;
        k77 k77 = k77Arr[2];
        jr jrVar = this.Z;
        Long l = (Long) jrVar.a(this);
        if (l != null) {
            long longValue = l.longValue();
            lj8 n0 = n0();
            n0.getClass();
            taf.o(n0.X, new fj8(i, longValue));
        }
        k77 k772 = k77Arr[2];
        jrVar.b(this, (Object) null);
    }

    public MembersListWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(aj8.class, "memberslist:args");
        this.b = l0().a;
        this.c = l0().b;
        this.o = l0().o;
        this.X = hwf.t();
        Class<inc> cls = inc.class;
        Object E = ek8.E(bundle, "arg_scope_id", cls);
        if (E != null) {
            this.Y = m25getSharedViewModelcp94BC8(((inc) ((Parcelable) E)).a, lj8.class, (s16) null);
            this.Z = new jr(Long.class, (Object) null, "selected_member_id_for_action");
            this.w0 = sy6.c;
            ej8 ej8 = ej8.a;
            f6c cpf = new cpf((Object) this, ej8.b(), 9);
            this.x0 = cpf;
            f6c mr5 = new mr5(this, ej8.b(), 9);
            this.y0 = mr5;
            f6c mr52 = new mr5(this, ej8.b(), 9);
            this.z0 = mr52;
            f6c i41 = new i41(ej8.b(), 6);
            this.A0 = i41;
            f6c i412 = new i41(ej8.b(), 2);
            this.B0 = i412;
            this.C0 = createViewModelLazy(uj8.class, new js5(24, new vj8(this, 1)));
            this.D0 = new t93(new s93(false, 1), new f6c[]{mr5, cpf, mr52, i41, i412});
            this.E0 = viewBinding(s6a.c);
            return;
        }
        throw new IllegalArgumentException(wn6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
