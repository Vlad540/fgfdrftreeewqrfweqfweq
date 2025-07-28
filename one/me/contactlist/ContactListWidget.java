package one.me.contactlist;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0013\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/contactlist/ContactListWidget;", "Lone/me/sdk/arch/Widget;", "Lrg9;", "Ldk3;", "Ly96;", "Lsn3;", "Ljo3;", "Ltq3;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lql3;", "type", "(Lql3;)V", "contact-list_release"}, k = 1, mv = {2, 0, 0})
public final class ContactListWidget extends Widget implements rg9, dk3, y96, sn3, jo3, tq3, lc3 {
    public static final /* synthetic */ k77[] S0;
    public final nl0 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final nl0 E0;
    public final n0c F0;
    public final t97 G0;
    public final List H0;
    public final t97 I0;
    public final t97 J0;
    public final r7e K0;
    public final e3 L0;
    public final jr M0;
    public final jr N0;
    public final jr O0;
    public final jr P0;
    public final jr Q0;
    public final jj7 R0;
    public final cpf X;
    public final cpf Y;
    public final cpf Z;
    public final sy6 a;
    public final t97 b;
    public final t97 c;
    public final ExecutorService o;
    public final mr5 w0;
    public final mr5 x0;
    public final t93 y0;
    public final t97 z0;

    static {
        Class<ContactListWidget> cls = ContactListWidget.class;
        S0 = new k77[]{new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), m4b.g(m7c.a, cls, "snackBar", "getSnackBar()Lone/me/sdk/snackbar/OneMeSnackbar;", 0), new khb(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new hc9(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;"), new hc9(cls, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;"), new hc9(cls, "isInSearch", "isInSearch()Z"), new hc9(cls, "isNeedScrollToTop", "isNeedScrollToTop()Z"), new hc9(cls, "isPermissionChecked", "isPermissionChecked()Z")};
    }

    public ContactListWidget() {
        this((Bundle) null, 1, (x54) null);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rr3, one.me.sdk.arch.Widget, one.me.contactlist.ContactListWidget] */
    public final void J(z96 z96) {
        bm3.p(this);
        xs7.E(getViewLifecycleScope(), (hu3) null, (ru3) null, new tl3(this, z96, (Continuation) null), 3);
    }

    public final void L(z96 z96, boolean z) {
        ((iq1) this.c.getValue()).e(gq1.Y, z);
        xs7.E(getViewLifecycleScope(), (hu3) null, (ru3) null, new sl3(this, z96, z, (Continuation) null), 3);
    }

    public final void M() {
        k77 k77 = S0[1];
        hba hba = (hba) this.E0.getValue();
        hba.i(getContext().getString(q2a.s));
        hba.j();
    }

    public final void P() {
        q0();
    }

