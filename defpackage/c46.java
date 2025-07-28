package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: c46  reason: default package */
public final class c46 extends ig7 {
    public final m66 X;

    public c46(m66 m66) {
        super(w04.l);
        this.X = m66;
    }

    public final int l(int i) {
        i56 i56 = (i56) C(i);
        if (i56 != null) {
            return i56.a;
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [one.me.sdk.gallery.view.NumericCheckButton, android.view.View] */
    public final void r(b7c b7c, int i) {
        wce wce;
        n56 n56 = (n56) b7c;
        i56 i56 = (i56) C(i);
        if (i56 != null) {
            if ((n56 instanceof m56) && (i56 instanceof h56)) {
                m56 m56 = (m56) n56;
                h56 h56 = (h56) i56;
                yk7 yk7 = h56.c;
                int i2 = yk7.A0;
                int i3 = ((i2 == 3) || i2 == 4) ? 0 : 8;
                AppCompatTextView appCompatTextView = m56.M0;
                appCompatTextView.setVisibility(i3);
                int i4 = yk7.A0;
                if (i4 == 3) {
                    appCompatTextView.setText(appCompatTextView.getContext().getString(cic.l1));
                    appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    appCompatTextView.setVisibility(0);
                } else if (i4 == 4) {
                    Context context = appCompatTextView.getContext();
                    int i5 = zhc.s0;
                    if (appCompatTextView.isInEditMode()) {
                        wce = db4.e0;
                    } else {
                        Context context2 = appCompatTextView.getContext();
                        r7e r7e = wce.a0;
                        wce = fja.E(context2);
                    }
                    Drawable q = js.q(i5, wce.t, context);
                    appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(q, (Drawable) null, (Drawable) null, (Drawable) null);
                    if (q instanceof AnimationDrawable) {
                        appCompatTextView.post(new rs8(q, 1));
                    }
                    String[] strArr = dhe.b;
                    appCompatTextView.setText(d8.a(h56.m));
                    appCompatTextView.setVisibility(0);
                }
                Context context3 = m56.a.getContext();
                ur6 d = ur6.d(h56.l);
                d.i = false;
                d.o = Boolean.FALSE;
                d.d = h56.d;
                int i6 = h56.k;
                if (i6 != 0) {
                    d.l = new mpa(i6, 1);
                }
                Uri uri = h56.g;
                if (uri != null) {
                    d.l = new qha(context3, uri);
                }
                tr6 a = d.a();
                int i7 = OneMeDraweeView.F0;
                m56.L0.o(a, (tr6) null);
                ? r5 = m56.K0;
                if (r5 != 0) {
                    if (h56.i) {
                        r5.setEnabled(true);
                        r5.setNumber(h56.h);
                    } else {
                        r5.setNumber(0);
                        r5.setEnabled(false);
                    }
                    a24.a0(r5, new eu5(3, m56));
                }
            }
            a24.a0(n56.a, new fz2(this, i, i56, 2));
        }
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        return i == 5 ? new b7c(from.inflate(t9a.b, viewGroup, false)) : new m56(from.inflate(t9a.c, viewGroup, false), this.X);
    }
}
