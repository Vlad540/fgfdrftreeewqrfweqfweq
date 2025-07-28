package one.me.android.di;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lone/me/android/di/ConcurrentComponent;", "Luo;", "<init>", "()V", "Lx4a;", "getExecutors", "()Lx4a;", "executors", "Lmbe;", "getSchedulers", "()Lmbe;", "schedulers", "Lpae;", "getDispatchers", "()Lpae;", "dispatchers", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@Keep
public final class ConcurrentComponent extends uo {
    public static final ConcurrentComponent INSTANCE = new ConcurrentComponent();

    private ConcurrentComponent() {
    }

    public final pae getDispatchers() {
        return (pae) getAccessor().c(pae.class);
    }

    public final x4a getExecutors() {
        return (x4a) getAccessor().c(x4a.class);
    }

    public final mbe getSchedulers() {
        return (mbe) getAccessor().c(mbe.class);
    }
}
