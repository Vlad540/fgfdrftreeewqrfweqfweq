package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import ru.ok.utils.widgets.BadgeCountView;

/* renamed from: sb0  reason: default package */
public final class sb0 extends u2 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ Object o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sb0(defpackage.tb0 r2, defpackage.pda r3) {
        /*
            r1 = this;
            r0 = 0
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.o = r2
            r1.X = r3
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb0.<init>(tb0, pda):void");
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [ru.ok.utils.widgets.BadgeCountView, android.widget.TextView, android.view.View] */
    public final void L1(Object obj, Object obj2) {
        int i;
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    tb0 tb0 = (tb0) this.o;
                    Paint b = tb0.b();
                    pda pda = (pda) this.X;
                    if (booleanValue) {
                        pda.getText();
                        i = -1;
                    } else {
                        i = pda.getText().e;
                    }
                    b.setColor(i);
                    tb0.c();
                    tb0.invalidateSelf();
                    return;
                }
                return;
            default:
                int intValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                ? r7 = (BadgeCountView) this.o;
                if (r7.getManageVisibility()) {
                    r7.setVisibility(intValue > 0 ? 0 : 8);
                }
                ve0 ve0 = null;
                if (r7.getVisibility() != 0) {
                    r7.setText((CharSequence) null);
                    return;
                } else if (intValue >= 0) {
                    r7.setText(r7.getNeedPlusIndicator() ? ((Context) this.X).getString(bvb.folder_new_messages_max_exceeded, new Object[]{Integer.valueOf(intValue)}) : String.valueOf(intValue));
                    int i2 = r7.C0;
                    GradientDrawable H = intValue < 10 ? swb.H(Integer.valueOf(i2), (Integer) null, (Integer) null) : swb.L(Integer.valueOf(i2), (Integer) null, (Integer) null, a24.X(((float) 20) * dh4.c().getDisplayMetrics().density));
                    if (1 <= intValue && intValue < 10) {
                        ve0 = new ve0(H, 20, 0.0f, 12);
                    } else if (10 <= intValue && intValue < 100) {
                        ve0 = new ve0(H, 22, 0.0f, 12);
                    } else if (100 <= intValue && intValue < 1000) {
                        ve0 = new ve0(H, 26, 0.0f, 12);
                    } else if (1000 <= intValue && intValue < 10000) {
                        ve0 = new ve0(H, 31, 10.0f, 4);
                    }
                    r7.setStyle(ve0);
                    return;
                } else {
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sb0(BadgeCountView badgeCountView, Context context) {
        super(9, (Object) 0);
        this.o = badgeCountView;
        this.X = context;
    }
}
