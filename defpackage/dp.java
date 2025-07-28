package defpackage;

import android.content.Context;

/* renamed from: dp  reason: default package */
public final /* synthetic */ class dp implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ fp c;
    public final /* synthetic */ o54 o;

    public /* synthetic */ dp(o54 o54, fp fpVar, Context context) {
        this.a = 2;
        this.o = o54;
        this.c = fpVar;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new swa(this.b, this.c.a(), this.o);
            case 1:
                this.c.a();
                return new Object();
            case 2:
                this.o.getClass();
                return new v98("ru.oneme.app.new.activeCalls", new r7e(new c6(7, this.c)), new ep(this.b));
            default:
                fp fpVar = this.c;
                return new fi7(this.b, fpVar.a(), (h7a) fpVar.d.getValue(), this.o, (bbe) fpVar.k.getValue());
        }
    }

    public /* synthetic */ dp(Context context, fp fpVar, o54 o54, int i) {
        this.a = i;
        this.b = context;
        this.c = fpVar;
        this.o = o54;
    }
}
