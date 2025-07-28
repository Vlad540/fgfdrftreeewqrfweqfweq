package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: o61  reason: default package */
public final class o61 extends jgd {
    public final mod X;
    public final Executor Y;

    public o61(mod mod, ExecutorService executorService) {
        super(executorService);
        this.X = mod;
        this.Y = executorService;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [n61, b7c] */
    public final void s(b7c b7c, int i, List list) {
        ? r5 = (n61) b7c;
        if (list.isEmpty()) {
            r5.A((eh6) this.o.f.get(i));
            return;
        }
        rg5 rg5 = new rg5(myc.L(new xi5(new es(2, list), new o8(19), oyc.a), x51.c));
        while (rg5.hasNext()) {
            dh6 dh6 = (dh6) rg5.next();
            boolean z = dh6 instanceof bh6;
            View view = r5.a;
            if (z) {
                ((fh3) view).setTitle(((bh6) dh6).a);
            } else if (dh6 instanceof xg6) {
                xg6 xg6 = (xg6) dh6;
                boolean z2 = xg6.d;
                long j = xg6.a;
                if (z2) {
                    fh3 fh3 = (fh3) view;
                    fh3.F(j, (CharSequence) null, (String) null);
                    fh3.setAvatarOverlay((oc0) r5.K0.getValue());
                } else {
                    fh3 fh32 = (fh3) view;
                    fh32.setAvatarOverlay((oc0) null);
                    String str = xg6.c;
                    if (str == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    fh32.F(j, xg6.b, str);
                }
            } else if (dh6 instanceof ch6) {
                ((fh3) view).setTime(((ch6) dh6).a);
            } else if (dh6 instanceof ah6) {
                ((fh3) view).C(((ah6) dh6).a);
            } else if (dh6 instanceof zg6) {
                ((fh3) view).setDescription(((zg6) dh6).a);
            } else if (dh6 instanceof yg6) {
                fh3 fh33 = (fh3) view;
                yg6 yg6 = (yg6) dh6;
                boolean z3 = true;
                fh33.A(yg6.a == 1);
                if (yg6.a != 2) {
                    z3 = false;
                }
                fh33.B(z3);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [n61, b7c] */
    public final b7c t(ViewGroup viewGroup, int i) {
        return new n61(new fh3(viewGroup.getContext(), (AttributeSet) null), this.X);
    }
}
