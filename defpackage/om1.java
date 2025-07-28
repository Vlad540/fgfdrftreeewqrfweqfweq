package defpackage;

import android.content.Context;

/* renamed from: om1  reason: default package */
public final /* synthetic */ class om1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ sm1 c;

    public /* synthetic */ om1(Context context, sm1 sm1, int i) {
        this.a = i;
        this.b = context;
        this.c = sm1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return sm1.y(this.b, this.c);
            case 1:
                return sm1.A(this.b, this.c);
            case 2:
                return sm1.B(this.b, this.c);
            default:
                an1 an1 = new an1(this.b);
                an1.setLayoutParams(new re3(-1, -1));
                kjd.U(an1, false);
                sm1 sm1 = this.c;
                an1.setListener(new rgc(19, sm1));
                an1.setVideoLayoutUpdatesControllerProvider(new mm1(sm1, 1));
                return an1;
        }
    }
}
