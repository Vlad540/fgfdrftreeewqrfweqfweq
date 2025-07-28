package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* renamed from: r51  reason: default package */
public final class r51 extends ConstraintLayout implements ms3 {
    public final t97 K0 = ez3.O(3, new p51(this, 0));
    public final t97 L0;
    public final ViewStub M0;
    public final ViewPager2 N0;
    public final nc6 O0;
    public final z51 P0;
    public final t97 Q0;
    public b R0;
    public q51 S0;
    public f5f T0;
    public ns3 U0;
    public final hg0 V0;

    /* JADX WARNING: type inference failed for: r4v1, types: [f6c, z51] */
    public r51(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L0 = ez3.O(3, new b5(context, 7));
        this.Q0 = ez3.O(3, new x2((Object) context, 7, (Object) this));
        this.V0 = new hg0(1, this);
        setLayoutParams(new re3(-1, -1));
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(o1a.E1);
        this.N0 = viewPager2;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(o1a.D1);
        this.M0 = viewStub;
        ? z51 = new z51(new x3a(5, (Object) this), new wwc(4, this), new p51(this, 1), new p51(this, 2));
        viewPager2.setAdapter(z51);
        this.P0 = z51;
        nc6 nc6 = new nc6(context);
        nc6.setId(uob.call_users_speakers_view_tab_layout);
        nc6.setBackgroundColor(0);
        nc6.setVisibility(8);
        this.O0 = nc6;
        addView(viewPager2, getScreenInfo().g ? (getScreenInfo().a * 9) / 16 : 0, getScreenInfo().f ? getScreenInfo().b : 0);
        addView(nc6, a24.X(((float) 80) * dh4.c().getDisplayMetrics().density), a24.X(((float) 24) * dh4.c().getDisplayMetrics().density));
        addView(viewStub, -2, -2);
        bf3 p = a06.p(this);
        int id = viewPager2.getId();
        p.d(id, 4, nc6.getId(), 3);
        hr1.q((float) 6, dh4.c().getDisplayMetrics().density, new hw9(p, 4, id, 4));
        p.d(id, 6, 0, 6);
        p.d(id, 7, 0, 7);
        p.d(id, 3, 0, 3);
        int id2 = nc6.getId();
        p.d(id2, 4, 0, 4);
        hr1.q((float) 8, dh4.c().getDisplayMetrics().density, new hw9(p, 4, id2, 4));
        p.d(id2, 6, 0, 6);
        p.d(id2, 7, 0, 7);
        int id3 = viewStub.getId();
        p.d(id3, 6, viewPager2.getId(), 6);
        new hw9(p, 6, id3, 4).e(a24.X(((float) 16) * dh4.c().getDisplayMetrics().density));
        p.d(id3, 4, nc6.getId(), 4);
        p.d(id3, 3, nc6.getId(), 3);
        p.d(id3, 7, nc6.getId(), 6);
        p.g(id3).d.l0 = true;
        p.g(id3).d.w = 0.0f;
        p.a(this);
    }

    private final jc6 getMediator() {
        return (jc6) this.K0.getValue();
    }

    private final ync getScreenInfo() {
        return (ync) this.L0.getValue();
    }

    private final TextView getScrollToStartView() {
        return (TextView) this.Q0.getValue();
    }

    public static final void w(r51 r51, int i) {
        r51.getClass();
        boolean z = true;
        if (i <= 1) {
            z = false;
        }
        boolean z2 = z;
        ViewStub viewStub = r51.M0;
        if (ek8.K(viewStub) || z2) {
            ek8.I(viewStub, r51.getScrollToStartView(), (s16) null);
            mt0.k(r51.getScrollToStartView(), z2, 0, (u16) null, 6);
        }
    }

    public final void D(ls3 ls3) {
        kjd.T(this, ls3.b());
    }

    public final List H(ks3 ks3, ks3 ks32) {
        return hw4.a;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jc6 mediator = getMediator();
        if (!mediator.c) {
            mediator.c = true;
            ViewPager2 viewPager2 = mediator.a;
            f6c adapter = viewPager2.getAdapter();
            mediator.d = adapter;
            if (adapter != null) {
                jw4 jw4 = new jw4(3, mediator);
                mediator.f = jw4;
                adapter.z(jw4);
                ic6 ic6 = new ic6(mediator.b);
                mediator.e = ic6;
                viewPager2.b(ic6);
                mediator.a();
            } else {
                throw new IllegalStateException("Attached before view pager has an adapter".toString());
            }
        }
        this.N0.b(this.V0);
    }

    public final void onDetachedFromWindow() {
        f6c f6c;
        super.onDetachedFromWindow();
        jc6 mediator = getMediator();
        if (mediator.c) {
            mediator.c = false;
            jw4 jw4 = mediator.f;
            if (!(jw4 == null || (f6c = mediator.d) == null)) {
                f6c.B(jw4);
            }
            mediator.f = null;
            mediator.d = null;
            ic6 ic6 = mediator.e;
            if (ic6 != null) {
                mediator.a.g(ic6);
            }
            mediator.e = null;
        }
        this.N0.g(this.V0);
    }

    public final void setControlsMediator(ns3 ns3) {
        this.U0 = ns3;
    }

    public final void setListener(q51 q51) {
        this.S0 = q51;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [z51, ig7] */
    public final void setOpponents(List<dga> list) {
        this.P0.E(list);
        int i = 0;
        if (!(list.size() > 1)) {
            i = 8;
        }
        nc6 nc6 = this.O0;
        nc6.setVisibility(i);
        nc6.b(list.size(), Math.min(list.size() - 1, this.N0.getCurrentItem()));
        ns3 ns3 = this.U0;
        if (ns3 != null) {
            rs3 rs3 = (rs3) ns3;
            D(rs3.j);
            u(rs3.k);
        }
    }

    public final void setOpponentsViewPool(b bVar) {
        this.R0 = bVar;
    }

    public final void setVideoLayoutUpdatesController(f5f f5f) {
        this.T0 = f5f;
    }

    public final void u(ls3 ls3) {
        kjd.S(this, ls3.b());
    }
}
