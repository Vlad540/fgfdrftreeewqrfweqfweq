package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;

/* renamed from: n9b  reason: default package */
public final class n9b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n9b(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n9b n9b = new n9b(this.Y, continuation);
        n9b.X = obj;
        return n9b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.X.E((List) this.X);
        return jue.a;
    }
}
