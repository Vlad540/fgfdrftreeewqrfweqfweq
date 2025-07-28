package one.me.messages.list.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.onechat.reactions.ReactionsViewModel;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0015\u0016\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0014¨\u0006\u0018"}, d2 = {"Lone/me/messages/list/ui/MessagesListWidget;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Ltq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "parentScope", "", "chatId", "loadMark", "", "", "highlights", "loadMessageId", "", "shouldHighlightMessage", "shouldSkipUnreadDecoration", "(Ljava/lang/String;JJLjava/util/List;JZZLx54;)V", "c78", "d09", "e09", "message-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MessagesListWidget extends Widget implements lc3, tq3 {
    public static final /* synthetic */ k77[] b1;
    public final t97 A0;
    public final ig6 B0;
    public c7e C0;
    public d19 D0;
    public final uw8 E0;
    public final t97 F0;
    public vp0 G0;
    public final n0c H0;
    public final n0c I0;
    public wue J0;
    public d04 K0;
    public ryd L0;
    public er7 M0;
    public final e3 N0;
    public final nl0 O0;
    public final nl0 P0;
    public final c78 Q0;
    public final d09 R0;
    public final e09 S0;
    public final t97 T0;
    public final w1f U0;
    public final nl0 V0;
    public final nl0 W0;
    public final jr X;
    public final nl0 X0;
    public final jr Y;
    public final nl0 Y0;
    public final t97 Z;
    public ww4 Z0;
    public final String a;
    public vzb a1;
    public final String b;
    public final jr c;
    public final jr o;
    public final sya w0;
    public final t97 x0;
    public final r7e y0;
    public final t97 z0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: k77[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            khb r0 = new khb
            java.lang.Class<one.me.messages.list.ui.MessagesListWidget> r1 = one.me.messages.list.ui.MessagesListWidget.class
            java.lang.String r2 = "parentScope"
            java.lang.String r3 = "getParentScope-IluPPks()Ljava/lang/String;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            n7c r2 = m7c.a
            java.lang.String r3 = "selectedMessageIdsForAction"
            java.lang.String r5 = "getSelectedMessageIdsForAction()[J"
            hc9 r2 = defpackage.c3d.g(r2, r1, r3, r5)
            hc9 r3 = new hc9
            java.lang.String r5 = "currentReadMark"
            java.lang.String r6 = "getCurrentReadMark()J"
            r3.<init>(r1, r5, r6)
            hc9 r5 = new hc9
            java.lang.String r6 = "isLastMsgCompletelyVisibleOnDetach"
            java.lang.String r7 = "isLastMsgCompletelyVisibleOnDetach()Z"
            r5.<init>(r1, r6, r7)
            hc9 r6 = new hc9
            java.lang.String r7 = "shouldSkipUnreadDecoration"
            java.lang.String r8 = "getShouldSkipUnreadDecoration()Z"
            r6.<init>(r1, r7, r8)
            khb r7 = new khb
            java.lang.String r8 = "recyclerView"
            java.lang.String r9 = "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;"
            r7.<init>(r1, r8, r9, r4)
            khb r8 = new khb
            java.lang.String r9 = "scrollButtonsContainer"
            java.lang.String r10 = "getScrollButtonsContainer()Lone/me/messages/list/ui/view/scroll/ScrollButtonsContainer;"
            r8.<init>(r1, r9, r10, r4)
            hc9 r9 = new hc9
            java.lang.String r10 = "contextMenuJob"
            java.lang.String r11 = "getContextMenuJob()Lkotlinx/coroutines/Job;"
            r9.<init>(r1, r10, r11)
            khb r10 = new khb
            java.lang.String r11 = "messagesListRecyclerViewAnalyticsListener"
            java.lang.String r12 = "getMessagesListRecyclerViewAnalyticsListener()Lone/me/messages/list/ui/recycler/MessagesListRecyclerViewAnalyticsListener;"
            r10.<init>(r1, r11, r12, r4)
            khb r11 = new khb
            java.lang.String r12 = "prefetchReactionsScrollListener"
            java.lang.String r13 = "getPrefetchReactionsScrollListener()Lru/ok/onechat/reactions/PrefetchReactionsScrollListener;"
            r11.<init>(r1, r12, r13, r4)
            khb r12 = new khb
            java.lang.String r13 = "messagesLayoutManager"
            java.lang.String r14 = "getMessagesLayoutManager()Lone/me/messages/list/ui/recycler/MessagesLayoutManager;"
            r12.<init>(r1, r13, r14, r4)
            khb r13 = new khb
            java.lang.String r14 = "messagesScroller"
            java.lang.String r15 = "getMessagesScroller()Lone/me/messages/list/ui/scroll/MessagesScroller;"
            r13.<init>(r1, r14, r15, r4)
            khb r14 = new khb
            java.lang.String r15 = "emptyStateContainer"
            r16 = r13
            java.lang.String r13 = "getEmptyStateContainer()Landroid/widget/FrameLayout;"
            r14.<init>(r1, r15, r13, r4)
            khb r13 = new khb
            java.lang.String r15 = "reactionEffectsView"
            r17 = r14
            java.lang.String r14 = "getReactionEffectsView()Lru/ok/onechat/reactions/ui/animation/ReactionEffectsView;"
            r13.<init>(r1, r15, r14, r4)
            r1 = 14
            k77[] r1 = new k77[r1]
            r1[r4] = r0
            r0 = 1
            r1[r0] = r2
            r0 = 2
            r1[r0] = r3
            r0 = 3
            r1[r0] = r5
            r0 = 4
            r1[r0] = r6
            r0 = 5
            r1[r0] = r7
            r0 = 6
            r1[r0] = r8
            r0 = 7
            r1[r0] = r9
            r0 = 8
            r1[r0] = r10
            r0 = 9
            r1[r0] = r11
            r0 = 10
            r1[r0] = r12
            r0 = 11
            r1[r0] = r16
            r0 = 12
            r1[r0] = r17
            r0 = 13
            r1[r0] = r13
            b1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.<clinit>():void");
    }

    public MessagesListWidget(String str, long j, long j2, List list, long j3, boolean z, boolean z2, x54 x54) {
        this(jjd.j(new wia[]{new wia(Widget.ARG_SCOPE_ID, new inc(str)), new wia("ARG_CHAT_ID", Long.valueOf(j)), new wia("ARG_LOAD_MARK", Long.valueOf(j2)), new wia("ARG_LOAD_MESSAGE_ID", Long.valueOf(j3)), new wia("ARG_HIGHLIGHTS", list), new wia("ARG_HIGHLIGHT_MESSAGE", Boolean.valueOf(z)), new wia("ARG_SKIP_UNREAD_DECOR", Boolean.valueOf(z2))}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l0(one.me.messages.list.ui.MessagesListWidget r6, defpackage.jpc r7) {
        /*
            java.lang.String r0 = r6.a
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0007
            goto L_0x0021
        L_0x0007:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0021
            tn7 r2 = defpackage.tn7.X
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Got new scrollState="
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
        L_0x0021:
            e09 r0 = r6.S0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r6.q0()
            boolean r2 = r0.c
            r3 = 0
            if (r2 == 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r0.b(r1, r3, r3)
        L_0x0030:
            zoc r0 = r6.s0()
            toc r1 = defpackage.toc.a
            int r2 = r7.a
            qoc r0 = r0.d(r1)
            r0.setCounter(r2)
            boolean r0 = r7.b
            if (r0 == 0) goto L_0x004b
            zoc r0 = r6.s0()
            r0.c(r1)
            goto L_0x0052
        L_0x004b:
            zoc r0 = r6.s0()
            r0.b(r1)
        L_0x0052:
            boolean r0 = r7.c
            toc r1 = defpackage.toc.b
            if (r0 == 0) goto L_0x0082
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r6.q0()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = defpackage.gp0.k(r0, r2)
            int r4 = r0.getChildCount()
            r5 = 1
            int r4 = r4 - r5
            android.view.View r0 = r0.getChildAt(r4)
            if (r0 != 0) goto L_0x0070
        L_0x006e:
            r0 = r3
            goto L_0x0077
        L_0x0070:
            int r0 = androidx.recyclerview.widget.RecyclerView.R(r0)
            if (r0 != r2) goto L_0x006e
            r0 = r5
        L_0x0077:
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x0082
            zoc r0 = r6.s0()
            r0.c(r1)
            goto L_0x0089
        L_0x0082:
            zoc r0 = r6.s0()
            r0.b(r1)
        L_0x0089:
            ipc r0 = r7.d
            toc r1 = defpackage.toc.c
            if (r0 != 0) goto L_0x0097
            zoc r6 = r6.s0()
            r6.b(r1)
            goto L_0x00ba
        L_0x0097:
            d09 r0 = r6.R0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = r6.q0()
            r4 = -1
            r0.a = r4
            r0.b = r4
            r0.b(r2, r3, r3)
            ipc r7 = r7.d
            long r2 = r7.b
            f29 r7 = r6.o0()
            boolean r7 = r7.a(r2)
            if (r7 != 0) goto L_0x00ba
            zoc r6 = r6.s0()
            r6.c(r1)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.l0(one.me.messages.list.ui.MessagesListWidget, jpc):void");
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m10getScopeIdIluPPks() {
        return this.b;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r10, android.os.Bundle r11) {
        /*
            r9 = this;
            t97 r0 = r9.z0
            java.lang.Object r0 = r0.getValue()
            we1 r0 = (we1) r0
            boolean r0 = r0.g(r10)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            if (r11 == 0) goto L_0x00a9
            java.lang.String r0 = "selected.messageIds.Action"
            long[] r0 = r11.getLongArray(r0)
            if (r0 != 0) goto L_0x001b
            goto L_0x00a9
        L_0x001b:
            int r1 = defpackage.a7a.S
            if (r10 != r1) goto L_0x009e
            int r10 = r0.length
            r1 = 0
            if (r10 != 0) goto L_0x0025
            r4 = r1
            goto L_0x002d
        L_0x0025:
            r10 = 0
            r2 = r0[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            r4 = r10
        L_0x002d:
            java.lang.String r10 = "bot.shareContact.confirm.keyboardId"
            java.lang.String r5 = r11.getString(r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            java.lang.String r2 = "bot.shareContact.confirm.button"
            java.lang.Class<yt0> r3 = defpackage.yt0.class
            if (r10 < r0) goto L_0x0042
            java.io.Serializable r2 = ht0.d(r11, r2, r3)
            goto L_0x004e
        L_0x0042:
            java.io.Serializable r2 = r11.getSerializable(r2)
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            r7 = r2
            yt0 r7 = (defpackage.yt0) r7
            java.lang.String r2 = "bot.shareContact.confirm.buttonPosition"
            java.lang.Class<eu0> r3 = defpackage.eu0.class
            if (r10 < r0) goto L_0x005c
            java.io.Serializable r10 = ht0.d(r11, r2, r3)
            goto L_0x0068
        L_0x005c:
            java.io.Serializable r10 = r11.getSerializable(r2)
            boolean r11 = r3.isInstance(r10)
            if (r11 == 0) goto L_0x0067
            r1 = r10
        L_0x0067:
            r10 = r1
        L_0x0068:
            r6 = r10
            eu0 r6 = (defpackage.eu0) r6
            zz8 r9 = r9.t0()
            r9.getClass()
            if (r4 == 0) goto L_0x00a9
            if (r5 == 0) goto L_0x00a9
            if (r7 == 0) goto L_0x00a9
            if (r6 != 0) goto L_0x007b
            goto L_0x00a9
        L_0x007b:
            pae r10 = r9.Y
            n3a r10 = (n3a) r10
            ju3 r10 = r10.b()
            ru3 r11 = ru3.b
            ky8 r0 = new ky8
            r8 = 0
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.internal.ContextScope r1 = r9.a
            qod r10 = xs7.D(r1, r10, r11, r0)
            k77[] r11 = defpackage.zz8.I1
            r0 = 5
            r11 = r11[r0]
            e3 r0 = r9.p1
            r0.o1(r9, r11, r10)
            goto L_0x00a9
        L_0x009e:
            zz8 r9 = r9.t0()
            java.util.List r11 = cs.f0(r0)
            r9.I(r10, r11)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.i(int, android.os.Bundle):void");
    }

    public final FrameLayout m0() {
        k77 k77 = b1[12];
        return (FrameLayout) this.X0.getValue();
    }

    public final MessagesLayoutManager n0() {
        k77 k77 = b1[10];
        return (MessagesLayoutManager) this.V0.getValue();
    }

    public final f29 o0() {
        k77 k77 = b1[11];
        return (f29) this.W0.getValue();
    }

    public final void onAttach(View view) {
        udd.q(xie.w(this), "lifecycle: onAttach");
        EndlessRecyclerView2 q0 = q0();
        vp0 vp0 = new vp0();
        vp0.v(q0);
        this.G0 = vp0;
        ReactionsViewModel q = p0().q();
        q.getClass();
        udd.q("ru.ok.onechat.reactions.ReactionsViewModel", "runChatSubscribeNotifObserving");
        xs7.E(am7.r(q), ((n64) q.k.getValue()).a, (ru3) null, new f0c(q, (Continuation) null), 2);
        k77 k77 = b1[9];
        d2b d2b = (d2b) this.P0.getValue();
        List b2 = this.E0.b();
        ArrayList arrayList = new ArrayList(q23.H(b2, 10));
        Iterator it = ((ArrayList) b2).iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((MessageModel) it.next()).b));
        }
        d2b.getClass();
        String str = d2b.n;
        udd.p(str, "setIdsForInvalidate %s", new Object[]{String.valueOf(arrayList.size())});
        udd.q(str, "clear");
        d2b.k.clear();
        d2b.f.c();
        zb9 zb9 = d2b.e;
        zb9.c();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            zb9.a(((Number) it2.next()).longValue());
        }
        d2b.g = true;
        k77 k772 = d2b.m[0];
        RecyclerView recyclerView = (RecyclerView) d2b.l.b;
        if (recyclerView != null) {
            recyclerView.post(new hg9(d2b, 13, recyclerView));
        }
        v40 v40 = this.w0.b;
        v40.Y = true;
        v40.d();
        view.postDelayed(new eq6(13, this), 1000);
    }

    public final void onChangeStarted(wr3 wr3, xr3 xr3) {
        MessageModel K;
        super.onChangeStarted(wr3, xr3);
        if (!xr3.a && !xr3.b && getView() != null) {
            int k = gp0.k(q0(), 0.3f);
            Integer valueOf = Integer.valueOf(k);
            if (k == -1) {
                valueOf = null;
            }
            if (valueOf != null && (K = this.E0.K(valueOf.intValue())) != null) {
                t0().H(K);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b09 b09 = new b09(this, 1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        b09.invoke(frameLayout);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        xh0 xh0 = (xh0) ((u98) this.T0.getValue());
        w1f w1f = this.U0;
        if (w1f != null) {
            xh0.g.remove(w1f);
        } else {
            xh0.getClass();
        }
        vzb vzb = this.a1;
        if (vzb != null) {
            vzb.f.clear();
            vzb.e.clear();
            vzb.b.b();
        }
        this.a1 = null;
        this.Z0 = null;
        ig6 ig6 = this.B0;
        ig6.c = false;
        ig6.d = null;
        ig6.b.clear();
        p0().q().f();
        c7e c7e = this.C0;
        if (c7e == null) {
            c7e = null;
        }
        t97 t97 = c7e.F0;
        if (t97.a()) {
            ((cn0) c7e.y0.getValue()).g(t97.getValue());
        }
        o27 o27 = this.D0;
        if (o27 == null) {
            o27 = null;
        }
        o27.i((RecyclerView) null);
        EndlessRecyclerView2 q0 = q0();
        k77 k77 = b1[8];
        q0.q0((cx8) this.O0.getValue());
        n0().I.b();
        ij5 ij5 = (ij5) this.F0.getValue();
        ij5.w0 = false;
        try {
            q0.p0(ij5);
        } catch (Throwable th) {
            udd.S(ij5.class.getName(), "fail to detach", th);
        }
        ij5.x0 = null;
        q0.setPager((ny4) null);
        wue wue = this.J0;
        if (wue != null) {
            q0.p0(wue);
        }
        this.J0 = null;
        ryd ryd = this.L0;
        if (ryd != null) {
            l83 l83 = ryd.o;
            nyd nyd = (nyd) l83.g;
            if (nyd != null) {
                ((f6c) l83.b).B(nyd);
            }
            l83.g = null;
            pyd pyd = ryd.y0;
            if (pyd != null) {
                ryd.b.B(pyd);
            }
            ryd.y0 = null;
        }
        ryd ryd2 = this.L0;
        if (ryd2 != null) {
            q0.p0(ryd2);
        }
        this.L0 = null;
        this.K0 = null;
        q0.setAdapter((f6c) null);
        q0.setDelegate((py4) null);
    }

    public final void onDetach(View view) {
        o62 o62;
        k77[] k77Arr = b1;
        k77 k77 = k77Arr[4];
        this.Y.b(this, Boolean.FALSE);
        vp0 vp0 = this.G0;
        if (vp0 != null) {
            vp0.B(q0());
        }
        w1f w1f = this.U0;
        w1f.e = null;
        w1f.o.i(-1);
        v40 v40 = this.w0.b;
        boolean z = false;
        v40.Y = false;
        if (v40.X) {
            v40.X = false;
            mib mib = v40.b;
            mib.b();
            mib.h.remove(v40.Z);
        }
        RecyclerView q0 = q0();
        int k = gp0.k(q0, 1.0f);
        View childAt = q0.getChildAt(q0.getChildCount() - 1);
        if (childAt != null && RecyclerView.R(childAt) == k) {
            z = true;
        }
        k77 k772 = k77Arr[3];
        this.X.b(this, Boolean.valueOf(z));
        zz8 t0 = t0();
        i22 i22 = (i22) t0.r1.a.getValue();
        if (i22 == null || (o62 = i22.b) == null || o62.m <= 0) {
            t0.x1.set(true);
        }
    }

    public final void onDismiss() {
        k77[] k77Arr = b1;
        g37 g37 = (g37) this.N0.T0(this, k77Arr[7]);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        k77 k77 = k77Arr[1];
        this.c.b(this, (Object) null);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        MessagesListWidget.super.onRequestPermissionsResult(i, strArr, iArr);
        ((we1) this.z0.getValue()).b(i, strArr, iArr);
    }

    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        Long H;
        super.onUpdateArgs(bundle, bundle2);
        boolean z = bundle2.getBoolean("ARG_SKIP_UNREAD_DECOR", false);
        k77 k77 = b1[4];
        this.Y.b(this, Boolean.valueOf(z));
        Object obj = bundle.get("ARG_LOAD_MESSAGE_ID");
        Object obj2 = bundle2.get("ARG_LOAD_MESSAGE_ID");
        ru3 ru3 = ru3.b;
        if (obj2 == null || obj2.equals(obj)) {
            Object obj3 = bundle.get("ARG_LOAD_MARK");
            Object obj4 = bundle2.get("ARG_LOAD_MARK");
            if (obj4 != null && !hhd.f(obj3, obj4) && (H = o0e.H(obj4.toString())) != null) {
                long longValue = H.longValue();
                bundle2.remove("ARG_LOAD_MARK");
                zz8 t0 = t0();
                t0.K(xs7.D(t0.a, t0.G0, ru3, new hz8(t0, longValue, (Continuation) null)));
                return;
            }
            return;
        }
        Long H2 = o0e.H(obj2.toString());
        if (H2 != null) {
            long longValue2 = H2.longValue();
            bundle2.remove("ARG_LOAD_MESSAGE_ID");
            zz8 t02 = t0();
            t02.getClass();
            gz8 gz8 = new gz8(t02, longValue2, (Continuation) null);
            t02.K(xs7.D(t02.a, t02.G0, ru3, gz8));
            View view = getView();
            if (view != null) {
                view.post(new q50(this, longValue2, 6));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v23, types: [l7c, java.lang.Object] */
    public final void onViewCreated(View view) {
        t0c t0c = t0().u1;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new l09((Continuation) null, this), 5), getViewLifecycleScope());
        EndlessRecyclerView2 q0 = q0();
        k77[] k77Arr = b1;
        k77 k77 = k77Arr[13];
        this.a1 = new vzb(q0, (dzb) this.Y0.getValue(), new qk8(4, view));
        ez3.N(new ck5(wx3.e(t0().H1, getViewLifecycleOwner().R(), ob7), new c19((Continuation) null, this), 5), getViewLifecycleScope());
        uw8 uw8 = this.E0;
        if (uw8.j() > 0) {
            o0().b();
        }
        EndlessRecyclerView2 q02 = q0();
        k77 k772 = k77Arr[8];
        q02.k((cx8) this.O0.getValue());
        k77 k773 = k77Arr[9];
        nl0 nl0 = this.P0;
        d2b d2b = (d2b) nl0.getValue();
        EndlessRecyclerView2 q03 = q0();
        d2b.getClass();
        d2b.l.o1(d2b, d2b.m[0], q03);
        EndlessRecyclerView2 q04 = q0();
        k77 k774 = k77Arr[9];
        q04.m((d2b) nl0.getValue());
        ? q05 = q0();
        afa.a(q05, new s09(q05, this, 0));
        EndlessRecyclerView2 q06 = q0();
        w1f w1f = this.U0;
        q06.m(w1f);
        n0().t1(new a19(this));
        ck5 ck5 = new ck5(new u09(t0().F1, 0), new b19((Continuation) null, this), 5);
        xv8 xv8 = xv8.a;
        e07.B(ez3.J(ck5, xv8.getDispatchers().c()), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new ik5(t0().A1, 2), getViewLifecycleOwner().R(), ob7), new m09((Continuation) null, this), 5), getViewLifecycleScope());
        l05 l05 = t0().B1;
        i26 i26 = r0;
        i26 hp0 = new hp0(2, this, MessagesListWidget.class, "handleNavigationEvents", "handleNavigationEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 20);
        ez3.N(new ck5(l05, i26, 5), getViewLifecycleScope());
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ? obj = new Object();
        ez3.N(new ck5(wx3.e(t0().w1, getViewLifecycleOwner().R(), ob7.X), new g09((Continuation) null, atomicInteger, this, obj), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(r0().c, getViewLifecycleOwner().R(), ob7), new n09((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(r0().X, new x09((Continuation) null, this), 5), getViewLifecycleScope());
        ck5 ck52 = new ck5(r0().w0, new y09((Continuation) null, this), 5);
        yb7 viewLifecycleScope = getViewLifecycleScope();
        xs7.E(viewLifecycleScope, (hu3) null, (ru3) null, new wb7(viewLifecycleScope, new ub7(ck52, (Continuation) null), (Continuation) null), 3);
        ez3.N(new ck5(wx3.e(t0().y1, getViewLifecycleOwner().R(), ob7), new o09((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new w09(new ik5(t0().z1, 2), this, 0), getViewLifecycleOwner().R(), ob7), new p09((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(p0().q().v, getViewLifecycleOwner().R(), ob7), new q09((Continuation) null, this), 5), getViewLifecycleScope());
        EndlessRecyclerView2 q07 = q0();
        x99 A = t0().A();
        da9 da9 = new da9(q07, uw8, A, r0());
        ez3.N(new ck5(A.g, new hp0(2, da9, da9.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/messages/list/ui/multiselection/MultiSelectionLogic$Data;)V", 4, 23), 5), getViewLifecycleScope());
        n0().t1(new j09(this, 1));
        ez3.N(new ck5(wx3.e(((o4a) xv8.getAccessor().c(o4a.class)).a, getViewLifecycleOwner().R(), ob7), new r09((Continuation) null, this), 5), getViewLifecycleScope());
        o6a o6a = (u98) this.T0.getValue();
        if (w1f != null) {
            o6a.g.add(w1f);
        }
        if (o6a.n.get() && w1f != null) {
            o6a.f.post(new b(14, (Object) w1f));
        }
    }

    public final k0c p0() {
        return (k0c) this.y0.getValue();
    }

    public final EndlessRecyclerView2 q0() {
        return (EndlessRecyclerView2) this.H0.T0(this, b1[5]);
    }

    public final nx8 r0() {
        return (nx8) this.Z.getValue();
    }

    public final zoc s0() {
        return (zoc) this.I0.T0(this, b1[6]);
    }

    public final zz8 t0() {
        return (zz8) this.x0.getValue();
    }

    public final void u0() {
        if (((Boolean) r0().c.a.getValue()).booleanValue()) {
            nx8 r0 = r0();
            taf.o(r0.x0, ix8.a);
        }
    }

    public final void v0(long j, View view) {
        g37 g37;
        long j2 = j;
        zz8 t0 = t0();
        grd grd = t0.s1;
        MessageModel e = ((tw8) grd.getValue()).e(j2);
        if (t0.A().d()) {
            t0.A().e(j2);
            return;
        }
        if ((e != null ? e.Z : null) == dcf.Error) {
            int size = ((tw8) grd.getValue()).c().size();
            kc3 kc3 = an8.a;
            List singletonList = Collections.singletonList(Long.valueOf(j));
            hge hge = new hge(c7a.h0);
            lg7 c2 = hwf.c();
            c2.add(new kc3(a7a.c, new hge(c7a.g0), 3, false));
            if (size > 1) {
                c2.add(new kc3(a7a.b, new jge(c7a.f0, cs.g0(new Object[]{Integer.valueOf(size)})), 3, false));
            }
            c2.add(new kc3(a7a.a, new hge(c7a.e0), 1, false));
            taf.o(t0.y1, new ded(singletonList, hge, (hge) null, hwf.a(c2)));
            return;
        }
        k77[] k77Arr = b1;
        k77 k77 = k77Arr[1];
        long[] jArr = (long[]) this.c.a(this);
        e3 e3Var = this.N0;
        if (jArr == null || ((g37 = (g37) e3Var.T0(this, k77Arr[7])) != null && !g37.isActive())) {
            View view2 = view;
            lp.K(view2, je6.LONG_PRESS);
            e3Var.o1(this, k77Arr[7], xs7.E(getViewLifecycleScope(), (hu3) null, ru3.b, new e19(this, j, view2, (Continuation) null), 1));
        }
    }

    public final void y(int i, Bundle bundle) {
        int i2;
        hge hge;
        Long valueOf = bundle != null ? Long.valueOf(bundle.getLong("messages:context_menu:message_id")) : null;
        if (valueOf != null) {
            String string = bundle.getString("messages:context_menu:link_url");
            if (string != null) {
                int i3 = vhc.b;
                int i4 = 3;
                t97 t97 = this.A0;
                if (i == i3) {
                    hhd.q(getContext(), bm3.u(string) ? h0e.k0(string, "mailto:") : bm3.v(string) ? h0e.k0(string, "tel:") : string);
                    if (hhd.y()) {
                        int t = hr1.t(bm3.u(string) ? 3 : bm3.v(string) ? 2 : 1);
                        if (t == 0) {
                            hge = new hge(whc.k);
                        } else if (t == 1) {
                            hge = new hge(whc.n);
                        } else if (t == 2) {
                            hge = new hge(whc.l);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        hba hba = new hba((Widget) this);
                        hba.h(hge);
                        hba.f(new vba(phc.n));
                        hba.j();
                    }
                    js8 v = t0().v();
                    long longValue = valueOf.longValue();
                    if (v != null) {
                        bo8 bo8 = (bo8) t97.getValue();
                        int t2 = hr1.t(bm3.u(string) ? 3 : bm3.v(string) ? 2 : 1);
                        if (t2 == 0) {
                            i2 = 1;
                        } else if (t2 == 1) {
                            i2 = 3;
                        } else if (t2 == 2) {
                            i2 = 2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        bo8.a(longValue, i2, v, 2);
                    }
                } else if (i == vhc.f) {
                    t0().C(string);
                    js8 v2 = t0().v();
                    long longValue2 = valueOf.longValue();
                    if (v2 != null) {
                        if (!bm3.u(string)) {
                            i4 = bm3.v(string) ? 2 : 1;
                        }
                        int t3 = hr1.t(i4);
                        if (t3 == 0) {
                            ((bo8) t97.getValue()).a(longValue2, 1, v2, 3);
                        } else if (t3 == 1) {
                            ((bo8) t97.getValue()).a(longValue2, 3, v2, 5);
                        } else if (t3 == 2) {
                            ((bo8) t97.getValue()).a(longValue2, 2, v2, 4);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else if (i == vhc.h) {
                    t0().D(string);
                }
            }
        } else {
            k77[] k77Arr = b1;
            k77 k77 = k77Arr[1];
            jr jrVar = this.c;
            long[] jArr = (long[]) jrVar.a(this);
            if (jArr != null) {
                k77 k772 = k77Arr[1];
                jrVar.b(this, (Object) null);
                if (i == a7a.y) {
                    u0();
                    nx8 r0 = r0();
                    if (jArr.length != 0) {
                        long j = jArr[0];
                        r0.getClass();
                        taf.o(r0.x0, new lx8(j));
                        return;
                    }
                    throw new NoSuchElementException("Array is empty.");
                }
                if (i == a7a.B || i == a7a.u) {
                    u0();
                }
                zz8 t0 = t0();
                if (jArr.length != 0) {
                    long j2 = jArr[0];
                    t0.getClass();
                    t0.I(i, Collections.singletonList(Long.valueOf(j2)));
                    return;
                }
                throw new NoSuchElementException("Array is empty.");
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MessagesListWidget(android.os.Bundle r24) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            r1 = 0
            r2 = 2
            r9 = 0
            r8.<init>(r0, r1, r2, r9)
            java.lang.Class<one.me.messages.list.ui.MessagesListWidget> r2 = one.me.messages.list.ui.MessagesListWidget.class
            java.lang.String r2 = r2.getName()
            r8.a = r2
            java.lang.String r2 = "MessagesList"
            r8.b = r2
            jr r2 = new jr
            java.lang.String r3 = "arg_key_scope_id"
            java.lang.Class<inc> r4 = defpackage.inc.class
            r2.<init>(r4, r3)
            jr r3 = new jr
            java.lang.Class<long[]> r4 = long[].class
            java.lang.String r5 = "selected.messageIds.Action"
            r3.<init>(r4, r9, r5)
            r8.c = r3
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            jr r4 = new jr
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            java.lang.String r6 = "messages:current.read.mark"
            r4.<init>(r5, r3, r6)
            r8.o = r4
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            jr r4 = new jr
            java.lang.String r5 = "is.last.message.completely.visible.on.detach"
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            r4.<init>(r6, r3, r5)
            r8.X = r4
            jr r4 = new jr
            java.lang.String r5 = "ARG_SKIP_UNREAD_DECOR"
            r4.<init>(r6, r3, r5)
            r8.Y = r4
            k77[] r3 = b1
            r1 = r3[r1]
            java.lang.Object r1 = r2.a(r8)
            inc r1 = (defpackage.inc) r1
            java.lang.String r1 = r1.a
            java.lang.Class<nx8> r2 = defpackage.nx8.class
            t97 r1 = r8.m25getSharedViewModelcp94BC8(r1, r2, r9)
            r8.Z = r1
            xv8 r10 = defpackage.xv8.a
            w4 r1 = r10.getAccessor()
            java.lang.Class<sya> r2 = defpackage.sya.class
            java.lang.Object r1 = r1.c(r2)
            sya r1 = (defpackage.sya) r1
            r8.w0 = r1
            c09 r1 = new c09
            r2 = 0
            r1.<init>(r0, r8, r2)
            js5 r2 = new js5
            r3 = 27
            r2.<init>(r3, r1)
            java.lang.Class<zz8> r1 = defpackage.zz8.class
            t97 r1 = r8.createViewModelLazy(r1, r2)
            r8.x0 = r1
            c09 r1 = new c09
            r2 = 1
            r1.<init>(r0, r8, r2)
            r7e r0 = new r7e
            r0.<init>(r1)
            r8.y0 = r0
            a09 r0 = new a09
            r1 = 12
            r0.<init>(r8, r1)
            r11 = 3
            t97 r0 = ez3.O(r11, r0)
            r8.z0 = r0
            w4 r0 = r10.getAccessor()
            java.lang.Class<bo8> r1 = defpackage.bo8.class
            r7e r0 = r0.d(r1)
            r8.A0 = r0
            ig6 r0 = new ig6
            w4 r1 = r10.getAccessor()
            java.lang.Class<gsc> r2 = defpackage.gsc.class
            r7e r1 = r1.d(r2)
            r0.<init>(r1)
            r8.B0 = r0
            w4 r1 = r10.getAccessor()
            java.lang.Class<x4a> r2 = defpackage.x4a.class
            java.lang.Object r1 = r1.c(r2)
            x4a r1 = (defpackage.x4a) r1
            java.util.concurrent.ExecutorService r13 = r1.a()
            h87 r1 = new h87
            zz8 r16 = r23.t0()
            java.lang.Class<zz8> r17 = defpackage.zz8.class
            java.lang.String r18 = "onAttachClickAction"
            r15 = 1
            java.lang.String r19 = "onAttachClickAction(Lone/me/messages/list/ui/view/MessagesAttachAction;)V"
            r20 = 0
            r21 = 7
            r14 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            lv1 r2 = new lv1
            r3 = 23
            r2.<init>((int) r3, (java.lang.Object) r8)
            k09 r14 = new k09
            r14.<init>(r8)
            ss8 r3 = new ss8
            r4 = 4
            r3.<init>((int) r4, (java.lang.Object) r8)
            uw8 r7 = new uw8
            rp0 r4 = new rp0
            r5 = 3
            r4.<init>(r5, r8)
            a09 r5 = new a09
            r6 = 0
            r5.<init>(r8, r6)
            r12 = r7
            r15 = r1
            r16 = r0
            r17 = r2
            r18 = r4
            r19 = r3
            r20 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r8.E0 = r7
            a09 r0 = new a09
            r1 = 1
            r0.<init>(r8, r1)
            t97 r0 = ez3.O(r11, r0)
            r8.F0 = r0
            int r0 = defpackage.opb.messages_list_recycler_view
            n0c r0 = r8.viewBinding(r0)
            r8.H0 = r0
            int r0 = defpackage.opb.messages_list_scroll_btn
            n0c r0 = r8.viewBinding(r0)
            r8.I0 = r0
            e3 r0 = hwf.t()
            r8.N0 = r0
            a09 r0 = new a09
            r1 = 2
            r0.<init>(r8, r1)
            nl0 r0 = r8.binding(r0)
            r8.O0 = r0
            a09 r0 = new a09
            r1 = 3
            r0.<init>(r8, r1)
            nl0 r0 = r8.binding(r0)
            r8.P0 = r0
            c78 r0 = new c78
            r0.<init>(r8)
            r8.Q0 = r0
            d09 r0 = new d09
            r0.<init>(r8)
            r8.R0 = r0
            e09 r0 = new e09
            r0.<init>(r8)
            r8.S0 = r0
            w4 r0 = r10.getAccessor()
            java.lang.Class<u98> r1 = defpackage.u98.class
            r7e r0 = r0.d(r1)
            r8.T0 = r0
            w1f r12 = new w1f
            w4 r0 = r10.getAccessor()
            java.lang.Class<yya> r1 = defpackage.yya.class
            r7e r16 = r0.d(r1)
            w4 r0 = r10.getAccessor()
            java.lang.Class<c4f> r1 = defpackage.c4f.class
            r7e r17 = r0.d(r1)
            w4 r0 = r10.getAccessor()
            java.lang.Class<v70> r1 = defpackage.v70.class
            java.lang.Object r0 = r0.c(r1)
            r18 = r0
            v70 r18 = (defpackage.v70) r18
            w4 r0 = r10.getAccessor()
            java.lang.Class<gza> r1 = defpackage.gza.class
            r7e r19 = r0.d(r1)
            b09 r13 = new b09
            r0 = 0
            r13.<init>(r8, r0)
            zv r22 = new zv
            java.lang.Class<one.me.messages.list.ui.MessagesListWidget> r3 = one.me.messages.list.ui.MessagesListWidget.class
            java.lang.String r4 = "onMessageClick"
            r1 = 2
            java.lang.String r5 = "onMessageClick(JLandroid/view/View;)V"
            r6 = 0
            r14 = 29
            r0 = r22
            r2 = r23
            r20 = r7
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r15 = r12
            r21 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r8.U0 = r12
            a09 r0 = new a09
            r1 = 8
            r0.<init>(r8, r1)
            nl0 r0 = r8.binding(r0)
            r8.V0 = r0
            a09 r0 = new a09
            r1 = 9
            r0.<init>(r8, r1)
            nl0 r0 = r8.binding(r0)
            r8.W0 = r0
            a09 r0 = new a09
            r1 = 10
            r0.<init>(r8, r1)
            nl0 r0 = r8.binding(r0)
            r8.X0 = r0
            a09 r0 = new a09
            r1 = 11
            r0.<init>(r8, r1)
            nl0 r0 = r8.binding(r0)
            r8.Y0 = r0
            w4 r0 = r10.getAccessor()
            java.lang.Class<xr7> r1 = defpackage.xr7.class
            java.lang.Object r0 = r0.c(r1)
            xr7 r0 = (defpackage.xr7) r0
            t97 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            f03 r1 = (defpackage.f03) r1
            i03 r1 = (defpackage.i03) r1
            long r1 = r1.D()
            long r3 = r0.g
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x021e
            boolean r1 = r0.i
            if (r1 != 0) goto L_0x021e
            goto L_0x0240
        L_0x021e:
            nma r1 = new nma
            oma r2 = defpackage.oma.CHAT_INIT_TO_RENDER
            long r3 = android.os.SystemClock.elapsedRealtime()
            r1.<init>(r2, r3)
            jc9 r3 = r0.e
            r3.k(r2, r1)
            ur7 r1 = new ur7
            r1.<init>(r0, r9)
            kotlinx.coroutines.internal.ContextScope r2 = r0.d
            qod r1 = xs7.E(r2, r9, r9, r1, r11)
            java.util.LinkedHashMap r0 = r0.f
            lma r2 = defpackage.lma.EVENT_OPEN_CHAT
            r0.put(r2, r1)
        L_0x0240:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.<init>(android.os.Bundle):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessagesListWidget(String str, long j, long j2, List list, long j3, boolean z, boolean z2, int i, x54 x54) {
        this(str, j, (i & 4) != 0 ? 0 : j2, (i & 8) != 0 ? hw4.a : list, (i & 16) != 0 ? 0 : j3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (x54) null);
    }
}
