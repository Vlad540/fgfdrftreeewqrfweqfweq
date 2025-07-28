package defpackage;

import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: ur5  reason: default package */
public final class ur5 extends jgd {
    public final /* synthetic */ int X = 1;
    public final Object Y;
    public final Object Z;
    public final n26 w0;

    public ur5(ExecutorService executorService, zx1 zx1, gu2 gu2) {
        super(executorService);
        this.Y = executorService;
        this.Z = zx1;
        this.w0 = gu2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [f6c, jgd, ig7, ur5] */
    public void s(b7c b7c, int i, List list) {
        switch (this.X) {
            case 1:
                chd chd = (chd) b7c;
                if (!list.isEmpty()) {
                    for (Object obj : list) {
                        if (obj instanceof ci8) {
                            chd.B((pg7) this.o.f.get(i), o23.e0(list));
                            return;
                        }
                    }
                }
                H(chd, i);
                return;
            default:
                ur5.super.s(b7c, i, list);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [h41, b7c] */
    /* JADX WARNING: type inference failed for: r4v3, types: [h41, b7c] */
    public final b7c t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                if (i == xob.oneme_folder_widget_section_view_type) {
                    return new h41(viewGroup.getContext(), (ExecutorService) ((Executor) this.Y), (zx1) ((vr5) this.Z));
                }
                if (i == xob.oneme_folder_widget_section_empty_view_type) {
                    return new h41(viewGroup.getContext(), (gu2) ((s16) this.w0));
                }
                String name = ur5.class.getName();
                throw new IllegalStateException(("Not supported viewType " + i + " for " + name).toString());
            default:
                if (i != a7a.D) {
                    return new rq3(viewGroup.getContext(), (u16) this.Z);
                }
                return new rq3(viewGroup.getContext(), (smc) this.Y, (u16) this.w0);
        }
    }

    public ur5(ExecutorService executorService, smc smc, h87 h87, io8 io8) {
        super(executorService);
        this.Y = smc;
        this.Z = h87;
        this.w0 = io8;
    }
}
