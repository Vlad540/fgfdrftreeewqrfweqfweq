package defpackage;

import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;

/* renamed from: b0  reason: default package */
public abstract class b0 implements fl {
    private volatile el cachedParams;

    public final synchronized el a() {
        el elVar = this.cachedParams;
        if (elVar != null) {
            return elVar;
        }
        el elVar2 = new el();
        populateParams(elVar2);
        this.cachedParams = elVar2;
        return elVar2;
    }

    public boolean canRepeat() {
        return a().b;
    }

    public final synchronized void invalidateParams() {
        this.cachedParams = null;
    }

    public abstract void populateParams(el elVar);

    public boolean shouldPost() {
        return a().c;
    }

    public final boolean willWriteParams() {
        return a().d;
    }

    public final boolean willWriteSupplyParams() {
        return a().e;
    }

    public final void writeParams(t67 t67) throws IOException, JsonSerializeException {
        a().c(t67);
    }

    public final void writeSupplyParams(t67 t67) throws IOException, JsonSerializeException {
        a().d(t67);
    }
}
