package defpackage;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: rf7  reason: default package */
public final class rf7 implements TransformationMethod {
    public of7 a;
    public final boolean b;
    public final boolean c;
    public final s16 d;
    public final p7 e;

    public rf7(of7 of7, s16 s16, int i) {
        of7 = (i & 1) != 0 ? null : of7;
        boolean z = (i & 2) != 0;
        this.a = of7;
        this.b = z;
        this.c = false;
        this.d = s16;
        this.e = new p7(0);
    }

    public static void a(Spannable spannable) {
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        if (spans != null) {
            for (Object obj : spans) {
                if (obj instanceof nf7) {
                    ((nf7) obj).a = null;
                } else if (obj instanceof efb) {
                    ((efb) obj).o = null;
                } else if (obj instanceof pe6) {
                    ((pe6) obj).c = null;
                } else if (obj instanceof yo0) {
                    ((yo0) obj).c = null;
                } else if (obj instanceof ip8) {
                    ((ip8) obj).c = null;
                } else if (obj instanceof lf7) {
                    ((lf7) obj).c = null;
                }
            }
        }
    }

    public final void b(View view, String str, sf7 sf7, ClickableSpan clickableSpan) {
        long currentTimeMillis = System.currentTimeMillis();
        p7 p7Var = this.e;
        if (currentTimeMillis - p7Var.c > p7Var.b) {
            p7Var.c = currentTimeMillis;
            of7 of7 = this.a;
            if (of7 == null) {
                of7 = view instanceof of7 ? (of7) view : null;
            }
            if (of7 != null) {
                of7.c(str, sf7, clickableSpan);
            }
        }
    }

    public final void c(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            if (spans != null) {
                for (Object d2 : spans) {
                    d(d2);
                }
            }
        }
    }

    public final void d(Object obj) {
        if (obj != null) {
            if (obj instanceof nf7) {
                ((nf7) obj).a = this.a;
            } else if (obj instanceof efb) {
                ((efb) obj).o = new pf7(this);
            } else if (obj instanceof pe6) {
                ((pe6) obj).c = new mf7(this, obj);
            } else if (obj instanceof yo0) {
                ((yo0) obj).c = new mf7(this, obj);
            } else if (obj instanceof ip8) {
                ((ip8) obj).c = new qf7(this);
            } else if (obj instanceof lf7) {
                ((lf7) obj).c = new mf7(this, obj);
            }
        }
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        Spannable l = lu7.l(charSequence, ((Number) this.d.invoke()).intValue(), this.b, this.c, new gw2(24, this));
        return l == null ? charSequence : l;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
