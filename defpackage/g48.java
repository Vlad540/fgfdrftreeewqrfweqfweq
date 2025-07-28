package defpackage;

import android.os.IBinder;
import java.util.Objects;

/* renamed from: g48  reason: default package */
public final /* synthetic */ class g48 implements IBinder.DeathRecipient {
    public final /* synthetic */ o48 a;

    public /* synthetic */ g48(o48 o48) {
        this.a = o48;
    }

    public final void binderDied() {
        r38 r38 = this.a.a;
        Objects.requireNonNull(r38);
        r38.G(new eq6(6, r38));
    }
}
