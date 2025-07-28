package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.List;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;

/* renamed from: w51  reason: default package */
public final class w51 extends ConstraintLayout {
    public final CallGridLayoutManager K0;
    public final RecyclerView L0;
    public final ed1 M0;
    public v51 N0;
    public final t97 O0;
    public dga P0 = dga.o;
    public s16 Q0;
    public final GestureDetector R0;

    public w51(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O0 = ez3.O(3, new b5(context, 8));
        setLayoutParams(new re3(-1, -1));
        this.R0 = new GestureDetector(context, new tz(2, this));
        ed1 ed1 = new ed1(raf.c, new lhd(5, this), new s51(this, 0), (dk1) null, new s51(this, 1), 18);
        this.M0 = ed1;
        float f = (float) 2;
        CallGridLayoutManager callGridLayoutManager = new CallGridLayoutManager(context, a24.X(dh4.c().getDisplayMetrics().density * f), new og0((getScreenInfo().f || getScreenInfo().e) ? 2 : 3, 2, (Object) this));
        callGridLayoutManager.K = new t51(this);
        this.K0 = callGridLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(uob.call_grid_opponents_view);
        recyclerView.setAdapter(ed1);
        recyclerView.setLayoutManager(callGridLayoutManager);
        recyclerView.j(new n51(a24.X(f * dh4.c().getDisplayMetrics().density), 0));
        recyclerView.l(new u51(0, this));
        this.L0 = recyclerView;
        addView(recyclerView, -1, -1);
        bf3 p = a06.p(this);
        int id = recyclerView.getId();
        p.d(id, 4, 0, 4);
        p.d(id, 6, 0, 6);
        p.d(id, 7, 0, 7);
        p.d(id, 3, 0, 3);
        p.a(this);
    }

    private final ync getScreenInfo() {
        return (ync) this.O0.getValue();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.R0.onTouchEvent(motionEvent);
    }

    public final void setListener(v51 v51) {
        this.N0 = v51;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [ed1, ig7] */
    public final void setOpponents(dga dga) {
        RecyclerView recyclerView = this.L0;
        List list = dga.c;
        int i = dga.a;
        if (i == 0 && list.size() > 2 && getHeight() != -2) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                recyclerView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else if (i == 0 && list.size() <= 2 && getHeight() != -1) {
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                recyclerView.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else if (i > 0 && getHeight() != -1) {
            ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.height = -1;
                recyclerView.setLayoutParams(layoutParams3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.P0 = dga;
        this.M0.E(list);
    }

    public final void setOpponentsViewPool(b bVar) {
        this.L0.setRecycledViewPool(bVar);
    }

    public final void setParentSizeProvider(o51 o51) {
        this.K0.P = o51;
    }

    public final void setVideoLayoutUpdatesControllerProvider(s16 s16) {
        this.Q0 = s16;
    }
}
