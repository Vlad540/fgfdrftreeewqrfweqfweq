package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: fk1  reason: default package */
public final /* synthetic */ class fk1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ik1 c;

    public /* synthetic */ fk1(Context context, ik1 ik1, int i) {
        this.a = i;
        this.b = context;
        this.c = ik1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ik1.x(this.b, this.c);
            default:
                cf1 cf1 = new cf1(this.b);
                cf1.setPipTheme(qda.a);
                cf1.setPipMode(ze1.b);
                cf1.setId(View.generateViewId());
                ik1 ik1 = this.c;
                cf1.setListener(new wwc(5, ik1));
                cf1.setVisibility(8);
                cf1.setVideoLayoutUpdatesControllerProvider(new dk1(ik1, 3));
                return cf1;
        }
    }
}
