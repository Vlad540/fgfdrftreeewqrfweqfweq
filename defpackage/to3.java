package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: to3  reason: default package */
public final class to3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ContactsPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public to3(Continuation continuation, ContactsPickerScreen contactsPickerScreen) {
        super(2, continuation);
        this.Y = contactsPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((to3) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        to3 to3 = new to3(continuation, this.Y);
        to3.X = obj;
        return to3;
    }

    public final Object o(Object obj) {
        gy5 gy5;
        Object obj2;
        wx3.H(obj);
        ro3 ro3 = (ro3) this.X;
        if (ro3 instanceof ro3) {
            mm3 mm3 = ro3.a;
            k77[] k77Arr = ContactsPickerScreen.z0;
            Widget widget = this.Y;
            ArrayList e = widget.getRouter().e();
            ListIterator listIterator = e.listIterator(e.size());
            while (true) {
                gy5 = null;
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (((vgc) obj2).a instanceof gy5) {
                    break;
                }
            }
            vgc vgc = (vgc) obj2;
            gy5 gy52 = vgc != null ? vgc.a : null;
            if (gy52 instanceof gy5) {
                gy5 = gy52;
            }
            if (gy5 != null) {
                k77[] k77Arr2 = ContactsPickerScreen.z0;
                k77 k77 = k77Arr2[0];
                jr jrVar = widget.x0;
                if (((Number) jrVar.a(widget)).intValue() != 0) {
                    Intent intent = new Intent();
                    intent.putExtra("contacts.picker.result.key", mm3);
                    k77 k772 = k77Arr2[0];
                    gy5.Q(((Number) jrVar.a(widget)).intValue(), -1, intent);
                    ex9 onBackPressedDispatcher = widget.getOnBackPressedDispatcher();
                    if (onBackPressedDispatcher != null) {
                        onBackPressedDispatcher.d();
                    }
                    bm3.p(widget);
                }
            }
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
