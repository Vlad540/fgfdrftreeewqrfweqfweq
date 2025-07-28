package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* renamed from: i41  reason: default package */
public final class i41 extends jgd implements py4 {
    public final /* synthetic */ int X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i41(Executor executor, int i) {
        super(executor);
        this.X = i;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [jgd, i41, ig7] */
    public void H(chd chd, int i) {
        switch (this.X) {
            case 5:
                r7d r7d = (r7d) chd;
                c3d.n((pg7) C(i));
                throw null;
            case 6:
                bdd bdd = (pg7) C(i);
                add add = ((cdd) chd).a.o;
                add.c = true;
                add.b.c();
                return;
            default:
                i41.super.H(chd, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [i41, ig7] */
    public void d() {
        E(Collections.singletonList(wu2.a));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [i41, ig7] */
    public void g() {
        E((List) null);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [jgd, i41, ig7] */
    public int l(int i) {
        switch (this.X) {
            case 0:
                return ((pg7) C(i)).o;
            case 3:
                ow4 ow4 = (pg7) C(i);
                return ow4.b;
            case 4:
                rj7 rj7 = (pg7) C(i);
                return rj7.b;
            default:
                return i41.super.l(i);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [jgd, i41, ig7] */
    public void r(b7c b7c, int i) {
        switch (this.X) {
            case 5:
                r7d r7d = (r7d) b7c;
                c3d.n((pg7) C(i));
                throw null;
            case 6:
                bdd bdd = (pg7) C(i);
                add add = ((cdd) b7c).a.o;
                add.c = true;
                add.b.c();
                return;
            default:
                i41.super.r(b7c, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [h41, b7c] */
    /* JADX WARNING: type inference failed for: r4v5, types: [rx0, b7c] */
    /* JADX WARNING: type inference failed for: r4v6, types: [rx0, b7c] */
    /* JADX WARNING: type inference failed for: r4v7, types: [rx0, b7c] */
    /* JADX WARNING: type inference failed for: r4v8, types: [rx0, b7c] */
    public final b7c t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                if (i == uob.call_event_view_item) {
                    return new h41(new f41(viewGroup.getContext()));
                }
                throw new IllegalArgumentException("Not supported viewType for CallEventsAdapter");
            case 1:
                return new rx0(new yu2(viewGroup.getContext()), 6);
            case 2:
                return new rx0(new EmptySearchView(viewGroup.getContext(), (AttributeSet) null), 7);
            case 3:
                p4a p4a = new p4a(viewGroup.getContext(), (AttributeSet) null);
                ? rx0 = new rx0(p4a, 8);
                p4a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                p4a.setIcon(phc.O0);
                p4a.setTitle(new hge(rhc.d0));
                p4a.setSubtitle(new hge(rhc.b0));
                return rx0;
            case 4:
                Context context = viewGroup.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ProgressBar progressBar = new ProgressBar(context);
                float f = (float) 48;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 17;
                progressBar.setLayoutParams(layoutParams);
                js.E(progressBar, km4.y0.r(progressBar).getIcon().h);
                frameLayout.addView(progressBar);
                return new rx0(frameLayout, 9);
            case 5:
                return new b7c(new OneMeButton(viewGroup.getContext(), (AttributeSet) null));
            default:
                return new b7c(new ycd(viewGroup.getContext()));
        }
    }
}
