package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: g01  reason: default package */
public final /* synthetic */ class g01 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ h01 c;

    public /* synthetic */ g01(Context context, h01 h01, int i) {
        this.a = i;
        this.b = context;
        this.c = h01;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                f01 f01 = new f01(this.b, (AttributeSet) null);
                h01 h01 = this.c;
                f01.setLayoutParams(h01.getLayoutParams());
                h01.removeAllViews();
                h01.addView(f01);
                return f01;
            default:
                zz0 zz0 = new zz0(this.b, (AttributeSet) null);
                h01 h012 = this.c;
                zz0.setLayoutParams(h012.getLayoutParams());
                h012.removeAllViews();
                h012.addView(zz0);
                return zz0;
        }
    }
}
