package ru.ok.tamtam.logout;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/logout/LogoutEventsByBus;", "Lru/ok/tamtam/logout/a;", "Lmp7;", "event", "Ljue;", "onEvent", "(Lmp7;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
final class LogoutEventsByBus implements a {
    public final tt0 a;
    public final hcd b = icd.b(0, 0, 0, 7);
    public final ContextScope c;

    public LogoutEventsByBus(tt0 tt0, pae pae) {
        this.a = tt0;
        this.c = n1g.a(((n3a) pae).c());
        tt0.d(this);
    }

    public final void b() {
        this.a.c(new kh0());
    }

    @a1e
    @Keep
    public final void onEvent(mp7 mp7) {
        xs7.E(this.c, (hu3) null, (ru3) null, new b(this, mp7, (Continuation) null), 3);
    }
}