    public final void e(long j) {
        Object obj;
        List list = ((bk3) o0().B0.a.getValue()).c;
        boa boa = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((lk3) obj).a == j) {
                    break;
                }
            }
            lk3 lk3 = (lk3) obj;
            if (lk3 != null) {
                boa = lk3.A0;
            }
        }
        if (boa != null) {
            ((ak3) this.K0.getValue()).a(requireActivity());
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.contactlist.ContactListWidget] */
    public final void g(long j, boolean z) {
        ((iq1) this.c.getValue()).e(gq1.Y, z);
        bm3.p(this);
        ((we1) this.G0.getValue()).l(j, z, new nl3(j, z));
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final rnc getScreenDelegate() {
        return this.R0;
    }

    public final void i(int i, Bundle bundle) {
        if (!((we1) this.G0.getValue()).g(i) && bundle != null) {
            o0().q(i, bundle.getLong("selected.contactId.Action"));
        }
    }

    public final void k(long j, View view) {
        int ordinal = o0().b.ordinal();
        if (ordinal == 0) {
            return;
        }
        if (ordinal == 1) {
            qod E = xs7.E(getViewLifecycleScope(), (hu3) null, ru3.b, new xl3(this, j, view, (Continuation) null), 1);
            this.L0.o1(this, S0[3], E);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final qna l0() {
        return (qna) this.I0.getValue();
    }

    public final CharSequence m0() {
        k77 k77 = S0[5];
        return (CharSequence) this.N0.a(this);
    }

    public final nea n0() {
        k77 k77 = S0[0];
        return (nea) this.A0.getValue();
    }

    public final mnc o() {
        return p0() ? mnc.y0 : mnc.w0;
    }

    public final kl3 o0() {
        return (kl3) this.z0.getValue();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [rr3, one.me.sdk.arch.Widget, one.me.contactlist.ContactListWidget] */
    public final void onAttach(View view) {
        ContactListWidget.super.onAttach(view);
        k77[] k77Arr = S0;
        k77 k77 = k77Arr[8];
        jr jrVar = this.Q0;
        if (!((Boolean) jrVar.a(this)).booleanValue()) {
            k77 k772 = k77Arr[8];
            jrVar.b(this, Boolean.TRUE);
            boolean b2 = l0().b(qna.f);
            t97 t97 = this.J0;
            if (!b2) {
                ((f03) t97.getValue()).i("app.writeConctatsRequested", true);
                l0().e(new jrf(this, 1));
                return;
            }
            qna l0 = l0();
            String[] strArr = qna.g;
            if (!l0.b(strArr)) {
                i03 i03 = (lqc) ((f03) t97.getValue());
                i03.getClass();
                if (!i03.g.getBoolean("app.writeConctatsRequested", false)) {
                    ((f03) t97.getValue()).i("app.writeConctatsRequested", true);
                    l0().f(new jrf(this, 1), strArr, 156);
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(p2a.n);
        nea n0 = n0();
        re3 re3 = new re3(-1, -2);
        re3.i = 0;
        re3.e = 0;
        re3.h = 0;
        constraintLayout.addView(n0, re3);
        p4a p4a = new p4a(constraintLayout.getContext(), (AttributeSet) null);
        p4a.setIcon(phc.l0);
        p4a.setTitle(new hge(q2a.n));
        p4a.setSubtitle(new hge(q2a.m));
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(constraintLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(zob.oneme_contactlist_rv);
        endlessRecyclerView2.setItemAnimator((k6c) null);
        t93 t93 = this.y0;
        endlessRecyclerView2.setAdapter(t93);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setEmptyView(p4a);
        hj2 hj2 = new hj2(4, new ml3(this, 0));
        ryd ryd = new ryd(endlessRecyclerView2, t93, hj2);
        endlessRecyclerView2.j(ryd);
        endlessRecyclerView2.j(new hk3(hj2, km4.y0.r(endlessRecyclerView2), (gk3) new zx1(20, (Object) this)));
        ryd ryd2 = new ryd(endlessRecyclerView2, t93, new hj2(2, new ka(this, 12, endlessRecyclerView2)));
        endlessRecyclerView2.j(ryd2);
        urd.B(new c3(ryd, ryd2, (Continuation) null, 8), endlessRecyclerView2);
        re3 re32 = new re3(-1, 0);
        re32.j = n0().getId();
        re32.e = 0;
        re32.h = 0;
        re32.l = 0;
        constraintLayout.addView(endlessRecyclerView2, re32);
        re3 re33 = new re3(-1, 0);
        re33.j = n0().getId();
        re33.e = 0;
        re33.h = 0;
        re33.l = 0;
        constraintLayout.addView(p4a, re33);
        return constraintLayout;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, java.lang.Object, one.me.contactlist.ContactListWidget] */
    public final void onDestroyView(View view) {
        ContactListWidget.super.onDestroyView(view);
        ((EndlessRecyclerView2) this.F0.T0(this, S0[2])).setAdapter((f6c) null);
        ((ul3) this.B0.getValue()).e();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!((we1) this.G0.getValue()).b(i, strArr, iArr)) {
            if (i == 156) {
                qna l0 = l0();
                jrf jrf = new jrf(this, 1);
                String[] strArr2 = qna.e;
                int i2 = cic.O1;
                int i3 = cic.U1;
                l0.getClass();
                qna.k(jrf, strArr, iArr, strArr2, i2, i3);
            }
            r0();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [rr3, one.me.sdk.arch.Widget, java.lang.Object, one.me.contactlist.ContactListWidget] */
    public final void onViewCreated(View view) {
        ContactListWidget.super.onViewCreated(view);
        ex9 h = getRouter().h();
        if (h != null) {
            h.b((ul3) this.B0.getValue());
        }
        ez3.N(new v11(o0().B0, ((xf0) this.D0.getValue()).w0, new c3(this, (Continuation) null, 9), 4), getViewLifecycleScope());
        ez3.N(new ck5(o0().G0, new vl3(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(o0().C0.i, new wl3(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final boolean p0() {
        k77 k77 = S0[6];
        return ((Boolean) this.O0.a(this)).booleanValue();
    }

    public final void q0() {
        l0().f(new jrf(this, 1), qna.e, 156);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r2v0, types: [mr5, ig7] */
    public final void r0() {
        boolean b2 = ((bk3) o0().C0.i.a.getValue()).b();
        ? r1 = this.w0;
        ? r2 = this.x0;
        if (!b2 || !p0()) {
            CharSequence m0 = m0();
            r2.E((m0 == null || m0.length() == 0) ? (List) ((xf0) this.D0.getValue()).w0.a.getValue() : hw4.a);
            r1.E((List) null);
            return;
        }
        boolean b3 = l0().b(qna.f);
        lo3 lo3 = new lo3(phc.J0, q2a.r, b3 ? q2a.q : q2a.p, b3 ? null : Integer.valueOf(q2a.o));
        r2.E((List) null);
        r1.E(Collections.singletonList(lo3));
    }

    public final void t() {
        q0();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [rr3, one.me.contactlist.ContactListWidget] */
    public final void v(long j) {
        bm3.p(this);
        o0().q(p2a.i, j);
    }

    public final void w(int i) {
        int t = hr1.t(i);
        if (t == 5 || t == 6) {
            l0().f(new jrf(this, 1), qna.h, 160);
        } else {
            q0();
        }
    }

    public final void y(int i, Bundle bundle) {
        k77[] k77Arr = S0;
        k77 k77 = k77Arr[4];
        jr jrVar = this.M0;
        Long l = (Long) jrVar.a(this);
        long longValue = l != null ? l.longValue() : 0;
        k77 k772 = k77Arr[4];
        jrVar.b(this, (Object) null);
        o0().q(i, longValue);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactListWidget(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: one.me.sdk.arch.Widget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: f6c[]} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ContactListWidget(android.os.Bundle r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r4 = 1
            r5 = 7
            r6 = 3
            r7 = 5
            r8 = 4
            r9 = 0
            r10 = 2
            r11 = 0
            r0.<init>(r1, r9, r10, r11)
            sy6 r12 = sy6.d
            r0.a = r12
            co3 r12 = defpackage.co3.a
            w4 r13 = r12.getAccessor()
            java.lang.Class<xg9> r14 = xg9.class
            r7e r13 = r13.d(r14)
            r0.b = r13
            w4 r13 = r12.getAccessor()
            java.lang.Class<iq1> r14 = iq1.class
            r7e r13 = r13.d(r14)
            r0.c = r13
            w4 r13 = r12.getAccessor()
            java.lang.Class<x4a> r14 = x4a.class
            java.lang.Object r13 = r13.c(r14)
            x4a r13 = (x4a) r13
            java.util.concurrent.ExecutorService r13 = r13.a()
            r0.o = r13
            cpf r14 = new cpf
            r14.<init>(r0, r13, r8)
            r0.X = r14
            cpf r15 = new cpf
            r15.<init>(r0, r13, r5)
            r0.Y = r15
            cpf r11 = new cpf
            r11.<init>(r0, r13, r8)
            r0.Z = r11
            mr5 r2 = new mr5
            r2.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r13, (int) r7)
            r0.w0 = r2
            mr5 r3 = new mr5
            r3.<init>((java.lang.Object) r0, (java.util.concurrent.ExecutorService) r13, (int) r6)
            r0.x0 = r3
            t93 r13 = new t93
            s93 r5 = new s93
            r5.<init>((boolean) r9, (int) r4)
            f6c[] r8 = new defpackage.f6c[r7]
            r8[r9] = r3
            r8[r4] = r14
            r8[r10] = r15
            r8[r6] = r11
            r3 = 4
            r8[r3] = r2
            r13.<init>(r5, r8)
            jw4 r2 = new jw4
            ll3 r3 = new ll3
            r3.<init>(r0, r9)
            r4 = 7
            r2.<init>(r4, r3)
            r13.z(r2)
            r0.y0 = r13
            fe2 r2 = new fe2
            r2.<init>(r1, r10)
            rh2 r3 = new rh2
            r4 = 24
            r3.<init>(r4, r2)
            java.lang.Class<kl3> r2 = defpackage.kl3.class
            t97 r2 = r0.createViewModelLazy(r2, r3)
            r0.z0 = r2
            ll3 r2 = new ll3
            r2.<init>(r0, r6)
            nl0 r2 = r0.binding(r2)
            r0.A0 = r2
            ll3 r2 = new ll3
            r3 = 4
            r2.<init>(r0, r3)
            t97 r2 = defpackage.ez3.O(r6, r2)
            r0.B0 = r2
            fe2 r2 = new fe2
            r2.<init>(r1, r6)
            t97 r1 = defpackage.ez3.O(r6, r2)
            r0.C0 = r1
            ll3 r1 = new ll3
            r1.<init>(r0, r7)
            rh2 r2 = new rh2
            r3 = 25
            r2.<init>(r3, r1)
            java.lang.Class<xf0> r1 = defpackage.xf0.class
            t97 r1 = r0.createViewModelLazy(r1, r2)
            r0.D0 = r1
            ll3 r1 = new ll3
            r2 = 6
            r1.<init>(r0, r2)
            nl0 r1 = r0.binding(r1)
            r0.E0 = r1
            int r1 = defpackage.zob.oneme_contactlist_rv
            n0c r1 = r0.viewBinding(r1)
            r0.F0 = r1
            ll3 r1 = new ll3
            r2 = 7
            r1.<init>(r0, r2)
            t97 r1 = defpackage.ez3.O(r6, r1)
            r0.G0 = r1
            pq3 r1 = new pq3
            int r17 = defpackage.p2a.q
            int r2 = defpackage.q2a.i
            hge r3 = new hge
            r3.<init>(r2)
            int r2 = phc.M0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            r21 = 20
            r20 = 0
            r16 = r1
            r18 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            pq3 r2 = new pq3
            int r23 = defpackage.p2a.r
            int r3 = cic.a
            hge r4 = new hge
            r4.<init>(r3)
            int r3 = phc.f2
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r27 = 20
            r26 = 0
            r22 = r2
            r24 = r4
            r22.<init>(r23, r24, r25, r26, r27)
            pq3 r3 = new pq3
            int r17 = defpackage.u5a.d
            int r4 = defpackage.v5a.f
            hge r5 = new hge
            r5.<init>(r4)
            int r4 = phc.e1
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)
            r21 = 20
            r20 = 0
            r16 = r3
            r18 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            pq3 r4 = new pq3
            int r23 = defpackage.u5a.k
            int r5 = defpackage.v5a.l
            hge r6 = new hge
            r6.<init>(r5)
            int r5 = phc.M1
            java.lang.Integer r25 = java.lang.Integer.valueOf(r5)
            r27 = 20
            r26 = 0
            r22 = r4
            r24 = r6
            r22.<init>(r23, r24, r25, r26, r27)
            pq3 r5 = new pq3
            int r17 = defpackage.u5a.e
            int r6 = defpackage.v5a.g
            hge r8 = new hge
            r8.<init>(r6)
            int r6 = phc.c0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r6)
            r21 = 20
            r20 = 0
            r16 = r5
            r18 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            pq3[] r1 = new pq3[]{r1, r2, r3, r4, r5}
            java.util.List r1 = defpackage.p23.B(r1)
            r0.H0 = r1
            rna r1 = rna.a
            t97 r1 = r1.b()
            r0.I0 = r1
            w4 r1 = r12.getAccessor()
            java.lang.Class<f03> r2 = f03.class
            r7e r1 = r1.d(r2)
            r0.J0 = r1
            w4 r1 = r12.getAccessor()
            java.lang.Class<xzc> r2 = xzc.class
            r1.d(r2)
            w4 r1 = r12.getAccessor()
            java.lang.Class<noa> r2 = noa.class
            r1.d(r2)
            xd3 r1 = new xd3
            r2 = 4
            r1.<init>(r2)
            r7e r2 = new r7e
            r2.<init>(r1)
            r0.K0 = r2
            e3 r1 = defpackage.hwf.t()
            r0.L0 = r1
            jr r1 = new jr
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.String r3 = "selected.contactId.Action"
            r4 = 0
            r1.<init>(r2, r4, r3)
            r0.M0 = r1
            jr r1 = new jr
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            java.lang.String r3 = "contact_list_widget_search_query"
            r1.<init>(r2, r4, r3)
            r0.N0 = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            jr r2 = new jr
            java.lang.String r3 = "contact_list_widget_is_in_search"
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r2.<init>(r4, r1, r3)
            r0.O0 = r2
            jr r2 = new jr
            java.lang.String r3 = "contact_list_widget_is_need_scroll_to_top"
            r2.<init>(r4, r1, r3)
            r0.P0 = r2
            jr r2 = new jr
            java.lang.String r3 = "contact_list_widget_permission_check"
            r2.<init>(r4, r1, r3)
            r0.Q0 = r2
            jj7 r1 = new jj7
            ll3 r2 = new ll3
            r3 = 8
            r2.<init>(r0, r3)
            r3 = 0
            r4 = 6
            r1.<init>((defpackage.s16) r2, (defpackage.s16) r3, (int) r4)
            r0.R0 = r1
            kl3 r1 = r28.o0()
            l05 r1 = r1.D0
            nc7 r2 = r0.lifecycleOwner
            pc7 r2 = r2.R()
            ob7 r4 = defpackage.ob7.o
            rn1 r1 = defpackage.wx3.e(r1, r2, r4)
            ol3 r2 = new ol3
            r2.<init>(r0, r3)
            ck5 r3 = new ck5
            r3.<init>(r1, r2, r7)
            yb7 r1 = r28.getLifecycleScope()
            defpackage.ez3.N(r3, r1)
            kl3 r1 = r28.o0()
            l05 r1 = r1.E0
            nc7 r2 = r0.lifecycleOwner
            pc7 r2 = r2.R()
            rn1 r1 = defpackage.wx3.e(r1, r2, r4)
            zi1 r2 = new zi1
            r3 = 25
            r2.<init>(r1, r3)
            pl3 r1 = new pl3
            r3 = 0
            r1.<init>(r0, r3)
            ck5 r3 = new ck5
            r3.<init>(r2, r1, r7)
            yb7 r0 = r28.getLifecycleScope()
            defpackage.ez3.N(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.contactlist.ContactListWidget.<init>(android.os.Bundle):void");
    }

    public ContactListWidget(ql3 ql3) {
        this(jjd.j(new wia("contact_screen_open_mode", ql3.name())));
    }
}
