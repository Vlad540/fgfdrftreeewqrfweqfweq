package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: qqa  reason: default package */
public final /* synthetic */ class qqa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ qqa(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    public final void onClick(View view) {
        qod qod = null;
        AbstractPickerScreen abstractPickerScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = PickSubscribersScreen.D0;
                gqa gqa = abstractPickerScreen.u0().c;
                ou3 ou3 = gqa.k;
                if (ou3 != null) {
                    xs7.E(ou3, (hu3) null, (ru3) null, new fqa(gqa, (Continuation) null), 3);
                    return;
                }
                return;
            default:
                k77[] k77Arr2 = PickSubscribersScreen.D0;
                abstractPickerScreen.w0().setProgressEnabled(true);
                gqa gqa2 = abstractPickerScreen.u0().c;
                k77 k77 = PickSubscribersScreen.D0[0];
                long[] jArr = (long[]) abstractPickerScreen.x0.a(abstractPickerScreen);
                i22 i22 = (i22) ((aw2) ((bv2) gqa2.d.getValue())).m(gqa2.a).a.getValue();
                if (i22 != null) {
                    ((ed3) gqa2.f.getValue()).f();
                    ou3 ou32 = gqa2.k;
                    if (ou32 != null) {
                        qod = xs7.E(ou32, ((pae) gqa2.c.getValue()).b(), (ru3) null, new dqa(gqa2, i22, jArr, (Continuation) null), 2);
                    }
                    gqa2.j.o1(gqa2, gqa.l[0], qod);
                    return;
                }
                return;
        }
    }
}
