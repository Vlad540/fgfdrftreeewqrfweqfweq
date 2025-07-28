package defpackage;

import android.widget.ImageView;
import one.me.rlottie.ImageReceiver;

/* renamed from: gi  reason: default package */
public final class gi implements ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [hi, android.view.View] */
    public final void invalidate() {
        switch (this.a) {
            case 0:
                ((hi) this.b).invalidate();
                return;
            case 1:
                ((ImageView) ((ht4) this.b).a).invalidate();
                return;
            case 2:
                ((yq8) this.b).invalidate();
                return;
            case 3:
                ((ts8) this.b).invalidate();
                return;
            default:
                ((bqf) this.b).invalidate();
                return;
        }
    }
}
