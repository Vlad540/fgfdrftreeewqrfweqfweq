package defpackage;

import android.media.ImageReader;
import java.util.concurrent.Executor;

/* renamed from: td  reason: default package */
public final /* synthetic */ class td implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ ud a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ mr6 c;

    public /* synthetic */ td(ud udVar, Executor executor, mr6 mr6) {
        this.a = udVar;
        this.b = executor;
        this.c = mr6;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        ud udVar = this.a;
        Executor executor = this.b;
        mr6 mr6 = this.c;
        synchronized (udVar.o) {
            try {
                if (!udVar.b) {
                    executor.execute(new c(udVar, 2, mr6));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
