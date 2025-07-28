package one.me.chats.search;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/chats/search/ChatsListSearchScreen;", "Lone/me/sdk/arch/Widget;", "Ltq3;", "Lpz2;", "Llc3;", "Lyqc;", "Lsn3;", "Lgy5;", "<init>", "()V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
public final class ChatsListSearchScreen extends Widget implements tq3, pz2, lc3, yqc, sn3, gy5 {
    public static final /* synthetic */ k77[] N0;
    public final cpf A0;
    public final tn3 B0;
    public final cpf C0;
    public final jw4 D0;
    public final tn3 E0;
    public final i41 F0;
    public final i41 G0;
    public final mr5 H0;
    public final i41 I0;
    public final t93 J0;
    public final n0c K0;
    public final e3 L0;
    public gba M0;
    public final jr X = new jr(Boolean.class, Boolean.TRUE, "should.restore.focus");
    public final n0c Y = viewBinding(xob.chats_list_search_toolbar);
    public final t97 Z = createViewModelLazy(bt2.class, new rh2(14, new hk2(7)));
    public final jj7 a;
    public final t97 b;
    public final sy6 c = sy6.d;
    public final jr o = new jr(Long.class, (Object) null, "selected.chatId.Action");
    public final t97 w0 = createViewModelLazy(xf0.class, new rh2(15, new hk2(8)));
    public final ExecutorService x0;
    public final t97 y0;
    public final tn3 z0;

