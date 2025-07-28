package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.b;

/* renamed from: d83  reason: default package */
public final class d83 extends b97 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e83 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d83(b bVar, int i) {
        super(0);
        this.a = i;
        this.b = bVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                e83 e83 = this.b;
                return new alc(e83.getApplication(), e83, e83.getIntent() != null ? e83.getIntent().getExtras() : null);
            case 1:
                this.b.reportFullyDrawn();
                return jue.a;
            case 2:
                e83 e832 = this.b;
                return new r16(e832.Y, new d83((b) e832, 1));
            default:
                b bVar = (b) this.b;
                ex9 ex9 = new ex9(new u73(bVar, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!hhd.f(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new dr1(bVar, 8, ex9));
                    } else {
                        bVar.a.a(new y73(ex9, 0, bVar));
                    }
                }
                return ex9;
        }
    }
}
