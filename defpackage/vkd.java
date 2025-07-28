package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import java.util.concurrent.CancellationException;

/* renamed from: vkd  reason: default package */
public final class vkd {
    public static final /* synthetic */ k77[] e;
    public final ou3 a;
    public final t97 b = ez3.O(3, new vfc(26));
    public final e3 c = hwf.t();
    public final e3 d = hwf.t();

    static {
        Class<vkd> cls = vkd.class;
        e = new k77[]{new hc9(cls, "infiniteAnimationJob", "getInfiniteAnimationJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "stateAnimationJob", "getStateAnimationJob()Lkotlinx/coroutines/Job;")};
    }

    public vkd(ac7 ac7) {
        this.a = ac7;
    }

    public static void a(hx6 hx6, int i) {
        if (hx6 != null) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(((jkd) hx6).L0.getCurrentTextColor()), Integer.valueOf(i)});
            ofObject.setDuration(200);
            ofObject.addUpdateListener(new pkd(hx6, 1));
            ofObject.start();
        }
    }

    public final void b() {
        k77[] k77Arr = e;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.c;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[0], (Object) null);
    }
}
