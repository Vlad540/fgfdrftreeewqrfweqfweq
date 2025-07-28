package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: h0c  reason: default package */
public final class h0c extends er3 {
    public Object X;
    public yr8 Y;
    public ryb Z;
    public ReactionsViewModel o;
    public yyb w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ ReactionsViewModel y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(continuation);
        this.y0 = reactionsViewModel;
    }

    public final Object o(Object obj) {
        this.x0 = obj;
        this.z0 |= Integer.MIN_VALUE;
        return ReactionsViewModel.e(this.y0, (d0c) null, this);
    }
}
