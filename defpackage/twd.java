package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* renamed from: twd  reason: default package */
public final class twd extends jgd {
    public final /* synthetic */ int X = 1;
    public final u16 Y;
    public final Object Z;
    public final n26 w0;

    public twd(ExecutorService executorService, hzb hzb, e98 e98, u5b u5b) {
        super(executorService);
        this.Z = hzb;
        this.Y = e98;
        this.w0 = u5b;
    }

    public final void H(chd chd, int i) {
        switch (this.X) {
            case 0:
                super.r(chd, i);
                if (chd instanceof ftc) {
                    ((ftc) chd).d(this.Y);
                }
                if (chd instanceof dud) {
                    dud dud = (dud) chd;
                    dud.M0.setOnTouchListener(new wd1(dud, this.w0));
                    u16 u16 = (u16) this.Z;
                    View view = dud.a;
                    if (u16 != null) {
                        view.setOnLongClickListener(new eb1(dud, 8, u16));
                        return;
                    } else {
                        view.setOnLongClickListener((View.OnLongClickListener) null);
                        return;
                    }
                } else {
                    return;
                }
            default:
                pg7 pg7 = (pg7) C(i);
                gzb gzb = null;
                fzb fzb = pg7 instanceof fzb ? (fzb) pg7 : null;
                if (fzb != null) {
                    if (chd instanceof gzb) {
                        gzb = (gzb) chd;
                    }
                    if (gzb != null) {
                        gzb.A(fzb);
                        a24.a0(gzb.a, new xv5(this.Y, 24, fzb));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public long k(int i) {
        switch (this.X) {
            case 1:
                return ((pg7) C(i)).getItemId();
            default:
                return super.k(i);
        }
    }

    public int l(int i) {
        switch (this.X) {
            case 1:
                return ((pg7) C(i)).l();
            default:
                return super.l(i);
        }
    }

    public final /* bridge */ /* synthetic */ void r(b7c b7c, int i) {
        switch (this.X) {
            case 0:
                H((chd) b7c, i);
                return;
            default:
                H((chd) b7c, i);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [android.view.View, n7d] */
    public final b7c t(ViewGroup viewGroup, int i) {
        switch (this.X) {
            case 0:
                if (i == rca.g) {
                    return new b7c(new n7d(viewGroup.getContext(), (AttributeSet) null));
                }
                if (i == rca.m) {
                    return new swd(viewGroup.getContext());
                }
                if (i == rca.h) {
                    return new swd(viewGroup.getContext());
                }
                if (i == rca.s) {
                    TextView textView = new TextView(viewGroup.getContext());
                    float f = (float) 16;
                    textView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), textView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), textView.getPaddingBottom());
                    nte.t.b(textView, yq4.b);
                    urd.B(new y9(3, (Continuation) null, 26), textView);
                    return new rx0(textView, 17);
                } else if (i == rca.r) {
                    return new dud(viewGroup.getContext());
                } else {
                    String name = twd.class.getName();
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        fn6.d(tn7.Z, name, wn6.h(i, "unknown item viewType: "), (Throwable) null);
                    }
                    return new rx0(new View(viewGroup.getContext()), 18);
                }
            default:
                int i2 = thc.a;
                hzb hzb = (hzb) this.Z;
                if (i != i2) {
                    return new gzb(viewGroup.getContext(), hzb);
                }
                Context context = viewGroup.getContext();
                u5b u5b = new u5b(4, this);
                ImageView imageView = new ImageView(context);
                int X2 = a24.X(((float) hzb.a()) * dh4.c().getDisplayMetrics().density);
                imageView.setLayoutParams(new n6c(X2, X2));
                a24.a0(imageView, new q6(19, u5b));
                urd.B(new ey6(X2, (Continuation) null, 1), imageView);
                return new rx0(imageView, 10);
        }
    }

    public twd(ExecutorService executorService, wwd wwd, wwd wwd2, wwd wwd3) {
        super(executorService);
        this.Y = wwd;
        this.Z = wwd2;
        this.w0 = wwd3;
    }
}
