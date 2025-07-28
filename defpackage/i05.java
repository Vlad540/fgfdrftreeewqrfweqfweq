package defpackage;

import ru.ok.tamtam.shared.lifecycle.AlreadyHandledEventException;

/* renamed from: i05  reason: default package */
public class i05 {
    public final Object a;
    public boolean b;

    public i05(Object obj) {
        this.a = obj;
        System.currentTimeMillis();
    }

    public final Object a() {
        if (this.b) {
            return new kcc(new AlreadyHandledEventException());
        }
        this.b = true;
        return this.a;
    }
}