    static {
        Class<ChatsListSearchScreen> cls = ChatsListSearchScreen.class;
        N0 = new k77[]{new hc9(cls, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;"), c3d.g(m7c.a, cls, "shouldRestoreFocus", "getShouldRestoreFocus()Z"), new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new khb(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new hc9(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;")};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: f6c[]} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChatsListSearchScreen() {
        /*
            r19 = this;
            r8 = r19
            r9 = 8
            r10 = 7
            r11 = 6
            r14 = 0
            r15 = 0
            r7 = 3
            r8.<init>(r14, r15, r7, r14)
            jj7 r6 = new jj7
            vz0 r5 = new vz0
            java.lang.Class<one.me.chats.search.ChatsListSearchScreen> r3 = one.me.chats.search.ChatsListSearchScreen.class
            java.lang.String r4 = "getCurrentScreen"
            r1 = 0
            java.lang.String r16 = "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;"
            r17 = 0
            r18 = 9
            r0 = r5
            r2 = r19
            r15 = r5
            r5 = r16
            r13 = r6
            r6 = r17
            r12 = r7
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r13.<init>((defpackage.s16) r15, (defpackage.s16) r14, (int) r11)
            r8.a = r13
            tp2 r0 = defpackage.tp2.a
            w4 r1 = r0.getAccessor()
            java.lang.Class<xg9> r2 = xg9.class
            r7e r1 = r1.d(r2)
            r8.b = r1
            sy6 r1 = sy6.d
            r8.c = r1
            jr r1 = new jr
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.String r3 = "selected.chatId.Action"
            r1.<init>(r2, r14, r3)
            r8.o = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            jr r2 = new jr
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            java.lang.String r4 = "should.restore.focus"
            r2.<init>(r3, r1, r4)
            r8.X = r2
            int r1 = defpackage.xob.chats_list_search_toolbar
            n0c r1 = r8.viewBinding(r1)
            r8.Y = r1
            hk2 r1 = new hk2
            r1.<init>(r10)
            rh2 r2 = new rh2
            r3 = 14
            r2.<init>(r3, r1)
            java.lang.Class<bt2> r1 = defpackage.bt2.class
            t97 r1 = r8.createViewModelLazy(r1, r2)
            r8.Z = r1
            hk2 r1 = new hk2
            r1.<init>(r9)
            rh2 r2 = new rh2
            r3 = 15
            r2.<init>(r3, r1)
            java.lang.Class<xf0> r1 = defpackage.xf0.class
            t97 r1 = r8.createViewModelLazy(r1, r2)
            r8.w0 = r1
            x4a r1 = r0.c()
            java.util.concurrent.ExecutorService r1 = r1.a()
            r8.x0 = r1
            w4 r0 = r0.getAccessor()
            java.lang.Class<qna> r2 = qna.class
            r7e r0 = r0.d(r2)
            r8.y0 = r0
            tn3 r0 = new tn3
            ur2 r2 = new ur2
            r2.<init>(r8)
            r0.<init>((defpackage.ur2) r2, (java.util.concurrent.ExecutorService) r1)
            r8.z0 = r0
            cpf r2 = new cpf
            es2 r3 = new es2
            r3.<init>(r8)
            r4 = 12
            r2.<init>(r3, r1, r4)
            r8.A0 = r2
            tn3 r3 = new tn3
            r3.<init>((defpackage.yqc) r8, (java.util.concurrent.ExecutorService) r1)
            r8.B0 = r3
            cpf r4 = new cpf
            mb1 r5 = new mb1
            r5.<init>(r12, r8)
            r6 = 4
            r4.<init>(r5, r1, r6)
            r8.C0 = r4
            jw4 r5 = new jw4
            r7 = 1
            r5.<init>(r7, r8)
            r8.D0 = r5
            tn3 r5 = new tn3
            r5.<init>((defpackage.yqc) r8, (java.util.concurrent.ExecutorService) r1)
            r8.E0 = r5
            i41 r7 = new i41
            r7.<init>(r1, r6)
            r8.F0 = r7
            i41 r6 = new i41
            r6.<init>(r1, r12)
            r8.G0 = r6
            mr5 r13 = new mr5
            r13.<init>((java.lang.Object) r8, (java.util.concurrent.ExecutorService) r1, (int) r12)
            r8.H0 = r13
            i41 r14 = new i41
            r15 = 1
            r14.<init>(r1, r15)
            r8.I0 = r14
            t93 r1 = new t93
            s93 r9 = new s93
            r10 = 0
            r9.<init>((boolean) r10, (int) r15)
            r11 = 9
            f6c[] r11 = new defpackage.f6c[r11]
            r11[r10] = r0
            r11[r15] = r13
            r0 = 2
            r11[r0] = r2
            r11[r12] = r3
            r0 = 4
            r11[r0] = r4
            r0 = 5
            r11[r0] = r5
            r0 = 6
            r11[r0] = r14
            r0 = 7
            r11[r0] = r7
            r0 = 8
            r11[r0] = r6
            r1.<init>(r9, r11)
            r8.J0 = r1
            int r0 = defpackage.f2a.g
            n0c r0 = r8.viewBinding(r0)
            r8.K0 = r0
            e3 r0 = defpackage.hwf.t()
            r8.L0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.search.ChatsListSearchScreen.<init>():void");
    }

    public final void Q(int i, int i2, Intent intent) {
        if (i == 101 && i2 == -1) {
            k77 k77 = N0[1];
            this.X.b(this, Boolean.FALSE);
        }
    }

    public final sy6 getInsetsConfig() {
        return this.c;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final void i(int i, Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("selected.chatId.Action");
            bt2 m0 = m0();
            taf.n(m0, m0.Z.a(), (ru3) null, new us2(i, m0, j, (Continuation) null), 2);
        }
    }

    public final void l0() {
        this.z0.E((List) null);
        hw4 hw4 = hw4.a;
        this.A0.E(hw4);
        this.B0.E(hw4);
        this.C0.E(hw4);
    }

    public final bt2 m0() {
        return (bt2) this.Z.getValue();
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [rr3, one.me.sdk.arch.Widget, one.me.chats.search.ChatsListSearchScreen] */
    public final void n0(nrc nrc) {
        nrc nrc2 = nrc;
        bm3.p(this);
        int t = hr1.t(nrc2.a);
        if (t == 0) {
            bt2 m0 = m0();
            taf.n(m0, m0.Z.b(), (ru3) null, new at2(m0, nrc.getItemId(), (Continuation) null), 2);
            zu2.b2(zu2.c, nrc.getItemId(), "local", (Long) null, (Long) null, (List) null, (String) null, 124);
        } else if (t == 1) {
            zu2.b2(zu2.c, nrc.getItemId(), "server", (Long) null, (Long) null, (List) null, (String) null, 124);
        } else if (t == 2) {
            bt2 m02 = m0();
            xs7.E(m02.a, m02.Z.a(), (ru3) null, new xs2(m02, nrc.getItemId(), (Continuation) null), 2);
        } else if (t == 3) {
            bt2 m03 = m0();
            xs7.E(m03.a, m03.Z.a(), (ru3) null, new zs2(m03, (ba6) nrc2, (Continuation) null), 2);
        } else if (t == 4) {
            cs8 cs8 = (cs8) nrc2;
            if (cs8.Y != null) {
                xs7.E(getViewLifecycleScope(), (hu3) null, (ru3) null, new xr2(this, cs8, (Continuation) null), 3);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [rr3, one.me.sdk.arch.Widget, java.lang.Object, one.me.chats.search.ChatsListSearchScreen] */
    public final void o0(nrc nrc, View view) {
        if (nrc instanceof rn2) {
            bm3.p(this);
            qod E = xs7.E(getViewLifecycleScope(), (hu3) null, ru3.b, new fs2(this, ((rn2) nrc).L0, view, (Continuation) null), 1);
            this.L0.o1(this, N0[4], E);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rr3, one.me.sdk.arch.Widget, java.lang.Object, one.me.chats.search.ChatsListSearchScreen] */
    public final void onChangeEnded(wr3 wr3, xr3 xr3) {
        ChatsListSearchScreen.super.onChangeEnded(wr3, xr3);
        if (xr3 == xr3.POP_ENTER) {
            bt2 m0 = m0();
            m0.o.h = m0;
        }
        k77[] k77Arr = N0;
        k77 k77 = k77Arr[1];
        jr jrVar = this.X;
        boolean booleanValue = ((Boolean) jrVar.a(this)).booleanValue();
        k77 k772 = k77Arr[1];
        jrVar.b(this, Boolean.TRUE);
        if (xr3.b && booleanValue) {
            raa searchView = ((nea) this.Y.T0(this, k77Arr[2])).getSearchView();
            if (searchView != null) {
                bm3.H((View) searchView.G0.getValue());
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(f2a.h);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        urd.B(new o(3, (Continuation) null, 2), linearLayout);
        nea nea = new nea(getContext(), 6);
        nea.setId(f2a.i);
        nea.setTransitionName(nea.getContext().getString(h2a.q));
        nea.setForm(fea.b);
        nea.setRightActions(new aea(new iea(new nu7(this, nea)), new gea(l9a.j, new hd1(24))));
        nea.setTitle(h2a.p);
        raa searchView = nea.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(searchView.getResources().getString(h2a.y));
            searchView.setCollapsible(false);
            searchView.setSearchText(((js2) m0().J0.a.getValue()).b);
            if (bundle != null) {
                searchView.setExpandWithAnimation(false);
                searchView.c(false);
            }
        }
        linearLayout.addView(nea);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(f2a.g);
        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView2.setItemAnimator((k6c) null);
        t93 t93 = this.J0;
        endlessRecyclerView2.setAdapter(t93);
        endlessRecyclerView2.setHasFixedSize(true);
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2.setPager(new t61(this, 1));
        endlessRecyclerView2.setDelegate(this.I0);
        ryd ryd = new ryd(endlessRecyclerView2, t93, new hj2(1, new ka(this, 6, endlessRecyclerView2)));
        endlessRecyclerView2.j(ryd);
        urd.B(new jj2(ryd, (Continuation) null, 1), endlessRecyclerView2);
        linearLayout.addView(endlessRecyclerView2);
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.chats.search.ChatsListSearchScreen] */
    public final void onDestroyView(View view) {
        this.M0 = null;
        this.E0.B(this.D0);
        ChatsListSearchScreen.super.onDestroyView(view);
    }

    public final void onDismiss() {
        k77[] k77Arr = N0;
        k77 k77 = k77Arr[0];
        this.o.b(this, (Object) null);
        g37 g37 = (g37) this.L0.T0(this, k77Arr[4]);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            jrf jrf = new jrf(this, 1);
            String[] strArr2 = qna.e;
            int i2 = cic.O1;
            int i3 = cic.U1;
            ((qna) this.y0.getValue()).getClass();
            qna.k(jrf, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        this.E0.z(this.D0);
        t0c t0c = m0().J0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new yr2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new v11(((xf0) this.w0.getValue()).w0, m0().J0, new z8(3, 4, ChatsListSearchScreen.class, this, "combineSearchAndBanners", "combineSearchAndBanners(Ljava/util/List;Lone/me/chats/search/ChatsListSearchState;)Ljava/util/List;"), 4), getViewLifecycleOwner().R(), ob7), new zr2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(m0().L0, getViewLifecycleOwner().R(), ob7), new cs2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(new zi1(wx3.e(m0().M0, getViewLifecycleOwner().R(), ob7), 16), new ds2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, java.lang.Object, one.me.chats.search.ChatsListSearchScreen] */
    public final void p0() {
        if (getView() != null) {
            ((EndlessRecyclerView2) this.K0.T0(this, N0[3])).x0(0);
        }
    }

    public final void w(int i) {
        ((qna) this.y0.getValue()).f(new jrf(this, 1), qna.e, 156);
    }

    public final void y(int i, Bundle bundle) {
        k77[] k77Arr = N0;
        k77 k77 = k77Arr[0];
        jr jrVar = this.o;
        Long l = (Long) jrVar.a(this);
        if (l != null) {
            long longValue = l.longValue();
            k77 k772 = k77Arr[0];
            jrVar.b(this, (Object) null);
            bt2 m0 = m0();
            taf.n(m0, m0.Z.a(), (ru3) null, new us2(i, m0, longValue, (Continuation) null), 2);
        }
    }
}
