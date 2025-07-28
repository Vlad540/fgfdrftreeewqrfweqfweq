package ru.ok.tamtam.login;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/login/LoginEventsByBus;", "Luo7;", "Lto7;", "event", "Ljue;", "onEvent", "(Lto7;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
final class LoginEventsByBus implements uo7 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public LoginEventsByBus(tt0 tt0, pae pae) {
        this.b = n1g.a(((n3a) pae).c().getImmediate());
        tt0.d(this);
    }

    @a1e
    @Keep
    public final void onEvent(to7 to7) {
        xs7.E(this.b, (hu3) null, (ru3) null, new a(this, to7, (Continuation) null), 3);
    }

    public final s0c stream() {
        return new s0c(this.a);
    }
}
