package defpackage;

import android.graphics.drawable.InsetDrawable;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: b4c  reason: default package */
public final /* synthetic */ class b4c implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ b4c(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    public final Object invoke() {
        r7e d;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = RecordControlsWidget.m1;
                int ordinal = recordControlsWidget.K0().ordinal();
                Class<va9> cls = va9.class;
                Class<pae> cls2 = pae.class;
                if (ordinal == 0) {
                    xuf xuf = xuf.a;
                    return new e40(xuf.getAccessor().d(cls2), xuf.getAccessor().d(cls));
                } else if (ordinal == 1) {
                    xuf xuf2 = xuf.a;
                    return new e40(xuf2.getAccessor().d(cls2), xuf2.getAccessor().d(cls));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            case 1:
                k77[] k77Arr2 = RecordControlsWidget.m1;
                if (recordControlsWidget.K0() == z2c.b) {
                    return new o60();
                }
                return null;
            case 2:
                k77[] k77Arr3 = RecordControlsWidget.m1;
                z2c K0 = recordControlsWidget.K0();
                h3c h3c = (h3c) recordControlsWidget.b.getValue();
                int ordinal2 = recordControlsWidget.K0().ordinal();
                if (ordinal2 == 0) {
                    d = xuf.a.getAccessor().d(r6f.class);
                } else if (ordinal2 == 1) {
                    d = xuf.a.getAccessor().d(n50.class);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return new y3c(K0, h3c, d, new r7e(new b4c(recordControlsWidget, 0)), new r7e(new b4c(recordControlsWidget, 1)));
            case 3:
                k77[] k77Arr4 = RecordControlsWidget.m1;
                return gq3.b(recordControlsWidget.getContext(), phc.J1);
            case 4:
                k77[] k77Arr5 = RecordControlsWidget.m1;
                return gq3.b(recordControlsWidget.getContext(), phc.I0);
            case 5:
                k77[] k77Arr6 = RecordControlsWidget.m1;
                return gq3.b(recordControlsWidget.getContext(), phc.X0);
            case 6:
                k77[] k77Arr7 = RecordControlsWidget.m1;
                return gq3.b(recordControlsWidget.getContext(), phc.T0);
            default:
                k77[] k77Arr8 = RecordControlsWidget.m1;
                float f = (float) 2;
                return new InsetDrawable(gq3.b(recordControlsWidget.getContext(), phc.o), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), a24.X(f * dh4.c().getDisplayMetrics().density));
        }
    }
}
