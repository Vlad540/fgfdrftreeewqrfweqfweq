package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: c4c  reason: default package */
public final /* synthetic */ class c4c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ c4c(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    public final void onClick(View view) {
        boolean z = false;
        switch (this.a) {
            case 0:
                k77[] k77Arr = RecordControlsWidget.m1;
                this.b.L0().y();
                return;
            case 1:
                k77[] k77Arr2 = RecordControlsWidget.m1;
                y3c L0 = this.b.L0();
                L0.B();
                L0.A0.m((Object) null, new o3c(2, L0.w(), false));
                return;
            case 2:
                k77[] k77Arr3 = RecordControlsWidget.m1;
                this.b.L0().x();
                return;
            case 3:
                k77[] k77Arr4 = RecordControlsWidget.m1;
                y3c L02 = this.b.L0();
                k77[] k77Arr5 = y3c.N0;
                L02.A(true);
                return;
            default:
                RecordControlsWidget recordControlsWidget = this.b;
                k77[] k77Arr6 = RecordControlsWidget.m1;
                e40 e40 = (e40) recordControlsWidget.L0().u();
                nb9 nb9 = (nb9) e40.b();
                nb9.getClass();
                xs7.E(nb9.h, (hu3) null, (ru3) null, new kb9(nb9, 1.0f, (Continuation) null), 3);
                long l = ((nb9) e40.b()).l();
                Long l2 = e40.e;
                if (l2 != null && l == l2.longValue()) {
                    z = true;
                }
                if (((nb9) e40.b()).x && z) {
                    ((nb9) e40.b()).q();
                    return;
                } else if (!((nb9) e40.b()).w || !z) {
                    Long l3 = e40.e;
                    if (l3 != null) {
                        long longValue = l3.longValue();
                        va9 b2 = e40.b();
                        nb9 nb92 = (nb9) b2;
                        xs7.E(nb92.h, nb92.b.b(), (ru3) null, new hb9(new sa9(longValue), nb92, (Continuation) null), 2);
                        return;
                    }
                    return;
                } else {
                    ((nb9) e40.b()).r();
                    return;
                }
        }
    }
}
