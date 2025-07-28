package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: sfc  reason: default package */
public final class sfc extends OrientationEventListener {
    public int a = -1;
    public final /* synthetic */ ydc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sfc(ydc ydc, Context context) {
        super(context);
        this.b = ydc;
    }

    public final void onOrientationChanged(int i) {
        ArrayList arrayList;
        if (i != -1) {
            int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
            if (this.a != i2) {
                this.a = i2;
                synchronized (this.b.b) {
                    arrayList = new ArrayList(((HashMap) this.b.o).values());
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        tfc tfc = (tfc) it.next();
                        tfc.getClass();
                        tfc.b.execute(new n30(i2, 15, tfc));
                    }
                }
            }
        }
    }
}
