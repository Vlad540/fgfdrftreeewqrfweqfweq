package defpackage;

import android.util.Base64;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: d93  reason: default package */
public final /* synthetic */ class d93 implements p3e {
    public final /* synthetic */ int a;

    public /* synthetic */ d93(int i) {
        this.a = i;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                Class<DefaultVideoFrameProcessor$Factory$Builder> cls = DefaultVideoFrameProcessor$Factory$Builder.class;
                try {
                    Object invoke = cls.getMethod("build", (Class[]) null).invoke(cls.getConstructor((Class[]) null).newInstance((Object[]) null), (Object[]) null);
                    invoke.getClass();
                    return (k4f) invoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof rh7) {
                    return (rh7) newSingleThreadExecutor;
                }
                return newSingleThreadExecutor instanceof ScheduledExecutorService ? new j69((ScheduledExecutorService) newSingleThreadExecutor) : new g69(newSingleThreadExecutor);
            case 2:
                byte[] bArr = new byte[12];
                y94.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new c94(new l34(0), 50000, 50000, 2500, 5000);
            case 4:
                return new d94(new l34(1), 50000, 50000, 2500, 5000, false);
            default:
                throw new IllegalStateException();
        }
    }
}
