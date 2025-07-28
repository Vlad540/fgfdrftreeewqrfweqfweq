package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* renamed from: g3e  reason: default package */
public final class g3e extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SuggestionsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g3e(SuggestionsWidget suggestionsWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = suggestionsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((q2e) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g3e g3e = new g3e(this.Y, continuation);
        g3e.X = obj;
        return g3e;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View, ty4] */
    public final Object o(Object obj) {
        wx3.H(obj);
        q2e q2e = (q2e) this.X;
        SuggestionsWidget suggestionsWidget = this.Y;
        if (q2e == null) {
            k77[] k77Arr = SuggestionsWidget.F0;
            suggestionsWidget.B0();
        } else {
            List list = q2e.b;
            boolean isEmpty = list.isEmpty();
            boolean z = !isEmpty;
            k77[] k77Arr2 = SuggestionsWidget.F0;
            int i = 8;
            suggestionsWidget.y0().setVisibility(isEmpty ? 0 : 8);
            ? z0 = suggestionsWidget.z0();
            if (z) {
                i = 0;
            }
            z0.setVisibility(i);
            suggestionsWidget.y0().setText(q2e.a == p2e.c ? z9a.p : z9a.q);
            ((v2e) suggestionsWidget.y0.getValue()).E(list);
        }
        return jue.a;
    }
}
