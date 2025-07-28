package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* renamed from: dd0  reason: default package */
public final class dd0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(dd0.class, "notCompletedCount$volatile");
    public final yc4[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public dd0(yc4[] yc4Arr) {
        this.a = yc4Arr;
        this.notCompletedCount$volatile = yc4Arr.length;
    }

    public final Object a(Continuation continuation) {
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        yc4[] yc4Arr = this.a;
        int length = yc4Arr.length;
        bd0[] bd0Arr = new bd0[length];
        for (int i = 0; i < length; i++) {
            yc4 yc4 = yc4Arr[i];
            ((i47) yc4).start();
            bd0 bd0 = new bd0(this, zv1);
            bd0.c = lp.t(yc4, true, bd0);
            bd0Arr[i] = bd0;
        }
        cd0 cd0 = new cd0(bd0Arr);
        for (int i2 = 0; i2 < length; i2++) {
            bd0 bd02 = bd0Arr[i2];
            bd02.getClass();
            bd0.X.set(bd02, cd0);
        }
        if (!(zv1.o.get(zv1) instanceof dl9)) {
            cd0.a();
        } else {
            bm3.s(zv1, cd0);
        }
        return zv1.m();
    }
}
