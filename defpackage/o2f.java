package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o2f  reason: default package */
public final /* synthetic */ class o2f implements yx5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ qf3 c;

    public /* synthetic */ o2f(Runnable runnable, qf3 qf3, int i) {
        this.a = i;
        this.b = runnable;
        this.c = qf3;
    }

    public final void b(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                r2f r2f = (r2f) bundle.getParcelable("VideoCompressionModeDialog:result:key");
                if (r2f != null) {
                    if (r2f.equals(p2f.a)) {
                        Runnable runnable = this.b;
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    } else if (r2f instanceof q2f) {
                        this.c.accept(((q2f) r2f).a);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                w7f w7f = (w7f) bundle.getParcelable("VideoQualityPickerDialog:result:key");
                if (w7f != null) {
                    if (w7f.equals(u7f.a)) {
                        Runnable runnable2 = this.b;
                        if (runnable2 != null) {
                            runnable2.run();
                            return;
                        }
                        return;
                    } else if (w7f instanceof v7f) {
                        this.c.accept(((v7f) w7f).a);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
        }
    }
}
