package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.b;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: z51  reason: default package */
public final class z51 extends jgd {
    public final /* synthetic */ int X = 1;
    public final Object Y;
    public final Object Z;
    public final Object w0;
    public final Object x0;

    public z51(ExecutorService executorService, er7 er7, mv4 mv4) {
        super(executorService);
        this.Y = executorService;
        this.Z = er7;
        this.w0 = mv4;
        this.x0 = new ygd(this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [jgd, z51, ig7] */
    public void H(chd chd, int i) {
        switch (this.X) {
            case 0:
                ((y51) chd).J0.setOpponents((pg7) C(i));
                return;
            default:
                z51.super.H(chd, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [z51, ig7] */
    public int j() {
        switch (this.X) {
            case 0:
                return this.o.f.size();
            default:
                return z51.super.j();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [jgd, z51, ig7] */
    public void r(b7c b7c, int i) {
        switch (this.X) {
            case 0:
                ((y51) b7c).J0.setOpponents((pg7) C(i));
                return;
            default:
                z51.super.r(b7c, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [f6c, z51, ig7] */
    public void s(b7c b7c, int i, List list) {
        switch (this.X) {
            case 0:
                y51 y51 = (y51) b7c;
                if (list.isEmpty()) {
                    y51.J0.setOpponents((pg7) C(i));
                    return;
                }
                y51.B((dga) this.o.f.get(i), list);
                return;
            default:
                z51.super.s(b7c, i, list);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [y51, b7c] */
    public final b7c t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                w51 w51 = new w51(viewGroup.getContext(), (AttributeSet) null);
                w51.setId(uob.call_opponents);
                w51.setParentSizeProvider((o51) this.Y);
                w51.setVideoLayoutUpdatesControllerProvider((s16) this.w0);
                w51.setListener((v51) this.Z);
                w51.setOpponentsViewPool((b) ((s16) this.x0).invoke());
                frameLayout.addView(w51, -1, -1);
                return new y51(frameLayout);
            default:
                return new rq3(viewGroup.getContext(), (er7) this.Z, (ExecutorService) ((Executor) this.Y), (ygd) this.x0);
        }
    }

    public z51(x3a x3a, wwc wwc, p51 p51, p51 p512) {
        super(nqc.a.p().a());
        this.Y = x3a;
        this.Z = wwc;
        this.w0 = p51;
        this.x0 = p512;
    }
}
