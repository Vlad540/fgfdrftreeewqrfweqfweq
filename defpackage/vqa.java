package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.ActChatPickerCompat;
import one.me.chats.picker.PickerChatController;
import one.me.sdk.arch.Widget;

/* renamed from: vqa  reason: default package */
public final class vqa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatController Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vqa(PickerChatController pickerChatController, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatController;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((vqa) n((w03) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vqa vqa = new vqa(this.Y, continuation);
        vqa.X = obj;
        return vqa;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (((w03) this.X) instanceof w03) {
            Widget widget = this.Y;
            sgc sgc = widget.C0;
            if (sgc != null && sgc.n()) {
                widget.o0().F0.K(1);
            }
            widget.D0.m();
            im requireActivity = widget.requireActivity();
            ActChatPickerCompat actChatPickerCompat = requireActivity instanceof ActChatPickerCompat ? (ActChatPickerCompat) requireActivity : null;
            if (actChatPickerCompat != null) {
                List<i22> s0 = o23.s0(((Map) widget.o0().w0.a.getValue()).values());
                k77 k77 = PickerChatController.F0[2];
                String str = (String) widget.X.a(widget);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (i22 i22 : s0) {
                    arrayList.add(Long.valueOf(i22.a));
                    arrayList2.add(Long.valueOf(i22.b.a));
                }
                xs7.E(xs7.A(actChatPickerCompat), ((pae) actChatPickerCompat.O0.getValue()).b(), (ru3) null, new w5(actChatPickerCompat, (t52) tp2.a.getAccessor().c(t52.class), arrayList, arrayList2, str, (Continuation) null), 2);
            } else {
                widget.getRouter().B(widget);
            }
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
