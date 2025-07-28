package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import one.me.sdk.arch.Widget;

/* renamed from: irf  reason: default package */
public final class irf extends pr3 {
    public boolean a;
    public final /* synthetic */ Widget b;

    public irf(Widget widget) {
        this.b = widget;
    }

    public final void d(rr3 rr3) {
        Widget widget = this.b;
        View requireView = widget.requireView();
        widget.onViewCreated(requireView);
        ek8.g(requireView, widget.getInsetsConfig(), new erf(widget, 1));
    }

    public final void j(rr3 rr3, View view) {
        boolean i0 = x87.i0(rr3);
        Widget widget = this.b;
        if (!i0) {
            widget.onViewCreated(view);
            ek8.g(view, widget.getInsetsConfig(), new erf(widget, 1));
        }
        view.addOnAttachStateChangeListener(new q40(widget, 14, this));
    }

    public final void k(rr3 rr3) {
        mrf viewModelStore$arch_release;
        Widget widget = rr3 instanceof Widget ? (Widget) rr3 : null;
        if (widget != null && (viewModelStore$arch_release = widget.getViewModelStore$arch_release()) != null) {
            jc9 jc9 = viewModelStore$arch_release.a;
            Object[] objArr = jc9.c;
            long[] jArr = jc9.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                taf taf = (taf) objArr[(i << 3) + i3];
                                lp.d(taf.a.getCoroutineContext());
                                taf.p();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            jc9.a();
            viewModelStore$arch_release.b.a();
        }
    }

    public final void l(rr3 rr3) {
        Widget widget = this.b;
        jc9 cleanActions$arch_release = widget.getCleanActions$arch_release();
        Object[] objArr = cleanActions$arch_release.c;
        long[] jArr = cleanActions$arch_release.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ml0 ml0 = (ml0) ((bz2) objArr[(i << 3) + i3]);
                            ml0.getClass();
                            nl0 nl0 = ml0.b;
                            nl0.X = new WeakReference(nl0.o);
                            nl0.o = null;
                            ml0.a = true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        if (this.a) {
            widget.finalizeCleanActions(rr3);
        }
    }

    public final void n(rr3 rr3, View view) {
        view.addOnAttachStateChangeListener(new ck(10, this.b));
    }
}
