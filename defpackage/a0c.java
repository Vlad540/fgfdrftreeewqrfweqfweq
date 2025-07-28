package defpackage;

import java.util.Collection;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: a0c  reason: default package */
public final /* synthetic */ class a0c implements qf3 {
    public final /* synthetic */ t97 a;
    public final /* synthetic */ ReactionsViewModel b;

    public /* synthetic */ a0c(t97 t97, ReactionsViewModel reactionsViewModel) {
        this.a = t97;
        this.b = reactionsViewModel;
    }

    public final void accept(Object obj) {
        Collection collection = (Collection) obj;
        n86 n86 = (n86) this.a.getValue();
        i22 i = this.b.i();
        if (i != null) {
            n86.a(i, collection);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
