package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import java.util.List;

/* renamed from: x34  reason: default package */
public final /* synthetic */ class x34 implements kh7, lh7, v1b, j26, y48, nf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ x34(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public void accept(Object obj) {
        qza qza = (qza) obj;
        switch (this.a) {
            case 7:
                qza.g0(this.b);
                return;
            case 8:
                qza.N(this.b);
                return;
            case 9:
                qza.setRepeatMode(this.b);
                return;
            default:
                qza.I0(this.b);
                return;
        }
    }

    public Object apply(Object obj) {
        Bitmap bitmap = (Bitmap) ((List) obj).get(this.b);
        return bitmap == null ? hx7.a : ax7.e(bitmap);
    }

    public void c(o48 o48) {
        if (o48.isConnected()) {
            r38 r38 = o48.a;
            r38.getClass();
            oyb.k(Looper.myLooper() == r38.X.getLooper());
            r38.o.getClass();
            bs6 a2 = p38.a();
            a2.c(new wg1((Object) o48, (Object) a2, this.b, 13), lh4.a);
        }
    }

    public void invoke(Object obj) {
        int i = this.b;
        switch (this.a) {
            case 0:
                ((n35) obj).getClass();
                udd.p("n35", "onDroppedVideoFrames: " + i, new Object[0]);
                return;
            case 1:
                ((gya) obj).onRepeatModeChanged(i);
                return;
            case 2:
                ((hya) obj).onRepeatModeChanged(i);
                return;
            default:
                ((hya) obj).onRepeatModeChanged(i);
                return;
        }
    }

    public boolean test(Object obj) {
        return this.b < ((List) obj).size();
    }

    public /* synthetic */ x34(int i, v1d v1d, Bundle bundle) {
        this.a = 6;
        this.b = i;
    }

    public /* synthetic */ x34(fd fdVar, int i, long j) {
        this.a = 0;
        this.b = i;
    }
}
