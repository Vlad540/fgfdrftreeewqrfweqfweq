package one.me.messages.list.ui.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lone/me/messages/list/ui/recycler/MessagesLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "hw8", "iw8", "message-list_release"}, k = 1, mv = {2, 0, 0})
public final class MessagesLayoutManager extends LinearLayoutManager {
    public final float E = 2.0f;
    public boolean F;
    public RecyclerView G;
    public final Rect H = new Rect();
    public final kc9 I;

    public MessagesLayoutManager() {
        super(1, false);
        int i = mlc.a;
        this.I = new kc9();
        p1(true);
        this.h = false;
    }

    public final void I0(RecyclerView recyclerView, int i) {
        int W0 = W0();
        int Y0 = Y0();
        int i2 = -1;
        if (W0 == -1 || Y0 == -1) {
            y0(i);
            return;
        }
        boolean z = true;
        if (W0 > i || i > Y0) {
            if ((Y0 + W0) / 2 <= i) {
                i2 = 1;
            }
            if (i >= W0) {
                W0 = Y0;
            }
            if (Math.abs(W0 - i) > 10) {
                n1(i, a24.X(((float) i2) * this.E * ((float) recyclerView.getHeight())));
            }
        }
        Context context = recyclerView.getContext();
        int W02 = W0();
        boolean z2 = W02 == Y0();
        boolean z3 = G() - 1 == i;
        boolean z4 = W02 == i;
        if ((!z2 || !z3 || !z4) && !this.F) {
            z = false;
        }
        J0(new hw8(i, context, z));
    }

    public final void S(View view, int i, int i2, int i3, int i4) {
        b7c T;
        RecyclerView recyclerView = this.G;
        if (recyclerView != null && (T = recyclerView.T(view)) != null) {
            boolean z = T instanceof x62;
            if (ht8.a(T.Y, 0) || z) {
                int i5 = i3 - i;
                int width = ((recyclerView.getWidth() - i5) / 2) + recyclerView.getLeft();
                MessagesLayoutManager.super.S(view, width, i2, width + i5, i4);
                return;
            }
            MessagesLayoutManager.super.S(view, i, i2, i3, i4);
        }
    }

    public final void W(RecyclerView recyclerView) {
        this.G = recyclerView;
    }

    public final void X(RecyclerView recyclerView) {
        this.G = null;
        this.H.setEmpty();
    }

    public final void d0(int i, int i2) {
        kc9 kc9 = this.I;
        Object[] objArr = kc9.b;
        long[] jArr = kc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((iw8) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void e0() {
        kc9 kc9 = this.I;
        Object[] objArr = kc9.b;
        long[] jArr = kc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((iw8) objArr[(i << 3) + i3]).a();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f0(int i, int i2) {
        kc9 kc9 = this.I;
        Object[] objArr = kc9.b;
        long[] jArr = kc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((iw8) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g0(int i, int i2) {
        kc9 kc9 = this.I;
        Object[] objArr = kc9.b;
        long[] jArr = kc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((iw8) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h0(int i) {
        kc9 kc9 = this.I;
        Object[] objArr = kc9.b;
        long[] jArr = kc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            ((iw8) objArr[(i2 << 3) + i4]).a();
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void i0(RecyclerView recyclerView, int i, int i2) {
        h0(i);
        kc9 kc9 = this.I;
        Object[] objArr = kc9.b;
        long[] jArr = kc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((iw8) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k0(x6c x6c) {
        MessagesLayoutManager.super.k0(x6c);
        if (W0() != -1 && Y0() != -1) {
            kc9 kc9 = this.I;
            Object[] objArr = kc9.b;
            long[] jArr = kc9.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((iw8) objArr[(i << 3) + i3]).b();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void t1(iw8 iw8) {
        kc9 kc9 = this.I;
        Object[] objArr = kc9.b;
        long[] jArr = kc9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (((iw8) objArr[i4]).getTag().equals(iw8.getTag())) {
                                kc9.g(i4);
                            }
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
        kc9.a(iw8);
    }

    public final void y0(int i) {
        View r = r(i);
        if (r == null) {
            MessagesLayoutManager.super.y0(i);
            RecyclerView recyclerView = this.G;
            if (recyclerView != null) {
                px9 px9 = new px9(recyclerView, true, new z65(i, 2, this));
                ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(px9);
                }
                recyclerView.addOnAttachStateChangeListener(px9);
            }
        } else if (this.F) {
            Rect rect = this.H;
            RecyclerView.V(rect, r);
            RecyclerView recyclerView2 = this.G;
            int i2 = 0;
            int height = (recyclerView2 != null ? recyclerView2.getHeight() : 0) - rect.height();
            if (height >= 0) {
                i2 = height;
            }
            n1(i, i2);
        } else {
            n1(i, a24.X(((float) 30) * dh4.c().getDisplayMetrics().density));
        }
    }
}
