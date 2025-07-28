package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.PickerChatController;

/* renamed from: yqa  reason: default package */
public final class yqa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatController Y;
    public final /* synthetic */ LinearLayout Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yqa(PickerChatController pickerChatController, LinearLayout linearLayout, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatController;
        this.Z = linearLayout;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((yqa) n((Set) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yqa yqa = new yqa(this.Y, this.Z, continuation);
        yqa.X = obj;
        return yqa;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int size = ((Set) this.X).size();
        PickerChatController pickerChatController = this.Y;
        boolean z = ((View) pickerChatController.y0.getValue()).getVisibility() == 0;
        nl0 nl0 = pickerChatController.y0;
        i80 i80 = pickerChatController.z0;
        LinearLayout linearLayout = this.Z;
        if (!z && size > 0) {
            ire.a(linearLayout, i80);
            if (nl0.a()) {
                ((View) nl0.getValue()).setVisibility(0);
            }
        } else if (z && size == 0) {
            ire.a(linearLayout, i80);
            at7.z(nl0);
            sgc sgc = pickerChatController.C0;
            if (sgc == null || !sgc.n()) {
                int i = e87.a;
                if (e87.b(e87.c)) {
                    pickerChatController.D0.m();
                }
            } else {
                pickerChatController.o0().F0.K(1);
            }
        }
        return jue.a;
    }
}
