package one.me.startconversation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/StartConversationScreen;", "Lone/me/sdk/arch/Widget;", "Ldk3;", "Ly96;", "Lsn3;", "Ljo3;", "Lsv3;", "Lw07;", "<init>", "()V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class StartConversationScreen extends Widget implements dk3, y96, sn3, jo3, sv3, w07 {
    public static final /* synthetic */ k77[] L0;
    public final ExecutorService A0;
    public final cpf B0;
    public final mr5 C0;
    public final cpf D0;
    public final cpf E0;
    public final cpf F0;
    public final cpf G0;
    public final mr5 H0;
    public final t93 I0;
    public final jw4 J0;
    public final or3 K0;
    public final jr X;
    public final r7e Y;
    public final t97 Z;
    public final jj7 a = new jj7(new vfc(27), (s16) null, 6);
    public final sy6 b = sy6.d;
    public final jr c;
    public final jr o;
    public final t97 w0;
    public final n0c x0;
    public final n0c y0;
    public final t97 z0;

    static {
        Class<StartConversationScreen> cls = StartConversationScreen.class;
        L0 = new k77[]{new hc9(cls, "isNeedScrollToTop", "isNeedScrollToTop()Z"), c3d.g(m7c.a, cls, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;"), new hc9(cls, "isInSearch", "isInSearch()Z"), new khb(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartConversationScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls = Boolean.class;
        this.c = new jr(cls, bool, "start_conversations_widget_is_need_scroll_to_top");
        this.o = new jr(CharSequence.class, (Object) null, "start_conversations_widget_search_query");
        jr jrVar = new jr(cls, bool, "contact_list_widget_is_in_search");
        this.X = jrVar;
        this.Y = new r7e(new vfc(29));
        this.Z = createViewModelLazy(dqd.class, new ypd(0, new opd(0)));
        this.w0 = createViewModelLazy(xf0.class, new ypd(1, new opd(1)));
        this.x0 = viewBinding(kca.o);
        this.y0 = viewBinding(kca.q);
        this.z0 = rna.a.b();
        ExecutorService a2 = ((x4a) ipd.a.getAccessor().c(x4a.class)).a();
        this.A0 = a2;
        f6c cpf = new cpf((Object) this, a2, 5);
        this.B0 = cpf;
        f6c mr5 = new mr5(this, a2, 3);
        this.C0 = mr5;
        f6c cpf2 = new cpf((Object) this, a2, 4);
        this.D0 = cpf2;
        f6c cpf3 = new cpf((Object) this, a2, 7);
        this.E0 = cpf3;
        f6c cpf4 = new cpf((Object) this, a2, 4);
        this.F0 = cpf4;
        f6c cpf5 = new cpf((Object) this, a2, 8);
        this.G0 = cpf5;
        f6c mr52 = new mr5(this, a2, 5);
        this.H0 = mr52;
        this.I0 = new t93(new s93(false, 1), new f6c[]{cpf, cpf5, mr5, cpf2, cpf3, cpf4, mr52});
        this.J0 = new jw4(7, new u5b(23, this));
        k77 k77 = L0[2];
        this.K0 = new or3(this, ((Boolean) jrVar.a(this)).booleanValue());
        ez3.N(new ck5(m0().x0.i, new rpd(this, (Continuation) null), 5), getLifecycleScope());
        ez3.N(new ck5(m0().z0, new spd(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final void A(s07 s07) {
        int ordinal = s07.ordinal();
        if (ordinal == 0) {
            mpd.c.P1().b(":invite/phone", (Bundle) null);
        } else if (ordinal == 1) {
            mpd.c.P1().b(":invite/qr", (Bundle) null);
        } else if (ordinal == 2) {
            ((ak3) this.Y.getValue()).a(getContext());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void J(z96 z96) {
        bm3.p(this);
        xs7.E(getViewLifecycleScope(), (hu3) null, (ru3) null, new vpd(this, z96, (Continuation) null), 3);
    }

    public final void P() {
        t();
    }

    public final void e(long j) {
        ((ak3) this.Y.getValue()).a(getContext());
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final CharSequence l0() {
        k77 k77 = L0[1];
        return (CharSequence) this.o.a(this);
    }

    public final dqd m0() {
        return (dqd) this.Z.getValue();
    }

    public final void onContextAvailable(Context context) {
        StartConversationScreen.super.onContextAvailable(context);
        ex9 onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(this.lifecycleOwner, this.K0);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(kca.m);
        nea nea = new nea(constraintLayout.getContext(), 6);
        nea.setId(kca.q);
        nea.setForm(fea.a);
        nea.setTitle(lca.f);
        nea.setLeftActions(new vda(new ppd(this, 0)));
        nea.setRightActions(new aea((jea) null, new iea(new upd(this))));
        raa searchView = nea.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(d8.u(nea.getContext(), lca.y));
            k77 k77 = L0[2];
            if (((Boolean) this.X.a(this)).booleanValue()) {
                searchView.setExpandWithAnimation(false);
                searchView.d();
                searchView.setExpandWithAnimation(true);
                searchView.setSearchText(l0());
            }
        }
        re3 re3 = new re3(-1, -2);
        re3.i = 0;
        re3.e = 0;
        re3.h = 0;
        constraintLayout.addView(nea, re3);
        RecyclerView recyclerView = new RecyclerView(constraintLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(kca.o);
        recyclerView.setItemAnimator((k6c) null);
        t93 t93 = this.I0;
        recyclerView.setAdapter(t93);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setClipToPadding(false);
        recyclerView.addOnAttachStateChangeListener(new q40(10, (Object) recyclerView));
        hj2 hj2 = new hj2(4, new ppd(this, 1));
        ryd ryd = new ryd(recyclerView, t93, hj2);
        recyclerView.j(ryd);
        s59 s59 = km4.y0;
        recyclerView.j(new hk3(hj2, s59.r(recyclerView), new qpd(this, 0)));
        recyclerView.j(new iq(5));
        recyclerView.j(new ryd(recyclerView, t93, new hj2(3, new npd(this, recyclerView, 1))));
        recyclerView.j(new es5(s59.r(recyclerView), new qpd(this, 1)));
        recyclerView.j(new ryd(recyclerView, t93, new hj2(2, new npd(this, recyclerView, 0))));
        urd.B(new rb(ryd, (Continuation) null, 4), recyclerView);
        re3 re32 = new re3(-1, 0);
        re32.j = nea.getId();
        re32.e = 0;
        re32.h = 0;
        re32.l = 0;
        constraintLayout.addView(recyclerView, re32);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        this.I0.B(this.J0);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            jrf jrf = new jrf(this, 1);
            String[] strArr2 = qna.e;
            int i2 = cic.O1;
            int i3 = cic.U1;
            ((qna) this.z0.getValue()).getClass();
            qna.k(jrf, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ez3.N(new ck5(m0().A0, new wpd(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new v11(m0().w0, ((xf0) this.w0.getValue()).w0, new f5c(this, (Continuation) null, 5), 4), getViewLifecycleScope());
        this.I0.z(this.J0);
    }

    public final void t() {
        ((qna) this.z0.getValue()).f(new jrf(this, 1), qna.e, 156);
    }

    public final void v(long j) {
        dqd m0 = m0();
        taf.n(m0, ((pae) m0.o.getValue()).a(), (ru3) null, new cqd(m0, j, (Continuation) null), 2);
        bm3.q(requireActivity());
    }

    public final void w(int i) {
        if (tpd.$EnumSwitchMapping$0[hr1.t(i)] != 1) {
            t();
        } else if (Build.VERSION.SDK_INT >= 33) {
            ((qna) this.z0.getValue()).f(new jrf(this, 1), qna.k, 177);
        }
    }
}
