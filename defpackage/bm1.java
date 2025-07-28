package defpackage;

import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;

/* renamed from: bm1  reason: default package */
public final /* synthetic */ class bm1 implements agc, bid, iba {
    public final /* synthetic */ int a;
    public final /* synthetic */ s16 b;

    public /* synthetic */ bm1(int i, s16 s16) {
        this.a = i;
        this.b = s16;
    }

    public void J(jba jba) {
        switch (this.a) {
            case 3:
                s16 s16 = this.b;
                if (s16 != null) {
                    s16.invoke();
                    return;
                }
                return;
            default:
                if (jba == jba.X || jba == jba.b) {
                    this.b.invoke();
                    return;
                }
                return;
        }
    }

    public void b() {
        int i = this.a;
        s16 s16 = this.b;
        switch (i) {
            case 0:
                gm1.setPositiveAction$lambda$70$lambda$69(s16);
                return;
            default:
                gm1.setNegativeAction$lambda$68$lambda$67(s16);
                return;
        }
    }

    public void j(ihd ihd) {
        CallsThreadUtilsKt.a(this.b, ihd);
    }
}
