package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: my4  reason: default package */
public final class my4 extends r6c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ my4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 0:
                for (r6c a2 : ((ty4) this.b).d2) {
                    a2.a(recyclerView, i);
                }
                return;
            default:
                return;
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                for (r6c b2 : ((ty4) obj).d2) {
                    b2.b(recyclerView, i, i2);
                }
                return;
            case 1:
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                s85 s85 = (s85) obj;
                int computeVerticalScrollRange = s85.H0.computeVerticalScrollRange();
                int i3 = s85.G0;
                int i4 = computeVerticalScrollRange - i3;
                int i5 = s85.a;
                s85.I0 = i4 > 0 && i3 >= i5;
                int computeHorizontalScrollRange = s85.H0.computeHorizontalScrollRange();
                int i6 = s85.F0;
                boolean z = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
                s85.J0 = z;
                boolean z2 = s85.I0;
                if (z2 || z) {
                    if (z2) {
                        float f = (float) i3;
                        s85.A0 = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                        s85.z0 = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                    }
                    if (s85.J0) {
                        float f2 = (float) i6;
                        s85.D0 = (int) ((((f2 / 2.0f) + ((float) computeHorizontalScrollOffset)) * f2) / ((float) computeHorizontalScrollRange));
                        s85.C0 = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
                    }
                    int i7 = s85.K0;
                    if (i7 == 0 || i7 == 1) {
                        s85.l(1);
                        return;
                    }
                    return;
                } else if (s85.K0 != 0) {
                    s85.l(0);
                    return;
                } else {
                    return;
                }
            case 2:
                if (i != 0 || i2 != 0) {
                    taf.o(((u68) ((KeyboardStickersWidget) obj).b.getValue()).X, q68.a);
                    return;
                }
                return;
            default:
                k77[] k77Arr = MediaGalleryWidget.Z;
                f56 m0 = ((MediaGalleryWidget) obj).m0();
                m0.getClass();
                taf.o(m0.c, new d56(-((float) recyclerView.computeVerticalScrollOffset())));
                return;
        }
    }
}
