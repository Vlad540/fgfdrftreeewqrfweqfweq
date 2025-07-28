package defpackage;

import android.os.Handler;
import android.os.Looper;
import ru.ok.android.externcalls.sdk.AudioLevelListener;

/* renamed from: go1  reason: default package */
public final /* synthetic */ class go1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ po1 b;

    public /* synthetic */ go1(po1 po1, int i) {
        this.a = i;
        this.b = po1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return hrd.a(((rz0) this.b.b).b());
            case 1:
                return (mc9) this.b.p.getValue();
            case 2:
                ((lc9) this.b.r.getValue()).g(Boolean.TRUE);
                return jue.a;
            case 3:
                return (lc9) this.b.r.getValue();
            case 4:
                return new AudioLevelListener(500, new Handler(Looper.getMainLooper()), new b(24, this.b));
            default:
                return new ko1(this.b);
        }
    }
}
