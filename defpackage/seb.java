package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: seb  reason: default package */
public final class seb extends jgd {
    public final reb X;
    public final wwc Y = new wwc(20, this);

    public seb(ExecutorService executorService, reb reb) {
        super(executorService);
        this.X = reb;
    }

    /* renamed from: J */
    public final void r(ifb ifb, int i) {
        View.OnLongClickListener onLongClickListener;
        ncb ncb = (ncb) ((pg7) C(i));
        b7c b7c = null;
        View.OnClickListener neb = ncb instanceof wbb ? new neb(this, 0) : ncb instanceof acb ? new neb(this, 1) : ncb instanceof ybb ? new neb(this, 2) : ncb instanceof zbb ? new neb(this, 3) : ncb instanceof lcb ? new neb(this, 4) : ncb instanceof kcb ? new neb(this, 5) : ncb instanceof fcb ? new oeb(ncb, this) : ncb instanceof icb ? new oeb(this, ncb) : null;
        if (ncb instanceof lcb) {
            onLongClickListener = new wk0(7, this);
        } else {
            if (ncb instanceof fcb) {
                ((fcb) ncb).getClass();
                int t = hr1.t(1);
                if (t != 0) {
                    if (t == 1) {
                        onLongClickListener = new peb(this, ncb, i);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            onLongClickListener = null;
        }
        ifb.A(ncb);
        if ((ncb instanceof bcb) || (ncb instanceof hcb)) {
            ifb.G(this.Y);
        } else if (ncb instanceof acb) {
            if (ifb instanceof f12) {
                b7c = (f12) ifb;
            }
            if (b7c != null) {
                ((d12) b7c.a).setOnShareLinkClickListener(new e12(0, new qeb(this, 0)));
            }
        } else if (ncb instanceof vbb) {
            if (ifb instanceof g1a) {
                b7c = (g1a) ifb;
            }
            if (b7c != null) {
                ((f1a) b7c.a).setListener(new xp(5, new qeb(this, 1)));
            }
        }
        if (neb != null) {
            ifb.H(neb);
        }
        if (onLongClickListener != null) {
            ifb.I(onLongClickListener);
        }
    }

    public final int l(int i) {
        return ((ncb) ((pg7) C(i))).l();
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [android.view.View, n7d] */
    /* JADX WARNING: type inference failed for: r2v20, types: [d12, android.view.View] */
    public final b7c t(ViewGroup viewGroup, int i) {
        int i2 = i;
        int i3 = 536870911 & i2;
        if (kjd.p(i3, 1)) {
            f1a f1a = new f1a(viewGroup.getContext());
            b7c b7c = new b7c(f1a);
            f1a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return b7c;
        } else if (kjd.p(i3, 2)) {
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), (AttributeSet) null);
            s10 s10 = new s10(oneMeButton, 6);
            oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return s10;
        } else if (kjd.p(i3, 4)) {
            return new s10(viewGroup.getContext());
        } else {
            if (kjd.p(i3, 65536)) {
                return new s10(new an3(viewGroup.getContext()), 3);
            }
            if (kjd.p(i3, 8)) {
                return new s10(new fk2(viewGroup.getContext()), 1);
            }
            if (kjd.p(i3, 16)) {
                ConstraintLayout n7d = new n7d(viewGroup.getContext(), (AttributeSet) null);
                s10 s102 = new s10(n7d, 7);
                n7d.setId(j8a.b1);
                return s102;
            } else if (kjd.p(i3, 4096)) {
                TextView textView = new TextView(viewGroup.getContext());
                s10 s103 = new s10(textView, 4);
                s103.F();
                textView.setId(j8a.z);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                textView.setGravity(16);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                nte.k.b(textView, yq4.b);
                urd.B(new y9(3, (Continuation) null, 11), textView);
                return s103;
            } else if (kjd.p(i3, 32)) {
                TextView textView2 = new TextView(viewGroup.getContext());
                s10 s104 = new s10(textView2, 5);
                s104.F();
                textView2.setId(j8a.T);
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                textView2.setTextAlignment(5);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                nte.k.b(textView2, yq4.b);
                Drawable b = gq3.b(textView2.getContext(), phc.V1);
                float f = (float) 20;
                b.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                textView2.setCompoundDrawablePadding(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
                textView2.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, b, (Drawable) null);
                urd.B(new c3(b, (Continuation) null, 14), textView2);
                return s104;
            } else if (kjd.p(i3, 32768)) {
                return new b7c(new d12(viewGroup.getContext()));
            } else {
                if (kjd.p(i3, 64)) {
                    return new dc(viewGroup.getContext(), 0);
                }
                if (kjd.p(i3, 256)) {
                    ? n7d2 = new n7d(viewGroup.getContext(), (AttributeSet) null);
                    s10 s105 = new s10(n7d2, 0);
                    n7d2.setModelItem(new o7d((long) 256, 0, new hge(l8a.i), (d7d) null, new hge(l8a.j), Integer.valueOf(phc.h1), w6d.a, (u6d) null, (mge) null, 0, (r6d) null, 1800));
                    return s105;
                } else if (kjd.p(i3, 128)) {
                    return new dc(viewGroup.getContext(), 1);
                } else {
                    if (kjd.p(i3, 512)) {
                        kh3 kh3 = new kh3(viewGroup.getContext(), (AttributeSet) null);
                        s10 s106 = new s10(kh3, 2);
                        urd.B(new o53(3, (Continuation) null, 0), kh3);
                        return s106;
                    } else if (kjd.p(i3, 2048)) {
                        return new dc(viewGroup.getContext(), 2);
                    } else {
                        if (kjd.p(i3, 1024)) {
                            ycd ycd = new ycd(viewGroup.getContext());
                            ycd.setShimmerBackground(xcd.a);
                            return new s10(ycd, 9);
                        }
                        throw new IllegalStateException(("unknown item view type " + i2 + "}").toString());
                    }
                }
            }
        }
    }
}
