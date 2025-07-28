package defpackage;

import android.graphics.Point;
import android.view.View;

/* renamed from: nm1  reason: default package */
public final /* synthetic */ class nm1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm1 b;

    public /* synthetic */ nm1(sm1 sm1, int i) {
        this.a = i;
        this.b = sm1;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sm1 sm1 = this.b;
                pm1 pm1 = sm1.f1;
                if (pm1 != null) {
                    le1 le1 = sm1.l1;
                    int[] iArr = new int[2];
                    sm1.S0.getLocationOnScreen(iArr);
                    pm1.v(le1, new Point(iArr[0], iArr[1]));
                    return;
                }
                return;
            case 1:
                sm1 sm12 = this.b;
                pm1 pm12 = sm12.f1;
                if (pm12 != null) {
                    pm12.y(sm12.l1);
                    return;
                }
                return;
            case 2:
                pm1 pm13 = this.b.f1;
                if (pm13 != null) {
                    pm13.P();
                    return;
                }
                return;
            default:
                sm1 sm13 = this.b;
                pm1 pm14 = sm13.f1;
                if (pm14 != null) {
                    pm14.S(sm13.l1);
                    return;
                }
                return;
        }
    }
}
