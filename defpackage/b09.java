package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: b09  reason: default package */
public final /* synthetic */ class b09 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ b09(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final Object invoke(Object obj) {
        ru3 ru3 = ru3.b;
        jue jue = jue.a;
        MessagesListWidget messagesListWidget = this.b;
        switch (this.a) {
            case 0:
                u1f u1f = (u1f) obj;
                k77[] k77Arr = MessagesListWidget.b1;
                zz8 t0 = messagesListWidget.t0();
                t0.getClass();
                t0.q1.o1(t0, zz8.I1[6], taf.n(t0, (hu3) null, ru3, new oz8(t0, u1f, (Continuation) null), 1));
                messagesListWidget.t0().G(u1f.c, u1f.a, (String) null);
                return jue;
            case 1:
                FrameLayout frameLayout = (FrameLayout) obj;
                k77[] k77Arr2 = MessagesListWidget.b1;
                RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(a7a.Q);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.setLayoutManager(messagesListWidget.n0());
                uw8 uw8 = messagesListWidget.E0;
                endlessRecyclerView2.setAdapter(uw8);
                endlessRecyclerView2.setHasFixedSize(true);
                endlessRecyclerView2.setItemAnimator((k6c) null);
                endlessRecyclerView2.setThreshold(20);
                endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
                endlessRecyclerView2.setPager(new mb1(16, messagesListWidget));
                endlessRecyclerView2.m(messagesListWidget.Q0);
                endlessRecyclerView2.m(messagesListWidget.R0);
                endlessRecyclerView2.m(messagesListWidget.S0);
                endlessRecyclerView2.k(new i87(1, messagesListWidget));
                d04 d04 = new d04(new b09(messagesListWidget, 4));
                messagesListWidget.K0 = d04;
                ryd ryd = new ryd(endlessRecyclerView2, uw8, d04);
                endlessRecyclerView2.j(ryd);
                messagesListWidget.L0 = ryd;
                wue wue = new wue(uw8, endlessRecyclerView2);
                endlessRecyclerView2.j(wue);
                messagesListWidget.J0 = wue;
                c7e c7e = new c7e(xv8.a.getAccessor().d(cn0.class), new WeakReference(endlessRecyclerView2), messagesListWidget.requireActivity(), new a09(messagesListWidget, 7), new b09(messagesListWidget, 5));
                messagesListWidget.C0 = c7e;
                d19 d19 = new d19(messagesListWidget, c7e);
                messagesListWidget.D0 = d19;
                d19.i(endlessRecyclerView2);
                urd.B(new z9((Object) messagesListWidget, (Continuation) null, 23, false), endlessRecyclerView2);
                frameLayout.addView(endlessRecyclerView2);
                frameLayout.addView(messagesListWidget.m0());
                k77 k77 = MessagesListWidget.b1[13];
                frameLayout.addView((dzb) messagesListWidget.Y0.getValue());
                zoc zoc = new zoc(frameLayout.getContext());
                zoc.setId(a7a.R);
                zoc.setOnClickListener(new b09(messagesListWidget, 3));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, a24.X(((float) 6) * dh4.c().getDisplayMetrics().density), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 8388693;
                frameLayout.addView(zoc, layoutParams);
                return jue;
            case 2:
                long longValue = ((Long) obj).longValue();
                k77[] k77Arr3 = MessagesListWidget.b1;
                messagesListWidget.t0().E(longValue);
                return jue;
            case 3:
                k77[] k77Arr4 = MessagesListWidget.b1;
                int ordinal = ((toc) obj).ordinal();
                if (ordinal == 0) {
                    MessageModel K = messagesListWidget.E0.K(messagesListWidget.q0().getLinearLayoutManager().Y0());
                    if (K != null) {
                        zz8 t02 = messagesListWidget.t0();
                        t02.K(xs7.D(t02.a, t02.G0, ru3, new iz8(t02, K, (Continuation) null)));
                    }
                } else if (ordinal == 1) {
                    zz8 t03 = messagesListWidget.t0();
                    t03.K(xs7.D(t03.a, t03.G0, ru3, new ny8(t03, (Continuation) null)));
                } else if (ordinal == 2) {
                    zz8 t04 = messagesListWidget.t0();
                    t04.K(xs7.D(t04.a, t04.G0, ru3, new fz8(t04, (Continuation) null)));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return jue;
            case 4:
                MessageModel K2 = messagesListWidget.E0.K(((Integer) obj).intValue());
                CharSequence charSequence = K2 != null ? K2.Y : null;
                if (charSequence == null || charSequence.length() == 0) {
                    return null;
                }
                return charSequence;
            default:
                int intValue = ((Integer) obj).intValue();
                k77[] k77Arr5 = MessagesListWidget.b1;
                messagesListWidget.u0();
                MessageModel K3 = messagesListWidget.E0.K(intValue);
                if (K3 != null) {
                    nx8 r0 = messagesListWidget.r0();
                    r0.getClass();
                    taf.o(r0.x0, new lx8(K3.a));
                }
                return jue;
        }
    }
}
