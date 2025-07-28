package defpackage;

import java.io.File;

/* renamed from: rsd  reason: default package */
public final class rsd implements jg9 {
    public final /* synthetic */ ssd a;

    public rsd(ssd ssd) {
        this.a = ssd;
    }

    public final void onFailed(Throwable th) {
        ssd ssd = this.a;
        ssd.b(ssd.f, th);
    }

    public final void onFinished(String str, File file, String str2) {
        ((x4a) this.a.c.getValue()).b().execute(new ncd(this, file, str2, 4));
    }
}
