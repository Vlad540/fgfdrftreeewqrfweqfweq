package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.fragment.app.b;

/* renamed from: gx5  reason: default package */
public final /* synthetic */ class gx5 implements rf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ gx5(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                this.b.I0.C();
                return;
            default:
                Intent intent = (Intent) obj;
                this.b.I0.C();
                return;
        }
    }
}
